
package Java.Leccion11.Ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        // Definimos el Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables para las notas y el promedio
        double nota1, nota2, nota3, promedio;

        // Solicitamos al usuario las notas
        System.out.println("Digite las 3 calificaciones: ");
        nota1 = scanner.nextDouble();
        nota2 = scanner.nextDouble();
        nota3 = scanner.nextDouble();

        // Calculamos el promedio
        promedio = (nota1 + nota2 + nota3) / 3;

        // Determinamos si el alumno aprueba o reprueba
        if (promedio >= 70) {
            System.out.println("El alumno es aprobado con: " + promedio);
        } else {
            System.out.println("El alumno está desaprobado con: " + promedio);
        }

        // Cerramos el Scanner
        scanner.close();
    }

}
