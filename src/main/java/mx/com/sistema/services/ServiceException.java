package mx.com.sistema.services;

public class ServiceException extends Exception {
	
	public ServiceException() {
		// TODO Auto-generated constructor stub
	}
	
	public ServiceException(String message) {
		super("Service Exception: "+message);
	}
	
}
