package preparcial2;

class Main {

	public static void main(String[] args) {

		VentasDelDia ventasDelDia = new VentasDelDia();
		

		
		Cafe cafeEjemplo = new Cafe("Latte", 1.50);

		// Calcular el precio final sin tarjeta
		double precioSinTarjeta = cafeEjemplo.calcularPrecioFinal(false);

		// Calcular el precio final con tarjeta
		double precioConTarjeta = cafeEjemplo.calcularPrecioFinal(true);

		System.out.println("Precio sin tarjeta: $" + precioSinTarjeta);
		System.out.println("Precio con tarjeta: $" + precioConTarjeta);
	}

}
