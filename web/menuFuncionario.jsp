<%-- 
    Document   : menuFuncionario
    Created on : 06/04/2015, 11:13:49
    Author     : Leticia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="buttons.css" >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Funcionario </title>
    </head>
    <body>
        <h1>Menu Funcionario</h1>
        <form action="Controller" method="POST" id="ingresso_form">          
            <input type="hidden" name="command" value="ingressocmd">
<!--            <input type="hidden" name="valor" value="teste">-->
            <button type="submit" name="ae" class="button" value="nois">Ingresso</button>
        </form>
    </body>
</html>
