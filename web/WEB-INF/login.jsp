<%-- 
    Document   : login
    Created on : 13/10/2016, 21:46:08
    Author     : thayn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype html>
<html>
    <head>

        <title>Login - Startup Weekend</title>

        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Majestic Login Form Widget Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />

        <!-- font files -->
        <link href='//fonts.googleapis.com/css?family=Muli:400,300,300italic,400italic' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Comfortaa:400,300,700' rel='stylesheet' type='text/css'>
        <!-- /font files -->

        <!-- css files -->
        <link href="animate-custom.css" rel="stylesheet" type="text/css" media="all" />
        <link href="style_login.css" rel="stylesheet" type="text/css" media="all" />
        <!-- /css files -->

        <link href="icone.ico" rel="icon" sizes="32x32" type="image/ico" />

    </head>
    <body>	
        <br>
        <div id="container_demo" >
            <a class="hiddenanchor" id="toregister"></a>
            <a class="hiddenanchor" id="tologin"></a>
            <a href="/WebProjeto2/home"><img src="home.png" width="3%" style="margin-left: 20px"></a>
            <div id="wrapper">
                <div id="login" class="animate form">
                    <form  action="login" method="post" autocomplete="on"> 
                        <h2>Login</h2> 
                        <p> 
                            <label for="username" class="uname" data-icon="u" ><span>E-mail</span></label>
                            <input id="username" name="username" required="required" type="text" placeholder="exemplo@exemplo.com"/>
                        </p>
                        <p> 
                            <label for="password" class="youpasswd" data-icon="p"><span>Senha</span></label>
                            <input id="password" name="password" required="required" type="password" placeholder="eg. X8df!90EO" /> 
                        </p>
                        <p class="keeplogin"> 
                            <input type="checkbox" id="brand" value="">
                            <label for="brand"><span></span>Lembrar</label>
                        </p>
                        <p class="login button"> 
                            <input type="submit" value="Login" /> 
                        </p>
                        <p class="change_link">
                            <span>Não é membro?</span>
                            <a href="#toregister" class="to_register">Registre-se</a>
                        </p>
                    </form>
                </div>

                <div id="register" class="animate form">
                    <form  action="cadastro" method="post" autocomplete="on"> 
                        <h2>Cadastro</h2> 
                        <p> 
                            <label for="nome" class="uname" data-icon="u"><span>Nome</span></label>
                            <input id="nome" name="nome" required="required" type="text" placeholder="Nome" />
                        </p>
                        <p> 
                            <label for="email" class="youmail" data-icon="e" ><span>E-mail</span></label>
                            <input id="email" name="email" required="required" type="email" placeholder="exemplo@exemplo.com"/> 
                        </p>
                        <p> 
                            <label for="endereco" class="uname" data-icon="u"><span>Endereço</span></label>
                            <input id="endereco" name="endereco" required="required" type="text" placeholder="Rua Moras, 876 - Centro" />
                        </p>
                        <p> 
                            <label for="senha" class="youpasswd" data-icon="p"><span>Senha</span></label>
                            <input id="senha" name="senha" required="required" type="password" placeholder="eg. X8df!90EO"/>
                        </p>
                        <p> 
                            <label for="senha2" class="youpasswd" data-icon="p"><span>Confirmação de senha</span></label>
                            <input id="senha2" name="senha2" required="required" type="password" placeholder="eg. X8df!90EO"/>
                        </p>
                        <p class="signin button"> 
                            <input type="submit" value="Cadastrar"/> 
                        </p>
                        <p class="change_link">  
                            <span>Já é membro?</span>
                            <a href="login" class="to_register">Login</a>
                        </p>
                    </form>
                </div>
            </div>
        </div>
        
    </body>
    
</html>

