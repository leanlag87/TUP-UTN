
public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1(); // Instancia de Clase1
        System.out.println("Clase1 = " + clase1.atributoPublic); // Imprime la referencia de clase1
        clase1.metodoPublico(); // Llama al método público de Clase1
        Clase3 claseHija = new Clase3(); // creamos un objeto de la clase hija
        System.out.println("ClaseHija = " + claseHija); // Imprime la referencia de claseHija

    }
}
