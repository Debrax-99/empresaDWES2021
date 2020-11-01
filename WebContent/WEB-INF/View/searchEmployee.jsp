<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Buscar Empleado</title>
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath}/ServletController?action=getSalary">
		<label for="dni">DNI:</label>
		<input type="text" name="dni" pattern="^[0-9]{8,8}[A-Z]$" placeholder="Introduzca el DNI" required/>
		<small>Introduzca 8 números seguidos de una letra mayúscula</small>
		<br>
		<input type="submit" value="Enviar"/>
	</form>
	<br><br>
	<p>DNI: ${dni}</p>
	<p>Sueldo: ${salary}</p>
	<br><br>
	<a href="empresa.jsp">Volver</a>
</body>
</html>