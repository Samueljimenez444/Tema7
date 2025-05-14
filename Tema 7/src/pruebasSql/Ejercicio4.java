package pruebasSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio4 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/institutodb";
		String usuario = "root";
		String contraseña = "cacaculopedopis";

		try (Connection conn = DriverManager.getConnection(url, usuario, contraseña)) {

			String consulta = "Insert into cursos values(4,'Historia 1','Estudio de la historia contemporanea europea',2025)";

			Statement st = conn.createStatement();
			int rs = st.executeUpdate(consulta);
			consulta = "Insert into cursos values(5,'Biologia 1','Estudio biologico de las plantas y animales',2025)";
			rs = st.executeUpdate(consulta);
			consulta = "Insert into cursos values(6,'Educacion Fisica 1','Ejercicios fisicos',2025)";
			rs = st.executeUpdate(consulta);
			consulta = "Insert into cursos values(7'Musica 1','Estudios de musica y arte',2025)";
			rs = st.executeUpdate(consulta);
			
			System.out.println("Las inserciones han sido introducidas correctamente");
		} catch (SQLException e1) {
			System.out.println("ERROR de insercion");
			System.out.println(e1.getMessage());
		}
	}

}
