<%-- 
    Document   : cliente
    Created on : 2-mag-2016, 19.32.50
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
        <title>Cliente</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Edoardo Maria Sanna">
        <meta name="keywords" content="Cliente, Climbyourlimits">
        <link href="style.css" rel="stylesheet" type="text/css" media="screen">
    </head>
    <body>
        <div class="page">
        
        
            <%@ include file="BlocchiDinamici/header.jsp" %> 
            
            <h3>Bentornato carissimo ${compratore.UsernameCliente}</h3>
            
        <%@ include file="BlocchiDinamici/sidebarleft_log.jsp" %>
        
        <%@ include file="BlocchiDinamici/sidebarright.jsp" %>
            
            <div class="testo">
        <h2>I nostri Prodotti</h2>
        <div id="Tabella">
        <table>
            <tr>
                <th>Nome Oggetto</th>
                <th>Foto</th>
                <th>Pezzi Disponibili</th>
                <th>Prezzo</th>
                <th>Add to Cart</th>
            </tr>
            <tr class="disp">
                <td>Tenda Trekking 2 Posti</td>
                <td class="imgtab"><img src="img/8800619266078.jpg" alt="tenda trekking" width="150" height="150"></td>
                <td>12</td>
                <td>69,99€</td>
                <td><a href="/cliente.html">Add to Cart</a></td>
            </tr>
            <tr class="pari">
                <td>Corda Arrampicata 70m</td>
                <td class="imgtab"><img src="img/corda-arrampicata-tendon-smart-lite-98.jpg" alt="corda 70m" width="150" height="150"></td>
                <td>8</td>
                <td>49,99€</td>
                <td><a href="/cliente.html">Add to Cart</a></td>
            </tr>
            <tr class="disp">
                <td>Fornellino da Campo</td>
                <td class="imgtab"><img src="img/$_35.JPG" alt="fornellino" width="150" height="150"></td>
                <td>90</td>
                <td>12,00€</td>
                <td><a href="/cliente.html">Add to Cart</a></td>
            </tr>
            <tr class="pari">
                <td>Scarponi Trekking</td>
                <td class="imgtab"><img src="img/mouflon_kevlar-1-800x800.jpg" alt="scarponi" width="150" height="150"></td>
                <td>37</td>
                <td>80,00</td>
                <td><a href="/cliente.html">Add to Cart</a></td>
            </tr>
            <tr class="disp">
                <td>Imbracatura Professionale</td>
                <td class="imgtab"><img src="img/C38AAA_2.jpg" alt="imbracatura" width="150" height="150"></td>
                <td>17</td>
                <td>38,00€</td>
                <td><a href="/cliente.html">Add to Cart</a></td>
            </tr>
        </table>
        </div>
    </div>
        
        <%@ include file="BlocchiDinamici/footer.jsp" %>
        
        </div>
    </body>
</html>

