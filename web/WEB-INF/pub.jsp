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