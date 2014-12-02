/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dto.Usuario;
import java.util.ArrayList;

/**
 *
 * @author gaby
 */
public interface InterfaceUsuario {
       public ArrayList<Usuario> listarUsuario();
    public ArrayList<Usuario> listarUsuario(int id);
    public ArrayList<Usuario> listarUsuario(String nombre);
    public String nombreUsuario(int id);
    public int CrearUsuario(Usuario c);
    public int EditarUsuario(Usuario c);
    public int EliminarUsuario(int id);
}
