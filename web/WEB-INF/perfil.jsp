<%-- 
    Document   : perfil
    Created on : 13/10/2016, 21:57:15
    Author     : thayn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Perfil - Startup Weekend</title>
        <link href="style.css" rel="stylesheet" type="text/css" /> 

        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

        <link href="icone.ico" rel="icon" sizes="32x32" type="image/ico" />

    </head>

    <body>
        <%-- Cabeçallho --%>
        <jsp:include page="/WEB-INF/_header.jsp"></jsp:include>
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <div class="panel panel-default">
                    <div class="panel-heading" align= "center">Usuário</div>
                    <div class="panel-body" align= "center">                        
                        <p>${usuario.login}</p>                            
                    </div>
                </div>

            <div class="panel panel-default">
                <div class="panel-heading" align= "center">Suas publicações
                    <a href="/WebProjeto2/publicacao" style="color: green">+ Nova publicação<span></span></a>
                </div>
                <div class="panel-body" align= "center">
                    <c:forEach items="${publicacoes}" var="publicacao">
                        <form action="ler" method="POST" accept-charset="utf-8">                                
                            <li>${publicacao.titulo}</li>
                            <a href="ler?titulo=${publicacao.titulo}&texto=${publicacao.texto}" style="color: green">[Ler]</a>
                        </form> 
                        <br>
                    </c:forEach>
                </div> 
                <br>
                
                <center>
                    <a href="/WebProjeto2/logout" style="color: green">[SAIR]<span></span></a>
                </center>
                
                <br>
            </div>
        </div>
                    
        <div class="col-md-3"></div>

        <%-- Rodapé --%>
        <jsp:include page="/WEB-INF/_footer.jsp"></jsp:include>
        
    </body>   

</html>
