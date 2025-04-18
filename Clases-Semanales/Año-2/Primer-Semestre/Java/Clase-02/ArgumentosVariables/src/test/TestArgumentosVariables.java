
package test;

class TestArgumentosVariables {
    public static void main(String[] args) {
        // llamamos el metodo imprimir numeros
        imprimirNumeros(3, 4, 5);
        imprimirNumeros(1, 2); // Llamada al método y le pasamos los argumentos
        variosParametros("Juan", "Perez", 7, 8, 9); // Llamamos al metodo que recibe varios argumentos

    }

    // Creamos un metodo para recibir varios parametros
    // El argumento varargs se define con tres puntos y se coloca al final de la
    // lista de argumentos
    private static void variosParametros(String nombre, String apellido, int... numeros) {
        System.out.println("Nombre: " + nombre + ", Apellido: " + apellido);
        imprimirNumeros(numeros); // Llamamos al metodo imprimir numeros
    }

    // Creamos el metodo imprimir numero
    private static void imprimirNumeros(int... numeros) {
        // Recorremos el arreglo de numeros
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + numeros[i]);
        }
    }
}