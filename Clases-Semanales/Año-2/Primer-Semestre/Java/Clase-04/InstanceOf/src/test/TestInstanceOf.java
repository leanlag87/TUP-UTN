public class TestInstanceOf {

    public static void main(String[] args) {

        // Creamos un objeto de la clase Empleado
        Empleado empleado1 = new Empleado("Damian", 8000);
        determinarTipo(empleado1); // Imprime "Es un empleado"

        empleado1 = new Gerente("Juan", 5000, "Sistemas");
        determinarTipo(empleado1); // Imprime "Es un gerente"

    }

    // Aplicamos el concepto de instanceof para determinar el tipo de objeto
    // que se está utilizando en tiempo de ejecución
    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("Es un gerente");
            // ((Gerente)empleado).getDepartamento(); // Llamamos al método de la clase
            Gerente gerente = (Gerente) empleado; // Hacemos un downcasting
            gerente.getDepartamento(); // Llamamos al método de la clase Gerente
            System.out.println("Gerente = " + gerente.getDepartamento());

        } else if (empleado instanceof Empleado) {
            System.out.println("Es un empleado");
        } else if (empleado instanceof Object) {
            System.out.println("Es un objeto de la clase Object");
        } else {
            System.out.println("No es un empleado ni un gerente");
        }
    }
}
