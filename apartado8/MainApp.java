package tarea6.apartado8;

import javax.swing.JOptionPane;

/*8) Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por
consola el indice y el valor al que corresponde. Haz dos métodos, uno para rellenar valores y
otro para mostrar.
 */
public class MainApp {

	public static void main(String[] args) {
		int arrayNumeros [] = new int [10];
		llenarArray(arrayNumeros);
		mostrarArray(arrayNumeros);
	}
	public static int llenarArray (int listaNumeros[]) {
		for (int i = 0 ; i < listaNumeros.length ; i++) {
			String numeroString = JOptionPane.showInputDialog(null, "Inserta numero en la posicion  " + i + " del array");
			int numeroInt = Integer.parseInt(numeroString);
			listaNumeros[i] = numeroInt;
		}
		return 0;
	}
	public static void mostrarArray (int imprimirNumeros[]) {
		for (int i = 0 ; i < imprimirNumeros.length ; i++) {
			System.out.println("Indice " + i + " valor " + imprimirNumeros[i]);
		}
	}
}
