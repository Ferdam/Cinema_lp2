<%-- 
    Document   : index
    Created on : 07/04/2015, 11:07:49
    Author     : Daniel Meyer | Vinicius Zamarrenho | Leticia Lopes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <link rel="stylesheet" href="buttons.css" >
        <link rel="stylesheet" href="login_styles.css" >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login</title>
    </head>
    <body>

        <div class="login">
            <h1>-LOGO/PAGINA LOGIN-</h1>
            <form action="Controller" method="POST" id="login_form">
                <input type="text" name="user" placeholder="Usuario" required="required" />
                <input type="password" name="pass" placeholder="Senha" required="required" />
                <input type="hidden" name="command" value="login">
                <button type="submit" class="button" value="ENTRAR">Entrar</button>
            </form>
        </div>

    </body>
</html>
