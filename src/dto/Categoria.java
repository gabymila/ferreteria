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
public class Categoria {
    private int idcat;
    private String nomcat;
    private String estado;

    public Categoria() {
    }

    public Categoria(int idcat, String nomcat, String estado) {
        this.idcat = idcat;
        this.nomcat = nomcat;
        this.estado = estado;
    }

    public int getIdcat() {
        return idcat;
    }

    public void setIdcat(int idcat) {
        this.idcat = idcat;
    }

    public String getNomcat() {
        return nomcat;
    }

    public void setNomcat(String nomcat) {
        this.nomcat = nomcat;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Categoria{" + "idcat=" + idcat + ", nomcat=" + nomcat + ", estado=" + estado + '}';
    }
    
}
