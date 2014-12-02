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
public class Usuario {
     private int idpersonal;
   private String nom_us;
   private String clave;

    public Usuario() {
    }

    public Usuario(int idpersonal, String nom_us, String clave) {
        this.idpersonal = idpersonal;
        this.nom_us = nom_us;
        this.clave = clave;
    }

    public int getIdpersonal() {
        return idpersonal;
    }

    public void setIdpersonal(int idpersonal) {
        this.idpersonal = idpersonal;
    }

    public String getNom_us() {
        return nom_us;
    }

    public void setNom_us(String nom_us) {
        this.nom_us = nom_us;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idpersonal=" + idpersonal + ", nom_us=" + nom_us + ", clave=" + clave + '}';
    }
}
