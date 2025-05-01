public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    // Sobreescribimos el metodo obtenerDetalles de la clase padre
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Departamento: " + this.departamento;
    }

    // Agregamos los getters y setters
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    // Sobreescribimos el metodo toString de la clase padre

    @Override
    public String toString() {
        return super.toString() + ", Departamento: " + this.departamento;
    }
}
