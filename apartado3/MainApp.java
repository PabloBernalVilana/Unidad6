package tarea6.apartado3;

import javax.swing.JOptionPane;

/* 3) Crea una aplicación que nos pida un número por teclado y con un método se lo pasamos
 *	por parámetro para que nos indique si es o no un número primo, debe devolver true si es
	primo sino false.
	Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
	primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo
 */ 
public class MainApp {

	public static void main(String[] args) {
		
		String numeroString = JOptionPane.showInputDialog(null, " Introduce un numero: ");
		int numeroInt = Integer.parseInt(numeroString);
		evaluarPrimo(numeroInt);
	}
			
	public static boolean evaluarPrimo (int num) {
				
		if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0 ) {
			JOptionPane.showMessageDialog(null, "El numero " + num + " es primo");
			return true; 
		} else {
			JOptionPane.showMessageDialog(null, "El numero " + num + " no es primo");
			return false;
		}
	}
}
