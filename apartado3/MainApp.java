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
