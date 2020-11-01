<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gestión de Nóminas</title>
</head>
<body>
	<a
		href="${pageContext.request.contextPath}/ServletController?action=listEmployees">Obtener
		lista de empleados</a>

	<br>
	<br>

	<a
		href="${pageContext.request.contextPath}/ServletController?action=searchEmployee">Buscar
		sueldo de un empleado</a>

	<br>
	<br>

	<a
		href="${pageContext.request.contextPath}/ServletController?action=modifyEmployee">Modificar
		datos de un empleado</a>

	<br>
	<br>
</body>
</html>