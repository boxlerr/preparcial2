package preparcial2;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class VentasDelDia {

    private LinkedList<Venta> ventas;
    private LocalDate dia;
    private boolean diaFinalizado; // Nueva variable

    public VentasDelDia() {
        this.dia = LocalDate.now();
        this.ventas = new LinkedList<>();
        this.diaFinalizado = false; // Inicializa en false al crear la instancia
    }

    public LinkedList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(LinkedList<Venta> ventas) {
        this.ventas = ventas;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public void agregarVenta(Venta venta) {
        if (!diaFinalizado) { // Verifica si el día ha finalizado antes de agregar una venta
            ventas.add(venta);
        } else {
            System.out.println("El día ya ha sido finalizado. No se pueden agregar más ventas.");
        }
    }

    public void finalizarDia() {
        if (!diaFinalizado) { // Verifica si el día no ha sido finalizado ya
            diaFinalizado = true;
            System.out.println("Día finalizado. No se pueden agregar más ventas.");
        } else {
            System.out.println("El día ya ha sido finalizado.");
        }
    }

    public boolean esDiaFinalizado() {
        return diaFinalizado;
    }

    public void mostrarTodasLasVentas() {
        System.out.println("Ventas del día " + dia + ":");
        for (Venta venta : ventas) {
            System.out.println(venta);
        }
    }

    public String determinarCafeMasVendido() {
        Map<String, Integer> contadorCafes = new HashMap<>(); // haciendo uso de hashmap por primera vez

        for (Venta venta : ventas) {
            String nombreCafe = venta.getCafe().getNombre();
            contadorCafes.put(nombreCafe, contadorCafes.getOrDefault(nombreCafe, 0) + venta.getCantidad());
        }

        String cafeMasVendido = null;
        int cantidadMaxima = 0;

        for (Map.Entry<String, Integer> entry : contadorCafes.entrySet()) {
            if (entry.getValue() > cantidadMaxima) {
                cafeMasVendido = entry.getKey();
                cantidadMaxima = entry.getValue();
            }
        }

        if (cafeMasVendido != null) {
            return "El café más vendido es: " + cafeMasVendido + " con " + cantidadMaxima + " unidades vendidas.";
        } else {
            return "No hay ventas registradas para determinar el café más vendido.";
        }
    }

    public double calcularRecaudacionTotal() {
        double recaudacionTotal = 0;
        for (Venta venta : ventas) {
            recaudacionTotal += venta.calcularTotal();
        }
        return recaudacionTotal;
    }

    public void eliminarVenta() {
        String idVentaStr = JOptionPane.showInputDialog("Ingrese el ID de la venta que desea eliminar:");
        
        try {
            int idVenta = Integer.parseInt(idVentaStr);
            boolean eliminada = false;

            for (Venta venta : ventas) {
                if (venta.getId() == idVenta) {
                    ventas.remove(venta);
                    eliminada = true;
                    break;
                }
            }

            if (eliminada) {
                JOptionPane.showMessageDialog(null, "Venta eliminada correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ninguna venta con el ID especificado.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un ID válido (número entero).");
        }
    }
    public void mostrarVentasConDescuento() {
        System.out.println("Ventas con descuento del día " + dia + ":");
        for (Venta venta : ventas) {
            if (venta.isTarjeta()) {
                System.out.println(venta);
            }
        }
    }

    @Override
    public String toString() {
        return "Ventas Del Dia | ventas: " + ventas + ", dia: " + dia;
    }
}
