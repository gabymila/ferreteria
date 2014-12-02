/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dto.Proveedor;
import java.util.ArrayList;

/**
 *
 * @author gaby
 */
public interface InterfaceProveedor {
       public ArrayList<Proveedor> listarProveedor();
    public ArrayList<Proveedor> listarProveedor(int id);
    public ArrayList<Proveedor> listarProveedor(String nombre);
    public String nombreProveedor(int id);
    public int CrearProveedor(Proveedor c);
    public int EditarProveedor(Proveedor c);
    public int EliminarProveedor(int id);
}
