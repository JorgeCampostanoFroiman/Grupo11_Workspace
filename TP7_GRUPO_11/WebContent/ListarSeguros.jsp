<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="entidad.Seguro" %>
<%@ page import="servlets.ListarSegurosServlet" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<a href="Inicio.jsp">Inicio</a>
	<a href="servletSeguro">Agregar Seguro</a>
	<a href="ListarSegurosServlet">Listar Seguros</a>
	
	<header>
	<h1>Listado de Seguros</h1>
	</header>

		<div class="form-grid">
			<label for="tipoSeguro">Filtrar por Tipo de Seguro:</label> <select
				id="tipoSeguro" name="tipoSeguro" onchange="filtrarSeguros()">
				<%
					ArrayList<String> listaTiposSeguros = (ArrayList<String>) request.getAttribute("listaSeguros");

					if (listaTiposSeguros != null) {
						for (String tipoSeguro : listaTiposSeguros) {
				%>
				<option value="<%=tipoSeguro%>"><%=tipoSeguro%></option>
				<%
					}
					}
				%>
			</select>
		</div>

		<table>
			<thead>
				<tr>
					<th>ID</th>
					<th>Descripción</th>
					<th>Tipo</th>
					<th>Costo Contratación</th>
					<th>Costo Asegurado</th>
				</tr>
			</thead>
			<tbody>
				<%
					@SuppressWarnings("unchecked")
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
			
</body>
</html>