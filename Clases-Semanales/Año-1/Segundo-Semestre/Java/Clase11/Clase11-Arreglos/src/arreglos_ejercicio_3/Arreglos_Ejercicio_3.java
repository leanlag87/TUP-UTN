package arreglos_ejercicio_3;

import java.util.Scanner;

public class Arreglos_Ejercicio_3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        float negativos = 0, positivos = 0, mediaNegativos, mediaPositivos;
        int conteo0 = 0, conteo_negativos = 0, conteo_positivos = 0;

        System.out.println("Guardamos los elementos en el arreglo: ");

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " . Digite un numero: ");
            numeros[i] = entrada.nextFloat();
            if (numeros[i] > 0) {
                positivos += numeros[i];
                conteo_positivos++;
            }
            else if(numeros[i]<0){
                negativos += numeros[i];
                conteo_negativos ++;
            }
            else{
                conteo0 ++;
            }
        }
        
        if(conteo_positivos == 0){
            System.out.println("\nNo se puede sacar la media de los positivos");
        }
        else{
            mediaPositivos = positivos/conteo_positivos;
            System.out.println("La media de los numeros positivos es: "+mediaPositivos);
        }
        
        if(conteo_negativos == 0){
            System.out.println("\nNo se puede sacar la media de los negativos");
        }
        else{
            mediaNegativos = negativos/conteo_negativos;
            System.out.println("La media de los numeros negativos es: "+mediaNegativos);
        }
        
        System.out.println("La cantidad de ceros es: "+conteo0);        
    }        
}