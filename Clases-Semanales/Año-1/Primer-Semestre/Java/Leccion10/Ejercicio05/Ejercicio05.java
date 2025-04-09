//Ejercicio:sistema de calificaciones con sentencia de control switch
package Java.Leccion10.Ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario que ingrese una calificacion
        System.out.println("Digite un numero entre 0 y 10: ");

        // Leemos la calificación ingresada por el usuario y la convertimos a entero
        var calificacion = Integer.parseInt(entrada.nextLine());

        // Evaluamos la calificacion usando un switch
        switch (calificacion) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("F");
                break;
            default:
                System.out.println("Fuera de rango");
                break;
        }

        // Cerramos el Scanner
        entrada.close();
    }
}
