package mx.com.sistema.dao;

import java.util.List;

import mx.com.sistema.models.Usuario;

public interface UsuarioDao {
	
	public int insertar(Usuario usuario) throws Exception;
	public void modificar(Usuario usuario) throws Exception;
	public void eliminar(Integer id) throws Exception;
	List<Usuario> obtenerTodos() throws Exception;
	public void obtener(Integer id) throws Exception;
	

}
