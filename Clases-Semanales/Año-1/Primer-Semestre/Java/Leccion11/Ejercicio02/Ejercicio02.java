package Java.Leccion11.Ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        // Definimos Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // variables para la compra, el descuento y el precio final
        double compra, descuento, precio_final;

        // Solicitamos al usuario el monto de la compra
        System.out.println("Digite la cantidad a pagar: ");
        compra = scanner.nextDouble();

        // Calculamos el descuento si la compra supera los $100
        if (compra > 100) {
            descuento = compra * 0.2;
        } else {
            descuento = 0;
        }

        // Calculamos el precio final
        precio_final = compra - descuento;

        // Mostramos el precio final a pagar
        System.out.println("El precio a pagar es: US$" + precio_final);

        // Cerramos el Scanner
        scanner.close();
    }
}
