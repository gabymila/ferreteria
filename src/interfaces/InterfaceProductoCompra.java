/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dto.ProductoCompra;
import java.util.ArrayList;

/**
 *
 * @author gaby
 */
public interface InterfaceProductoCompra {
       public ArrayList<ProductoCompra> listarProductoCompra();
    public ArrayList<ProductoCompra> listarProductoCompra(int id);
    public ArrayList<ProductoCompra> listarProductoCompra(String nombre);
    public String nombreProductoCompra(int id);
    public int CrearProductoCompra(ProductoCompra c);
    public int EditarProductoCompra(ProductoCompra c);
    public int EliminarProductoCompra(int id);
}
