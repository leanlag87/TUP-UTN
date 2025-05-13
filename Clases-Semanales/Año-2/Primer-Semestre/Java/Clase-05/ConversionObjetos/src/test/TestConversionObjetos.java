public class TestConversionObjetos {

    public static void main(String[] args) {
        Empleado empleado; // Declaramos la variable empleado de tipo Empleado
        // Asignamos un objeto de tipo Escritor a la variable empleado
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        // Mostramos el objeto empleado
        System.out.println("empleado = " + empleado);
        System.out.println(empleado.obtenerDetalles());// Mostramos los detalles del empleado

        // empleado.getTipoEscritura(); // Esto no es posible porque empleado es de tipo
        // Empleado

        // Downcasting
        ((Escritor) empleado).getTipoEscritura(); // Obtenemos el tipo de escritura

        Escritor escritor = (Escritor) empleado; // Realizamos el downcasting
        escritor.getTipoEscritura(); // Obtenemos el tipo de escritura

        // Upcasting
        Empleado empleado2 = escritor; // Realizamos el upcasting
        System.out.println(empleado2.obtenerDetalles()); // Mostramos los detalles del empleado
    }
}
