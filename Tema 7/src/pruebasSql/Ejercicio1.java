package pruebasSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio1 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/institutodb";
		String usuario = "root";
		String contraseña = "cacaculopedopis";
		String consulta ;
		try (Connection con = DriverManager.getConnection(url, usuario, contraseña)) {
			Statement st = con.createStatement();
	
			consulta = "insert into estudiantes values (5,'Jose', 'Iglesias','2006-05-04','jose@gmail.com',611463523)";
			int rs1 = st.executeUpdate(consulta);

			System.out.println("Insercion Realizada Correctamente");
		} catch (SQLException e)

		{
			System.out.println(e);
		}

	}
}
