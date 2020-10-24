<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario dni</title>
<!-- CSS -->
       <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
<div class="container-fluid">

<% String error = (String)request.getAttribute("error"); 
	if(error.length() > 0){ %>
	<p class="alert alert-danger" role="alert"><%= error %> </p>	
		
	<%}%>

	<form action="/nominas3/ServletControlador?action=Consultar" method="post">
	   <div class="form-group">
		<table class="table table-striped table-dark">
			<tr>
				<td colspan="2">Consultar Salario</td>
			</tr>
			<tr>
				<td>Introduzca dni: </td>
			<td><input type="text" size="30" float= "left" name="dni"></td>
			</tr>
			<tr>
		<!-- <td colspan="2"><a href="/nominas3/ServletControlador?action=Consultar" class="btn btn-dark btn-block text-white"> Consultar </a></td>  -->
				<td colspan="2"><button type="submit" value="Consultar"> Consultar </td>
			</tr>
		</table>
	  </div>	
	</form>
	
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