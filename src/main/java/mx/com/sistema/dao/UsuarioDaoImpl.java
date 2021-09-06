package mx.com.sistema.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import mx.com.sistema.models.Usuario;

public class UsuarioDaoImpl implements UsuarioDao {

	private Connection connection;

	public UsuarioDaoImpl(Connection connection) {
		this.connection = connection;
	}

	@Override
	public int insertar(Usuario usuario) throws DaoException {

		Integer rowsAffected = 0;

		try(PreparedStatement st = connection.prepareStatement("INSERT INTO usuario (nombre,apellido) VALUES(?,?)");){
			st.setString(1, usuario.getNombre());
			st.setString(2, usuario.getApellido());
			rowsAffected = st.executeUpdate();
		}catch(SQLException e) {
			throw new DaoException(e.getMessage());
		}
		return rowsAffected;
	}

	@Override
	public void modificar(Usuario usuario) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Integer id) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> obtenerTodos() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void obtener(Integer id) throws DaoException {
		// TODO Auto-generated method stub
		
	}



}
