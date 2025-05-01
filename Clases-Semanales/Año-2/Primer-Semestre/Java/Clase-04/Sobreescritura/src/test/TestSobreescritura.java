public class TestSobreescritura {

    public static void main(String[] args) {

        // Creamos un objeto de la clase Empleado
        Empleado empleado1 = new Empleado("Damian", 8000);
        imprimir(empleado1); // Imprimimos el resultado del metodo obtenerDetalles

        // Imprimimos el resultado del metodo obtenerDetalles
        // System.out.println("empleado1 = " + empleado1.obtenerDetalles());

        // Gerente gerente1 = new Gerente("Juan", 5000, "Sistemas");
        // imprimir(gerente1); // Imprimimos el resultado del metodo obtenerDetalles
        // System.out.println("gerente1 = " + gerente1.obtenerDetalles());

        empleado1 = new Gerente("Juan", 5000, "Sistemas");
        imprimir(empleado1);
    }

    // Aplicamos el concepto de polimorfismo
    public static void imprimir(Empleado empleado) {
        String detalles = empleado.obtenerDetalles();
        System.out.println("Detalles: " + detalles);
        // System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
