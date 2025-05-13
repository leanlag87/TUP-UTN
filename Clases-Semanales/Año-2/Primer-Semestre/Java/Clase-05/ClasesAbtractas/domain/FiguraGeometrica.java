public abstract class FiguraGeometrica {
    protected String tipoFigura;

    // Constructor
    protected FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    // Metodo abstracto para calcular el area
    public abstract void dibujar();

    // Agregamos el get y el set

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    // Metodo toString para mostrar el objeto
    @Override
    public String toString() {
        return "FiguraGeometrica{" +
                "tipoFigura='" + tipoFigura + '\'' +
                '}';
    }
}
