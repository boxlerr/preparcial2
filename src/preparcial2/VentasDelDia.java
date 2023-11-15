package preparcial2;

import java.time.LocalDate;
import java.util.LinkedList;

public class VentasDelDia {

	
	private LinkedList <Venta> ventas;
	private LocalDate dia;
	
	
	public VentasDelDia() {
		this.dia = LocalDate.now();
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
	
	
	@Override
	public String toString() {
		return "VentasDelDia [ventas=" + ventas + ", dia=" + dia + "]";
	}
	
	
}
