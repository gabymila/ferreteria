/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;


import dto.Personal;
import java.util.ArrayList;

/**
 *
 * @author gaby
 */
public interface InterfacePersonal {
     public ArrayList<Personal> listarPersonal();
    public ArrayList<Personal> listarPersonal(int id);
    public ArrayList<Personal> listarPersonal(String nombre);
    public String nombrePersonal(int id);
    public int CrearPersonal(Personal c);
    public int EditarPersonal(Personal c);
    public int EliminarPersonal(int id);  
}
