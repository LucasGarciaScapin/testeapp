<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<c:url value="/novaEmpresa" var="linkedPath"/>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrando nova empresa</title>
</head>
<body>
	<form action="${linkedPath}" method="POST">
		Nome: <input type="text" name="nome">
		Data Abertura:  <input type="text" name="data">
		<input type="submit">
	</form>
</body>
</html>