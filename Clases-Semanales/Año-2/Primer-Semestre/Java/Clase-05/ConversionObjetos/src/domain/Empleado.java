public class Empleado {
    protected String nombre; // Nombre del empleado
    protected double sueldo; // Sueldo del empleado

    // Constructor
    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    // Metodo para obtener detalles del empleado
    public String obtenerDetalles() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }

    // get metodo para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // set metodo para establecer el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // get metodo para obtener el sueldo
    public double getSueldo() {
        return sueldo;
    }

    // set metodo para establecer el sueldo
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // metodo toString para mostrar el objeto
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }

}
