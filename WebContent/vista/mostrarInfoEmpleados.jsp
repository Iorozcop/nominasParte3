<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="beans.EmpleadoBean"%>

<%@page import="java.util.ArrayList" %>    

<%ArrayList<EmpleadoBean> emp =  (ArrayList<EmpleadoBean>)request.getAttribute("empleado"); %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<!-- CSS -->
       <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
	</head>
	<body>
		<div class="container-fluid">
			<h1>EMPLEADOS</h1>     
			
			<table class="table table-striped table-dark">
			        <thead>
		                <th scope="col">Nombre: </th>
		                <th scope="col">Dni</th>
		                <th scope="col">Sexo</th>
		                <th scope="col">Categoría</th>
		                <th scope="col">Años trabajados</th> 
	                </thead>
			<% for (int i=0; i < emp.size(); i++){ %> 
			<tbody>               
	                <tr>
			 <% EmpleadoBean empleado = (EmpleadoBean)emp.get(i); %>	
			 
			 <td> <%= empleado.getNombre() %> </td>
			  <td> <%= empleado.getDni() %> </td>
			  <td> <%= empleado.getSexo() %> </td>
			  <td> <%= empleado.getCategoria() %> </td>
			  <td> <%= empleado.getAnyosTrabajados() %> </td>
			<% } %> 
	
	                   <td></td>
	                </tr>                
	                </tbody>           
	            </table>
	            
	            
	            
	    <% if(emp.size() == 0){ %>
	       <p class="alert alert-danger" role="alert">No hay resultados.</p>
        <%}else{%>   
           <p class="alert alert-success" role="alert">Total de empleados: <%= emp.size() %></p>     
        
	      <%}%>      
	            <form action="index.jsp" method="post">
		           <button type="submit" value="inicio" class="btn btn-outline-dark"> atrás </button>
	            </form>
	      </div>
	      

	      
	      <!-- Bootstrap Scripts -->
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
           
	</body>
</html>