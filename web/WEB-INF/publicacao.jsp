<%-- 
    Document   : pulbicacao
    Created on : 13/10/2016, 21:57:15
    Author     : thayn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Publicação de conteúdo - Startup Weekend</title>
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
                <div class="panel-heading" align= "center">Escreva aqui sua publicação</div>
                <div class="panel-body" align= "center">
                    <form action="publicacao" method="POST" enctype="multipart/form-data" accept-charset="utf-8">
                        <label for="titulo">Título da publicação:</label>
                        <input type="text" name="titulo" id="titulo" placeholder="Título" size="40">
                        <br>
                        <br>
                        
                        <textarea placeholder="Utilize esta área para escrever sua publicação" rows="10" cols="60" name="texto" id="texto"></textarea > 
                        <input type="file" name="file" />
                        <br>
                        <br>
                        <progress id="progress" value="0"></progress>
                        <button id="enviando" type="submit" value="Enviar">Enviar</button>
                        <br>
                        <span id="display"></span>
                        <br>
                        
                        <script>
                            function upload(a){var b=new XMLHttpRequest;b.open("POST","./publicacao",!0),b.upload&&(b.upload.onprogress=function(a){a.lengthComputable&&(progressBar.max=a.total,progressBar.value=a.loaded,display.innerText=Math.floor(a.loaded/a.total*100)+"%")},b.upload.onloadstart=function(a){progressBar.value=0},b.upload.onloadend=function(a){progressBar.value=a.loaded,loadBtn.disabled=!1,loadBtn.innerHTML="100%"}),b.send(a)}function buildFormData(){for(var a=new FormData,b=0;b<3e3;b+=1)a.append("data[]",Math.floor(999999*Math.random()));return a}var progressBar=document.getElementById("progress"),loadBtn=document.getElementById("enviando"),display=document.getElementById("display");loadBtn.addEventListener("click",function(a){this.disabled=!0,this.innerHTML="Enviando...",upload(buildFormData())});
                        </script>                         
                        
                    </form>
                </div>
            </div>
        </div>
        
        <div class="col-md-3"></div>

        <%-- Rodapé --%>
        <jsp:include page="/WEB-INF/_footer.jsp"></jsp:include>
        
    </body>   

</html>
