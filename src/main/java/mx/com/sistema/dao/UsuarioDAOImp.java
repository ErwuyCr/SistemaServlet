package mx.com.sistema.dao;

import java.sql.PreparedStatement;
import java.util.List;
import mx.com.sistema.models.Usuario;

public class UsuarioDAOImp extends Conexion implements UsuarioDao {

	@Override
	public int insertar(Usuario usuario) throws Exception {
		
		int usuarioCreado=0;
		
		try {
			this.conectar();
			PreparedStatement st = this.conexion.prepareStatement("INSERT INTO Usuarios(nombre,apellido) VALUES(?,?)");
			st.setString(1, usuario.getNombre());
			st.setString(2, usuario.getApellido());
			usuarioCreado = st.executeUpdate();
			st.close();
		} catch (Exception e) {
			throw e;
		} finally {
			this.cerrar();
		}
		
		return usuarioCreado;
	}

	@Override
	public void modificar(Usuario usuario) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> obtenerTodos() throws Exception {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	@Override
	public void obtener(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
