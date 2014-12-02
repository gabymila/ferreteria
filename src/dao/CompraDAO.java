/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.Conexion;
import dto.Cliente;
import dto.Compra;
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
public class CompraDAO implements interfaces.InterfaceCompra{
 private Connection cx = null;
    private Statement st;
    private ResultSet rs;
    private String sql;
    @Override
    public ArrayList<Compra> listarCompra() {
      ArrayList<Compra> lista=new ArrayList<>();
        sql = "SELECT * FROM Compra";
       try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Compra c= new Compra();
                c.setIdcompra(rs.getInt("idcompr"));
                c.setIdpers(rs.getInt("personal"));
                c.setIdprov(rs.getInt("proveedor"));
                c.setTotal(rs.getDouble("total"));
                c.setEstado(rs.getString("estado"));
                c.setSerie_doc(rs.getString("serie_doc"));
                lista.add(c);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;   
    }

    @Override
    public ArrayList<Compra> listarCompra(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Compra> listarCompra(String nombre) {
         ArrayList<Compra> lista=new ArrayList<>();
        sql ="*SELECT idcompra, idpers, idprov, total, estado,serie_doc, FROM CLIENTE WHERE NOMBRE LIKE 'PA%' ORDER BY NOMBRE";
        try {
           cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Compra c= new Compra();
                c.setIdcompra(rs.getInt("idcompr"));
                c.setIdpers(rs.getInt("personal"));
                c.setIdprov(rs.getInt("proveedor"));
                c.setTotal(rs.getDouble("total"));
                c.setEstado(rs.getString("estado"));
                c.setSerie_doc(rs.getString("serie_doc"));
                lista.add(c);
            }
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);   
        }
       return lista;
    }

    @Override
    public String nombreCompra(int id) {
                  String nombre="";
        sql = "SELECT * FROM Compra WHERE idCompra= "+id;
        try {
             cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                nombre=rs.getString("nombre");
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
        return nombre;

    }

    @Override
    public int CrearCompra(Compra c) {
           int op=0;
        sql = "INSERT INTO Cliente(idcompra,idpers, idprov, total, estado, serie_doc) VALUES(NULL,'"
                +c.getIdcompra()+"',"+c.getIdpers()
                +","+c.getIdprov()+","+c.getTotal()
                +","+c.getEstado()
                +","+c.getSerie_doc()+")";
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
    public int EditarCompra(Compra c) {
          int op=0;
        sql ="INSERT INTO Compra (idcompra, idpers, idprov, total, estado, serie_doc) VALUES(null, "
            +c.getIdcompra()+", '"
            +c.getIdpers()+"', '"
            +c.getIdprov()+"', "
            +c.getTotal()+", '"
            +c.getEstado()+"', '"
            +c.getSerie_doc()+"')";
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
    public int EliminarCompra(int id) {
    int op=0;
        sql = "DELETE FROM compra WHERE idcompra="+id;
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
