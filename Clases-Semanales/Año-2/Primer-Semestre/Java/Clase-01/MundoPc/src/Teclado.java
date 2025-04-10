//Clase hija de la clase DispositivoEntrada

public class Teclado extends DispositivoEntrada {
    // Ingresamos los atributos para la clase hija
    private final int idTeclado;
    private static int contadorTeclados;

    // Creamos el constructor de la clase hija
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca); // LLamamos a la clase padre a través de super
        this.idTeclado = ++contadorTeclados;
    }

    // Creamos el método toString para imprimir el objeto de forma más legible
    @Override
    public String toString() {
        return "Teclado{" +
                "idTeclado=" + idTeclado +
                ", " + super.toString() +
                '}';

    }
}