/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase controladora de la aplicación
 * @author rbr - 081024
 *
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 081024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int opcion;
		boolean cerrarMenu = false;
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		do {
			//Muestro el menú por consola
			mostrarMenu();
			opcion = sc.nextInt();
			//Accedo a la opción seleccionada por el usuario
			switch(opcion) {
			case 1:
				System.out.println("Has accedido al ejercicio de repaso 1");
				ejercicio1();
				break;
			case 2:
				System.out.println("Has accedido al ejercicio de repaso 2");
				ejercicio2();
				break;
			case 3:
				System.out.println("Has accedido al ejercicio de repaso 3");
				ejercicio3();
				break;
			case 4:
				System.out.println("Has accedido al ejercicio de repaso 4");
				ejercicio4();
				break;
			case 5:
				System.out.println("Cerrando aplicación.....");
				System.out.println("Aplicación cerrada correctamente!!!");
				break;
			default:
				System.err.println("La opción seleccionada no es válida...");
				System.err.println("Inténtelo de nuevo...");
				break;
			}
		}while(!cerrarMenu);
		
		//Cierro la variable Scanner
		sc.close();

	}
	
	/**
	 * Método que mostrará el menú por consola
	 * rbr - 081024
	 */
	public static void mostrarMenu() {
		System.out.println("-----------------------");
		System.out.println("          MENÚ         ");
		System.out.println("-----------------------");
		System.out.println("1. Ejercicio Repaso 1");
		System.out.println("2. Ejercicio Repaso 2");
		System.out.println("3. Ejercicio Repaso 3");
		System.out.println("4. Ejercicio Repaso 4");
		System.out.println("5. Cerrar Aplicación");
		System.out.println("-----------------------");
		System.out.println("Seleccione la opción que desee: ");
	}
	
	/**
	 * Método que contiene el código para ejecutar el ejercicio de repaso 1
	 * rbr - 081024
	 */
	public static void ejercicio1() {
		//Variables
		int num1, num2;
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario los dos numero enteros por consola
		System.out.println("Introduzca el primer número entero: ");
		num1 = sc.nextInt();
		System.out.println("Introduzca el segundo número entero: ");
		num2 = sc.nextInt();
		
		//Muestro por consola la suma de los número enteros
		System.out.println("La suma de los números es: " + (num1 + num2));
		//Muestro por consola la resta de los número enteros
		System.out.println("La resta de los números es: " + (num1 - num2));
		//Muestro por consola la multiplicación de los número enteros
		System.out.println("La multiplicación de los números es: " + (num1 * num2));
		//Muestro por consola la división de los número enteros
		System.out.println("La división de los números es: " + (num1 / num2));
		//Muestro por consola el resto de la división de los número enteros
		System.out.println("El resto de la división de los números es: " + (num1 % num2));
	}
	
	/**
	 * Método que contiene el código para ejecutar el ejercicio de repaso 2
	 * rbr - 081024
	 */
	public static void ejercicio2() {
		//Variables
		int numero = 24;
		
		//Sumo 10 al valor de la variable
		System.out.println("El resultado de sumar 10 al valor de la variable es: " + (numero + 10));
		//Resto 5 al valor de la variable
		System.out.println("El resultado de restar 5 al valor de la variable es: " + (numero - 5));
		//Multiplico por 3 el valor de la variable
		System.out.println("El resultado de multiplicar por 3 el valor de la variable es: " + (numero * 3));
		//Divido entre 2 el valor de la variable
		System.out.println("El resultado de dividir entre 2 el valor de la variable es: " + (numero / 2));
	}
	
	/**
	 * Método que contiene el código para ejecutar el ejercicio de repaso 3
	 * rbr - 081024
	 */
	public static void ejercicio3() {
		//Variables
		int num1 = 12, num2 = 24;
		boolean hola = false, adios = true;
		
		System.out.println("El valor de la primera variable es: " + num1);
		System.out.println("El valor de la segunda variable es: " + num2);
		
		//Muestro por consola si la primera variable es igual, mayor o menor que la segunda
		if(num1>num2) {
			System.out.println("La primera variable es mayor que la segunda");
		}else if(num1 == num2) {
			System.out.println("La primera variable es igual que la segunda");
		}else {
			System.out.println("La primera variable es menor que la segunda");
		}
		
		//Verifico si la primera variable es distinta a la primera
		if(num1 != num2) {
			System.out.println("La primera variable es distinta a la segunda");
		}else {
			System.out.println("La primera variable es igual a la segunda");
		}
		
		//Muestro la conjunción (AND) de ambas variables
		boolean AND = hola && adios;
		System.out.println("El resultado de la conjunción AND es: " + AND);
		//Muestro la conjunción (OR) de ambas variables
		boolean OR = hola || adios;
		System.out.println("El resultado de la conjunción OR es: " + OR);
		//Muestro la conjunción (NOT) de ambas variables
		boolean NOT = hola != adios;
		System.out.println("El resultado de la conjunción NOT es: " + NOT);
	}
	
	/**
	 * Método que contiene el código para ejecutar el ejercicio de repaso 4
	 * rbr - 081024
	 */
	public static void ejercicio4() {
		//Variables
		int a = 24, b = 6, c = 11, resultado;
		
		//Calculo el resultado
		resultado = (a + b) * c / (b - a);
		
		//Muestro por consola el resultado
		System.out.println("El resultado es: " + resultado);
		
		//Explico cómo ha afectado al cálculo la prioridad de los operadores
		System.out.println("En primer lugar, se ejecutan primero los operadores que están entre paréntesis ya que"
				+ " el paréntesis indica que se realice primero esas operaciones que contienen en su interior."
				+ " Finalmente se ejecutan la multiplicación y la división.");
	}

}
