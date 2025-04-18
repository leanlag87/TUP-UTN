package test;

import domain.Persona;

public class TestBloqueInicializacion {
    public static void main(String[] args) {
        // Se ejecuta el bloque estatico y el bloque de inicializacion no estatico
        Persona persona1 = new Persona();
        System.out.println("persona1 = " + persona1);
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
    }
}
