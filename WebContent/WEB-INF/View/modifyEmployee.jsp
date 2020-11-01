<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modificar Empleado</title>
</head>
<body>
	<form method="post"
		action="${pageContext.request.contextPath}/ServletController?action=getEmployee">
		<label for="dni">DNI:</label> <input type="text" name="dni"
			pattern="^[0-9]{8,8}[A-Z]$" placeholder="Introduzca el DNI" required />
		<br> <small>Introduzca 8 números seguidos de una letra
			mayúscula</small> <br> <input type="submit" value="Enviar" />
	</form>
	<br>
	<br>
	<form>
		<label for="name">Nombre:</label>
		<input type="text" name="name" value="${employee.name}" required />
		<br>
		<label for="dni">DNI:</label>
		<input type="text" name="dni" pattern="^[0-9]{8,8}[A-Z]$" value="${employee.dni}" required />
		<br>
		<small>Introduzca 8 números seguidos de una letra mayúscula</small>
		<br>
		<label for="sex">Sexo:</label>
		<input type="text" name="sex" pattern="^[HM]$" value="${employee.sex}" required />
		<br>
		<small>Escriba H o M</small>
		<br>
		<label for="category">Categoría:</label>
		<input type="text" name="category" pattern="^([1-9]|10)$" value="${employee.category}" required />
		<br>
		<small>Introduzca un número del 1 al 10</small>
		<br>
		<label for="years">Años trabajados:</label>
		<input type="text" name="years" pattern="^\d+$" value="${employee.years}" required />
		<br>
		<small>Introduzca sólo números</small>
		<br>
		<input type="submit" value="Enviar" />
	</form>
	<br>
	<br>
	<a href="empresa.jsp">Volver</a>
</body>
</html>