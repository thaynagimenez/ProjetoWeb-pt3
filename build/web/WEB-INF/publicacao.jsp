<%-- 
    Document   : pulbicacao
    Created on : 13/10/2016, 21:57:15
    Author     : Ricardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina de plublicação de conteúdo</title>
        <link href="style.css" rel="stylesheet" type="text/css" />   
    </head>

    <body>

        <%-- Cabeçallho --%>
        <jsp:include page="/WEB-INF/_header.jsp"></jsp:include>

        <form action="publicacaocontroller" method="POST" accept-charset="utf-8">
            <textarea rows="4" cols="50">
                Utilize esta área para escrever seu post
            </textarea>
            <input type="submit" value="inserir">
        </form>
    </body>   

</html>
