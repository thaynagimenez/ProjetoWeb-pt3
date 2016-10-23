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

        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    </head>

    <body>
        <%-- Cabeçallho --%>
        <jsp:include page="/WEB-INF/_header.jsp"></jsp:include>


            <div class="panel panel-default">
                <div class="panel-heading">Cadastro de novo usuario</div>
                <div class="panel-body">

                    <!--Formulário de cadastro -->
                    <form action="cadastro" method="POST" accept-charset="utf-8">
                        <div class="form-group">
                            <label for="nome">Nome :</label>
                            <input type="text" name="nome" id="nome">
                    </div>

                    <div class="form-group">
                        <label for="login">Login :</label>
                        <input type="text" name="login" id="login">
                    </div>

                    <div class="form-group">
                        <label for="senha">Senha : </label>
                        <input type="text" name="senha" id="senha">
                    </div>

                    <div class="form-group">
                        <label for="senha2">Repita sua senha : </label>
                        <input type="text" name="senha2" id="senha2">
                    </div>
                    <input type="submit" value="Cadastrar">
                </form>

            </div>
        </div>

        <%-- Rodapé --%>
        <jsp:include page="/WEB-INF/_footer.jsp"></jsp:include>
    </body>
</html>
