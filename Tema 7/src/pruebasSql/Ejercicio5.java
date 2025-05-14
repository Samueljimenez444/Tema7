package pruebasSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ejercicio5 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/institutodb";
		String user = "root";
		String password = "cacaculopedopis";

		try (Connection conn = DriverManager.getConnection(url, user, password)) {
			String query = "Insert into calificaciones (id_calificacion,id_estudiante,id_curso,id_profesor,tipo_evaluacion,nota,fecha_evaluacion)  Values(?,?,?,?,?,?,?)";
			try (PreparedStatement stmt = conn.prepareStatement(query)) {
				stmt.setInt(1, 5);

				stmt.setInt(2, 4);

				stmt.setInt(3, 1);

				stmt.setInt(4, 1);

				stmt.setString(5, "Examen");

				stmt.setInt(6, 10);

				stmt.setString(7, "2025-05-14");

				stmt.executeUpdate();

				System.out.println("Actualizaciones realizadas con éxito.");

			}

		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
