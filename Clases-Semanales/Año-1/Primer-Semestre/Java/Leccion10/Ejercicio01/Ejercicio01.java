//Ejercicio con la estrucutura if else 

package Java.Leccion10.Ejercicio01;

public class Ejercicio01 {

    public static void main(String[] args) {
        // Declaramos una variable booleana con el valor false
        var condicion = false;

        // Evaluamos la condición booleana
        if (condicion) {
            // Si la condición es verdadera, se ejecuta este bloque
            System.out.print("Condicion Verdadera"); // Condicion simple.
        } else {
            // Si la condición es falsa, se ejecuta este bloque
            System.out.print("Condicion Falsa"); // Condicion doble
        }

        // variable entera con el valor 2
        var numero = 2;
        // variable de tipo String para almacenar el texto correspondiente al número
        var numeroTexto = "Numero desconocido";

        // Evaluamos la variable 'numero' y asignamos el texto correspondiente a
        // 'numeroTexto'
        if (numero == 1) {
            numeroTexto = "Numero uno";
        } else if (numero == 2) {
            numeroTexto = "Numero dos";
        } else if (numero == 3) {
            numeroTexto = "Numero tres";
        } else if (numero == 4) {

            numeroTexto = "Numero no encontrado";
        }
        // Imprimimos el resultado final
        System.out.println("numeroTexto = " + numeroTexto);

    }

}