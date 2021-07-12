package tarea6.apartado7;

import javax.swing.JOptionPane;

/*7) Crea un aplicación que nos convierta una cantidad de euros introducida por teclado a otra
moneda, estas pueden ser a dolares, yenes o libras. El método tendrá como parámetros, la
cantidad de euros y la moneda a pasar que sera una cadena, este no devolverá ningún valor,
mostrara un mensaje indicando el cambio (void).
El cambio de divisas son:
•
•
•
0.86 libras es un 1 €
1.28611 $ es un 1 €
129.852 yenes es un 1 €
*/
public class MainApp {

	public static void main(String[] args) {

		String cantidadString = JOptionPane.showInputDialog(null, "Cuantos euros deseas cambiar: ");
		double cantidadDouble = Double.parseDouble(cantidadString);
		String moneda = JOptionPane.showInputDialog(null, "Que moneda desea (dolar, yen o libra): ");
		cambioMoneda(cantidadDouble, moneda);
	}

	public static void cambioMoneda(double cantidadEuros, String moneda) {
		final double libra = 0.86;
		final double dollar = 1.28611;
		final double yen = 129.852;
		double monedaCambiada = 0;
		System.out.println(moneda);
		switch (moneda) {
		case "libra":
			monedaCambiada = cantidadEuros * libra;
			JOptionPane.showMessageDialog(null, cantidadEuros + " en libras son " + monedaCambiada);
			break;
		case "dolar":
			monedaCambiada = cantidadEuros * dollar;
			JOptionPane.showMessageDialog(null, cantidadEuros + " en dolares son " + monedaCambiada);
			break;
		case "yen":
			monedaCambiada = cantidadEuros * yen;
			JOptionPane.showMessageDialog(null, cantidadEuros + " en yenes son " + monedaCambiada);
			break;
		}

	}

}
