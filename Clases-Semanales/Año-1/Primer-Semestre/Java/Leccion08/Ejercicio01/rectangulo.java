//Se solicita calcular el área y el perímetro de un rectángulo

package Java.Leccion08.Ejercicio01;

import java.util.Scanner;

public class rectangulo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que digite el alto del rectángulo
        System.out.println("Digite el alto del rectángulo:");
        int alto = scanner.nextInt(); // Leer el valor entero ingresado por el usuario y asignarlo a la variable
                                      // 'alto'

        // Solicitar al usuario que digite el ancho del rectángulo
        System.out.println("Digite el ancho del rectángulo:");
        int ancho = scanner.nextInt(); // Leer el valor entero ingresado por el usuario y asignarlo a la variable
                                       // 'ancho'

        // Calcular el área del rectángulo usando la fórmula: área = alto * ancho
        int area = alto * ancho;

        // Calcular el perímetro del rectángulo usando la fórmula: perímetro = (alto +
        // ancho) * 2
        int perimetro = (alto + ancho) * 2;

        System.out.println("Mostrar el área y perímetro.\n");

        // Imprimir el resultado del área
        System.out.println("Área: " + area + " cm.");

        // Imprimir el resultado del perímetro
        System.out.println("Perímetro: " + perimetro + " cm.");

        // Cierra el objeto Scanner para liberar recursos.
        scanner.close(); // Metodo q se utiliza para cerrar el objeto scanner
                         // aconsejable usarlo cuando no vamos a seguir pidiendole entradas al usuario
    }
}
