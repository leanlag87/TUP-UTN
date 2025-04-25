package domain;

public class Persona {
    private String nombre;

    // Constructor
    public Persona(String nombre) {
        this.nombre = nombre; // Inicializamos el atributo nombre
    }

    // Agregamos los getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Agregamos el metodo toString para imprimir el objeto
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
