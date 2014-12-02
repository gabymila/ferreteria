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
public class ProductoCompra {
   private int idprod;
   private int idcomp;
   private int cant;
   private double prec_comp;
   private double descut;

    public ProductoCompra() {
    }

    public ProductoCompra(int idprod, int idcomp, int cant, double prec_comp, double descut) {
        this.idprod = idprod;
        this.idcomp = idcomp;
        this.cant = cant;
        this.prec_comp = prec_comp;
        this.descut = descut;
    }

    public int getIdprod() {
        return idprod;
    }

    public void setIdprod(int idprod) {
        this.idprod = idprod;
    }

    public int getIdcomp() {
        return idcomp;
    }

    public void setIdcomp(int idcomp) {
        this.idcomp = idcomp;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getPrec_comp() {
        return prec_comp;
    }

    public void setPrec_comp(double prec_comp) {
        this.prec_comp = prec_comp;
    }

    public double getDescut() {
        return descut;
    }

    public void setDescut(double descut) {
        this.descut = descut;
    }

    @Override
    public String toString() {
        return "ProductoCompra{" + "idprod=" + idprod + ", idcomp=" + idcomp + ", cant=" + cant + ", prec_comp=" + prec_comp + ", descut=" + descut + '}';
    }
}
