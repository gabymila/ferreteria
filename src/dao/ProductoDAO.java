/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.Conexion;

import dto.Producto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gaby
 */
public class ProductoDAO implements interfaces.InterfaceProducto{
  private Connection cx = null;
    private PreparedStatement st;
    private ResultSet rs;
    private String sql;
    @Override
    public ArrayList<Producto> listarProducto() {
          ArrayList<Producto> lista=new ArrayList<>();
        sql = "SELECT * FROM Producto";
              try {
            cx = Conexion.getConex();
            st = cx.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
               Producto p= new Producto();
                p.setIdprod(rs.getInt("idPRODUCTO"));
                p.setIdcat(rs.getInt("idCATEGORIA"));
                p.setNomprod(rs.getString("NOMBRE"));
                p.setColor(rs.getString("COLOR"));
                p.setMedida(rs.getString("MEDIDA"));
                p.setPeso(rs.getInt("peso"));
                p.setStock(rs.getString("STOCK"));
                 p.setPrec_venta(rs.getDouble("PRECIO_VENT"));
                lista.add(p);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;  
    }

    @Override
    public ArrayList<Producto> listarProducto(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Producto> listarProducto(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
    }
    @Override
    public int CrearProducto(Producto pr) {
        int op=0;
        sql = "INSERT INTO PRODUCTO(idPRODUCTO,idCATEGORIA, NOMBRE, COLOR, medida, peso, stock, estado, precio_vent) VALUES(NULL,?,?,?,?,?,?,?,?)";
               
        System.out.println(sql);
        try {
             cx = Conexion.getConex();
            st = cx.prepareStatement(sql);
            st.setInt(1,pr.getIdcat());
            st.setString(2,pr.getNomprod());
            st.setString(3, pr.getColor());
            st.setString(4, pr.getMedida());
            st.setInt(5, pr.getPeso());
            st.setString(6, pr.getStock());
            st.setString(7, pr.getEstado());
            st.setDouble(8, pr.getPrec_venta());
            op=  st.executeUpdate();           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return op;    
    }

    @Override
    public int EditarProducto(Producto pr) {
           int op=0;
        sql ="UPDATE producto SET idCATEGORIA=?, NOMBRE=?,COLOR=?,MEDIDA=?,PESO=?,STOCK=?,ESTADO=?,PRECIO_VENT=? WHERE idPRODUCTO=?";
        try {
            cx = Conexion.getConex();
            st = cx.prepareStatement(sql);
              st.setInt(1,pr.getIdcat());
            st.setString(2,pr.getNomprod());
            st.setString(3, pr.getColor());
            st.setString(4, pr.getMedida());
            st.setInt(5, pr.getPeso());
            st.setString(6, pr.getStock());
            st.setString(7, pr.getEstado());
            st.setDouble(8, pr.getPrec_venta());
            st.setInt(9, pr.getIdprod());
            op = st.executeUpdate();
        } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e);    
        }
        return op;
    }

    @Override
    public int EliminarProducto(int id) {
         int op=0;
        sql = "DELETE FROM producto WHERE idPRODUCTO="+id;
        System.out.println(sql);
        try {
            cx = Conexion.getConex();
            st = cx.prepareStatement(sql);
            op=  st.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return op;
    }

    @Override
    public String nombreProducto(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
