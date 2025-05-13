import java.util.Objects;

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

    // metodo hashCode para obtener el hash del objeto
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
        return hash;
    }

    // metodo equals para comparar dos objetos
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;

        }
        final Empleado other = (Empleado) obj;
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;

    }
}
