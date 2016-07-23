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
public class Utenti_Venditori {
    
    private String UsernameVend;
    private String PasswordVend;
    public int idVend;
    private int idContoVend;
    
    public Utenti_Venditori () {
    
    }
    
    public String getUsernameVend () {
       return UsernameVend;
    }
    
    public void setUsernameVend (String UsernameVend) {
       this.UsernameVend = UsernameVend;
    }
    
    public String getPasswordVend () {
       return PasswordVend;
    }
    
    public void setPasswordVend (String PasswordVend) {
       this.PasswordVend = PasswordVend;
    }
    
    public int getidVend () {
       return idVend;
    }
    
    public void setidVend (int idVend) {
       this.idVend = idVend;
    }
    
    public int getidContoVenditore () {
       return idContoVend;
    }
    
    public void setidContoVend (int idContoVend) {
       this.idContoVend = idContoVend;
    }
    
}
