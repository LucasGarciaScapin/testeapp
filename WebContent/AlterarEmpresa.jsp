<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt"%>
<c:url value="/alterarEmpresa" var="linkedPath"/>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrando nova empresa</title>
</head>
<body>
	<form action="${linkedPath}" method="POST">
		Nome: <input type="text" name="nome" value="${empresa.nome}">
		Data Abertura:  <input type="text" name="data" value="<fmt:formatDate value="${empresa.data}" pattern="dd/MM/yyyy"/>">
		<input type="hidden" name="id" value="${empresa.id}"/>
		<input type="submit">
	</form>
</body>
</html>