//La clase Clase3 hereda de la clase Clase1 es clase hija de Clase1

public class Clase3 extends Clase1 {
    // Creamos un constructor publico para llamar al constructor de la clase padre
    public Clase3() {
        super("Protected");
        this.atributoProtected = "Accedemos desde la clase hija";
        System.out.println("AtributoProtected = " + this.atributoProtected); // atributo protected de la clase padre
        this.atributoPublic = "Es totalmente publico";

    }

}