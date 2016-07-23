/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Model.Oggetti;
import Model.Oggetti_Factory;
import Model.Utenti_Clienti_Factory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(name = "cliente", urlPatterns = {"/cliente.html"})
public class cliente extends HttpServlet {

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
        
        ArrayList<Oggetti> ListaOggetti = new ArrayList<>();
        ListaOggetti = Oggetti_Factory.getInstance().getListaOggetti();
        
        if (session.getAttribute("id") == null){
            request.setAttribute("venditore_autenticato", true);
            request.getRequestDispatcher("cliente.jsp").forward(request, response);
        }
        else if (session.getAttribute("id") != null){
            switch ((String)session.getAttribute("idutente")){
                case ("venditore"): {
                    request.setAttribute("venditore", true);
                    request.getRequestDispatcher("cliente.jsp").forward(request, response);
                }
                case ("cliente"): {
                    if (request.getParameter("OggId") != null) {
                        Oggetti pack = Oggetti_Factory.getInstance().getOggetti(Integer.parseInt(request.getParameter("OggId")));
                        request.setAttribute("pack", pack);
                        request.setAttribute("riepilogo", true);
                        request.getRequestDispatcher("cliente.jsp").forward(request, response);
                    }
                    else if (request.getParameter("packId") != null){
                        int saldo = Utenti_Clienti_Factory.getInstance().getUtenti_Clienti((int) session.getAttribute("idCliente")).getIdContoCliente();
                        Oggetti pack = Oggetti_Factory.getInstance().getOggetti(Integer.parseInt(request.getParameter("packId")));
                        
                        if (saldo > pack.getPrezOgg()) {
                            request.setAttribute("pack", pack);
                            request.setAttribute("aquisto", true);
                            request.getRequestDispatcher("clienti.jsp").forward(request, response);
                        }
                        
                        else {
                            request.setAttribute("noacquisto", true);
                            request.getRequestDispatcher("cliente.jsp").forward(request, response);
                        }
                    }
                    else {
                        request.setAttribute("compratore_autenticato", true);
                        request.setAttribute("ListaOggetti", ListaOggetti);
                        request.getRequestDispatcher("cliente.jsp").forward(request, response);
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
