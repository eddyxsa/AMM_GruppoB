/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Utente
 */
public class Utenti_Clienti_Factory {
    private String connectionString;
    private static Utenti_Clienti_Factory singleton;
    public static Utenti_Clienti_Factory getInstance () {
       if (singleton == null) {
           singleton = new Utenti_Clienti_Factory ();
       }
       return singleton;
    }
    
    private ArrayList<Utenti_Clienti> listaClienti = new ArrayList<Utenti_Clienti>();
    
    private Utenti_Clienti_Factory () {
       
       //Cliente 1
       Utenti_Clienti c1 = new Utenti_Clienti();
       c1.setUsernameCliente("Cliente1");
       c1.setPasswordCliente("1");
       c1.setIdCliente(47);
       c1.setIdContoCliente(2587);
       listaClienti.add(c1);
       
       //Cliente 2
       Utenti_Clienti c2 = new Utenti_Clienti ();
       c2.setUsernameCliente("Cliente2");
       c2.setPasswordCliente("2");
       c2.setIdCliente(68);
       c2.setIdContoCliente(3102);
       listaClienti.add(c2);
       
       //Cliente 3
       Utenti_Clienti c3 = new Utenti_Clienti ();
       c3.setUsernameCliente("Cliente3");
       c3.setPasswordCliente("3");
       c3.setIdCliente(29);
       c3.setIdContoCliente(1203);
       listaClienti.add(c3);
       
       
    }
    
 /*public Utenti_Clienti getCliente(String username, String psw)
    {
        try
        {
            Connection conn = DriverManager.getConnection(connectionString, 
                            "edosanna",
                            "edosanna");
            // sql command
            String query = "select * from cliente where "
                    + "password = ? and username = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            // dati
            stmt.setString(1, psw);
            stmt.setString(2, username);
            //
            ResultSet set = stmt.executeQuery();
            
            if(set.next())
            {
                Utenti_Clienti cliente = new Utenti_Clienti();
                cliente.setIdCliente(set.getInt("idcliente"));
                cliente.setUsernameCliente(set.getString("usernamecliente"));
                cliente.setPasswordCliente(set.getString("passwordcliente"));
                cliente.setCredito(new Saldo (set.getDouble("idcontocliente")));
                
                stmt.close();
                conn.close();
                
                return cliente;
            }
            
        
        }
        catch(Exception e)
        {
           e.printStackTrace(); 
        }
        return null;
    }
    */
    //Metodi
    //Restituisce lista dei Clienti
    
    public ArrayList<Utenti_Clienti> getlistaClienti() {
       return listaClienti;
    }
    
    //Restituisce cliente tramite id
    public Utenti_Clienti getUtenti_Clienti (int idCliente) {
       for (Utenti_Clienti u : listaClienti) {
          if (u.getIdCliente() == idCliente)
              return u;
       }
       return null;
    }

    /**
     * @return the connectionString
     */
    public String getConnectionString() {
        return connectionString;
    }

    /**
     * @param connectionString the connectionString to set
     */
    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
    
}
