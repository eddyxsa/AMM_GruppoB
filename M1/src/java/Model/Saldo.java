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
    public double Saldo;
    
    public Saldo (Double Saldo) {
         this.Saldo = Saldo;
    }

    Saldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getidConto () {
       return idConto;
    }
    
    public void setidConto (int idConto) {
       this.idConto = idConto;
    }
    
    public double getSaldo () {
       return Saldo;
    }
    
    public void setSaldo (int Saldo) {
       this.Saldo = Saldo;
    }
}
