package Java.Leccion08.Ejercicios02;

import java.util.Scanner;

public class elMayorDeDosNumeros {
    public static void main(String[] args) {

        // Crear un objeto Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que digite el primer número
        System.out.println("Digite el primer número:");
        int numero1 = scanner.nextInt(); // Leer el valor entero ingresado por el usuario y asignarlo a la variable
                                         // 'numero1'

        // Solicitar al usuario que digite el segundo número
        System.out.println("Digite el segundo número:");
        int numero2 = scanner.nextInt(); // Leer el valor entero ingresado por el usuario y asignarlo a la variable
                                         // 'numero2'

        // Usar el operador ternario para determinar cuál número es mayor
        // Sintaxis: condicion ? valor_si_verdadero : valor_si_falso;
        int mayor = (numero1 > numero2) ? numero1 : numero2;

        // Imprimir el resultado del mayor número
        System.out.println("El mayor de los dos números es: " + mayor);

        // Cierra el objeto Scanner para liberar recursos.
        scanner.close(); // Metodo q se utiliza para cerrar el objeto scanner
        // aconsejable usarlo cuando no vamos a seguir pidiendole entradas al usuario
    }
}
