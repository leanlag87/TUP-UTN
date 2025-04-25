public class ClaseHija2 extends Clase2 {
    public ClaseHija2() {
        super(); // Llama al constructor de la clase padre
        this.atributoDefault = "Modificacion del atributo default desde la clase hija";
        System.out.println("atributoDefault = " + this.atributoDefault); // atributo default de la clase hija
        this.metodoDefault(); // Llama al método default de la clase hija
    }
}