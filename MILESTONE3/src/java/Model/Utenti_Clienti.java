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
public class Utenti_Clienti {
    
    private String UsernameCliente;
    private String PasswordCliente;
    public int idCliente;
    private int idContoCliente;
    
    public Utenti_Clienti () {
    
    }
    
    public String getUsernameCliente () {
       return UsernameCliente;
    }
    
    public void setUsernameCliente (String UsernameCliente) {
       this.UsernameCliente = UsernameCliente;
    }
    
    public String getPasswordCliente () {
       return PasswordCliente;
    }
    
    public void setPasswordCliente (String PasswordCliente) {
       this.PasswordCliente = PasswordCliente;
    }
    
    public int getidCliente () {
       return idCliente;
    }
    
    public void setidCliente (int idCliente) {
       this.idCliente = idCliente;
    }
    
    public int getidContoCliente () {
       return idContoCliente;
    }
    
    public void setidContoCliente (int idContoCliente) {
       this.idContoCliente = idContoCliente;
    }
    
}
