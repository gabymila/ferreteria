/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.Conexion;
import dto.Compra;
import dto.Personal;
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
public class PersonalDAO implements interfaces.InterfacePersonal{
  private Connection cx = null;
    private Statement st;
    private ResultSet rs;
    private String sql;
   
    @Override
    public ArrayList<Personal> listarPersonal() {
      ArrayList<Personal> lista=new ArrayList<>();
        sql = "SELECT * FROM Personal";
       try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
               Personal p= new Personal();
                p.setIdpersonal(rs.getInt("idpersonal"));
                p.setNombre(rs.getString("nombre"));
                p.setApellido(rs.getString("apellido"));
                p.setDireccion(rs.getString("direccion"));
                p.setDni(rs.getString("dni"));
                p.setCelu(rs.getString("celu"));
                lista.add(p);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;   
    }

    @Override
    public ArrayList<Personal> listarPersonal(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Personal> listarPersonal(String nombre) {
         ArrayList<Personal> lista=new ArrayList<>();
        sql ="*SELECT idpersonal,nombre, apellido, direccion, dni,celu, FROM personal WHERE NOMBRE LIKE 'PA%' ORDER BY NOMBRE";
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
               Personal p= new Personal();
                p.setIdpersonal(rs.getInt("idpersonal"));
                p.setNombre(rs.getString("nombre"));
                p.setApellido(rs.getString("apellido"));
                p.setDireccion(rs.getString("direccion"));
                p.setDni(rs.getString("dni"));
                p.setCelu(rs.getString("celu"));
                lista.add(p);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;   
    }

    @Override
    public String nombrePersonal(int id) {
          String nombre="";
        sql = "SELECT * FROM personal WHERE idPersonal= "+id;
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
    public int CrearPersonal(Personal c) {
        int op=0;
        sql = "INSERT INTO personal(idpersonal,nombre, apellido, direccion, dni, celu) VALUES(NULL,'"
                +c.getIdpersonal()+"',"+c.getNombre()
                +","+c.getApellido()+","+c.getDireccion()
                +","+c.getDni()
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
    public int EditarPersonal(Personal p) {
           int op=0;
        sql ="INSERT INTO Personal (idpersonal, nombre, apellido, direccion, dni, celu) VALUES(null, "
                +p.getIdpersonal()+", '"
            +p.getNombre()+"', '"
            +p.getApellido()+"', "
            +p.getDireccion()+", '"
            +p.getDni()+"', '"
            +p.getCelu()+"')";
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
    public int EliminarPersonal(int id) {
          int op=0;
        sql = "DELETE FROM personal WHERE idpersonal="+id;
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
