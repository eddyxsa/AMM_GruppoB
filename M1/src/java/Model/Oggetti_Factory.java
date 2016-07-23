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
public class Oggetti_Factory {
    private String connectionString;
    private static Oggetti_Factory singleton;
    public static Oggetti_Factory getInstance () {
       if (singleton == null) {
          singleton = new Oggetti_Factory ();
       }
       return singleton;
    }
    
    private ArrayList<Oggetti> ListaOggetti = new ArrayList<Oggetti> ();
    
    private Oggetti_Factory () {
       
        //Oggetto 1
        Oggetti o1 = new Oggetti ();
        o1.setNomeOgg("Tenda Trekking");
        o1.setUrlOgg("img/880061966078.jpg");
        o1.setDescrizOgg("Bellissima tenda 2 posti");
        o1.setPrezOgg(69.99);
        o1.setquantitaOgg(12);
        o1.setidOgg(1);
        o1.setidVendOgg(12);
        ListaOggetti.add(o1);
        
        //Oggetto 2
        Oggetti o2 = new Oggetti ();
        o2.setNomeOgg("Corda Arrampicata 70m");
        o2.setUrlOgg("img/corda-arrampicata-tendon-smart-lite-98.jpg");
        o2.setDescrizOgg("Corda Antistrappo 70m");
        o2.setPrezOgg(49.99);
        o2.setquantitaOgg(8);
        o2.setidOgg(2);
        o2.setidVendOgg(88);
        ListaOggetti.add(o2);
        
        //Oggetto 3
        Oggetti o3 = new Oggetti ();
        o3.setNomeOgg("Fornellino");
        o3.setUrlOgg("img/$_35.JPG");
        o3.setDescrizOgg("Fornellino da Campo a gas");
        o3.setPrezOgg(12.00);
        o3.setquantitaOgg(90);
        o3.setidOgg(3);
        o3.setidVendOgg(12);
        ListaOggetti.add(o3);
        
        //Oggetto4
        Oggetti o4 = new Oggetti ();
        o4.setNomeOgg("Scarponi");
        o4.setUrlOgg("img/mouflon_kevlar-1-800x800.jpg");
        o4.setDescrizOgg("Scarponi impermeabili in Kevlar");
        o4.setPrezOgg(80.00);
        o4.setquantitaOgg(37);
        o4.setidOgg(4);
        o4.setidVendOgg(12);
        ListaOggetti.add(o4);
        
        //Oggetto 5
        Oggetti o5 = new Oggetti ();
        o5.setNomeOgg("Imbracatura");
        o5.setUrlOgg("img/C38AAA_2.jpg");
        o5.setDescrizOgg("Imbracatura fino 40KN");
        o5.setPrezOgg(38.00);
        o5.setquantitaOgg(17);
        o5.setidOgg(5);
        o5.setidVendOgg(88);
        ListaOggetti.add(o5);
        
    }
    
    //Metodi 
    
    //Restituisce tutti gli oggetti
    public ArrayList<Oggetti> getListaOggetti () {
       return ListaOggetti;
    } 
    
    public Oggetti getOggetti (int idOgg) {
       for (Oggetti u : ListaOggetti) {
          if (u.idOgg == idOgg)
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
