/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Utente
 */
public class Utenti_Clienti_Factory {
    
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
       c1.setidCliente(47);
       c1.setidContoCliente(2587);
       listaClienti.add(c1);
       
       //Cliente 2
       Utenti_Clienti c2 = new Utenti_Clienti ();
       c2.setUsernameCliente("Cliente2");
       c2.setPasswordCliente("2");
       c2.setidCliente(68);
       c2.setidContoCliente(3102);
       listaClienti.add(c2);
       
       //Cliente 3
       Utenti_Clienti c3 = new Utenti_Clienti ();
       c3.setUsernameCliente("Cliente3");
       c3.setPasswordCliente("3");
       c3.setidCliente(29);
       c3.setidContoCliente(5400);
       listaClienti.add(c3);
    }
    
    //Metodi
    //Restituisce lista dei Clienti
    
    public ArrayList<Utenti_Clienti> getlistaClienti() {
       return listaClienti;
    }
    
    //Restituisce cliente tramite id
    public Utenti_Clienti getUtenti_Clienti (int idCliente) {
       for (Utenti_Clienti u : listaClienti) {
          if (u.idCliente == idCliente)
              return u;
       }
       return null;
    }
    
}
