/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Model.Oggetti;
import Model.Oggetti_Factory;
import Model.Saldo_Factory;
import Model.Utenti_Clienti;
import Model.Utenti_Clienti_Factory;
import Model.Utenti_Venditori;
import Model.Utenti_Venditori_Factory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "login", urlPatterns = {"/login.html"}, loadOnStartup = 0)
public class login extends HttpServlet {
/*
private static final String JDBC_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
private static final String DB_CLEAN_PATH = "../../web/WEB-INF/DB/Milestone4";
private static final String DB_BUILD_PATH = "WEB-INF/DB/Milestone4";

@Override 
    public void init(){
        String dbConnection = "jdbc:derby:" + this.getServletContext().getRealPath("/") + DB_BUILD_PATH;
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        Oggetti_Factory.getInstance().setConnectionString(dbConnection);
        Saldo_Factory.getInstance().setConnectionString(dbConnection);
        Utenti_Clienti_Factory.getInstance().setConnectionString(dbConnection);
        Utenti_Venditori_Factory.getInstance().setConnectionString(dbConnection);
    }
    */
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
        
        //Login Compratore
        if(request.getParameter("Submit") != null){
            String user = request.getParameter("utente");
            String psw = request.getParameter("psw");
            ArrayList<Oggetti> ListaOggetti = Oggetti_Factory.getInstance().getListaOggetti();
            ArrayList<Utenti_Clienti> listaClienti = Utenti_Clienti_Factory.getInstance().getlistaClienti();
            for(Utenti_Clienti c : listaClienti)
            {
                if(c.getUsernameCliente().equals(user)&&c.getPasswordCliente().equals(psw))
                {
                   session.setAttribute("compratore_autenticato", true);
                   session.setAttribute("ListaOggetti", ListaOggetti);
                   session.setAttribute("utente", true);
                   session.setAttribute("idutente", "cliente");
                   session.setAttribute("id", true);
                   session.setAttribute("autenticato", c);
                   session.setAttribute("compratore", c);
                   request.getRequestDispatcher("cliente.jsp").forward(request, response);
                   
                }
            }
            
            ArrayList<Utenti_Venditori> listaVenditori = Utenti_Venditori_Factory.getInstance().getListaVenditori();
            for(Utenti_Venditori v : listaVenditori)
            {
                if(v.getUsernameVend().equals(user)&&v.getPasswordVend().equals(psw))
                {
                   session.setAttribute("venditore_autenticato", true);
                   session.setAttribute("utente", true);
                   session.setAttribute("idutente", "venditore");
                   session.setAttribute("id", true);
                   session.setAttribute("autenticato", v);
                   session.setAttribute("venditore", v);
                   request.getRequestDispatcher("venditore.jsp").forward(request, response);
                }
                
                else
                {
                   session.setAttribute("utente", false);
                   request.getRequestDispatcher("login.jsp").forward(request, response);
                }
            
            }
        }
        else {
            if(session.getAttribute("id") != null){
                switch ((String)session.getAttribute("idutente")){
                    case ("cliente"): {
                        request.getRequestDispatcher("cliente.jsp").forward(request, response);
                    }
                    case ("venditore"): {
                        request.getRequestDispatcher("venditore.jsp").forward(request, response);
                    }
                }
            }
            else {
                request.getRequestDispatcher("login.jsp").forward(request, response);
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
    