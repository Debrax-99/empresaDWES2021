<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Empleados</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>Nombre</th>
				<th>DNI</th>
				<th>Sexo</th>
				<th>Categoría</th>
				<th>Años trabajados</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="employee">
				<tr>
					<td>${employee.name}</td>
					<td>${employee.dni}</td>
					<td>${employee.sex}</td>
					<td>${employee.category}</td>
					<td>${employee.years}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br><br>
	<a href="empresa.jsp">Volver</a>
</body>
</html>