package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        // System.out.println("Dia 1: " + Dias.LUNES); // Imprime el valor de la
        // constante LUNES
        // indicarDiaSemana(Dias.LUNES); // Llama al método para indicar el día de la
        // semana
        System.out.println("\n Continente No. 4: " + Continentes.EUROPA);
        System.out.println(" Paises: " + Continentes.EUROPA.getPaises());
        System.out.println(" Poblacion: " + Continentes.EUROPA.getPoblacion());
        System.out.println("\n Continente No. 1: " + Continentes.AFRICA);
        System.out.println(" Paises: " + Continentes.AFRICA.getPaises());
        System.out.println(" Poblacion: " + Continentes.AFRICA.getPoblacion());
        System.out.println("\n Continente No. 2: " + Continentes.AMERICA);
        System.out.println(" Paises: " + Continentes.AMERICA.getPaises());
        System.out.println(" Poblacion: " + Continentes.AMERICA.getPoblacion());
        System.out.println("\n Continente No. 3: " + Continentes.ASIA);
        System.out.println(" Paises: " + Continentes.ASIA.getPaises());
        System.out.println(" Poblacion: " + Continentes.ASIA.getPoblacion());
        System.out.println("\n Continente No. 5: " + Continentes.OCEANIA);
        System.out.println(" Paises: " + Continentes.OCEANIA.getPaises());
        System.out.println(" Poblacion: " + Continentes.OCEANIA.getPoblacion());

    }

    // Creamos un metodo privado fuera del main para indicar el dia de la semana
    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
            default:
                System.out.println("No es un dia de la semana valido");
                break;
        }
    }
}
