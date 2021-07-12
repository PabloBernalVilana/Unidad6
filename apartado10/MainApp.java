package tarea6.apartado10;

import javax.swing.JOptionPane;

/*
 * /*10) Crea un array de n�meros de un tama�o pasado por teclado, el array contendr�
n�meros aleatorios primos entre los n�meros deseados, por �ltimo nos indicar cual es el
mayor de todos.
Haz un m�todo para comprobar que el n�mero aleatorio es primo, puedes hacer todos lo
m�todos que necesites.
 */
public class MainApp {

	public static void main(String[] args) {

		int arraySize = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el tama�o del array: "));
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
