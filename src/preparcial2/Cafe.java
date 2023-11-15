package preparcial2;

public class Cafe {

	private String nombre;
	private double precio;
	
	public Cafe(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

    public double calcularPrecioFinal(boolean tarjeta) {
        if (tarjeta) {
            // Aplicar descuento del 15%
            precio = precio * 0.85;
        }
        return precio;
    }
    
	@Override
	public String toString() {
		return "Cafe nombre=" + nombre + ", precio=" + precio;
	}
}
