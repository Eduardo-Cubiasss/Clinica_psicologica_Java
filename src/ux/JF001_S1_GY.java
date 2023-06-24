/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;
import Database.ConnectionSQL;
import java.sql.PreparedStatement;
import Ui.JF001_S1_AF;
import java.sql.Connection;
import java.sql.Types;

/**
 *
 * @author 50369
 */
public class JF001_S1_GY {
    public static void IniciarSesion(){
    JF001_S1_AF variables = new JF001_S1_AF();
    String user = variables.UserName;
    String pass = variables.Contraseña;
    
    PreparedStatement ps;
    Connection conn;
    try{
            conn = (Connection) ConnectionSQL.getConexion();
            ps = conn.prepareStatement("EXEC PDLogear (?), (?),(?)");
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.registerOutParameter(3,Types.BOOLEAN);
            ps.executeUpdate();
            
            boolean acceso = ps.getBoolean(3);
    }
    catch(Exception e){
        System.out.println("Error #0001");
        e.printStackTrace();
    }
    }
}

