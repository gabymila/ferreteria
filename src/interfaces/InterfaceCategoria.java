/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dto.Categoria;
import java.util.ArrayList;

/**
 *
 * @author gaby
 */
public interface InterfaceCategoria {
   public ArrayList<Categoria> listarCategoria();
    public ArrayList<Categoria> listarCategoria(int id);
     public int buscarIdCategoria(String nomcat);
    public String nomCategoria(int idcat);
    public int CrearCategoria(Categoria c);
    public int EditarCategoria(Categoria c);
    public int EliminarCategoria(int id);  
}
