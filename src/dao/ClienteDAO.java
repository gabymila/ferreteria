/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.Conexion;
import dto.Categoria;
import dto.Cliente;
import interfaces.InterfaceCliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gaby
 */
public class ClienteDAO implements InterfaceCliente{
     private Connection cx = null;
    private Statement st;
    private ResultSet rs;
    private String sql;
    @Override
    public ArrayList<Cliente> listarCliente() {
        ArrayList<Cliente> lista=new ArrayList<>();
        sql = "SELECT * FROM Cliente";
       try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Cliente c= new Cliente();
                c.setIdclien(rs.getInt("idclient"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setDni(rs.getString("dni"));
                c.setDireccion(rs.getString("direccion"));
                c.setCelu(rs.getString("celu"));
                lista.add(c);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }

    @Override
    public ArrayList<Cliente> listarCliente(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cliente> listarCliente(String datos) {
           ArrayList<Cliente> lista=new ArrayList<>();
        sql ="*SELECT NOMBRE, APELLIDOS, DNI FROM CLIENTE WHERE NOMBRE LIKE 'PA%' ORDER BY NOMBRE";
        try {
          cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Cliente c= new Cliente();
                c.setIdclien(rs.getInt("idclient"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setDni(rs.getString("dni"));
                c.setDireccion(rs.getString("direccion"));
                c.setCelu(rs.getString("celu"));
                lista.add(c);
            }
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);   
        }
       return lista;
    }

    @Override
    public String nombreCliente(int id) {
          String nombre="";
        sql = "SELECT * FROM Cliente WHERE idCliente= "+id;
        try {
             cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                nombre=rs.getString("nom_client");
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
        return nombre;
    
    }

    @Override
    public int CrearCliente(Cliente c) {
         int op=0;
        sql = "INSERT INTO Cliente(idClient, nombre, apellido, dni, direccion, celu) VALUES(NULL,'"
                +c.getIdclien()+"',"+c.getNombre()
                +","+c.getApellido()+","+c.getDni()
                +","+c.getDireccion()
                +","+c.getCelu()+")";
        System.out.println(sql);
        try {
             cx = Conexion.getConex();
            st = cx.createStatement();
            op=  st.executeUpdate(sql);           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return op;
    }
     

    @Override
    public int EditarCliente(Cliente c) {
         int op=0;
        sql = "UPDATE curso SET idClient="+c.getIdclien()
                +",nombre= '"+c.getNombre()
                +"',apellido=" +c.getApellido()
                +", dni= "+c.getDni()
                +", direccion="+c.getDireccion()
                +", celu="+c.getCelu()+" WHERE idCurso="+c.getIdclien();
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            op = st.executeUpdate(sql);
        } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e);    
        }
        return op;
    }

    @Override
    public int EliminarCliente(int id) {
        int op=0;
        sql = "DELETE FROM curso WHERE idClient="+id;
        System.out.println(sql);
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            op=  st.executeUpdate(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return op;
    }
    
}
