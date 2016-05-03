<%-- 
    Document   : login
    Created on : 2-mag-2016, 19.32.41
    Author     : Utente
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Edoardo Maria Sanna">
        <meta name="keywords" content="Climbyourlimits, Login">
        <link href="style.css" rel="stylesheet" type="text/css" media="screen">
    </head>
    <body>

        <div class="page">
        
        <%@ include file="BlocchiDinamici/header.jsp" %> 
            
        <%@ include file="BlocchiDinamici/siderbarleft.jsp" %>
        
        <%@ include file="BlocchiDinamici/sidebarright.jsp" %> 
        
        <div class="testo">
            <div id="accedi">
            <h2>Accedi</h2>
            </div>
            <c:choose>
            <c:when test="${empty utente_autenticato}">
                <form method="post" action="login.html">
                  <div id="vendcentr">
                  <div>
                    <label for="utente">Username</label>
                    <input type="text" name="utente" 
                           id="utente" value="Username" />
                  </div>
                  <div>
                    <label for="psw">Password</label>
                    <input type="password" name="psw"
                           id="psw" value="xxxxx" />
                  </div>
                    <div>
                    <input class="Bottone" type="submit" name="Submit" value="ACCEDI"/>
                    </div>
                  </div>
              
              <c:if test="${not empty login_fallito}">
                    <div class="err">
                        <h3>Username o Password Errati!</h3>
                    </div>
              </c:if>
              </form>
            </c:when>
            
           <c:otherwise> <h2>Benvenuto ${utente_autenticato.UsernameCliente} ${utente_autenticato.UsernameVend}</h2></c:otherwise>
          </c:choose>
                
        </div>
        
        <%@ include file="BlocchiDinamici/footer.jsp" %>
        
        </div>
        
        
       
    </body>
</html>

