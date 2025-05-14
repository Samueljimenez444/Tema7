package pruebasSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/institutodb";
		String user = "root";
		String password = "cacaculopedopis";
		
		int id;
		
		Scanner lectura=new Scanner(System.in);
		
		System.out.println("Introduce la id a eliminar");
		
		id=lectura.nextInt();
		
		try (Connection conn = DriverManager.getConnection(url, user, password)) {

			String query = "delete from estudiantes where id_estudiante=? ";

			try (PreparedStatement stmt = conn.prepareStatement(query)) {
				stmt.setDouble(1, id);


				stmt.executeUpdate();
				System.out.println("Actualizaciones realizadas con éxito.");

			}

		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
