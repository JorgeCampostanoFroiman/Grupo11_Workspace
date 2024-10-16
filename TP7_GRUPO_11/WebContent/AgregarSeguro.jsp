<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agregar Seguro</title>
<style>
        .form-grid {
            display: grid;
            grid-template-columns: 1fr 2fr;
            gap: 10px; /
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

<a href="">Inicio</a><a href="AgregarSeguro.jsp">Agregar Seguro</a><a href="">Listar Seguro</a>


 <form class="form-container" method="get" action="servletSeguro">
        <div class="form-grid">
            <label for="txtId">Id Seguro</label>
           <input type="text" id="txtId" name="txtId" 
       value="<%= request.getAttribute("obtenerUltimoID") != null ? (int)request.getAttribute("obtenerUltimoID") : "" %>" 
       readonly>
        </div>

        <div class="form-grid">
            <label for="txtDescripcion">Descripción</label>
            <input type="text" id="txtDescripcion" name="txtDescripcion">
        </div>

        <div class="form-grid">
            <label for="tipoSeguro">Tipo de Seguro</label>
            
            <select id="tipoSeguro" name="tipoSeguro">
            <% 
                    // Obtener la lista de seguros del atributo
                    ArrayList<String> listaSeguros = (ArrayList<String>) request.getAttribute("listaSeguros");
                    
                    // Verificar que la lista no esté vacía
                    if (listaSeguros != null) {
                        for (String tiposeguro : listaSeguros) { 
                %>
                            <option value="<%= tiposeguro %>"><%= tiposeguro %></option>
                <% 
                        } 
                    } 
                %>
            </select>
        </div>

        <div class="form-grid">
            <label for="txtCosto">Costo Contratación</label>
            <input type="number" id="txtCosto" name="txtCosto">
        </div>

        <div class="form-grid">
            <label for="txtCostoMaximo">Costo Máximo Asegurado</label>
            <input type="number" id="txtCostoMaximo" name="txtCostoMaximo">
        </div>
        <div><input class="form-grid" type="submit" name="btnAceptar" value="Aceptar"></div>
    </form>


</body>
</html>