//Creamos la clase padre del proyecto

public class DispositivoEntrada {
    private String tipoEntrada;
    private String marca;

    // Creamos el constructor
    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    // Creamos los getters y setters
    public String getTipoEntrada() {
        return this.tipoEntrada;

    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Creamos el método toString
    // Este método nos permite imprimir el objeto de forma más legible
    @Override
    public String toString() {
        return "DispositivoEntrada{" +
                "tipoEntrada='" + tipoEntrada + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

}