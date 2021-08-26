package mx.com.sistema.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.sistema.dao.UsuarioDAOImp;
import mx.com.sistema.dao.UsuarioDao;
import mx.com.sistema.models.Usuario;

/**
 * Servlet implementation class CrearUsuario
 */
public class CrearUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
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
		// TODO Auto-generated method stub
		
		Usuario u1 = new Usuario();
		
		int usuarioCreado=0; 
		u1.setNombre(request.getParameter("nombre"));
		u1.setApellido(request.getParameter("apellido"));
		
		UsuarioDao dao = new UsuarioDAOImp();
		try {
			usuarioCreado = dao.insertar(u1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(u1.toString());
		System.out.println(usuarioCreado);
		
		request.setAttribute("usuarioCreado", usuarioCreado);
		
		RequestDispatcher miDispacher = request.getRequestDispatcher("private/usuarios/crearUsuario.jsp");
		miDispacher.forward(request, response);
		
	}

}
