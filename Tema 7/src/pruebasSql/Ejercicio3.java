package pruebasSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/institutodb";
        String usuario = "root";
        String contraseña = "cacaculopedopis";

        try (Connection conn = DriverManager.getConnection(url, usuario, contraseña)) {
            String consulta = "delete from estudiantes WHERE id_estudiante = 5";

            Statement st = conn.createStatement();
            int rs = st.executeUpdate(consulta);

            if (rs > 0) {
                System.out.println("Registro eliminado correctamente.");
            } else {
                System.out.println("No se encontró el registro con id_estudiante = 5.");
            }

        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }
}
