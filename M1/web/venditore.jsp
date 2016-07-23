<%-- 
    Document   : venditore
    Created on : 2-mag-2016, 19.33.01
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
        <title>Venditore</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Edoardo Maria Sanna">
        <meta name="keywords" content="Climbyourlimits,Venditore">
        <link href="style.css" rel="stylesheet" type="text/css" media="screen">
    </head>
    <body>
        <div class="page">
        
            <%@ include file="BlocchiDinamici/header.jsp" %> 
            
            
            
            <%@ include file="BlocchiDinamici/sidebarleft_log.jsp" %>
            
        
        <%@ include file="BlocchiDinamici/sidebarright.jsp" %>
        <c:choose>
            
            <c:when test="${problema == true}">
                <div class="restrict"><h3 class="err">Tutti i campi sono Obbligatori!</h3></div>
            </c:when>
            
                        <c:when test="${riepilogo == true}">
                        <div id="tabella2">
            <h3 class="err"> Riepilogo Inserimento </h3>
            <table>  
                <tr>
                    <th> Nome Oggetto </th>
                    <th> Foto </th>
                    <th> Descrizione </th>
                    <th> Pezzi disponibili </th>
                    <th> Prezzo </th>
                </tr>
                
                <tr class="disp">
                    <td> ${addobj.getNomeOgg()} </td>
                    <td> <img title="Foto" src="${addobj.getUrlOgg()}" 
                              width="150" height="150" alt="Foto ${addobj.getNomeOgg()}"/> </td>
                    <td> ${addobj.getDescrizOgg()} </td>
                    <td> ${addobj.getquantitaOgg()} </td>
                    <td> ${addobj.getPrezOgg()} € </td>
                </tr>
            </table>
                
            
                
            </div>
        </c:when>
                
            <c:when test="${venditore_autenticato == true}">
        <h3>Bentornato carissimo ${venditore.getUsernameVend()} Il suo Saldo è: ${Saldo.Saldo}</h3>    
            <div class="testo">
        <h2>Inserisci il tuo Articolo</h2>
        <form method="post" action="venditore.html">
            <div id="vendcentr">
            <div>
            <label for="NomeOggetto">Nome Oggetto</label>
            <input type="text" name="NomeOggetto" value=" " id="NomeOggetto"/>
            </div>
            <div>
            <label for="URLimg">URL Immagine</label>
            <input type="url" name="URLimg" value=" " id="URLimg"/>
            </div>
            <div>
            <label for="Descrizione">Descrizione</label>
            <textarea name="Descrizione" id="Descrizione" rows="10" cols="40">Descrizione Oggetto</textarea>
            </div>
            <div>
            <label for="Prezzo">Prezzo</label>
            <input type="number" name="Prezzo" id="Prezzo"/>
            </div>
            <div>
            <label for="disponibili">Pezzi Disponibili</label>
            <input type="number" name="disponibili" id="disponibili"/>
            </div>
            <div>
            <input class="Bottone" type="submit" name="submitvenditore" value="Carica"/>
            <input class="Bottone" type="reset" name="resetvenditore" value="Rimuovi"/>
            </div>
            </div>
               
        </form>
            </div>
            </c:when>
        

        
        <c:when test="${compratore_autenticato == true}">
            <div class="restrict"><h3 class="err">Area Riservata ai Venditori!</h3></div>
        </c:when>
        </c:choose>
        
        
<%@ include file="BlocchiDinamici/footer.jsp" %>
        
        </div>
    </body>
</html>

