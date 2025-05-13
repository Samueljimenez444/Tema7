package pruebasSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/institutodb";
		String usuario = "root";
		String contraseña = "cacaculopedopis";
		try (Connection con = DriverManager.getConnection(url, usuario, contraseña)) {
			System.out.println("Hola, conexion exitosa");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from estudiantes");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println("----------");


			}
		} catch (SQLException e)

		{
			System.out.println(e);
		}

	}
}
