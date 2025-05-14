package pruebasSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio6 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/institutodb";
		String user = "root";
		String password = "cacaculopedopis";
		double nota = 0;
		try (Connection conn = DriverManager.getConnection(url, user, password)){

			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("select nota from calificaciones where id_estudiante=1 and id_calificacion=1");
			if (rs.next()) {
				
				System.out.println(rs.getDouble(1));
				
				nota = rs.getDouble(1);
				
				nota++;
			}

			String query = "update calificaciones set nota=? where id_estudiante=? ";
			
			try (PreparedStatement stmt = conn.prepareStatement(query)) {
				stmt.setDouble(1, nota);
				
				stmt.setInt(2, 1);
				stmt.executeUpdate();
				System.out.println("Actualizaciones realizadas con éxito.");

			}

		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
