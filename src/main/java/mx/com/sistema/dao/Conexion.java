package mx.com.sistema.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.h2.tools.RunScript;

public final class Conexion {
	
	private static Connection conexion = null;
	//JDBC driver nombre y base de datos URL
	//private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	//private final String DB_URL = "jdbc:mysql://192.168.15.11:3306/PruebaSistema";
	
	//Credencias de la BD
	//private final String USER = "autobot";
	//private final String PASS = "Ptrl0p3r@";
	
	static {
		try {
			Class.forName("org.h2.Driver");
			conexion = DriverManager.getConnection("jdbc:h2:~/test");
			System.out.println("ENtre"+conexion.isClosed());
			RunScript.execute(conexion, new FileReader("src/main/resources/schema.sql"));
		} catch (SQLException | FileNotFoundException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public void conectar() throws Exception {
//		
//		try {
//			//Class.forName("com.mysql.jdbc.Driver");
//			//conexion = DriverManager.getConnection(DB_URL, USER, PASS);
//			conexion = DriverManager.getConnection("jdbc:h2:~/test");
//			RunScript.execute(conexion, new FileReader("src/main/resources/schema.sql"));
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			throw e;
//		}
//	}
	
	public static Connection getConnection() {
		if(conexion != null) {
			return conexion;
		}else {
			try {
				Class.forName("org.h2.Driver");
				 org.h2.Driver.load();
				conexion = DriverManager.getConnection("jdbc:h2:~/test");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conexion;
		}
	}
	
	public void cerrar() throws SQLException {
		if(conexion != null) {
			if(!conexion.isClosed()) {
				conexion.close();
			}
		}	
	}

}
