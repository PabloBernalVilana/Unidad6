package tarea6.apartado11;

import javax.swing.JOptionPane;

/*Crea dos arrays de números con la dimensión pasada por teclado.
Uno de ellos estará rellenado con números aleatorios y el otro apuntara al array anterior,
reasigna los valores del segundo array con valores aleatorios.
Después, crea un método que tenga como parámetros, los dos arrays y devuelva uno nuevo
con la multiplicación de la posición 0 del array1 con el del array2 y así sucesivamente.
Por último, muestra el contenido de cada array.
public class MainApp {*/

public class MainApp {
	
	public static void main(String[] args) {
		
		int sizeArray = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el tamaño del array: "));
		int [] arrayUno = new int  [sizeArray];
		int [] arrayDos = new int  [sizeArray];
		int [] arrayTres = new int  [sizeArray];
		
		Funcion multiplicarArrays = new Funcion(arrayUno, arrayDos, sizeArray);
		
		multiplicarArrays.crearArrays(arrayUno, arrayDos, sizeArray);
		multiplicarArrays.mostrarArray(arrayUno, arrayDos, arrayTres);
		multiplicarArrays.numerosAleatorios(arrayDos, sizeArray);
		multiplicarArrays.multiplicarArray(arrayUno, arrayDos, sizeArray, arrayTres);
		multiplicarArrays.mostrarArray(arrayUno, arrayDos, arrayTres);

	}

}
