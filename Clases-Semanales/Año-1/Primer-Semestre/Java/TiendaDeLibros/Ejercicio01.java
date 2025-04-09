/*Ejercicio: Tienda de libros
Mostrar: Ingrese los siguientes datos del libro
Digite el nombre del libro
Digite el ID del libro
Digite el precio del libro
Indicar si el envío es gratuito (True/False)
Mostrar:
	Nombre:
	ID: 
	Precio:
	Envío Gratuito?:*/

package Java.TiendaDeLibros;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el nombre del libro: ");
        String nombreLibro = entrada.nextLine();
        System.out.println("Digite el id del libro: ");
        int idLibro = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el precio del libro: ");
        double precioLibro = Double.parseDouble(entrada.nextLine());
        System.out.println("Confirme si el envio es gratuito: ");
        boolean envioGratuito = Boolean.parseBoolean(entrada.nextLine());

        System.out.println(nombreLibro + " #" + idLibro);
        System.out.println("Precio del libro: $" + precioLibro);
        System.out.println("El envio del libro gratuito es: " + envioGratuito);

        // Cierra el objeto Scanner para liberar recursos.
        entrada.close(); // Metodo q se utiliza para cerrar el objeto scanner
        // aconsejable usarlo cuando no vamos a seguir pidiendole entradas al usuario
    }
}
