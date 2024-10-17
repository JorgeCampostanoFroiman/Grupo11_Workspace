<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de seguros</title>
</head>
<body>
<a href="Inicio.jsp">Inicio</a><a href="AgregarSeguro.jsp">Agregar Seguro</a><a href="ServletSeguros.jsp">Listar Seguro</a>

<h4> "Tipos de seguros de la base de datos"</h4>


<form class="form-container" method="get" action="servletSeguroListar">
     
        <div class="form-grid">
            <label for="busquedaTipoSeguro">Busqueda por tipos de seguros</label>
            
            <select id="busquedaTipoSeguro" name="busquedaTipoSeguro" style="width: 120px; ">
            <%
                   
             %>
            </select><input class="form-grid" type="submit" name="btnAceptar" value="Filtrar" style="height: 27px; ">
 		 <div></div>|
        </div>
    </form>



</body>
</html>