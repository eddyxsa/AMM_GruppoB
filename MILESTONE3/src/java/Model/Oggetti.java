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
public class Oggetti {
    
    private String NomeOgg;
    private String UrlOgg;
    private String DescrizOgg;
    private Double PrezOgg;
    public int idOgg;
    private int quantitaOgg;
    private int idVendOgg;
    
    public Oggetti (){
    
    }
    
    public Oggetti(String NomeOgg, String UrlOgg, String DescrizOgg, double PrezOgg, int idOgg, int quantitaOgg, int idVendOgg)
    {
        this.NomeOgg = NomeOgg;
        this.UrlOgg = UrlOgg;
        this.DescrizOgg = DescrizOgg;
        this.PrezOgg = PrezOgg;
        this.idOgg = idOgg;
        this.quantitaOgg = quantitaOgg;
        this.idVendOgg = idVendOgg;
    }
    
    public String getNomeOgg () {
       return NomeOgg;
    }
    
    public void setNomeOgg (String NomeOgg) {
       this.NomeOgg = NomeOgg;
    }
    
    public String getUrlOgg (){
       return UrlOgg;
    }
    
    public void setUrlOgg (String UrlOgg) {
       this.UrlOgg = UrlOgg;
    }
    
    public String getDescrizOgg () {
       return DescrizOgg;
    }
    
    public void setDescrizOgg (String DescrizOgg) {
       this.DescrizOgg = DescrizOgg;
    }
    
    public Double getPrezOgg () {
       return PrezOgg;
    }
    
    public void setPrezOgg (Double PrezOgg) {
       this.PrezOgg = PrezOgg;
    }
    
    public int getidOgg () {
       return idOgg;
    }
    
    public void setidOgg (int idOgg) {
       this.idOgg = idOgg;
    }
    
    public int getquantitaOgg () {
       return quantitaOgg;
    }
    
    public void setquantitaOgg (int quantitaOgg) {
       this.quantitaOgg = quantitaOgg;
    }
    
    public int getidVendOgg () {
       return idVendOgg;
    }
    
    public void setidVendOgg (int idVendOgg) {
       this.idVendOgg = idVendOgg;
    }
    
}
