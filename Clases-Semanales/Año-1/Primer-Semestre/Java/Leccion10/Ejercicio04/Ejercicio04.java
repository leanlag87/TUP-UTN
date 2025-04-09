//Ejercicio:sistema de calificaciones con if else
//como tarea hacerlo también con la sentencia de control switch

package Java.Leccion10.Ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario que ingrese una calificacion
        System.out.println("Digite un numero entro 0 y 10: ");

        // Leemos la calificación ingresada por el usuario y la convertimos a entero
        var calificacion = Integer.parseInt(entrada.nextLine());

        // Evaluamos la calificacion usando un if-else
        if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("A");
        } else if (calificacion >= 8 && calificacion < 9) {
            System.out.println("B");
        } else if (calificacion >= 7 && calificacion < 8) {
            System.out.println("C");
        } else if (calificacion >= 6 && calificacion < 7) {
            System.out.println("D");
        } else if (calificacion >= 0 && calificacion < 6) {
            System.out.println("F");
        } else {
            System.out.println("Fuera de rango");
        }

        // Cerramos el Scanner
        entrada.close();
    }
}
