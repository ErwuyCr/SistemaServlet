package mx.com.sistema.models;

import java.util.List;

public class Usuario {
	private String nombre;
	private String apellido;
	private List<String> roles;
	private String nivel;
	
	public Usuario() {
		
	}
	
	public Usuario(String nombre, String apellido, List<String> roles, String nivel) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.roles = roles;
		this.nivel = nivel;
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
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	


}
