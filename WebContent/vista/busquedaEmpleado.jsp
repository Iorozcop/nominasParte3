<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    <h2>Elige una opción:</h2>
		<br>
		<form action="/nominas3/ServletControlador?action=nombre" method="post">
		   <p>Buscar por nombre:</p>
		   <input type="text" size="30" float= "left" name="nombre">
		  <button type="submit" value="nombre" class="btn btn-outline-dark">Buscar</button>
		</form>
		
		<form action="/nominas3/ServletControlador?action=dni" method="post">
		  <p>Buscar por dni:</p>
		  <input type="text" size="30" float= "left" name="dni">
		  <button type="submit" value="dni" class="btn btn-outline-dark">Buscar</button>
		</form>
		
		<form action="/nominas3/ServletControlador?action=sexo" method="post">
		   <p>Buscar por sexo:</p>
		   <input type="text" size="30" float= "left" name="sexo">
		   <button type="submit" value="sexo" class="btn btn-outline-dark">Buscar</button>
		</form>
		
		<form action="/nominas3/ServletControlador?action=categoria" method="post">
		   <p>Buscar por categoría:</p>
		   <input type="text" size="30" float= "left" name="categoria">
		   <button type="submit" value="categoria" class="btn btn-outline-dark">Buscar</button>
		</form>
		
		<form action="/nominas3/ServletControlador?action=anyos" method="post">
		    <p>Buscar por años trabajados:</p>
		    <input type="text" size="30" float= "left" name="anyosTrabajados">
		   <button type="submit" value="anyos" class="btn btn-outline-dark">Buscar</button>
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