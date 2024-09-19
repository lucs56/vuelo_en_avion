package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
     public Connection conectar() {
         Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/registro";
        String user = "root";
        String password = "";

        try {
            // Registrar el driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa!");
            // Aquí puedes empezar a trabajar con la base de datos

        } catch (ClassNotFoundException e) {
            System.out.println("Driver no encontrado");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Conexión fallida: " + e.getMessage());
            e.printStackTrace();
        }
         return conn;
    }
}
