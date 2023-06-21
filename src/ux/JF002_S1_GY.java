/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Database.ConnectionSQL;
import java.sql.PreparedStatement;
import Ui.JF002_S1_RH;
import java.sql.Connection;

/**
 *
 * @author 50369
 */
public class JF002_S1_GY {
    
    public static void RegistrarUsuarios(){
       JF002_S1_RH variables = new JF002_S1_RH();
       String nombre = variables.Nombre;
       String usuario = variables.Usuario;
       String contraseña = variables.Contraseña;
       String rcontra = variables.RContraseña;
       String idclincia = variables.IdClinica;
       String vacio = "elemento vacio";
       
       if(contraseña.equals(rcontra))
       {
           
        PreparedStatement ps;
        Connection conn;
        try {
            conn = (Connection) ConnectionSQL.getConexion();
            ps = conn.prepareStatement("INSERT INTO TbUsuarios VALUES (?), (?)");
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            /*
            ps = conn.prepareStatement("INSERT INTO TbAdministrador VALUES (?), (?), (?), (?), (?), (?), (?), (?)");
            ps.setString(1, nombre);
            ps.SetString();
            */
            ps.executeUpdate();
        }
        catch (Exception e){
              System.out.println("Error #0002");
              e.printStackTrace();
        }
       }
       else
       {
           System.out.println("Error #0001: Las contraseñas no coinciden, vuelva a intentarlo");
       }
       
       
    }
}
