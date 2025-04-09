/*
  Ejercicio 2:
Hacer un programa que calcule e imprima el salario de un empleado, 
a partir de sus horas semanales trabajadas y de su salario por hora.

 */

//"package;" es una declaración de paquete en q indica que la clase a la que pertenece está ubicada en el paquete. Los paquetes se utilizan para organizar y estructurar el código fuente en diferentes directorios.

package Java.Leccion07;

//Importa la clase Scanner para poder leer la entrada del usuari
import java.util.Scanner;

//Define la clase CalculoSalarioEmpleado. 
public class CalculoSalarioEmpleado {

	// Define el método principal de la clase.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario.

		System.out.println("Ingrese las horas semanales trabajadas por el empleado: "); // Imprime un mensaje pidiendo
																						// al usuario que ingrese las
																						// horas semanales trabajadas.
		double horasTrabajadas = sc.nextDouble(); // Lee y guarda en la variable horasTrabajadas las horas semanales
													// trabajadas ingresadas por

		System.out.println("Ingrese el salario por hora del empleado: ");
		double salarioPorHora = sc.nextDouble();

		double salarioTotal = horasTrabajadas * salarioPorHora;

		System.out.println("El salario total del empleado es: " + salarioTotal);

		sc.close(); // Cierra el objeto Scanner para liberar recursos.
	}
}
