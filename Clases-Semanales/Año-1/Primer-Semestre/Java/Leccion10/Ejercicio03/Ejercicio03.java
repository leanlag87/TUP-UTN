//Ejercicio: Cálculo de las estaciones del año con Switch

package Java.Leccion10.Ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario que ingrese un numero de mes
        System.out.println("Digite un numero de mes: ");

        // Leemos el valor del mes ingresado por el usuario y lo convertimos a entero
        var mes = Integer.parseInt(entrada.nextLine());

        // Inicializamos la variable 'estacion' con un valor por defecto
        var estacion = "Estacion desconocida";

        // Estructura switch para determinar la estación del año según el mes ingresado
        switch (mes) {
            case 1:
            case 2:
            case 3:
                estacion = "Verano";
                break;
            case 4:
            case 5:
            case 6:
                estacion = "Otoño";
                break;
            case 7:
            case 8:
            case 9:
                estacion = "Invierno";
                break;
            case 10:
            case 11:
            case 12:
                estacion = "Primavera";

        }

        // Mostramos la estación correspondiente al mes ingresado
        System.out.println("Estacion = " + estacion);

        // Cerramos el Scanner
        entrada.close();
    }
}
