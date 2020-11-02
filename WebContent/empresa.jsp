<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Required meta tags -->
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous" />
<title>Gestión de Nóminas</title>
</head>
<body>
	<header class="container text-white bg-dark">
		<h1>GESTIÓN DE NÓMINAS</h1>
	</header>
	<div class="container p-5">
		<div class="row">
			<div class="col-md-4">
				<a class="btn btn-info"
				href="${pageContext.request.contextPath}/ServletController?action=listEmployees">Obtener
				lista de empleados</a>
			</div>
			<div class="col-md-4">
				<a class="btn btn-info"
				href="${pageContext.request.contextPath}/ServletController?action=searchEmployee">Buscar
				sueldo de un empleado</a>
			</div>
			<div class="col-md-4">
				<a class="btn btn-info"
				href="${pageContext.request.contextPath}/ServletController?action=modifyEmployee">Modificar
				datos de un empleado</a>
			</div>
		</div>
	</div>

	<!-- jQuery, Popper.js, and Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
		integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js"
		integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s"
		crossorigin="anonymous"></script>
</body>
</html>