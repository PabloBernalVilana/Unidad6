package tarea6.apartado12;

import javax.swing.JOptionPane;

/*
 * 
 * 12) Crea un array de n�meros de un tama�o pasado por teclado, el array contendr�
 * n�meros aleatorios entre 1 y 300 y mostrar� aquellos n�meros que acaben en un d�gito que
 * nosotros le indiquemos por teclado (debes controlar que se introduce un numero correcto),
 * estos deben guardarse en un nuevo array.
 * Por ejemplo, en un array de 10 posiciones le indicamos mostrar los n�meros acabados en 5,
 * podr�a salir 155, 25, etc.
 */

public class MainApp {

	public static void main(String[] args) {

		int tamanoArray = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el tamano del array"));
		int numeroFiltro = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce �ltimo d�gito: "));
		int arrayNumeros[] = new int[tamanoArray];
		int arrayFiltrado[] = new int[tamanoArray];
		int min = 0;
		int max = 300;
		int numeroAleatorio;
		int contadorCifras = 0;

		for (int i = 0; i < arrayNumeros.length; i++) {
			numeroAleatorio = (int) (Math.random() * (max - min - 1) + (min) + 1);
			arrayNumeros[i] = numeroAleatorio;
		}
		for (int i = 0; i < arrayNumeros.length; i++) {
			if (arrayNumeros[i] % 10 == numeroFiltro) {
				arrayFiltrado[contadorCifras] = arrayNumeros[i];
				contadorCifras++;
			}

		}

		for (int i = 0; i < arrayNumeros.length; i++) {
			System.out.print(arrayNumeros[i] + " ");
		}
		System.out.println(" ");
		for (int j = 0; j < arrayFiltrado.length; j++) {
			System.out.print(arrayFiltrado[j] + " ");
		}

	}
}
