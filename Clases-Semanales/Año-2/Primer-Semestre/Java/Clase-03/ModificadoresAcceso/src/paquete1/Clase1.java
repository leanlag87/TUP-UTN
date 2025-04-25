
public class Clase1 {
    public String atributoPublic = "Valor atributo public";
    protected String atributoProtected = "Valor atributo protected";// creamos un atributo protected

    public Clase1() {
        // Constructor de Clase1
        System.out.println("Constructor de Clase1 llamado");

    }

    // Creamos un constructor protegido para la clase Clase1
    // Este constructor solo puede ser accedido desde la misma clase o desde una
    // subclase o desde la misma clase en el mismo paquete
    protected Clase1(String atributoPublic) {
        System.out.println("Constructor protegido");
    }

    // Creamos un metodo publico para ver cuando se ejecuta
    public void metodoPublico() {
        System.out.println("Método público de Clase1 llamado");
    }

    // Creamos un metodo protegido para ver cuando se ejecuta
    // Este metodo solo puede ser accedido desde la misma clase o desde una subclase
    protected void metodoProtected() {
        System.out.println("Método protegido de Clase1 llamado");
    }
}
