package tarea6.apartado11;

/*Crea dos arrays de números con la dimensión pasada por teclado.
Uno de ellos estará rellenado con números aleatorios y el otro apuntara al array anterior,
reasigna los valores del segundo array con valores aleatorios.
Después, crea un método que tenga como parámetros, los dos arrays y devuelva uno nuevo
con la multiplicación de la posición 0 del array1 con el del array2 y así sucesivamente.
Por último, muestra el contenido de cada array.
public class MainApp {*/

public class Funcion {
// definir atributos

	int sizeArray;
	int[] arrayUno = new int[sizeArray];
	int[] arrayDos = new int[sizeArray];
	int[] arrayTres = new int[sizeArray];
	int maxNum = 20;
	int minNum = 0;
	boolean cambiarDatos = false;
	boolean multiplicarDatos = false;
	
	
	// generar metodos constructores
	public Funcion(int[] arrayUno, int[] arrayDos, int sizeArray) {
		this.arrayUno = arrayUno;
		this.arrayDos = arrayDos;
		this.sizeArray = sizeArray;
	}
	public int[] crearArrays(int arrayUno[], int arrayDos[], int sizeArray) {
		// int maxNum = Integer.MAX_VALUE;
		
		int aux = 0;
		for (int i = 0; i < arrayUno.length; i++) {
			arrayUno[i] = (int) (Math.random() * (maxNum - minNum - 1) + (minNum)) + 1;
			aux = arrayUno[i];
			arrayDos[i] = aux;
		}
		return arrayUno;
	}
	public void mostrarArray(int arrayUno[], int arrayDos[], int arrayTres[]) {
		if (cambiarDatos == false && multiplicarDatos == false) {
			System.out.println("Array de " + sizeArray  + " posiciones creado");
			System.out.println("Array 1 completado con numeros aleatorios");
			for (int i = 0; i < arrayUno.length; i++) {
				System.out.print(arrayUno[i] + " - ");
			}
			System.out.println(" ");
			System.out.println("Datos del array 1 copiados en el array 2");
			for (int i = 0; i < arrayDos.length; i++) {
				System.out.print(arrayDos[i] + " - ");
			}
				System.out.println(" ");
		} else {
			System.out.println("Datos array 2 modificados con valor aleatorio");
			for (int i = 0; i < arrayDos.length; i++) {
				System.out.print(arrayDos[i] + " - ");
			}
			System.out.println("\nDatos del array 1 y 2 multiplicados: ");
			System.out.println("Generado array 3 con los resultados: ");
			for (int i = 0; i < arrayTres.length; i++) {
				System.out.print(arrayTres[i] + " - ");
			
			}
		}
	}
	public int[] numerosAleatorios(int arrayDos[], int sizeArray) {

		for (int i = 0; i < arrayDos.length; i++) {
			arrayDos[i] = (int) (Math.random() * (maxNum - minNum - 1) + (minNum)) + 1;
			cambiarDatos = true;
		}
		return arrayDos;
	}
	public int [] multiplicarArray(int arrayUno[], int arrayDos[], int sizeArray, int arrayTres[]) {
		for (int i = 0 ; i < arrayTres.length ; i++) {
			arrayTres[i] = arrayUno[i] * arrayDos[i];
			multiplicarDatos = true;
		}
	return arrayTres;
	}
}
