<%-- 
    Document   : Principal
    Created on : 22/03/2018, 20:49:31
    Author     : aluno
--%>


<%@page import="com.mycompany.adoptionmaven.pessoa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            pessoa usuario = (pessoa) session.getAttribute("usuariologado");
        %>
    </head>
    <body>
        <h1>Oi, <%=usuario.getNome()%>!</h1>
        <a href="trocar.jsp">Trocar Dados</a>
    </body>
</html>
