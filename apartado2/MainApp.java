package tarea6.apartado2;

/*
 * 
 * 	2) Crea una aplicación que nos genere una cantidad de números enteros aleatorios que
	nosotros le pasaremos por teclado. Crea un método donde pasamos como parámetros entre
	que números queremos que los genere, podemos pedirlas por teclado antes de generar los
	números. Este método devolverá un número entero aleatorio. Muestra estos números por
	pantalla
	}
 */
import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {

		int resultado = 0;
		String cantidadString = JOptionPane.showInputDialog(null,
				"Introduce cuantos numeros aleatorios deseas generar: ");
		int cantidadInt = Integer.parseInt(cantidadString);

		String minimoString = JOptionPane.showInputDialog(null, "Introduce el numero inicial: ");
		int minimoInt = Integer.parseInt(minimoString);

		String maximoString = JOptionPane.showInputDialog(null, "Introduce el numero final: ");
		int maximoInt = Integer.parseInt(maximoString);

		randomInt(minimoInt, maximoInt, cantidadInt);
		randomSolo(minimoInt, maximoInt, resultado);
	}

	public static void randomInt(int minimo, int maximo, int cantidad) {

		int arrayNumeros[] = new int[cantidad];
		System.out.println("Cantidad de numeros deseados: " + cantidad);
		System.out.println("Numeros aleatorios entre " + minimo + " y " + maximo);
		for (int i = 0; i < arrayNumeros.length; i++) {
			int n = (int) (Math.random() * ((maximo + 1) - minimo)) + minimo;
			arrayNumeros[i] = n;
			System.out.println(" * " + arrayNumeros[i]);

		}
	}
	public static void randomSolo(int min, int max, int res) {
		res = (int) (Math.random() * (max + 1 - min)) + min;
		System.out.println("Mostrar un numero random: " + res);
	}
}
