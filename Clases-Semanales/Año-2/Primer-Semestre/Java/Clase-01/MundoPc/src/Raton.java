//Clase hija de la clase DispositivoEntrada

public class Raton extends DispositivoEntrada {
    // Ingresamos los atributos para la clase hija
    private final int idRaton;
    private static int contadorRatones;

    // Creamos el constructor de la clase hija
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca); // LLamamos a la clase padre a través de super
        this.idRaton = ++contadorRatones;
    }

    // Creamos el método toString para imprimir el objeto de forma más legible
    @Override
    public String toString() {
        return "Raton{" +
                "idRaton=" + idRaton +
                ", " + super.toString() +
                '}';
    }
}
