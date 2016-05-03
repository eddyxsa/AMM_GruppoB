/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Model.Utenti_Clienti;
import Model.Utenti_Clienti_Factory;
import Model.Utenti_Venditori;
import Model.Utenti_Venditori_Factory;
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
@WebServlet(name = "login", urlPatterns = {"/login.html"})
public class login extends HttpServlet {

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
       
            HttpSession session = request.getSession(true);

            
            //Login del compratore
            
        if(request.getParameter("Submit") != null)    
        {
            String UsernameCliente = request.getParameter("utente");
            String PasswordCliente = request.getParameter("psw");
            String UsernameVend = request.getParameter("utente");
            String PasswordVend = request.getParameter("psw");
            ArrayList<Utenti_Clienti> listaClienti = Utenti_Clienti_Factory.getInstance().getlistaClienti ();
            for(Utenti_Clienti c : listaClienti)
                  
            {
                    if(c.getUsernameCliente().equals(UsernameCliente)&&
                       c.getPasswordCliente().equals(PasswordCliente))
                    {
                      session.setAttribute("utente_autenticato", c);  
                      session.setAttribute("compratore_autenticato", c);
                      request.setAttribute("utente_autenticato", c);
                      request.setAttribute("compratore_autenticato", c);
                      request.getRequestDispatcher("cliente.jsp").forward(request, response);
                      
                      
                    }
            }
            
            ArrayList<Utenti_Venditori> listaVenditori = Utenti_Venditori_Factory.getInstance().getListaVenditori();
            for(Utenti_Venditori v : listaVenditori)
                   
            {
                    if(v.getUsernameVend().equals(UsernameVend)&&
                       v.getPasswordVend().equals(PasswordVend))
                        
                    {
                      session.setAttribute("utente_autenticato", v);  
                      session.setAttribute("venditore_autenticato", v);
                      request.getRequestDispatcher("venditore.jsp").forward(request, response);
                      
                    }
       
            }
            if( session.getAttribute("utente_autenticato") == null){
                session.setAttribute("login_fallito", true);
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        }
         else {
            request.getRequestDispatcher("login.jsp").forward(request, response);
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
