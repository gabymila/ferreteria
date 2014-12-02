/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dto.Venta;
import java.util.ArrayList;

/**
 *
 * @author gaby
 */
public interface InterfaceVenta {
      public ArrayList<Venta> listarVenta();
    public ArrayList<Venta> listarVenta(int id);
    public ArrayList<Venta> listarVenta(String nombre);
    public String nombreVenta(int id);
    public int CrearVenta(Venta c);
    public int EditarVenta(Venta c);
    public int EliminarVenta(int id); 
}
