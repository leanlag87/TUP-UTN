package domain;

public class Persona {

    private final int idPersona;
    private static int contadorPersonas;

    // Creamos un bloque de inicializacion estatico
    static {
        System.out.println("Ejecutando bloque estatico de inicializacion");
        ++Persona.contadorPersonas;
        // idPersona = 10; no se puede hacer porque idPersona no es un atributo estatico
    }

    // Creamos un bloque de inicializacion no estatico
    // conocido como contexto dimanico
    {
        System.out.println("Ejecutando bloque de inicializacion NO estatico");
        this.idPersona = Persona.contadorPersonas++; // Se incrementa el contador de personas y se asigna a idPersona
    }

    // Los bloques de inicializacion se ejecutan antes del constructor

    // Creamos un constructor vacio
    public Persona() {
        System.out.println("Ejecutando constructor vacio");
    }

    // Generamos el metodo get para obtener el valor de idPersona
    public int getIdPersona() {
        return idPersona;
    }

    // Generamos el metodo toString para imprimir el objeto
    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                '}';
    }
}
