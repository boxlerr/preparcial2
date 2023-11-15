package preparcial2;

import javax.swing.JOptionPane;

public class EncargadoVenta extends Empleado { //hereda de empleado

	
	private String caja;

	public EncargadoVenta(String nombre, String dni, String caja) {
		super(nombre, dni);
		this.caja = caja;
	}

	public String getCaja() {
		return caja;
	}

	public void setCaja(String caja) {
		this.caja = caja;
	}
	public void AgregarVenta(VentasDelDia ventas) {
		
		String [] nombre = {"Latte","Flat White","Lagrima","Expreso"};
		double [] precio = {1.50,2.50,1.30,1.00};
		
		int opcion = JOptionPane.showOptionDialog(null, ventas, caja, 0, 0, null, nombre, nombre[0]);
		
		ventas.getVentas().add(null);
	}
	
	@Override
	public void Login(String us, String pass) {
		String [] menu = {"Ventas","Cafe mas vendido"};

	}
	
}
