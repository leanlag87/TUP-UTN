package enumeraciones;

//Con la palabra reservada enum se define una enumeracion
//Una enumeracion es un tipo de dato que permite definir un conjunto de constantes
//Deja de ser una clase y se convierte en un tipo de dato
public enum Continentes {

    // Definicion de las constantes de la enumeracion
    AFRICA(53, "1.2 billones"),
    AMERICA(34, "1.1 billones"),
    ASIA(48, "1.1 millones"),
    EUROPA(46, "1 billon"),
    OCEANIA(14, "1.2 millones"),;

    // Atributo de la enumeracion
    private final int paises;
    private String poblacion; // Se puede agregar otro atributo si se desea

    // Constructor de la enumeracion
    Continentes(int paises, String poblacion) {
        this.paises = paises;
        this.poblacion = poblacion;
    }

    // Metodo para obtener el numero de paises
    public int getPaises() {
        return paises;
    }

    // Metodo para obtener la poblacion
    public String getPoblacion() {
        return poblacion;
    }
}
