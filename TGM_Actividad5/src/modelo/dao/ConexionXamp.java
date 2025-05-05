package modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionXamp {
	
	private String url = "jdbc:mysql://localhost:3306/proyectos_fp_2025";
	private String user = "root";
	private String password = "";
	private static Connection conn;
	
	private ConexionXamp() {
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("\nconexcion establecida");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("\nconeccion NOOOO establecida");
		}
				System.out.println("Fin del programa");
	}

	public static Connection getConexion() {
		if (conn == null)
			new ConexionXamp();
		
		return conn;
	}
}
