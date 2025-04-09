/*
Ejercicio 2: Hacer un programa que calcule el cuadro de una suma,

el usuario debe ingresar el valor de a y el valor de b.

Formula: (a+b)2=a2+b2+2*a*b

Para esto deberán utilizar la clase Math y un método llamado pow
*/

package Java.Leccion12.Ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        // Definimos Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // variables para los valores de a y b
        double a, b;

        // Solicitamos al usuario que ingrese los valores de a y b
        System.out.println("Ingrese el valor de a: ");
        a = scanner.nextDouble();

        System.out.println("Ingrese el valor de b: ");
        b = scanner.nextDouble();

        // Calculamos a^2, b^2 y 2ab utilizando la clase Math y el método pow
        double aCuadrado = Math.pow(a, 2);
        double bCuadrado = Math.pow(b, 2);
        double dosAB = 2 * a * b;

        // Calculamos el resultado de la formula
        double resultado = aCuadrado + bCuadrado + dosAB;

        // Mostramos el resultado
        System.out.println("El resultado es: " + resultado);

        // Cerramos el Scanner
        scanner.close();
    }
}
