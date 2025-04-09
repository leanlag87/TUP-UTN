package Java.Leccion09.Ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, nota3, suma;

        // Guardamos las 3 notas
        System.out.println("Digite las 3 calificaciones: ");
        nota1 = Float.parseFloat(entrada.nextLine());
        nota2 = Float.parseFloat(entrada.nextLine());
        nota3 = Float.parseFloat(entrada.nextLine());

        // Hacemos la suma de las notas
        suma = nota1 + nota2 + nota3;

        // Imprimimos el resultado
        System.out.println("\nLa suma es: " + suma);

        // Cierra el objeto Scanner para liberar recursos.
        entrada.close(); // Metodo q se utiliza para cerrar el objeto scanner
                         // aconsejable usarlo cuando no vamos a seguir pidiendole entradas al usuario
    }
}
