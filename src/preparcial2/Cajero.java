package preparcial2;

import javax.swing.JOptionPane;

public class Cajero {
	 
	 static int mostrarMenu() {
	        String[] opciones = {"Agregar Venta", "Mostrar Todas las Ventas", "Mostrar Café Más Vendido", "Mostrar Recaudación Total", "Mostrar Ventas con Descuento", "Eliminar Venta", "Finalizar Día"};
	        return JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menú", 0, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]) + 1;
	    }
	
}
