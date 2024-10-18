package servlets;

import entidad.Seguro;
import daoImpl.SeguroDaoImpl;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int ultimoId = segDao.UltimoId();	
		
		ArrayList<String> listaSeguros = segDao.GetTypeAll();

		request.setAttribute("obtenerUltimoID", ultimoId);
		request.setAttribute("listaSeguros", listaSeguros);

		request.getRequestDispatcher("AgregarSeguro.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getParameter("btnAceptar") != null) {
			String descripcion = request.getParameter("txtDescripcion");
			String id_split = request.getParameter("tipoSeguro").split("-")[0];
			int tipoSeguro = Integer.parseInt(id_split);
			BigDecimal costo = new BigDecimal(request.getParameter("txtCosto"));
			BigDecimal costoMaximo = new BigDecimal(request.getParameter("txtCostoMaximo"));

			Seguro nuevoSeguro = new Seguro();
			nuevoSeguro.setDescripcion(descripcion);
			nuevoSeguro.setTipo(tipoSeguro);
			nuevoSeguro.setCosto(costo);
			nuevoSeguro.setCostoMaximo(costoMaximo);

			if (segDao.Insert(nuevoSeguro)) {
				request.setAttribute("Exitoso", "Se agrego el seguro correctamente");
				request.getRequestDispatcher("AgregarSeguro.jsp").forward(request, response);
			} else {
				request.setAttribute("error", "Error al agregar el seguro.");
				doGet(request, response);
			}
		}
	}
}
