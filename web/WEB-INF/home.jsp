<%-- 
    Document   : home
    Created on : 13/10/2016, 21:47:24
    Author     : thayn
--%>

<%@page import="model.Publicacao"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <!--Metadados-->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="keyword" content="Startup, Weekend, Network, Learn">
        <meta name="description" content="Startup Weekend - Learn, Network, Startup">
        <meta name="author" content="Ricardo Corassa e Thayna Gimenez">

        <title>Startup Weekend - Learn, Network, Startup</title>

        <!--Folha de estilo-->
        <link href="style.css" rel="stylesheet" type="text/css" />

        <!--Ícone da aba do navegador-->
        <link href="icone.ico" rel="icon" sizes="32x32" type="image/ico" />
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        
        <!--
	<script type="text/javascript" src="/WEB-INF/biblioteca_ajax.js"></script>
        -->
         
        
        <script type="text/javascript">
            function loadXMLDoc2(a){var b;b=window.XMLHttpRequest?new XMLHttpRequest:new ActiveXObject("Microsoft.XMLHTTP"),b.open("GET",a,!0),b.onreadystatechange=function(){4==b.readyState&&200==b.status?document.getElementById("numpub").innerHTML="Número de publicações: "+b.responseText:4==b.readyState&&(document.getElementById("numpub").innerHTML="erro")},b.send(null)}
        </script>
        
        <script>
            $(document).ready(function(){$("#myModal").modal("show"),setTimeout(function(){$("#myModal").modal("hide")},2e3)}),$(window).load(function(){});
        </script>        
        
        <!--Folha de estilo para o drap and drop-->
        <style>
        #div1, #div2 {
            float: left;
            width: 100px;
            height: 50px;
            margin: 10px;
            padding: 10px;
            border: 1px solid black;
        }
        </style>
        
        <!--Drap and drop-->
        <script>
        function allowDrop(a){a.preventDefault()}function drag(a){a.dataTransfer.setData("text",a.target.id)}function drop(a){a.preventDefault();var b=a.dataTransfer.getData("text");a.target.appendChild(document.getElementById(b))}
        </script>
        
    </head>

    <body>
        
        <div class="container">
            <!-- Modal -->
            <div class="modal fade" id="myModal" role="dialog">
                <div class="modal-dialog">
                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">Bem vindo!</h4>
                        </div>
                        <div class="modal-body">
                            <h3><center>Aguarde...</center></h3>
                            <p><center>Estamos terminando o café</center></p>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
        
            
        <script type="text/javascript" charset="utf-8">
            function atualiza(){loadXMLDoc2("./NumPublicacao")}var num_pub;num_pub=setInterval(atualiza,5e3);
        </script>
        
        <%-- Cabeçallho --%>
        <jsp:include page="/WEB-INF/_header.jsp"></jsp:include>

        <!--Seção 1 - Learn, Network, Startup-->
        <section class="sw-hero sw-hero-home inverter-cor">
            <div class="container">
                <div class="col-lg-10 col-lg-offset-1 col-md-12">
                    <h1>Learn, Network, Startup</h1>
                    <p>In just 54 hours, you will experience the highs, lows, fun, and pressure that make up life at a startup. As you learn how to create a real company, you'll meet the very best mentors, investors, cofounders, and sponsors who are ready to help you get started. Your community is here to help you — find an event today!</p>

                    <div class="container hero-search hidden-xs hidden-sm">
                        <div class="row">
                            <div class="col-md-5"><h3>Find an event near:</h3></div>
                            <div class="col-md-7">
                                <form class="form-inline event-search">
                                    <div style="margin:0; padding:0; display:inline">
                                        <input name="utf8" type="hidden"/>
                                    </div>
                                    <div class="form-group">
                                        <input class="form-control" id="event" name="event" placeholder="Find" size="50" type="text" />
                                        <button class="btn btn-white btn-search" name="button" type="submit">Go!</button>
                                        
                                        <ul id="container" style="background-color: white"></ul>
                                        <script type="text/javascript" src="/scripts/busca.js"></script>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <div class="col-md-5"></div>
        <div class="col-md-5">
            <div id="div1" ondrop="drop(event)" ondragover="allowDrop(event)">
              <img src="img_w3slogo.gif" draggable="true" ondragstart="drag(event)" id="drag1" width="80" height="30">
            </div>

            <div id="div2" ondrop="drop(event)" ondragover="allowDrop(event)"></div>
        </div> 
        
        <!--Seção 2 - Introdução -->
        <section class="sw-introduction">
            <div class="container">
                <h2>The hardest part of starting up is starting out. At Startup Weekend, you'll be immersed in the ideal environment for startup magic to happen.</h2>
                <p class="pxl">Surrounded by smart, passionate people and with the best tools and approaches at your disposal, you’ll take giant leaps toward creating a business, becoming a founder, and connecting with the right people and resources.</p>

                <p id="numpub">Número de publicações: </p>
               
               
                <div class="row sw-offset-row">
                <c:forEach items="${lista}" var="lista">
                    <div class="col-md-3 col-sm-6">
                        <div class="sw-content-block sw-block-connect">
                            <div class="sw-block-icon"><img src="menu.png" width="99%"/></div>
                            <form action="ler" method="POST" accept-charset="utf-8">
                                <a href="ler?titulo=${lista.titulo}&texto=${lista.texto}" style="color: black"><h3>"${lista.titulo}"</h3></a>
                            </form>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </section>

    <%-- Rodapé --%>
    <jsp:include page="/WEB-INF/_footer.jsp"></jsp:include>

</body>

</html>
