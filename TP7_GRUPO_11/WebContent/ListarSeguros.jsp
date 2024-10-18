<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="entidad.Seguro"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<header>
	<h1>Listado de Seguros</h1>
	</header>

	<div class="container">
		<!-- Enlaces a las otras páginas -->
		<div class="nav-links">
			<a href="inicio.jsp">Inicio</a> <a href="AgregarSeguro.jsp">Agregar
				Seguro</a>
		</div>

		<!-- Filtro por tipo de seguro -->
		<div class="form-grid">
			<label for="tipoSeguro">Filtrar por Tipo de Seguro:</label> <select
				id="tipoSeguro" name="tipoSeguro" onchange="filtrarSeguros()">
				<%
					// Obtener la lista de tipos de seguros del atributo
					@SuppressWarnings("unchecked")
					ArrayList<String> listaTiposSeguros = (ArrayList<String>) request.getAttribute("listaSeguros");

					// Verificar que la lista no esté vacía
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

		<!-- Tabla para mostrar los seguros -->
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
					// Obtener la lista de seguros del atributo
					@SuppressWarnings("unchecked")
					ArrayList<Seguro> listaSeguros = (ArrayList<Seguro>) request.getAttribute("listaSeguros");

					// Verificar que la lista no esté vacía
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