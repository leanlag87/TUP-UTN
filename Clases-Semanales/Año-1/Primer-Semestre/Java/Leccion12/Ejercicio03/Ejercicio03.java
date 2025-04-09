/*Ejercicio 3: La calificacion final de un estudiante de informática

se calcula con base a las calificaciones de cuatro aspectos de su

rendimiento académico: participación, primer examen parcial, segundo

examen parcial y examen final. Sabiendo que las calificaciones anteriores

entran a la calificación final con ponderaciones de 10%, 25%, 25%

y 40%, Hacer un programa que calcule e imprima la calificación final

obtenida por un estudiante. 

Que el usuario digite las calificaciones de estos 4 datos y así podremos tener,

la calificación final.
*/

package Java.Leccion12.Ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        // Definimos Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // variables para las calificaciones
        double participacion, primerParcial, segundoParcial, examenFinal;
        double calificacionFinal;

        // Solicitamos al usuario que ingrese las calificaciones
        System.out.println("Ingrese la calificación de participacion : ");
        participacion = scanner.nextDouble();

        System.out.println("Ingrese la calificación del primer examen parcial : ");
        primerParcial = scanner.nextDouble();

        System.out.println("Ingrese la calificación del segundo examen parcial : ");
        segundoParcial = scanner.nextDouble();

        System.out.println("Ingrese la calificación del examen final : ");
        examenFinal = scanner.nextDouble();

        // Calculamos la calificación final
        calificacionFinal = (participacion * 0.10) +
                (primerParcial * 0.25) +
                (segundoParcial * 0.25) +
                (examenFinal * 0.40);

        // Mostramos la calificación final
        System.out.println("La calificación final es: " + calificacionFinal);

        // Cerramos el Scanner
        scanner.close();
    }
}
