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
		
		int numeroInt= Integer.parseInt(JOptionPane.showInputDialog(null, " Introduce un numero: "));
		int  contador = 0;
		evaluarPrimo(numeroInt, contador);
	}

	public static int evaluarPrimo(int numeroInt, int contador) {
		for (int j = numeroInt; j > 0; j--) {
			if (numeroInt % j == 0) {
				contador++;
			}
		}
		if (contador == 2) { // es un numero primo
			JOptionPane.showMessageDialog(null,"El numero " + numeroInt + " es primo");
		} else {
			JOptionPane.showMessageDialog(null,"El numero " + numeroInt + " no es primo");
		}
		return numeroInt;

	}

}
