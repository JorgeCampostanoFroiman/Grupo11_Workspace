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
        String tipoSeguro = request.getParameter("tipoSeguro");
        
        ArrayList<Seguro> listaSeguros = segDao.GetListAll();
        
        if (tipoSeguro != null && !tipoSeguro.isEmpty()) {
        	System.out.println("Entro al if [tipoSeguro != null && !tipoSeguro.isEmpty()]");
            ArrayList<Seguro> segurosFiltrados = new ArrayList<>();
            for (Seguro seguro : listaSeguros) {
            	System.out.println("Valor tipodescripcion: [" + seguro.getTipoDescripcion() + "]");
            	System.out.println("Valor tipodesSeguro: [" + tipoSeguro + "]");
                if (seguro.getTipoDescripcion().equalsIgnoreCase(tipoSeguro)) {
                    segurosFiltrados.add(seguro);
                    System.out.println("Entro al if [seguro.getTipoDescripcion().equalsIgnoreCase(tipoSeguro)]");
                }
            }
            listaSeguros = segurosFiltrados;
            System.out.println("Tipos de seguros obtenidos: " + listaSeguros);
        }

        ArrayList<String> listaTiposSeguros = segDao.GetTypeAll();
        
        request.setAttribute("listaSeguros", listaSeguros);
        request.setAttribute("listaTiposSeguros", listaTiposSeguros);
        
        request.getRequestDispatcher("ListarSeguros.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
