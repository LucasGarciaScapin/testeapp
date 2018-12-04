<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/removeEmpresa" var="removeEmpresa" />
<c:url value="/mostrarEmpresa" var="mostrarEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Empresas Cadastradas - JSP</title>
</head>
<body>
Lista de Empresas Cadastradas: 
<ul>
 <c:if test="${not empty empresa}">
            Empresa ${ empresa } cadastrada com sucesso!
    </c:if>

	<c:forEach items="${listaEmpresa}" var ="empresa">
		<li>
			${empresa.nome} - <fmt:formatDate value="${empresa.data}" pattern="dd/MM/yyyy"/>  
			<a href="${mostrarEmpresa}?id=${empresa.id}">Editar</a>
			<a href="${removeEmpresa}?id=${empresa.id}">Remove</a>
		</li>
	 </c:forEach>
</ul>
</body>
</html>