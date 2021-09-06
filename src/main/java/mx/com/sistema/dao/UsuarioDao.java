package mx.com.sistema.dao;

import java.util.List;

import mx.com.sistema.models.Usuario;

public interface UsuarioDao {
	
	public int insertar(Usuario usuario) throws DaoException;
	public void modificar(Usuario usuario) throws DaoException;
	public void eliminar(Integer id) throws DaoException;
	List<Usuario> obtenerTodos() throws DaoException;
	public void obtener(Integer id) throws DaoException;
	

}
