/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.Conexion;
import dto.Categoria;
import interfaces.InterfaceCategoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

/**
 *
 * @author Pamela
 */
public class Categoria1DAO implements InterfaceCategoria{
     private Connection cx = null;
    private PreparedStatement st;
    private ResultSet rs;
    private String sql;
    @Override
    public ArrayList<Categoria> listarCategoria() {
         ArrayList<Categoria> lista=new ArrayList<>();
        sql = "SELECT * FROM categoria";
        try {
            cx = Conexion.getConex();
            st = cx.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                Categoria c= new Categoria();
                c.setIdcat(rs.getInt("idCATEGORIA"));
                c.setNomcat(rs.getString("NOM_CATE"));
                c.setEstado(rs.getString("ESTADO"));
                lista.add(c);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public ArrayList<Categoria> listarCategoria(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


  

    @Override
    public int CrearCategoria(Categoria c) {
         int op = 0;
        sql = "INSERT FROM categoria INTO(idCATEGORIA,NOM_CATE,ESTADO)VALUES(null, ?, ?)";
        try {
            cx = Conexion.getConex();
            st = cx.prepareStatement(sql);
            st.setString(1, c.getNomcat());
            st.setString(2, c.getEstado());
            op = st.executeUpdate();
        } catch (Exception ex) {
        }
        return op;
    
         }

    @Override
    public int EditarCategoria(Categoria c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int EliminarCategoria(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String nomCategoria(int idcat) {
         String nom="";
        sql="SELECT *FROM categoria WHERE idCATEGORIA=?";
        try {
            cx = Conexion.getConex();
            st = cx.prepareStatement(sql);
            st.setInt(1, idcat);
            rs = st.executeQuery();
            while(rs.next()){
                nom = rs.getString("nom_cate");
            }
        } catch (Exception e) {
        }
        
        return nom;
        
    
          }

    @Override
    public int buscarIdCategoria(String nomcat) {
         int id=0;
      sql = "SELECT *FROM Categoria WHERE nom_cate=?";
        try {
            cx = Conexion.getConex();
            st = cx.prepareStatement(sql);
            st.setString(1, nomcat);
            rs = st.executeQuery();
            while(rs.next()){
            id = rs.getInt("idCategoria");
            }
        } catch (SQLException e) {
        }
        return id;
    }
         }

  
    

