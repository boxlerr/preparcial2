package preparcial2;

public class Cajero extends Empleado{

	//+MostrarVentas():void;
	//-Mostrar que tipo de cafe se vendio mas.
	//-Mostrar recaudacion total.
	//-Mostrar las ventas con descuentos.
	
	private double sueldo;

	public Cajero(String nombre, String dni, double sueldo) {
		super(nombre, dni);
		this.sueldo = sueldo;
	}
	 
	 @Override
	 public void Login(String us, String pass) {
			String [] menu = {"Ventas","Cafe mas vendido","Recaudacion del dia","Descuentos"};
		}
	
}
