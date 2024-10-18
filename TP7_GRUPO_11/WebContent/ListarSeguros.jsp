<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="entidad.Seguro" %>
<%@ page import="servlets.ListarSegurosServlet" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de Seguros</title>
	<style>
		body {
		    font-family: Arial, sans-serif;
		    margin: 20px;
		}
		
		a {
		    text-decoration: none;
		    color: #5A5A5A;
		    margin-right: 20px;
		}
		
		a:hover {
		    text-decoration: underline;
		}
		
		h1 {
		    font-size: 1.5em;
		    color: #333;
		}
		
		.form-grid {
		    margin-bottom: 20px;
		}
		
		label {
		    font-weight: bold;
		    margin-right: 10px;
		}
		
		select {
		    padding: 5px;
		    margin-right: 10px;
		}
		
		button {
		    background-color: #4CAF50;
		    color: white;
		    border: none;
		    padding: 5px 10px;
		    cursor: pointer;
		}
		
		button:hover {
		    background-color: #45a049;
		}
		
		table {
		    width: 100%;
		    border-collapse: collapse;
		    margin-top: 20px;
		}
		
		table, th, td {
		    border: 1px solid #ddd;
		}
		
		th, td {
		    padding: 10px;
		    text-align: left;
		}
		
		th {
		    background-color: #f2f2f2;
		}
		
		tr:nth-child(even) {
		    background-color: #f9f9f9;
		}
		
		tr:hover {
		    background-color: #f1f1f1;
		}
	</style>
</head>
<body>
    <a href="Inicio.jsp">Inicio</a>
    <a href="servletSeguro">Agregar seguro</a>
    <a href="ListarSegurosServlet">Listar seguros</a>

    <header>
        <h1>"Tipo de seguros de la base de datos"</h1>
    </header>

    <form method="GET" action="ListarSegurosServlet">
	    <label for="tipoSeguro">Búsqueda por tipo de Seguros:</label>
		    <select id="tipoSeguro" name="tipoSeguro">
		        <%
		            ArrayList<String> listaTiposSeguros = (ArrayList<String>) request.getAttribute("listaTiposSeguros");
		            if (listaTiposSeguros != null) {
		                for (String tipoSeguro : listaTiposSeguros) {
		        %>
		        <option value="<%=tipoSeguro.substring(tipoSeguro.indexOf("-") + 2)%>"><%=tipoSeguro%></option>
		        <%
		                }
		            }
		        %>
		    </select>
	    <button type="submit">Filtrar</button>
	</form>

    <table>
        <thead>
            <tr>
                <th>ID seguro</th>
                <th>Descripción seguro</th>
                <th>Descripción tipo seguro</th>
                <th>Costo contratación</th>
                <th>Costo máximo asegurado</th>
            </tr>
        </thead>
        <tbody>
            <%
                ArrayList<Seguro> listaSeguros = (ArrayList<Seguro>) request.getAttribute("listaSeguros");
                if (listaSeguros != null) {
                    for (Seguro seguro : listaSeguros) {
            %>
            <tr>
                <td><%=seguro.getId()%></td>
                <td><%=seguro.getDescripcion()%></td>
                <td><%=seguro.getTipoDescripcion()%></td>
                <td><%=seguro.getCosto()%></td>
                <td><%=seguro.getCostoMaximo()%></td>
            </tr>
            <%
                    }
                } else {
            %>
            <tr>
                <td colspan="5">No se encontraron seguros</td>
            </tr>
            <%
                }
            %>
        </tbody>
    </table>
</body>
</html>