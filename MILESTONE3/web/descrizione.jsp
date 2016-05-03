<%-- 
    Document   : descrizione
    Created on : 2-mag-2016, 18.45.36
    Author     : Utente
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Climb your Limits</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Edoardo Maria Sanna">
        <meta name="keywords" content="Climb, Escursionismo">
        <link href="style.css" rel="stylesheet" type="text/css" media="screen">
    </head>
    <body>
        <div class="page">
            
        <%@ include file="BlocchiDinamici/header.jsp" %> 
        
        <c:choose>
            <c:when test="${venditore_loggato || cliente_loggato}">
                <%@ include file="BlocchiDinamici/sidebarleft_log.jsp" %>
            </c:when>
            
            <c:when test="${!venditore_loggato && !cliente_loggato}">
                <%@ include file="BlocchiDinamici/siderbarleft.jsp" %>
            </c:when>
        </c:choose>
        
        <%@ include file="BlocchiDinamici/sidebarright.jsp" %> 
    
        <div class="testo">
            <h2>Il nostro Mondo</h2>
        <div id="sommario">
            <ul>
            <li><a href="#primo">Cosa Vendiamo</a></li>
            <li><a href="#secondo">Venditori</a></li>
            <li><a href="#terzo">Acquirenti</a></li>
        </ul>
        </div>
            <div id="descr">
        <h3 id="primo">Cosa Vendiamo</h3>
        <p>Il nostro sito &egrave; attrezzato per tutti i tipi di escursionismo, 
            potrai acquistare o vendere qualsiasi tipo di attrezzatura per essere
            preparato ad una nuova avventura attraverso panorami mozzafiato.</p>
        <h3 id="secondo">Venditori</h3>
        <p>I venditori avranno la possibilit&agrave; di pubblicare i loro articoli 
            sul nostro sito in maniera privata, singoli oggetti, o attraverso una 
            partneship che mostrer&agrave; sul nostro sito tutto il loro catalogo, 
            la partnership avrà anche privilegi a livello pubblicitario e di 
            visibilit&agrave; all'interno di 
            CLIMB YOUR LIMITS</p>
        <h3 id="terzo">Acquirenti</h3>
        <p>I nostri clienti potranno acquistare il meglio che c'&egrave; sul mercato
            in quanto a escursionismo, non solo il meglio ma al miglior prezzo sul mercato. 
            Avranno anche la possibilit&agrave; di ricevere aggiornamenti costanti sulle 
            ultime novit&agrave; in fatto di attrezzatura.</p>
            </div>
        </div>
        
        <%@ include file="BlocchiDinamici/footer.jsp" %> 
            
        </div>
    </body>
</html>
