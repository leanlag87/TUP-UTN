//Esta clase no va usar la clase padre, pero va a usar las clases hijas de DispositivoEntrada (Clase padre)
//Es decir que no va a interactuar con la clase DispositivoEntrada, pero si con las clases hijas Teclado y Raton

public class Computadora {
    // Creamos los atributos
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;

    // Creamos el constructor vacío privado
    private Computadora() {
        this.idComputadora = ++Computadora.contadorComputadoras;
    }

    // Creamos el constructor con parámetros
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this(); // Llamamos al constructor vacío para inicializar el idComputadora
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    // Creamos los métodos getters y setters
    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    // Creamos el método toString para mostrar los datos de la computadora
    @Override
    public String toString() {
        return "Computadora{" +
                "idComputadora=" + idComputadora +
                ", nombre='" + nombre + '\'' +
                ", monitor=" + monitor +
                ", teclado=" + teclado +
                ", raton=" + raton +
                '}';
    }
}
