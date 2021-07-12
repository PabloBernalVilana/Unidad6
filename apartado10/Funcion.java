package tarea6.apartado10;

import javax.swing.JOptionPane;

/*
 * /*10) Crea un array de números de un tamaño pasado por teclado, el array contendrá
números aleatorios primos entre los números deseados, por último nos indicar cual es el
mayor de todos.
Haz un método para comprobar que el número aleatorio es primo, puedes hacer todos lo
métodos que necesites.
 */
public class Funcion {
	// Atributos
	int arraySize;
	int numMin;
	int numMax;
	int numPrimo;
	int[] arrayNumeros = new int[arraySize];
	int primoMayor;

	// Generamos metodo constructor
	public Funcion(int arraySize, int numMin, int numMax, int[] arraydNumeros, int primoMayor) {
		// los parámetros que le pasamos
		// son iguales a los atributos de
		// la clase Funcion
		this.arraySize = arraySize;
		this.numMin = numMin;
		this.numMax = numMax;
		this.arrayNumeros = arraydNumeros;
		this.primoMayor = primoMayor;
	}

	// metodo para generar numeros primos
	public int[] generarArray(int arraySize, int numMin, int numMax, int numPrimo, int[] imprimirArray) {

		for (int i = 0; i < arraySize; i++) {
			numPrimo = (int) (Math.random() * (numMax - numMin - 1) + (numMin)) + 1;
			int contador = 0;
			boolean guardarNumero = false;
			for (int j = numPrimo; j > 0; j--) {
				if (numPrimo % j == 0) {
					contador++;
				}
			}
			if (contador == 2) { // es un numero primo
				guardarNumero = true;
			} else {
				guardarNumero = false;
			}
			if (guardarNumero) {
				arrayNumeros[i] = numPrimo;
			} else {
				i--;
			}
		}
		return arrayNumeros;
	}

	public void mostrarArray(int arrayNumeros[]) {
		System.out.println("Array generado: \n");
		for (int i = 0; i < arrayNumeros.length; i++) {
			System.out.print(arrayNumeros[i] + " - ");
		}
	}

	public void primoMayor(int arrayNumeros[], int primoMayor) {
		for (int i = 0; i < arrayNumeros.length; i++) {
			if (arrayNumeros[i] > primoMayor) {
				primoMayor = arrayNumeros[i];
			}
		}
		JOptionPane.showMessageDialog(null, "El numero mayor de los numeros " + " primos generados es : " + primoMayor);
	}
}
