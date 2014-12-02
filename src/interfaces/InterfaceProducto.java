/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dto.Producto;
import java.util.ArrayList;

/**
 *
 * @author gaby
 */
public interface InterfaceProducto {
       public ArrayList<Producto> listarProducto();
    public ArrayList<Producto> listarProducto(int id);
    public ArrayList<Producto> listarProducto(String nombre);
    public String nombreProducto(int id);
    public int CrearProducto(Producto c);
    public int EditarProducto(Producto c);
    public int EliminarProducto(int id);
}
