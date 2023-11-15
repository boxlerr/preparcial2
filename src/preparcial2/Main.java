package preparcial2;
import javax.swing.JOptionPane;

class Main {

    public static void main(String[] args) {

        VentasDelDia ventasDelDia = new VentasDelDia();
        EncargadoVenta empleado = new EncargadoVenta("Nombre", "123456", "admin", "admin123", "Caja 1");

        boolean inicioSesionExitoso = false;
        int intentos = 3;  // Número máximo de intentos permitidos

        do {
            String usuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario:");
            String contrasena = JOptionPane.showInputDialog("Ingrese la contraseña:");

            inicioSesionExitoso = empleado.Login(usuario, contrasena);

            if (inicioSesionExitoso) {
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso.");
                int opcion;
                do {
                    opcion = mostrarMenu();

                    switch (opcion) {
                        case 1:
                            empleado.agregarVenta(ventasDelDia);
                            break;
                        case 2:
                            ventasDelDia.mostrarTodasLasVentas();
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, ventasDelDia.determinarCafeMasVendido());
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "Recaudación total: $" + ventasDelDia.calcularRecaudacionTotal(), "Recaudación Total", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case 5:
                            ventasDelDia.mostrarVentasConDescuento();
                            break;
                        case 6:
                            ventasDelDia.eliminarVenta();
                            break;
                        case 7:
                            finalizarDia(ventasDelDia);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, elija una opción del menú.");
                    }

                } while (opcion != 7);
            } else {
                JOptionPane.showMessageDialog(null, "Error al iniciar sesión. Intentos restantes: " + (--intentos));
            }

        } while (!inicioSesionExitoso && intentos > 0);

        if (!inicioSesionExitoso) {
            JOptionPane.showMessageDialog(null, "Número máximo de intentos alcanzado. La aplicación se cerrará.");
        }
    }

    private static int mostrarMenu() {
        String[] opciones = {"Agregar Venta", "Mostrar Todas las Ventas", "Mostrar Café Más Vendido", "Mostrar Recaudación Total", "Mostrar Ventas con Descuento", "Eliminar Venta", "Finalizar Día"};
        return JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menú", 0, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]) + 1;
    }


    private static void finalizarDia(VentasDelDia ventasDelDia) {
        // Implementa la lógica para finalizar el día
        ventasDelDia.finalizarDia();
    }
}
