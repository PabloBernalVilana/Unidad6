package tarea6.apartado10;

import javax.swing.JOptionPane;

/*10) Crea un array de n�meros de un tama�o pasado por teclado, el array contendr�
n�meros aleatorios primos entre los n�meros deseados, por �ltimo nos indicar cual es el
mayor de todos.
Haz un m�todo para comprobar que el n�mero aleatorio es primo, puedes hacer todos lo
m�todos que necesites.
 */
public class MainApp {

	public static void main(String[] args) {
		String tamanoString = JOptionPane.showInputDialog(null, "Introduce el tama�o del array: ");
		String minString = JOptionPane.showInputDialog(null, "Introduce el numero inicial del rango: ");
		String maxString = JOptionPane.showInputDialog(null, "Introduce el numero final del rango: ");
		int tamanoInt = Integer.parseInt(tamanoString);
		int minInt = Integer.parseInt(minString);
		int maxInt = Integer.parseInt(maxString);
		int arrayNumeros[] = new int [tamanoInt];
		arrayPrimos(arrayNumeros, minInt, maxInt);
		
	}
	public static void arrayPrimos(int listaPrimos[], int minimo, int maximo) {
		for (int i = 0 ; i < listaPrimos.length ; i++ ) {
			int numeroRandom = (int) (Math.random() * ((maximo + 1) - minimo)) + minimo;
			if (numeroRandom % 2 != 0 && numeroRandom % 3 != 0 && numeroRandom % 5 != 0 && numeroRandom != 0) {
				listaPrimos[i] = numeroRandom;
				System.out.println(listaPrimos[i]);
			}else {
				i++;
			}
		}
	}
}

