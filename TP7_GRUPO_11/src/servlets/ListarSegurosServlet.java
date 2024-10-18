package servlets;

import entidad.Seguro;
import daoImpl.SeguroDaoImpl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ListarSegurosServlet")
public class ListarSegurosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	SeguroDaoImpl segDao = new SeguroDaoImpl();
       
    public ListarSegurosServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
						 throws ServletException, IOException {
		ArrayList<Seguro> listaSeguros = segDao.GetListAll();
		
		ArrayList<String> listaTiposSeguros = segDao.GetTypeAll();
		
		request.setAttribute("listaSeguros", listaSeguros);
		request.setAttribute("listaTiposSeguros", listaTiposSeguros);
		
		request.getRequestDispatcher("ListarSeguros.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
