package mx.com.sistema.services;

import mx.com.sistema.models.Usuario;

public interface UsuarioService {

	Integer save(Usuario usuario) throws ServiceException;

}
