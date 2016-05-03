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
public class Saldo_Factory {
    
    private static Saldo_Factory singleton;
    public static Saldo_Factory getInstance () {
       if (singleton == null) {
          singleton = new Saldo_Factory ();
       }
       return singleton;
    }
    
    private ArrayList<Saldo> ListaSaldoConto = new ArrayList<Saldo> ();
    
    //Costruttore
    private Saldo_Factory () {
       
        //Conto 1
        Saldo s1 = new Saldo ();
        s1.setidConto(2587);
        s1.setSaldo(200);
        ListaSaldoConto.add(s1);
        
        //Conto 2
        Saldo s2 = new Saldo ();
        s2.setidConto(3102);
        s2.setSaldo(1203);
        ListaSaldoConto.add(s2);
        
        //Conto 3
        Saldo s3 = new Saldo ();
        s3.setidConto(5400);
        s3.setSaldo(480);
        ListaSaldoConto.add(s3);
        
        //Conto 4
        Saldo s4 = new Saldo ();
        s4.setidConto(003706);
        s4.setSaldo(350);
        ListaSaldoConto.add(s4);
        
        //Conto 5
        Saldo s5 = new Saldo ();
        s5.setidConto(001412);
        s5.setSaldo(90);
        ListaSaldoConto.add(s5);
    }
    
    //Restituisce Lista
    public ArrayList<Saldo> getListaSaldoConto () {
       return ListaSaldoConto;
    }
    
    //Restituisce un conto particolare
    public Saldo getConto (int idConto) {
       for (Saldo u : ListaSaldoConto) {
          if (u.idConto == idConto)
              return u;
       }
       return null;
    }
    
}
