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
    private int idCliente;
    private int idContoCliente;
    private Saldo Credito;

    /**
     * @return the UsernameCliente
     */
    public String getUsernameCliente() {
        return UsernameCliente;
    }

    /**
     * @param UsernameCliente the UsernameCliente to set
     */
    public void setUsernameCliente(String UsernameCliente) {
        this.UsernameCliente = UsernameCliente;
    }

    /**
     * @return the PasswordCliente
     */
    public String getPasswordCliente() {
        return PasswordCliente;
    }

    /**
     * @param PasswordCliente the PasswordCliente to set
     */
    public void setPasswordCliente(String PasswordCliente) {
        this.PasswordCliente = PasswordCliente;
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the idContoCliente
     */
    public int getIdContoCliente() {
        return idContoCliente;
    }

    /**
     * @param idContoCliente the idContoCliente to set
     */
    public void setIdContoCliente(int idContoCliente) {
        this.idContoCliente = idContoCliente;
    }

    /**
     * @return the Credito
     */
    public Saldo getCredito() {
        return Credito;
    }

    /**
     * @param Credito the Credito to set
     */
    public void setCredito(Saldo Credito) {
        this.Credito = Credito;
    }
    
}
