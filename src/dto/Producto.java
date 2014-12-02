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
public class Producto {
    private int idprod;
    private int idcat;
    private String nomprod;
    private String color;
    private String medida;
    private int peso;
    private String stock;
    private String estado;
    private double prec_venta;

    public Producto() {
    }

    public Producto(int idprod, int idcat, String nomprod, String color, String medida, int peso, String stock, String estado, double prec_venta) {
        this.idprod = idprod;
        this.idcat = idcat;
        this.nomprod = nomprod;
        this.color = color;
        this.medida = medida;
        this.peso = peso;
        this.stock = stock;
        this.estado = estado;
        this.prec_venta = prec_venta;
    }

    public int getIdprod() {
        return idprod;
    }

    public void setIdprod(int idprod) {
        this.idprod = idprod;
    }

    public int getIdcat() {
        return idcat;
    }

    public void setIdcat(int idcat) {
        this.idcat = idcat;
    }

    public String getNomprod() {
        return nomprod;
    }

    public void setNomprod(String nomprod) {
        this.nomprod = nomprod;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrec_venta() {
        return prec_venta;
    }

    public void setPrec_venta(double prec_venta) {
        this.prec_venta = prec_venta;
    }

    @Override
    public String toString() {
        return "Producto{" + "idprod=" + idprod + ", idcat=" + idcat + ", nomprod=" + nomprod + ", color=" + color + ", medida=" + medida + ", peso=" + peso + ", stock=" + stock + ", estado=" + estado + ", prec_venta=" + prec_venta + '}';
    }
    
}
