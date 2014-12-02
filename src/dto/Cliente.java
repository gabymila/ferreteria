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
public class Cliente {
     private int idclien;
    private String nombre;
     private String apellido;
     private String dni;
    private String direccion;
    private String celu; 

    public Cliente() {
    }

    public Cliente(int idclien, String nombre, String apellido, String dni, String direccion, String celu) {
        this.idclien = idclien;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.celu = celu;
    }

    public int getIdclien() {
        return idclien;
    }

    public void setIdclien(int idclien) {
        this.idclien = idclien;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelu() {
        return celu;
    }

    public void setCelu(String celu) {
        this.celu = celu;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idclien=" + idclien + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", direccion=" + direccion + ", celu=" + celu + '}';
    }
   
    
}
