//Clase que es independiente de las otras clases

public class Monitor {
    // creamos los atributos para la clase Monitor
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    // Creamos el constructor vacio privado para que sea llamado desde el
    // constructor publico
    private Monitor() {
        this.idMonitor = ++contadorMonitores;
    }

    // Creamos el constructor publico
    public Monitor(String marca, double tamanio) {
        this(); // llamamos al constructor vacio privado
        this.marca = marca;
        this.tamanio = tamanio;
    }

    // Creamos los getters y setters
    public int getIdMonitor() {
        return this.idMonitor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    // Creamos el método toString para imprimir el objeto de forma más legible
    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", tamanio=" + tamanio +
                '}';
    }

}