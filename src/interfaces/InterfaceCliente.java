/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dto.Cliente;
import java.util.ArrayList;

/**
 *
 * @author gaby
 */
public interface InterfaceCliente {
       public ArrayList<Cliente> listarCliente();
    public ArrayList<Cliente> listarCliente(int id);
    public ArrayList<Cliente> listarCliente(String nombre);
    public String nombreCliente(int id);
    public int CrearCliente(Cliente c);
    public int EditarCliente(Cliente c);
    public int EliminarCliente(int id);
}
