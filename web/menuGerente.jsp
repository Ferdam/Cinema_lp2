<%-- 
    Document   : menuGerente
    Created on : 06/04/2015, 11:14:08
    Author     : Daniel Meyer, Daniel Meyer | Vinicius Zamarrenho | Leticia Lopes Lopes, Vinicius Zamarrenho
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
        <script src="functions.js"></script>
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

                    <jsp:include page="sidemenu_ger.jspf" flush="true"/>

                    <!--*******************************************************************-->

                </div>  
                <div class='content'>
                    <div class='title'>
                        LOGO 
                        </div>
                        <div class="footer"><p>Footer.</p></div>  
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>