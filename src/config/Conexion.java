/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author gaby
 */
public class Conexion {
    private static final String url="jdbc:mysql://localhost:3306/dbruli";
    private static final String usuario="root";
    private static final String clave="root";
    private static final String driver ="com.mysql.jdbc.Driver";
    private static Connection conex=null;
    public static Connection getConex(){
        try {
            if(conex==null){
              Class.forName(driver);
              conex = DriverManager.getConnection(url, usuario, clave);
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    return conex;
    } 
}
