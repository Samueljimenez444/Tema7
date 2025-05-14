package pruebasSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/institutodb";
		String user = "root";
		String password = "cacaculopedopis";
		
		String nombre;
		
		String apellidos;
		
		int id;
		
		String email;
		
		String fecha;
		
		int telefono;
		
		Scanner lectura = new Scanner(System.in);

		try (Connection conn = DriverManager.getConnection(url, user, password)) {
			
			String query = "Insert into estudiantes (id_estudiante,nombre,apellido,fecha_nacimiento,email,telefono)  Values(?,?,?,?,?,?)";
			id=lectura.nextInt();
			lectura.nextLine();
			nombre=lectura.nextLine();
			apellidos=lectura.nextLine();
			fecha=lectura.nextLine();
			email=lectura.nextLine();
			telefono=lectura.nextInt();
			
			try (PreparedStatement stmt = conn.prepareStatement(query)) {
				
				stmt.setInt(1, id);

				stmt.setString(2, nombre);

				stmt.setString(3, apellidos);

				stmt.setString(4, fecha);

				stmt.setString(5, email);

				stmt.setInt(6, telefono);

			

				stmt.executeUpdate();

				System.out.println("Actualizaciones realizadas con éxito.");

			}

		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
