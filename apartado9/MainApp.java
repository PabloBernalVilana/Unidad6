package tarea6.apartado9;

import javax.swing.JOptionPane;

/*9) Crea un array de n�meros donde le indicamos por teclado el tama�o del array,
rellenaremos el array con n�meros aleatorios entre 0 y 9. Al final muestra por pantalla el
valor de cada posici�n y la suma de todos los valores.
Tareas a realizar: Haz un m�todo para rellenar el array(que tenga como par�metros los
n�meros entre los que tenga que generar) y otro para mostrar el contenido y la suma del
array.
 */
public class MainApp {

	public static void main(String[] args) {
		final int minimo = 0;
		final int maximo = 9;
		String tamanoString = JOptionPane.showInputDialog(null, "Introduce el tama�o del array: ");
		int tamanoInt = Integer.parseInt(tamanoString);
		int arrayNumeros[] = new int [tamanoInt];
		rellenarArray(arrayNumeros, minimo, maximo);
		mostrarArray(arrayNumeros);
		System.out.println("Total de numeros generados: " + tamanoInt);
}

	public static int rellenarArray (int listaNumeros[], int min, int max) {
		
		for (int i = 0 ; i < listaNumeros.length ; i++ ) {
			int numeroRandom = (int) (Math.random() * ((max + 1) - min)) + min;
			listaNumeros[i] = numeroRandom;
			}
		return 0;
	}
	public static void mostrarArray (int imprimirArray[]) {
		int sumaArray = 0;
		for (int i = 0 ; i < imprimirArray.length ; i++) {
			System.out.print("Indice: " + i + "| valor: " + imprimirArray[i]);
			sumaArray += imprimirArray[i];
			System.out.println("| Suma del Array: " + sumaArray);
		}
	}
}
