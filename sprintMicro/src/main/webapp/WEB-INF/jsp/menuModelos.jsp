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
	<c:url var="modelo_post_url" value="/modelo/register" />
	<form:form action="${save_modelo_url}" method="post"
		modelAttribute="modelo">
		
		<form:label path="tp_caminhao">Tipo do caminhão:</form:label>
		<br>
		<form:input type="text" path="tp_caminhao" />
		<br>

		<form:label path="desc_modelo_caminho">Descrição do modelo:</form:label>
		<br>
		<form:input type="text" path="desc_modelo_caminho" />
		<br>

		<form:label path="ano_frabricacao">Ano de fabricação: </form:label>
		<br>
		<form:input type="number" path="ano_frabricacao" />
		<br>
		
		<input type="submit" name="salvar" value="Salvar" />
	</form:form>
</body>
</html>