<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="/WebProjeto2/home">Startup Weekend</a>
        </div>
        <ul class="nav navbar-nav">   
            <form action="./busca" method="get" accept-charset="utf8">
                <input id="parametro" name="parametro" placeholder="Find" size="50" type="text" value="" autocomplete="off"/>
                <a href="/WebProjeto2/busca">GO</a>
                <!-- Mostra resultado da busca -->
                <ul id="container" style="background-color: white"></ul>
                <script type="text/javascript" src="/scripts/busca.js"></script>
            </form>
        </ul>
    </div>
</nav>