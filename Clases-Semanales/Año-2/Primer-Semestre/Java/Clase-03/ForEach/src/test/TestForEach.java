import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        // Creamos un arreglo de tipo entero
        int edades[] = { 18, 20, 25, 30, 35 }; // sintaxis resumida
        // Creamos un for each para recorrer el arreglo de edades
        for (int edad : edades) { // Esta seria la sintaxis resumida del for each
            System.out.println("Edad: " + edad); // Imprimimos la edad
        }

        // Creamos un arreglo de objetos de la clase Persona
        Persona personas[] = { new Persona("Juan"), new Persona("Pedro"), new Persona("Maria") }; // sintaxis resumida

        // Creamos un for each para recorrer el arreglo de personas
        for (Persona persona : personas) { // Esta seria la sintaxis resumida del for each
            System.out.println("Persona: " + persona); // Imprimimos la persona
        }
    }
}