function loadXMLDoc(url) {
    var xmlhttp;
    //alert(url);
    if (window.XMLHttpRequest){
        xmlhttp=new XMLHttpRequest();}
    else{
        xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    }
        document.getElementById("test").innerHTML = "Carregando";
        xmlhttp.open("GET",url,true);
        xmlhttp.onreadystatechange = function(){
            if(xmlhttp.readyState == 4 && xmlhttp.status == 200){

                document.getElementById("test").innerHTML = xmlhttp.responseText;
            }else{
                if(xmlhttp.readyState == 4)
                    document.getElementById("test").innerHTML = "erro";
                }
    }
    xmlhttp.send(null);
};