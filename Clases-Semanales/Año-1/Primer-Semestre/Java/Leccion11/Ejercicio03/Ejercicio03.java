package Java.Leccion11.Ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        // Definimos Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // variables para los números y el resultado
        double num1, num2, resultado;

        // Solicitamos al usuario los números
        System.out.println("Digite 2 números: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();

        // Comprobamos las condiciones y calculamos el resultado
        if (num1 == num2) {
            resultado = num1 * num2; // Si son iguales, multiplicamos
        } else if (num1 > num2) {
            resultado = num1 - num2; // Si el primer número es mayor, restamos
        } else {
            resultado = num1 + num2; // Si el segundo número es mayor, sumamos
        }

        // Mostramos el resultado
        System.out.println("El resultado es: " + resultado);

        // Cerramos el Scanner
        scanner.close();
    }
}
