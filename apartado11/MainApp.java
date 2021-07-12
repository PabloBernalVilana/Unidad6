package tarea6.apartado11;

import javax.swing.JOptionPane;

/*Crea dos arrays de n�meros con la dimensi�n pasada por teclado.
Uno de ellos estar� rellenado con n�meros aleatorios y el otro apuntara al array anterior,
reasigna los valores del segundo array con valores aleatorios.
Despu�s, crea un m�todo que tenga como par�metros, los dos arrays y devuelva uno nuevo
con la multiplicaci�n de la posici�n 0 del array1 con el del array2 y as� sucesivamente.
Por �ltimo, muestra el contenido de cada array.
public class MainApp {*/

public class MainApp {
	
	public static void main(String[] args) {
		
		int sizeArray = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el tama�o del array: "));
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
