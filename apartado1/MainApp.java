package tarea6.apartado1;

import javax.swing.JOptionPane;
/*  @Author Pablo Bernal Vilana
 *  Calcula el área de:
 *  Circulo
 *  Triangulo
 *  Cuadrado
 *  Y nos muestra por ventana emergente
 *  la operacion y el resultado
 */
public class MainApp {

	public static void main(String[] args) {
		// declaramos constantes
		// asignamos valor fijo
		final double PI = 3.1415;
		final double divisorExponente = 2;
		// declaramos la variable resultado
		// e inicializamos a 0
		double resultado = 0;
		// introduccion mediante teclado de la 
		// figura que deseamos para calcular su area
		// y lo asignamos a una variable
		String eleccionFigura = JOptionPane.showInputDialog(null, "Elije una figura para calcular su area (Circulo, Triangulo o Cuadrado):  ");
		// En funcion de la figura que introducimos
		// nos llamara a un metodo o a otro
		switch (eleccionFigura) {
		case "Circulo": // si es "Circulo"
			String radioString = JOptionPane.showInputDialog(null, "Introduce el valor del radio: ");// asignamos el valor del radio
			double radioDouble = Double.parseDouble(radioString);// a la variable radioDouble
			// llamamos al metodo y le pasamos como
			// parametros las constantes que necesitamos
			// y las variables con las que operaremos
			// dentro del metodo
			areaCirculo(PI, radioDouble, divisorExponente, resultado); 
			break;

		case "Cuadrado":// si es "Cuadrado"
			String ladoString = JOptionPane.showInputDialog(null, "Introduce el valor del lado: ");
			double ladoDouble = Double.parseDouble(ladoString);
			// llamamos al metodo y le pasamos como
			// parametros las constantes que necesitamos
			// y las variables con las que operaremos
			// dentro del metodo
			areaCuadrado(ladoDouble, resultado, divisorExponente);
			break;

		case "Triangulo":// si es "Triangulo"
			String baseString = JOptionPane.showInputDialog(null, "Introduce el valor de la base");
			double baseDouble = Double.parseDouble(baseString);
			String alturaString = JOptionPane.showInputDialog(null, "Introduce el valor de la altura");
			double alturaDouble = Double.parseDouble(alturaString);
			// llamamos al metodo y le pasamos como
			// parametros las constantes que necesitamos
			// y las variables con las que operaremos
			// dentro del metodo
			areaTriangulo(baseDouble, alturaDouble, divisorExponente, resultado);
			break;

		default: // si introducimos el nombre de una figura mal
			JOptionPane.showMessageDialog(null, "Figura incorrecta!");
			break;
		}
	}
	public static double areaCirculo(double PI, double radioDouble, double divisorExponente, double resultado) {
		resultado = PI * (Math.pow(radioDouble, divisorExponente));
		JOptionPane.showMessageDialog(null, PI + " * " + (Math.pow(radioDouble, divisorExponente)) + " = " + resultado);
		return resultado;
	}

	public static double areaCuadrado(double ladoDouble, double resultado, double divisorExponente) {

		resultado = (Math.pow(ladoDouble, divisorExponente));
		JOptionPane.showMessageDialog(null, ladoDouble + " * " + ladoDouble + " = " + resultado);
		return resultado;
	}

	public static double areaTriangulo(double baseDouble, double alturaDouble, double divisorExponente,
			double resultado) {
		resultado = ((baseDouble * alturaDouble) / divisorExponente);
		JOptionPane.showMessageDialog(null,
				"(" + baseDouble + " * " + alturaDouble + ")" + " / " + divisorExponente + " = " + resultado);
		return resultado;
	}

}
