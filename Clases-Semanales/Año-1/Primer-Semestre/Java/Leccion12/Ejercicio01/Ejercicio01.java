/*
Ejercicio 1: Construir un programa que, dado un número total de

horas, devuelve el número de semanas, días y horas equivalentes.

Por ejemplo dado un total de 1000 horas debe mostrar 5 semanas,

6 días y 16 horas.

 */

package Java.Leccion12.Ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        // Definimos Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Declaramos variable para el número total de horas
        int totalHoras;

        // Solicitamos al usuario que ingrese el numero total de horas
        System.out.println("Ingrese el número total de horas: ");
        totalHoras = scanner.nextInt();

        // Calculamos el número de semanas, días y horas
        int semanas = totalHoras / 168;
        int horasRestantes = totalHoras % 168;

        // 1 día = 24 horas
        int dias = horasRestantes / 24;
        int horas = horasRestantes % 24;

        // Mostramos el resultado
        System.out.println(totalHoras + " horas equivalen a:");
        System.out.println(semanas + " semanas,");
        System.out.println(dias + " días y");
        System.out.println(horas + " horas.");

        // Cerramos el Scanner
        scanner.close();
    }
}
