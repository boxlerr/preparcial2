package preparcial2;

import javax.swing.JOptionPane;

public class EncargadoVenta extends Empleado {

    private String caja;

    public EncargadoVenta(String nombre, String dni, String usuario, String contrasena, String caja) {
        super(nombre, dni, usuario, contrasena);
        this.caja = caja;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public void agregarVenta(VentasDelDia ventas) {
        String[] nombresCafe = {"Latte", "Flat White", "Lagrima", "Expresso"};
        double[] precios = {1.50, 2.50, 1.30, 1.00};

        int opcion = JOptionPane.showOptionDialog(null, ventas, this.getCaja(), 0, 0, null, nombresCafe, nombresCafe[0]);

        // Verificar si se seleccionó un café (opcion != -1)
        if (opcion != -1) {
            // Crear una instancia de Venta y agregarla a la lista
            Cafe cafeSeleccionado = new Cafe(nombresCafe[opcion], precios[opcion]);
            Venta nuevaVenta = new Venta(cafeSeleccionado, ventas.getVentas().size() + 1, 1, false);
            ventas.agregarVenta(nuevaVenta);
        }
    }

    @Override
    public boolean Login(String us, String pass) {
        return "admin".equals(us) && "admin123".equals(pass);
    }

}
