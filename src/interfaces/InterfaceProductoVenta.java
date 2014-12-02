/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dto.ProductoVenta;
import java.util.ArrayList;

/**
 *
 * @author gaby
 */
public interface InterfaceProductoVenta {
     public ArrayList<ProductoVenta> listarProductoVenta();
    public ArrayList<ProductoVenta> listarProductoVenta(int id);
    public ArrayList<ProductoVenta> listarProductoVenta(String nombre);
    public String nombreProductoVenta(int id);
    public int CrearProductoVenta(ProductoVenta c);
    public int EditarProductoVenta(ProductoVenta c);
    public int EliminarProductoVenta(int id);  
}
