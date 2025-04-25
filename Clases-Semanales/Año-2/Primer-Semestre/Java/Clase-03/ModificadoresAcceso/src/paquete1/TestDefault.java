public class TestDefault {
    public static void main(String[] args) {
        ClaseHija2 claseH2 = new ClaseHija2(); // Instancia de ClaseHija2
        claseH2.atributoDefault = "Cambio desde la prueba"; // Modifica el atributo default de la clase hija
        System.out.println("claseh2 atributo default = " + claseH2.atributoDefault);

        Clase4 clase4 = new Clase4("Publico"); // Instancia de Clase4
        System.out.println(clase4.getAtributoPrivate()); // Imprime el atributo privado de Clase4
        clase4.setAtributoPrivate("Cambio desde la prueba"); // Modifica el atributo privado de Clase4
        System.out.println("clase4 = " + clase4.getAtributoPrivate()); // Imprime el atributo privado de Clase4
    }
}
