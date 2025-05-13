public class Escritor extends Empleado {
    final TipoEscritura tipoEscritura; // Tipo de escritura

    // Constructor
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        // Llamada al constructor de la clase padre
        this.tipoEscritura = tipoEscritura;
    }

    // metodo para sobreescribir el metodo toString
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Tipo Escritura=" + tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        return "Escritor{" + "tipoEscritura=" + tipoEscritura + "}" + super.toString();

    }

    // Metodo para obtener el tipo de escritura
    public TipoEscritura getTipoEscritura() {
        return this.tipoEscritura;
    }

}
