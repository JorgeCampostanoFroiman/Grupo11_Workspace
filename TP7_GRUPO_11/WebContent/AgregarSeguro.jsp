<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="servlets.servletSeguro" %>
<!DOCTYPE html>
<html>
<head>
    <title>Agregar Seguro</title>
    <style>
        .form-grid {
            display: grid;
            grid-template-columns: 1fr 2fr;
            gap: 10px;
            align-items: center;
            margin-bottom: 15px;
        }

        label {
            justify-self: end;
        }

        .form-container {
            max-width: 500px;
            margin: 0 auto;
        }
    </style>
</head>
<body>

<a href="Inicio.jsp">Inicio</a>
<a href="servletSeguro">Agregar Seguro</a>
<a href="ServletSeguros.jsp">Listar Seguros</a>

<h1>Agregar Seguro</h1>

<% if (request.getAttribute("error") != null) { %>
    <p style="color: red;"><%= request.getAttribute("error") %></p>
<% } %>

<form class="form-container" method="post" action="servletSeguro">
    <div class="form-grid">
        <label for="txtId">Id Seguro</label>
        <input type="text" id="txtId" name="txtId" 
               value="<%= request.getAttribute("obtenerUltimoID") != null ?
            		      request.getAttribute("obtenerUltimoID") : "" %>" readonly>
    </div>

    <div class="form-grid">
        <label for="txtDescripcion">Descripción</label>
        <input type="text" id="txtDescripcion" name="txtDescripcion">
    </div>

    <div class="form-grid">
        <label for="tipoSeguro">Tipo de Seguro</label>
        <select id="tipoSeguro" name="tipoSeguro">
            <% 
                ArrayList<String> listaSeguros = (ArrayList<String>) request.getAttribute("listaSeguros");
                if (listaSeguros != null) {
                    for (String tipo : listaSeguros) {
            %>
                        <option value="<%= tipo.split(" - ")[0] %>"><%= tipo %></option>
            <%      } 
                } 
            %>
        </select>
    </div>

    <div class="form-grid">
        <label for="txtCosto">Costo Contratación</label>
        <input type="number" id="txtCosto" name="txtCosto" step="0.01">
    </div>

    <div class="form-grid">
        <label for="txtCostoMaximo">Costo Máximo Asegurado</label>
        <input type="number" id="txtCostoMaximo" name="txtCostoMaximo" step="0.01">
    </div>

    <div><input class="form-grid" type="submit" name="btnAceptar" value="Aceptar"></div>
</form>

</body>