package tarea6.apartado3;

import javax.swing.JOptionPane;

/* 3) Crea una aplicaci�n que nos pida un n�mero por teclado y con un m�todo se lo pasamos
 *	por par�metro para que nos indique si es o no un n�mero primo, debe devolver true si es
	primo sino false.
	Un n�mero primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
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
