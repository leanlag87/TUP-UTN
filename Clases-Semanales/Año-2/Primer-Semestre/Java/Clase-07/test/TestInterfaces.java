package test;

import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos accesoDatos = new ImplementacionMySql();
        accesoDatos.insertar();
        accesoDatos.listar();
        accesoDatos.actualizar();
        accesoDatos.eliminar();

        // Llamamos al metodo imprimir y se imprime desde donde lo llamamos (mysql)
        imprimir(accesoDatos);

        accesoDatos = new ImplementacionOracle();
        accesoDatos.insertar();
        accesoDatos.listar();
        accesoDatos.actualizar();
        accesoDatos.eliminar();

        // Llamamos al metodo imprimir y se imprime desde donde lo llamamos (oracle )
        imprimir(accesoDatos);

    }

    // Crear un metodo que reciba como parametro una interfaz
    public static void imprimir(IAccesoDatos datos) {
        datos.listar();
    }
}
