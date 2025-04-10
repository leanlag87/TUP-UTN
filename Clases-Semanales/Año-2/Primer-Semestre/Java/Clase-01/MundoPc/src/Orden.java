public class Orden {
    // Creamos los atributos
    private final int idOrden;
    private Computadora computadoras[]; // Arreglo de objetos Computadora
    private static int contadorOrdenes; // Contador de ordenes
    private static final int MAX_COMPUTADORAS = 10; // Constante para el maximo de computadoras por orden
    private int contadorComputadoras; // Contador de computadoras por orden

    // Constructor vacio publico
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes; // Incrementamos el contador de ordenes y asignamos el id
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS]; // Creamos el arreglo de computadoras
    }

    // Metodo para agregar computadoras a la orden
    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) { // Verificamos si hay espacio en el arreglo
            this.computadoras[this.contadorComputadoras++] = computadora; // Agregamos la computadora al arreglo y
                                                                          // aumentamos el contador
        } else {
            System.out.println("Se ha superado el maximo de computadoras: " + Orden.MAX_COMPUTADORAS); // Mensaje de
                                                                                                       // error
        }
    }

    // Metodo para mostrar la orden
    public void mostrarOrden() {
        System.out.println("Id Orden: " + this.idOrden); // Mostramos el id de la orden
        System.out.println("Computadoras de la orden: " + this.idOrden); // Mensaje
        for (int i = 0; i < this.contadorComputadoras; i++) { // Recorremos el arreglo de computadoras
            System.out.println(this.computadoras[i]); // Mostramos la computadora
        }
        System.out.println("Total de computadoras: " + this.contadorComputadoras); // Mostramos el total de computadoras
    }
}