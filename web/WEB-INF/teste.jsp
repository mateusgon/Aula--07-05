<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@include file="jspf/cabecalho.jspf" %>
        <h1> Introdução </h1>
        <p> 
            Olá ${nome}!
        </p>
            <c:if test="${idade>0}">
                <p> Você tem ${idade} anos! </p>
        </c:if>
      
        
        <p>São <%= new Date() %></p>
        <%@include file="jspf/rodape.jspf" %>
