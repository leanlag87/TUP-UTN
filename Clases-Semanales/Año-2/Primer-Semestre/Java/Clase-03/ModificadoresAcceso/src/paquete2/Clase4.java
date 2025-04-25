public class Clase4 {
    private String atributoPrivate = "Atributo privado de la clase 4"; // Atributo privado

    private Clase4() { // Constructor privado
        System.out.println("Constructor privado de Clase4"); // Mensaje de constructor privado
    }

    // Creamos un contructor publico para poder crear objetos
    public Clase4(String argumento) {
        this();
        System.out.println("Constructor publico de Clase4"); // Mensaje de constructor publico
    }

    // Metodo privado
    private void metodoPrivado() {
        System.out.println("Metodo privado de Clase4"); // Mensaje de metodo privado
    }

    // Generamos los getters y setters para el atributo privado
    public String getAtributoPrivate() {
        return atributoPrivate; // Retorna el atributo privado
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate; // Modifica el atributo privado
    }

    // Generamos el metodo publico para llamar al metodo privado
    public void metodoPublico() {
        System.out.println("Llamando al metodo privado desde el metodo publico"); // Mensaje de metodo publico
        this.metodoPrivado(); // Llama al metodo privado
    }

}
