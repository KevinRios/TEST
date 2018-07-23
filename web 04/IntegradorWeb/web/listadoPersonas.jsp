<%@page import="ar.com.KevinRios.java.objetos.Persona"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<jsp:include page="template_superior.jsp"></jsp:include>    
    <script>
        $(document).ready(function () {
            $('#tablaPersonas').DataTable({
                lengthMenu: 5
            });

        });
    </script>
    <h1>Lista Personas  </h1>

    <form method="POST" action="BuscarPersonasServlet">
        <input type="text" name= "textoBuscar" placeholder="Buscador...">
        <button type="submit"> Buscar </button>
    </form>

<%
    ArrayList<Persona> personas = (ArrayList<Persona>) request.getAttribute("personas");
%>

<table id="tablaPersonas" class="display" style="width:100%">
    <thead>
        <tr>
            <th> Id </th>
            <th> Nombre </th>
            <th> Apellido </th>
            <th> Email </th>
            <th> Borrar </th>
        </tr>
    </thead>
    <tbody>
        <% for (Persona p : personas) {%>
        <tr>
            <td> <%= p.getIdPersona()%> </td>
            <td> <%= p.getNombre()%> </td>
            <td> <%= p.getApellido()%> </td>
            <td> <%= p.getEmail()%> </td>
            <td><a href=""></td>
            <td> <button type="submit" action="BorrarPersonasServlet"> Borrar </button></td>
        </tr>
        <% }%>  
    </tbody>


</table>




<jsp:include page="template_inferior.jsp"></jsp:include>   
