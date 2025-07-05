package UTN.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // Metodo para poder conectarnos a la DB MySQL
    public static Connection getConnection() {
        Connection conexion = null;
        // Variables para conxion a la DB
        var baseDatos = System.getenv("DB_NAME");
        var urlBase = System.getenv("DB_URL");
        var url = urlBase + baseDatos;
        var usuario = System.getenv("DB_USER");
        var password = System.getenv("DB_PASSWORD");

        // Clase del driver de mysql en memoria
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Ocurrio un error en la conexion: " + e.getMessage());
        } // Fin del catch
        return conexion;

    }// Fin del metodo getConnection
}// Fin de la clase Conexion
