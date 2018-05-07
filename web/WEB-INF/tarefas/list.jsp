<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@include file="../jspf/cabecalho.jspf" %>
        <p> Bem vindo </p>
    <ul>
        <c:forEach var="tarefa" items="${tarefas}">
            <li> ${tarefa} </li>
        </c:forEach>
    </ul>
<%@include file="../jspf/rodape.jspf" %>
