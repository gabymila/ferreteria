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
public class Proveedor {
    private int idproveed;
   private String razn_scial;
   private String ruc;
    private String direccion;
    private String email; 
     private String descrip;
    private String estado;
    private String fax; 
    private String celu;  

    public Proveedor() {
    }

    public Proveedor(int idproveed, String razn_scial, String ruc, String direccion, String email, String descrip, String estado, String fax, String celu) {
        this.idproveed = idproveed;
        this.razn_scial = razn_scial;
        this.ruc = ruc;
        this.direccion = direccion;
        this.email = email;
        this.descrip = descrip;
        this.estado = estado;
        this.fax = fax;
        this.celu = celu;
    }

    public int getIdproveed() {
        return idproveed;
    }

    public void setIdproveed(int idproveed) {
        this.idproveed = idproveed;
    }

    public String getRazn_scial() {
        return razn_scial;
    }

    public void setRazn_scial(String razn_scial) {
        this.razn_scial = razn_scial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCelu() {
        return celu;
    }

    public void setCelu(String celu) {
        this.celu = celu;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idproveed=" + idproveed + ", razn_scial=" + razn_scial + ", ruc=" + ruc + ", direccion=" + direccion + ", email=" + email + ", descrip=" + descrip + ", estado=" + estado + ", fax=" + fax + ", celu=" + celu + '}';
    }
}
