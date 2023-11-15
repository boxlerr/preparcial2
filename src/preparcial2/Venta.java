package preparcial2;

public class Venta {

	
	private Cafe cafe;
	private int id;
	private int cantidad;
	private boolean tarjeta;
	
	
	public Venta(Cafe cafe, int id, int cantidad, boolean tarjeta) {
		super();
		this.cafe = cafe;
		this.id = id;
		this.cantidad = cantidad;
		this.tarjeta = tarjeta;
	}

	public Cafe getCafe() {
		return cafe;
	}

	public void setCafe(Cafe cafe) {
		this.cafe = cafe;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public boolean isTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(boolean tarjeta) {
		this.tarjeta = tarjeta;
	}


	
	@Override
	public String toString() {
		return "Venta [cafe=" + cafe + ", id=" + id + ", cantidad=" + cantidad + ", tarjeta=" + tarjeta + "]";
	}
	
	
	
	
	
	
}
