package mx.com.sistema.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.sistema.dao.UsuarioDaoImpl;
import mx.com.sistema.dao.UsuarioDao;
import mx.com.sistema.models.Usuario;
import mx.com.sistema.services.ServiceException;
import mx.com.sistema.services.UsuarioService;
import mx.com.sistema.services.UsuarioServiceImpl;


/**
 * Servlet implementation class CrearUsuario
 */
public class CrearUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsuarioService usuarioService = new UsuarioServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HOLA desde el Servlet");
		
		RequestDispatcher miDispacher = request.getRequestDispatcher("private/usuarios/crearUsuario.jsp");
		miDispacher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario usuario = new Usuario();
		usuario.setNombre(request.getParameter("nombre"));
		usuario.setApellido(request.getParameter("apellido"));
		
		int usuarioCreado=0; 
		try {
			usuarioCreado = usuarioService.save(usuario);
		}catch(ServiceException se) {
			System.out.println("Ocurrio un error: " + se.getMessage());
		}
		request.setAttribute("usuarioCreado", usuarioCreado > 0 );
		RequestDispatcher miDispacher = request.getRequestDispatcher("private/usuarios/crearUsuario.jsp");
		miDispacher.forward(request, response);
		
	}

}
