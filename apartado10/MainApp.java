package tarea6.apartado10;

import javax.swing.JOptionPane;

/*
 * /*10) Crea un array de números de un tamaño pasado por teclado, el array contendrá
números aleatorios primos entre los números deseados, por último nos indicar cual es el
mayor de todos.
Haz un método para comprobar que el número aleatorio es primo, puedes hacer todos lo
métodos que necesites.
 */
public class MainApp {

	public static void main(String[] args) {

		int arraySize = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el tamaño del array: "));
		int numMin = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce limite inferior:"));
		int numMax = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce limite Superior:"));
		int imprimirArray [] = new int [arraySize];
		int pMayor = 0;
		if (arraySize >= 0 && numMin >= 0 && numMax >=0  ) {
			Funcion numeroAleatorio = new Funcion(arraySize, numMin, numMax, imprimirArray, pMayor);
			numeroAleatorio.generarArray(arraySize, numMin, numMax, numMax, imprimirArray);
			numeroAleatorio.mostrarArray(imprimirArray);
			numeroAleatorio.primoMayor(imprimirArray, pMayor);
			
		} else {
			JOptionPane.showMessageDialog(null, "No se puede crear el array");
		}
	}
}
