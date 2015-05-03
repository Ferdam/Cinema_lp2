<%-- 
    Document   : menuGerente
    Created on : 06/04/2015, 11:14:08
    Author     : Daniel Meyer, Leticia Lopes, Vinicius Zamarrenho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="menu_style.css" >
        <link rel="stylesheet" href="menu_buttons.css" >
        <link rel="stylesheet" href="sidemenu_styles.css" >
    </head>
    <body>
        <div class='wrapper'>
            <div class='header'>
                <div class='title stripe_bg'>
                    <b>Sistema de Cinema</b>
                </div>
                <div class='user'>
                    <div class='name'>
                        <a href="#" title="Usuario">Gerente Gerenciando</a>
                    </div>
                    <div class='logout'>
                        <a href="#" title="Logoff">Logoff</a>
                    </div>
                </div>
            </div>
            <div class='main'>
                <div class='nav'>
                    <div class='search'>
                        <input placeholder='Search' type='text'>
                    </div>
                    <!--**********************|COLLAPSABLE SIDE MENU|**********************-->

                    <ol id="menutree">


                        <li>
                            <label class="menu_label" for="c1">Vendas</label>
                            <input type="checkbox" id="c1" checked />
                            <ol>
                                <li class="page_sel"><a href="#">Ingressos</a></li>
                            </ol>
                        </li>

                        <li>
                            <label class="menu_label" for="c2">Menu type 2</label>
                            <input type="checkbox" id="c2" />                  
                            <ol>
                                <li class="page"><a href="#">Page1</a></li>
                                <li class="page"><a href="#">Page2</a></li>
                                <li class="page"><a href="#">Page3</a></li>
                            </ol>
                        </li>

                    </ol>

                    <!--*******************************************************************-->

                </div>  
                <div class='content'>
                    <div class='title'>
                        Venda de Ingressos
                    </div>
                    <div class='grid'>
                        <div class='col'>
                            <div class='head'>
                                Primeiro painel
                            </div>
                            <form method="post">
                                <table>
                                    <tbody>
                                        <tr>
                                            <td><label>1o Item :</label></td>
                                            <td><input id="identifiant" readonly="true" name="identifiant" type="text" value="test" /></td>
                                        </tr>
                                        <tr>
                                            <td><label>2o Item :</label></td>
                                            <td><input required="required" id="identifiant" name="identifiant" type="text" /></td>
                                        </tr>
                                    </tbody>
                                </table>
                                <div class='btnset'>
                                    <input class="button pri" type="submit" name="submit" value="Ok" />
                                </div>

                            </form>
                        </div>
                        <div class="footer"><p>Footer.</p></div>  
                    </div>
                </div>
            </div>
    </body>
</html>
