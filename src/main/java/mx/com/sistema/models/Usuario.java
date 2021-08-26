package mx.com.sistema.models;

public class Usuario {
	
	private int Id;
	private String nombre;
	private String apellido;
	
	public Usuario() {
		
	}
	
	public Usuario(int Id, String nombre, String apellido) {
		this.Id = Id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public int getId() {
		return Id;
	}
	
	public void setId(int Id) {
		this.Id = Id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	

	@Override
	public String toString() {
		return "Usuario [Id=" + Id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	


}
