package Java.Leccion09.Ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int salario = 1000;
        int comision = 150, venta;
        float salarioMensual, ventaCarro, porcVenta, totalPrecio;

        System.out.print("Digite la cantidad de carros vendidos: ");
        venta = Integer.parseInt(entrada.nextLine());
        System.out.print("Digite el precio de un carro: ");
        ventaCarro = Float.parseFloat(entrada.nextLine());

        comision = venta;
        totalPrecio = ventaCarro * venta;
        porcVenta = totalPrecio * 0.05f;
        salarioMensual = salario + comision + porcVenta;

        // Imprimimos el resultado final
        System.out.println("\nEl salario mensual es: " + salarioMensual);

        // Cierra el objeto Scanner para liberar recursos.
        entrada.close(); // Metodo q se utiliza para cerrar el objeto scanner
        // aconsejable usarlo cuando no vamos a seguir pidiendole entradas al usuario

    }

}
