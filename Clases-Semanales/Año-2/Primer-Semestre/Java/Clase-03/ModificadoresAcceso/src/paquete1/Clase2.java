class Clase2 {
    String atributoDefault = "Valor del atributo default"; // atributo default de la clase hija

    // Constructor vacio
    // Clase2() {
    // System.out.println("Constructor Default");
    // }

    // Constructor publico
    public Clase2() {
        super(); // Llama al constructor de la clase padre
        this.atributoDefault = "Modificacion del atributo default";
        System.out.println("atributoDefault = " + this.atributoDefault);
        this.metodoDefault(); // Llama al método default de la clase hija
    }

    // Metodo default
    void metodoDefault() {
        System.out.println("Método Default");
    }
}
