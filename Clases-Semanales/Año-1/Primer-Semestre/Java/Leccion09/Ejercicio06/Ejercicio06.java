package Java.Leccion09.Ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float guillermo, luis, juan, total;
        System.out.println("Digite la cantidad de dinero de Guillermo: ");
        guillermo = Float.parseFloat(entrada.nextLine());

        luis = guillermo / 2;
        juan = (luis + guillermo) / 2;
        total = luis + guillermo + juan;

        // Imprimimos el resultado
        System.out.println("\nEl dinero de Luis es: US$" + luis);
        System.out.println("El dinero de Juan es: US$" + juan);
        System.out.println("El total de dinero entre los tres es: US$" + total);

        // Cierra el objeto Scanner para liberar recursos.
        entrada.close(); // Metodo q se utiliza para cerrar el objeto scanner
        // aconsejable usarlo cuando no vamos a seguir pidiendole entradas al usuario

    }
}