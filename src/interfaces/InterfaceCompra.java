/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dto.Compra;
import java.util.ArrayList;

/**
 *
 * @author gaby
 */
public interface InterfaceCompra {
     public ArrayList<Compra> listarCompra();
    public ArrayList<Compra> listarCompra(int id);
    public ArrayList<Compra> listarCompra(String nombre);
    public String nombreCompra(int id);
    public int CrearCompra(Compra c);
    public int EditarCompra(Compra c);
    public int EliminarCompra(int id);  
}
