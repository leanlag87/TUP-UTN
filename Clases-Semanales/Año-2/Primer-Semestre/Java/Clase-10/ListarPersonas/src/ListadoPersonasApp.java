import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        // Creamos una lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();

        // Creamos un menu
        var salir = false;
        while (!salir) {
            mostrarMenu();// llamamos al método mostrarMenu
            try {
                salir = ejecutarOperacion(entrada, personas); // llamamos al metodo
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            } // fin del try-catch
            System.out.println();// Solo para dar un salto de línea
        } // fin del while
    }// fin del main

    // Creamos el método estatico mostrarMenu
    private static void mostrarMenu() {
        // Mostramos las opciones del menú
        System.out.print("""
                *** Listado de Personas ***
                1. Agregar Persona
                2. Listar Personas
                3. Salir
                """);

        System.out.print("Seleccione una opción: ");
    } // fin del método mostrarMenu

    // Creamos el método estatico ejecutarOperacion
    private static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas) {
        var opcion = Integer.parseInt(entrada.nextLine());
        var salir = false;
        // validamos la opcion a través de un switch
        switch (opcion) {
            case 1 -> {
                // Agregar Persona
                System.out.print("Ingrese el nombre: ");
                var nombre = entrada.nextLine();
                System.out.print("Ingrese el teléfono: ");
                var tel = entrada.nextLine();
                System.out.print("Ingrese el email: ");
                var email = entrada.nextLine();

                // Creamos una nueva persona y la agregamos a la lista
                var persona = new Persona(nombre, tel, email);
                personas.add(persona);
                System.out.println("La lista tiene " + personas.size() + " personas registradas.");
            } // fin del case 1
            case 2 -> {
                // Listar Personas
                System.out.println("Listado de personas: ");
                // Mejoras con lambda y el metodo reference
                // personas.forEach((persona) -> {
                // System.out.println(persona);
                // });
                personas.forEach(System.out::println); // Usando método de referencia
            } // fin del case 2
            case 3 -> {
                // Salir
                System.out.println("Saliendo de la aplicación...");
                salir = true;
            } // fin del case 3
            default -> {
                // Opción no válida
                System.out.println("Opción no válida: " + opcion);
            } // fin del default
        } // fin del switch
        return salir;
    } // fin del método ejecutarOperacion

}// fin de la clase ListadoPersonasApp