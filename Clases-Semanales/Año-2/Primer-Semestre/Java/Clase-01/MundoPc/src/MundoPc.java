
public class MundoPc {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 24); // importamos la clase Monitor
        Teclado tecladoHP = new Teclado("HP", "Mecanico"); // importamos la clase Teclado
        Raton ratonHP = new Raton("HP", "Bluetooth"); // importamos la clase Raton
        // Importamos la clase Computadora y creamost una computadora
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        System.out.println(computadoraHP); // Mostramos la computadora HP

        // Creamos una segunda computadora de otra marca
        Monitor monitorGamer = new Monitor("Gamer", 27); // importamos la clase Monitor
        Teclado tecladoGamer = new Teclado("Gamer", "Mecanico"); // importamos la clase Teclado
        Raton ratonGamer = new Raton("Gamer", "Bluetooth"); // importamos la clase Raton
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        System.out.println(computadoraGamer); // Mostramos la computadora Gamer

        // Creamos una computadora de marca Asus
        Monitor monitorAsus = new Monitor("Asus", 27);
        Teclado tecladoAsus = new Teclado("Asus", "Mecanico");
        Raton ratonAsus = new Raton("Asus", "Bluetooth");
        Computadora computadoraAsus = new Computadora("Computadora Asus", monitorAsus, tecladoAsus, ratonAsus);
        System.out.println(computadoraAsus);

        // Creamos una computadora de marca Dell
        Monitor monitorDell = new Monitor("Dell", 27);
        Teclado tecladoDell = new Teclado("Dell", "Mecanico");
        Raton ratonDell = new Raton("Dell", "Bluetooth");
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);
        System.out.println(computadoraDell);

        // Creamos un objeto de la clase Orden
        Orden orden1 = new Orden(); // importamos la clase Orden
        Orden orden2 = new Orden();
        Orden orden3 = new Orden();
        Orden orden4 = new Orden();

        // Mostramos la orden
        // Agregamos las computadoras a la orden
        orden1.agregarComputadora(computadoraHP); // Agregamos la computadora HP a la orden

        System.out.println(); // Salto de linea

        orden1.agregarComputadora(computadoraGamer); // Agregamos la computadora Gamer a la orden

        // Creamos una computadora de varias marcas
        Computadora computadorasVarias = new Computadora("Computadora Armada", monitorHP, tecladoGamer, ratonGamer);
        orden2.agregarComputadora(computadorasVarias);

        orden3.agregarComputadora(computadoraAsus); // Agregamos la computadora Asus a la orden
        orden4.agregarComputadora(computadoraDell); // Agregamos la computadora Dell a la orden

        // Mostramos la orden
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        orden3.mostrarOrden();
        orden4.mostrarOrden();

    }
}
