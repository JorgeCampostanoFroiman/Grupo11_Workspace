package servlets;
import entidad.Seguro;
import daoImpl.SeguroDaoImpl;
import java.util.ArrayList;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servletSeguro")
public class servletSeguro extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	SeguroDaoImpl segDao = new SeguroDaoImpl();
  
    public servletSeguro() {
        super();

      
    }
    
    
    public class CargaComboServlet extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) 
                throws ServletException, IOException {
            
            request.setAttribute("listaSeguros", segDao.GetTypeAll());
            request.getRequestDispatcher("AgregarSeguro.jsp").forward(request, response);
        }
    }
    
   
    public class ObtenerUltimoID extends HttpServlet
    {
    	 protected void doGet(HttpServletRequest request, HttpServletResponse response) 
                 throws ServletException, IOException {
             
             request.setAttribute("obtenerUltimoID", segDao.UltimoId());
             request.getRequestDispatcher("AgregarSeguro.jsp").forward(request, response);
         }
    	
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
