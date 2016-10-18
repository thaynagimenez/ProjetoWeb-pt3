<%-- 
    Document   : cadastro
    Created on : 18/10/2016, 19:44:51
    Author     : Ricardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro - Startup Weekend</title>
    </head>
    <body>
        <%-- Cabeçallho --%>
        <jsp:include page="/WEB-INF/_header.jsp"></jsp:include>


        <!--Formulário de cadastro -->
            <form action="cadastro" method="POST" accept-charset="utf-8">
                <label for="nome">Nome :</label>
                <input type="text" name="nome" value="${cidadeEditar.nome}" id="nome">
            
                <label for="login">Login :</label>
                <input type="text" name="login" value="${cidadeEditar.nome}" id="login">
                
                <label for="senha">Senha : </label>
                <input type="text" name="senha" value="${cidadeEditar.nome}" id="senha">
                
                 <label for="senha2">Repita sua senaha : </label>
                <input type="text" name="senha2" value="${cidadeEditar.nome}" id="senha2">
            <input type="submit" value="Cadastrar">
        </form>



        <%-- Rodapé --%>
        <jsp:include page="/WEB-INF/_footer.jsp"></jsp:include>
    </body>
</html>
