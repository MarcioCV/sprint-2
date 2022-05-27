<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:url var="info_post_url" value="/informacoes/register" />
	<form:form action="${save_info_url}" method="post"
		modelAttribute="info">
		<form:label path="id_user">ID usuario:</form:label>
		<br>
		<form:input type="text" path="id_user" />
		<br>
		
		<form:label path="id_modelo">ID modelo:</form:label>
		<br>
		<form:input type="text" path="id_modelo" />
		<br>
		
		<form:label path="id_componente">ID Componente:</form:label>
		<br>
		<form:input type="text" path="id_componente" />
		<br>
		<input type="submit" name="salvar" value="Salvar" />
	</form:form>
</body> 
</html>      