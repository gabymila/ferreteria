/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.Conexion;
import dto.Personal;
import dto.ProductoCompra;
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
public class ProductoCompraDAO implements interfaces.InterfaceProductoCompra{
 private Connection cx = null;
    private Statement st;
    private ResultSet rs;
    private String sql;
    @Override
    public ArrayList<ProductoCompra> listarProductoCompra() {
     ArrayList<ProductoCompra> lista=new ArrayList<>();
        sql = "SELECT * FROM Personal"; 
         try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
               ProductoCompra pc= new ProductoCompra ();
                pc.setIdprod(rs.getInt("idprod"));
                pc.setIdcomp(rs.getInt("idcomp"));
                 pc.setCant(rs.getInt("cantidad"));
                pc.setPrec_comp(rs.getDouble("Prec_comp"));
                pc.setDescut(rs.getDouble("descuento"));
                lista.add(pc);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;   
    }

    @Override
    public ArrayList<ProductoCompra> listarProductoCompra(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ProductoCompra> listarProductoCompra(String nombre) {
           ArrayList<ProductoCompra> lista=new ArrayList<>();
        sql ="*SELECT idprod,idcomp,cantidad, prec_comp, descuento, FROM ProductoCompra WHERE NOMBRE LIKE 'PA%' ORDER BY NOMBRE";
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
               ProductoCompra pc= new ProductoCompra ();
                pc.setIdprod(rs.getInt("idprod"));
                pc.setIdcomp(rs.getInt("idcomp"));
                 pc.setCant(rs.getInt("cantidad"));
                pc.setPrec_comp(rs.getDouble("Prec_comp"));
                pc.setDescut(rs.getDouble("descuento"));
                lista.add(pc);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;   
    }

    @Override
    public String nombreProductoCompra(int id) {
                String nombre="";
        sql = "SELECT * FROM ProductoCompra WHERE idprod= "+id;
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
    public int CrearProductoCompra(ProductoCompra c) {
           int op=0;
        sql = "INSERT INTO personal(idpersonal,nombre, apellido, direccion, dni, celu) VALUES(NULL,'"
                +c.getIdprod()+"',"+c.getIdcomp()
                +","+c.getCant()+","+c.getDescut()
                +","+c.getPrec_comp()+")";
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
    public int EditarProductoCompra(ProductoCompra pc) {
          int op=0;
        sql ="INSERT INTO Personal (idprod, idcomp, cant, descuento, prec_comp) VALUES(null, "
                +pc.getIdprod()+", '"
            +pc.getIdcomp()+"', '"
            +pc.getCant()+"', "
            +pc.getDescut()+", '"
            +pc.getPrec_comp()+"')";
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
    public int EliminarProductoCompra(int id) {
               int op=0;
        sql = "DELETE FROM personal WHERE idprod="+id;
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
