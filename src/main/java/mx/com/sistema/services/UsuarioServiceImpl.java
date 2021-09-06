package mx.com.sistema.services;

import mx.com.sistema.dao.Conexion;
import mx.com.sistema.dao.DaoException;
import mx.com.sistema.dao.UsuarioDaoImpl;
import mx.com.sistema.dao.UsuarioDao;
import mx.com.sistema.models.Usuario;

public class UsuarioServiceImpl implements UsuarioService {
	
	private UsuarioDao usuarioDao = new UsuarioDaoImpl(Conexion.getConnection());

	@Override
	public Integer save(Usuario usuario) throws ServiceException {
		// TODO Auto-generated method stub
		Integer rowsAffected = 0;
		try {
			rowsAffected  = usuarioDao.insertar(usuario);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e.getMessage());
		}
		return rowsAffected;
	}

}
