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
public class Utenti_Venditori_Factory {
    private String connectionString;
    private static Utenti_Venditori_Factory singleton;
    public static Utenti_Venditori_Factory getInstance () {
       if (singleton == null) {
          return singleton = new Utenti_Venditori_Factory ();
       }
       return singleton;
           }
    
    private ArrayList<Utenti_Venditori> listaVenditori = new ArrayList<Utenti_Venditori>();
    
    private Utenti_Venditori_Factory () {
    
        //Venditore 1
        Utenti_Venditori v1 = new Utenti_Venditori ();
        v1.setUsernameVend("Venditore1");
        v1.setPasswordVend("1");
        v1.setidVend(88);
        v1.setidContoVend(003706);
        listaVenditori.add(v1);
        
        //Venditore 2
        Utenti_Venditori v2 = new Utenti_Venditori ();
        v2.setUsernameVend("Venditore2");
        v2.setPasswordVend("2");
        v2.setidVend(12);
        v2.setidContoVend(001412);
        listaVenditori.add(v2);
    }
    
        /* Metodi */
    
    /* Restituisce la lista di tutti i venditori */
    public ArrayList<Utenti_Venditori> getListaVenditori ()
    {
        return listaVenditori;
    }
    
    /* Restituisce un determinato venditore tramite il suo id, che è univoco */
    public Utenti_Venditori getUtenti_Venditori (int idVend)
    {
        for(Utenti_Venditori u : listaVenditori)
        {
            if(u.idVend == idVend)
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
