/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Utente
 */
public class Saldo {
    
    public int idConto;
    private int Saldo;
    
    public Saldo () {
    
    }
    
    public int getidConto () {
       return idConto;
    }
    
    public void setidConto (int idConto) {
       this.idConto = idConto;
    }
    
    public int getSaldo () {
       return Saldo;
    }
    
    public void setSaldo (int Saldo) {
       this.Saldo = Saldo;
    }
}
