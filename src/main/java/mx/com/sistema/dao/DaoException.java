package mx.com.sistema.dao;

public class DaoException extends Exception {

	public DaoException() {
	}

	public DaoException(String message) {
		super("Dao Exception: "+message);
		// TODO Auto-generated constructor stub
	}
	
}
