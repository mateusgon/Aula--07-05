<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@include file="jspf/cabecalho.jspf" %>
        <h1> Introdu��o </h1>
        <p> 
            Ol� ${nome}!
        </p>
            <c:if test="${idade>0}">
                <p> Voc� tem ${idade} anos! </p>
        </c:if>
                <ul>
                <c:forEach items="${numeros}" var="numero">
                    <li> ${numero} </li>
                </c:forEach>
                </ul>
        <p>S�o <%= new Date() %></p>
        <%@include file="jspf/rodape.jspf" %>
