var onResize = (function () {
    'use strict';
    var timeWindow = 200; // tempo em ms
    var lastExecution = new Date((new Date()).getTime() - timeWindow);
    var onResize = function (args) {
        // Live - search
            var container = document.querySelector("#container");
            document.querySelector("input")
            .addEventListener("keyup", function () {
            var xmlhttp = new XMLHttpRequest();
                    xmlhttp.open("GET", "buscaTitulos?titulo=" + this.value, true);
                    xmlhttp.onreadystatechange = function () {
                    if (xmlhttp.readyState === 4 && xmlhttp.status === 200) {
                    console.log(xmlhttp.responseText);
                    //JSON Message
                            var artigos = JSON.parse(xmlhttp.responseText);
                            container.innerHTML = "";
                            for (var i = 0; i < (artigos.length); i++) {
                    var li = document.createElement("li");
                            li.innerHTML = artigos[i].titulo;
                            li.className = "";
                            container.appendChild(li);
                    }
                    }
                    };
                    xmlhttp.send();
            });
    };

return function () {
    if ((lastExecution.getTime() + timeWindow) <= (new Date()).getTime()) {
        lastExecution = new Date();
        return onResize.apply(this, arguments);
    }
};
}());
