/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.Conexion;
import dto.Personal;
import dto.ProductoVenta;
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
public class ProductoVentaDAO implements interfaces.InterfaceProductoVenta{
  private Connection cx = null;
    private Statement st;
    private ResultSet rs;
    private String sql;  

    @Override
    public ArrayList<ProductoVenta> listarProductoVenta() {
         ArrayList<ProductoVenta> lista=new ArrayList<>();
        sql = "SELECT * FROM ProductoVenta";
       try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
               ProductoVenta pv= new ProductoVenta();
                pv.setIdventa(rs.getInt("idventa"));
                pv.setIdprod(rs.getInt("idprod"));
                pv.setPrecio(rs.getDouble("precio"));
                pv.setCant(rs.getInt("cantidad"));
                lista.add(pv);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista; 
    }

    @Override
    public ArrayList<ProductoVenta> listarProductoVenta(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ProductoVenta> listarProductoVenta(String nombre) {
            ArrayList<ProductoVenta> lista=new ArrayList<>();
        sql ="*SELECT idventa,idprod,precio, cantidad, FROM ProductoVenta WHERE NOMBRE LIKE 'PA%' ORDER BY NOMBRE";
         try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
               ProductoVenta pv= new ProductoVenta();
                pv.setIdventa(rs.getInt("idventa"));
                pv.setIdprod(rs.getInt("idprod"));
                pv.setPrecio(rs.getDouble("precio"));
                pv.setCant(rs.getInt("cantidad"));
                lista.add(pv);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista; 
    }

    @Override
    public String nombreProductoVenta(int id) {
         String nombre="";
        sql = "SELECT * FROM ProductoVenta WHERE idProd= "+id;
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
    public int CrearProductoVenta(ProductoVenta c) {
        int op=0;
        sql = "INSERT INTO personal(idventa,idprod, precio, cantidad) VALUES(NULL,'"
                +c.getIdventa()+"',"+c.getIdprod()
                +","+c.getPrecio()+","+c.getCant();

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
    public int EditarProductoVenta(ProductoVenta c) {
         int op=0;
        sql = "INSERT INTO personal(idventa,idprod, precio, cantidad) VALUES(NULL,'"
                +c.getIdventa()+"',"+c.getIdprod()
                +","+c.getPrecio()+","+c.getCant();
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
    public int EliminarProductoVenta(int id) {
         int op=0;
        sql = "DELETE FROM ProductoVenta WHERE idprod="+id;
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
