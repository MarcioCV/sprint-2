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
	<c:url var="dados_post_url" value="/dados/register" />
	<form:form action="${save_dados_url}" method="post"
		modelAttribute="dados">

		<form:label path="desc_nome">Nome completo: </form:label>
		<br>
		<form:input type="text" path="desc_nome" />
		<br>

		<form:label path="desc_estado">Estado: </form:label>
		<br>
		<form:input type="text" path="desc_estado" />
		<br>

		<form:label path="desc_cidade">Cidade: </form:label>
		<br>
		<form:input type="text" path="desc_cidade" />
		<br>
		
		<form:label path="desc_telefone_celular">Telefone: </form:label>
		<br>
		<form:input type="text" path="desc_telefone_celular" />
		<br>
		
		<form:label path="num_dd">Cidade: </form:label>
		<br>
		<form:input type="number" path="num_dd" />
		<br>
		
		<input type="submit" name="salvar" value="Salvar" />
	</form:form>
</body>
</html>