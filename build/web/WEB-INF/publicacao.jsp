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
        <!-- <link href="style.css" rel="stylesheet" type="text/css" /> -->  

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
                <div class="panel-heading">Escreva seu texto aqui</div>
                <div class="panel-body">
                    
                    <form action="publicacao" method="POST" accept-charset="utf-8">
                        
                        <label for="titulo">Titulo:</label>
                        <input type="text" name="titulo" id="titulo">
                        
                        <!-- <textarea rows="4" cols="50">
                            Utilize esta área para escrever seu post
                        </textarea> -->
                        <input type="submit" value="inserir">
                    </form>

                </div>
            </div>

        <%-- Rodapé --%>
        <jsp:include page="/WEB-INF/_footer.jsp"></jsp:include>
    </body>   

</html>
