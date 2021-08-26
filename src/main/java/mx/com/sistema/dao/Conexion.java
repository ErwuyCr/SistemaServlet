package mx.com.sistema.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	protected Connection conexion;
	//JDBC driver nombre y base de datos URL
	//private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private final String DB_URL = "jdbc:mysql://192.168.15.11:3306/PruebaSistema";
	
	//Credencias de la BD
	private final String USER = "autobot";
	private final String PASS = "Ptrl0p3r@";
	
	public void conectar() throws Exception {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection(DB_URL, USER, PASS);			
			
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
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
