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
	<c:url var="componente_post_url" value="/componente/register" />
	<form:form action="${save_componente_url}" method="post"
		modelAttribute="componentes">

		<form:label path="desc_componente">Descricao:</form:label>
		<br>
		<form:input type="text" path="desc_componente" />
		<br>
		
		<input type="submit" name="salvar" value="Salvar" />
	</form:form>
</body>
</html>