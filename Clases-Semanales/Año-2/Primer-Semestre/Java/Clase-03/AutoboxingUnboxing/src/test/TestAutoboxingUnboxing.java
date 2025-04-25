public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        // Clases envolventes "Wrapper"
        /*
         * Clases envolventes de tipos primitivos:
         * int = la clase envolvente es Integer
         * long = la clase envolvente es Long
         * float = la clase envolvente es Float
         * double = la clase envolvente es Double
         * char = la clase envolvente es Character
         * boolean = la clase envolvente es Boolean
         * byte = la clase envolvente es Byte
         * short = la clase envolvente es Short
         * Envolventes: son clases que envuelven a los tipos primitivos, es decir, son
         * objetos que representan
         * un tipo primitivo. Por ejemplo, la clase Integer es una envolvente del tipo
         * primitivo int.
         */

        int enteroPrimi = 10;// variable de tipo primitivo
        System.out.println("enteroPrimi = " + enteroPrimi);

        Integer entero = 10; // Tipo object con la clase envolvente Integer
        // Estos ejemplos serian el tipo "Autoboxing" que es la conversión de un tipo
        System.out.println("entero = " + entero.toString());// pasa a ser una cadena de texto por el método toString
        System.out.println("entero = " + entero.byteValue());// pasa a ser un byte por el método byteValue
        System.out.println("entero = " + entero.doubleValue());// pasa a ser un double por el método doubleValue

        // Unboxing: convertir un objeto a un tipo primitivo
        int entero2 = entero;
        System.out.println("entero2 = " + entero2);// se convierte a un tipo primitivo int
    }
}
