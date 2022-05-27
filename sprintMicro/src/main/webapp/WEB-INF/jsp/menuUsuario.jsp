<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:url var="user_post_url" value="/user/register" />
	<form:form action="${save_user_url}" method="post"
		modelAttribute="user">

		<form:label path="nome_user">Login: </form:label>
		<br>
		<form:input type="text" path="nome_user" />
		<br>

		<form:label path="desc_senha">Senha: </form:label>
		<br>
		<form:input type="password" path="desc_senha" />
		<br>

		<form:label path="id_cadastro">ID Cadastro: </form:label>
		<br>
		<form:input type="number" path="id_cadastro" />
		<br>
		
		<input type="submit" name="salvar" value="Salvar" />
	</form:form>
</body>
</html>