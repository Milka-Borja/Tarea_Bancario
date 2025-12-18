package Tarea_Banco_BDD.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    private static final String URL = "jdbc:mysql://ut0gf8cenzsvnehu:lZQ5dvzOpD9kEX6re77r@bpcmgueupdwjn05uc4nm-mysql.services.clever-cloud.com:3306/bpcmgueupdwjn05uc4nm";
    private static final String USUARIO = "ut0gf8cenzsvnehu";
    private static final String CLAVE = "lZQ5dvzOpD9kEX6re77r";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            // Establece la conexión
            conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
            return conn;
        } catch (SQLException e) {
            System.err.println("Error al conectar con la base de datos. ¿Está MySQL corriendo? " + e.getMessage());
            return null;
        }
    }

    public static void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}