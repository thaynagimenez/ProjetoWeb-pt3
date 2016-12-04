<!--menu-->
<nav class="menu">
    <div class="container">
        <ul>
            <li><a target="_blank" href="/WebProjeto2/home"><img alt="Sw-logo-white" src="img/sw-logo-white-532a0ec919a9f54c31e35b924c7c55f1.svg"></a></li>
                <li>
                    <div class="find event-search col-lg-offset-1">						
                        <div>
                        <form action="./busca" method="get" accept-charset="utf8">
                            <input class="form-control" id="parametro" name="parametro" placeholder="Find" size="50" type="text" value="" autocomplete="off"/>
                            <a href="/WebProjeto2/busca">GO</a>
                            <!-- Mostra resultado da busca -->
                            <ul id="container" style="background-color: white"></ul>
                            <script type="text/javascript" src="/scripts/busca.js"></script> 
                        </form>
                    </div>
                </div>
            </li>
            <li>
                <a href="/WebProjeto2/perfil">Perfil<span></span></a>
            </li>
            <li>
                <a href="/WebProjeto2/publicacao">+ Nova Publicação<span></span></a>
            </li>
        </ul>
    </div>
</nav>