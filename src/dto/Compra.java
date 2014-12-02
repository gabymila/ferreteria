/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author gaby
 */
public class Compra {
   private int idcompra;
   private int idpers;
   private int idprov;
    private double total;
    private String serie_doc;
    private String estado; 

    public Compra() {
    }

    public Compra(int idcompra, int idpers, int idprov, double total, String serie_doc, String estado) {
        this.idcompra = idcompra;
        this.idpers = idpers;
        this.idprov = idprov;
        this.total = total;
        this.serie_doc = serie_doc;
        this.estado = estado;

    }

    public int getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    public int getIdpers() {
        return idpers;
    }

    public void setIdpers(int idpers) {
        this.idpers = idpers;
    }

    public int getIdprov() {
        return idprov;
    }

    public void setIdprov(int idprov) {
        this.idprov = idprov;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getSerie_doc() {
        return serie_doc;
    }

    public void setSerie_doc(String serie_doc) {
        this.serie_doc = serie_doc;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Compra{" + "idcompra=" + idcompra + ", idpers=" + idpers + ", idprov=" + idprov  + ", total=" + total + ", serie_doc=" + serie_doc + ", estado=" + estado+ '}';
    }

    
}
