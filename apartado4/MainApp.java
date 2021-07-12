package tarea6.apartado4;

import javax.swing.JOptionPane;

/*
 * 4) Crea una aplicación que nos calcule el factorial de un número pedido por teclado, lo
 * realizara mediante un método al que le pasamos el número como parámetro. Para calcular
 * el factorial, se multiplica los números anteriores hasta llegar a uno. Por ejemplo, si
 * introducimos un 5, realizara esta operación 5*4*3*2*1=120
 */
public class MainApp {

	public static void main(String[] args) {
		
		String numeroString =  JOptionPane.showInputDialog(null, "Introduce un numero: ");
		int numeroInt = Integer.parseInt(numeroString);
		factorialNumero(numeroInt);
		JOptionPane.showMessageDialog(null, "resultado del factorial: " + factorialNumero(numeroInt));			
		}
		public static int factorialNumero (int num) {
			int resultado = 1;
			for (int i = 1; i <= num ; i++) {
				resultado *= i;
			}
			return resultado;
	}
}
