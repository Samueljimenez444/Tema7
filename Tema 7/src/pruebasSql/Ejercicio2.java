package pruebasSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio2 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost/institutodb";
		String usuario = "root";
		String contraseña = "cacaculopedopis";
		
		try (Connection conn = DriverManager.getConnection(url, usuario, contraseña)) {
			
			String consulta = "update estudiantes set email = 'anaNuevo@gmail' where id_estudiante=1";
			
		
			Statement st = conn.createStatement();
			int rs = st.executeUpdate(consulta);
			
				


		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
}
