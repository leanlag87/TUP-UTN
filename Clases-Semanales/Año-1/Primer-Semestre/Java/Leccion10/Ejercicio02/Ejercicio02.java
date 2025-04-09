//Ejercicio: Cálculo de las estaciones del año con if else

package Java.Leccion10.Ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Pedimos al usuario que ingrese un mes del año
        System.out.println("Digite un mes del año: ");

        // Leemos el valor del mes ingresado por el usuario y lo convertimos a entero
        var mes = Integer.parseInt(entrada.nextLine());

        // Inicializamos la variable 'estacion' con un valor por defecto
        var estacion = "Estacion desconocida";

        // Determinamos la estación del año segun el mes ingresado
        if (mes == 1 || mes == 2 || mes == 3) {
            estacion = "Verano";
        } else if (mes == 4 || mes == 5 || mes == 6) {
            estacion = "Otoño";

        } else if (mes == 7 || mes == 8 || mes == 9) {
            estacion = "Invierno";

        } else if (mes == 10 || mes == 11 || mes == 12) {
            estacion = "Primavera";

        }
        // Mostramos la estación correspondiente al mes ingresado
        System.out.println("Estacion " + estacion);

        // Cerramos el Scanner
        entrada.close();
    }
}
