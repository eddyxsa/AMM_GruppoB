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
            
            
            
        <%@ include file="BlocchiDinamici/sidebarleft_log.jsp" %>
        
        <%@ include file="BlocchiDinamici/sidebarright.jsp" %>
        <c:choose>
            
        <c:when test="${noacquisto == true}">
            <p> Attenzione! Credito insufficiente per acquistare tale oggetto. </p>
            <p> <a href="Cliente.html"> Continua </a> </p>
        </c:when>
        
        <c:when test="${acquisto == true}">
                <p> Oggetto acquistato </p>
                <p> <a href="Cliente.html"> Continua </a> </p>
        </c:when>
            
        <c:when test="${riepilogo == true}">
            <div id="tabella3">
            <table>
                <tr> 
                    <th> Nome </th>
                    <th> Foto </th>
                    <th> Pezzi disponibili </th>
                    <th> Prezzo </th>
                </tr>
               
                <tr class="disp">
                    <td> ${pack.getNomeOgg()} </td>
                    <td> <img title="Foto" src="${pack.getUrlOgg()}" 
                              width="120" height="140" alt="Foto ${pack.getNomeOgg()}"/> </td>
                    <td> ${pack.getquantitaOgg()} </td>
                    <td> ${pack.getPrezOgg()} € </td>
                </tr>
            </table>
                
            <p class="linkp"> <a href="cliente.html?packId=${pack.getidOgg()}"> Conferma </a> </p>
            </div>
        </c:when>
    
            
            <c:when test="${compratore_autenticato == true}">
        <h3>Bentornato carissimo ${compratore.getUsernameCliente()}</h3>    
            <div class="tiesto">
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
            <c:forEach var="ciclo" items="${ListaOggetti}">
            <tr class="disp">
                <td>${ciclo.getNomeOgg()}</td>
                <td class="imgtab"><img src="${ciclo.getUrlOgg()}" alt="tenda trekking" width="150" height="150"></td>
                <td>${ciclo.getquantitaOgg()}</td>
                <td>${ciclo.getPrezOgg()}</td>
                <td><a href="cliente.html?OggId=${ciclo.getidOgg()}">Add to Cart</a></td>
            </tr>
            </c:forEach>
            
        </table>
        </div>
            </div>
            </c:when>
        <c:when test="${venditore_autenticato == true}">
            <div class="restrict"><h3 class="err">Area Riservata ai Clienti!</h3></div>
        </c:when>
            

        
        
            </c:choose>
            <%@ include file="BlocchiDinamici/footer.jsp" %>
        </div>
    </body>
</html>

