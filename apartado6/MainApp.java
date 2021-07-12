package tarea6.apartado6;

import javax.swing.JOptionPane;

/*6) Crea una aplicación que nos cuente el número de cifras de un número entero positivo
(hay que controlarlo) pedido por teclado. Crea un método que realice esta acción, pasando
el número por parámetro, devolverá el número de cifras.
 * 
 * 
 * 
 * 
 */
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int divisor = 10;
		String numeroString = JOptionPane.showInputDialog(null, "Introduce un numero: ");
		int numeroInt = Integer.parseInt(numeroString);
		int contadorCifras = contarCifras(numeroInt, divisor);

		JOptionPane.showMessageDialog(null,
				"El numero decimal " + numeroString + " tiene " + contadorCifras + " cifras");
	}

	public static int contarCifras(int numeroEntero, int div) {
		int contador = 0;
		while (numeroEntero != 0) {
			numeroEntero = numeroEntero / div;
			System.out.println(numeroEntero + " / " + div + " = " + (numeroEntero / div));
			contador++;
			System.out.println("Contador de cifras: " + contador);
		}
		return contador;
	}
}
