package tarea6.apartado5;

import javax.swing.JOptionPane;

/*5) Crea una aplicaci�n que nos convierta un n�mero en base decimal a binario. 
 * Esto lo realizara un m�todo al que le pasaremos el numero como par�metro, devolver� un String
con el numero convertido a binario. Para convertir un numero decimal a binario, debemos
dividir entre 2 el numero y el resultado de esa divisi�n se divide entre 2 de nuevo hasta que
no se pueda dividir mas, el resto que obtengamos de cada divisi�n formara el numero
binario, de abajo a arriba.
 */
public class MainApp {

	public static void main(String[] args) {

		String numeroString = JOptionPane.showInputDialog(null, "introduce un numero: ");
		String baseDos = "";
		String binario = decimalBinario(numeroString, baseDos);

		JOptionPane.showMessageDialog(null, "El numero decimal " + numeroString + " en base 10 "
				+ " equivale al numero " + binario + " en base 2.");

	}

	public static String decimalBinario(String numeroStrg, String binario) {
		int numeroInt = Integer.parseInt(numeroStrg);
		int modulo;
		
		if ( numeroInt < 0) {
			JOptionPane.showMessageDialog(null, "El numero " + numeroInt + 
			" no puede ser transformado a binario");
		}
		
		while (numeroInt > 0) {
			modulo = (numeroInt % 2);
			binario = modulo + binario;
			numeroInt = numeroInt / 2;
			System.out.println(binario);

		}
		return binario;
	}
}
