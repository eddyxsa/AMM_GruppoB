/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Model.Oggetti;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Utente
 */
@WebServlet(name = "venditore", urlPatterns = {"/venditore.html"})
public class venditore extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(false);
        request.setAttribute("riepilogo", false);
        
        if (session.getAttribute("id") == null){
            request.setAttribute("compratore_autenticato", true);
            request.getRequestDispatcher("venditore.jsp").forward(request, response);
        }
        
        else if (session.getAttribute("id") != null){
            switch ((String)session.getAttribute("idutente")){
                case("cliente"):{
                    request.setAttribute("compratore_autenticato", true);
                    request.getRequestDispatcher("venditore.jsp").forward(request, response);
                }
                case("venditore"):{
                    if (request.getParameter("submitvenditore") != null){
                        Oggetti addobj = new Oggetti ();
                        addobj.setNomeOgg(request.getParameter("NomeOggetto"));
                        addobj.setUrlOgg(request.getParameter("URLimg"));
                        addobj.setDescrizOgg(request.getParameter("Descrizione"));
                        try {
                            addobj.setquantitaOgg(Integer.parseInt(request.getParameter("disponibili")));
                        }
                        catch (Exception e) {
                            addobj.setquantitaOgg(0);
                        }
                        try {
                            addobj.setPrezOgg(Double.parseDouble(request.getParameter("Prezzo")));
                        }
                        catch (Exception e) {
                            addobj.setPrezOgg(0.0);
                        }
                        
                        if (addobj.getNomeOgg() != null && addobj.getUrlOgg() != null && addobj.getDescrizOgg() != null &&
                            addobj.getquantitaOgg() != 0 && addobj.getPrezOgg() != 0.0) {
                          
                        
                            request.setAttribute("addobj", addobj);
                            request.setAttribute("riepilogo", true);
                            request.getRequestDispatcher("venditore.jsp").forward(request, response);
                    
                        }
                        else {
                            request.setAttribute("problema", true);
                            request.getRequestDispatcher("venditore.jsp").forward(request, response);
                        }
                    }
                    
                }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
