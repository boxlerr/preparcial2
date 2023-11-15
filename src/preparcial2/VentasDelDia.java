package preparcial2;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;


public class VentasDelDia {

	
	private LinkedList <Venta> ventas;
	private LocalDate dia;
	
	
	public VentasDelDia() {
		this.dia = LocalDate.now();
        this.ventas = new LinkedList<>();
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
        ventas.add(venta);
    }

    public void mostrarTodasLasVentas() {
        System.out.println("Ventas del día " + dia + ":");
        for (Venta venta : ventas) {
            System.out.println(venta);
        }
    }
    public String determinarCafeMasVendido() {
		Map <String, Integer> contadorCafes = new HashMap <>(); //haciendo uso de hashmap por primera vez 
		
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
		return "VentasDelDia [ventas=" + ventas + ", dia=" + dia + "]";
	}
}
