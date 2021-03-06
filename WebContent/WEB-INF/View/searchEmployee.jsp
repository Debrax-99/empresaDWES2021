<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <!-- Required meta tags -->
    <meta charset="utf-8" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1, shrink-to-fit=no"
    />

    <!-- Bootstrap CSS -->
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
      integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
      crossorigin="anonymous"
    />
<title>Buscar Empleado</title>
</head>
<body>
	<header class="container text-dark bg-secondary">
		<h1>SUELDO DE UN EMPLEADO</h1>
	</header>
	<div class="container">
		<div class="row">
			<form class="form-group" method="post" action="${pageContext.request.contextPath}/ServletController?action=getSalary">
				<label for="dni">DNI:</label>
				<input class="form-control" type="text" name="dni" pattern="^[0-9]{8,8}[A-Z]$" placeholder="Introduzca el DNI" required/>
				<small>Introduzca 8 números seguidos de una letra mayúscula</small>
				<input class="btn btn-secondary m-2" type="submit" value="Enviar"/>
			</form>
		</div>
		<div class="row">
			<p>DNI: ${dni}</p>
			<br>
			<p>Sueldo: ${salary}</p>
		</div>
		<div class="row">
			<a class="btn btn-info" href="empresa.jsp">Volver</a>
		</div>
	</div>
	
	<!-- jQuery, Popper.js, and Bootstrap JS -->
    <script
      src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
      integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
      integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js"
      integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s"
      crossorigin="anonymous"
    ></script>
</body>
</html>