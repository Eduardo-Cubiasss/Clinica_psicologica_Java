/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 50369
 */
public class Procesos_almacenados {
    public boolean In_admin_clinica_users(Administrador modeloadmin, Usuarios modelousuarios, Clinica modeloclinica) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = (Connection) ConnectionSQL.getConexion();
            ps = conn.prepareStatement("EXEC PDRegistrarAdmin ?, ?, ?, ?");
            ps.setString(1, modeloadmin.getNombre());
            ps.setString(2, modelousuarios.getUserName());
            ps.setString(3, modelousuarios.getContraseña());
            ps.setString(4, modeloclinica.getIDClinica());
            System.out.println("Exitooo");
            System.out.println(modeloadmin.getNombre());
            ps.executeUpdate();
            System.out.println("Lo lograste");
            return true;

        } catch (SQLException e) {
            System.out.println("Error #J001GU");
            System.out.println(e.toString());
            return false;
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static int Logear(Usuarios modelousuarios){
        
       int acceso = 0;
       int nivelusuario = 0;
        PreparedStatement ps;
        Connection conn;
        try {
            conn = ConnectionSQL.getConexion();
            ps = conn.prepareStatement("DECLARE @resultado INT; DECLARE @ventana INT; EXEC PDLogear ?, ?, @resultado OUTPUT, @ventana OUTPUT;");
            ps.setString(1, modelousuarios.getUserName());
            ps.setString(2, modelousuarios.getContraseña());

            ResultSet rs = ps.executeQuery("SELECT @resultado AS acceso");
            ResultSet rs1 = ps.executeQuery("SELECT @ventana AS abrirventana");

            while(rs.next()) {
                acceso = rs.getInt(1); // Obtener el valor de la variable de salida @resultado
                modelousuarios.setAcceso(acceso);
                System.out.println(acceso);
            }
            while(rs1.next()){
                nivelusuario = rs1.getInt(1);
                modelousuarios.setResultado(nivelusuario);
                System.out.println(nivelusuario);
            }

        } catch (Exception e) {
            System.out.println("Error #J00DA");
            e.printStackTrace();
        }
        return 0;
            /*
            
            conn = ConnectionSQL.getConexion();
            ps = conn.prepareStatement("DECLARE @resultado INT; DECLARE @ventana INT; EXEC PDLogear ?, ?, @resultado OUTPUT, @ventana OUTPUT;");
            ps.setString(1, modelousuarios.getUserName());
            ps.setString(2, modelousuarios.getContraseña());

            // Realizar una consulta adicional para obtener el resultado
           // PreparedStatement psConsulta = conn.prepareStatement("SELECT @resultado AS acceso;");
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                acceso = rs.getInt("acceso");
                nivelusuario = rs.getInt("abrirventana");
                //PreparedStatement psConsulta2 = conn.prepareStatement("SELECT @ventana AS abrirventana;");
                //ResultSet rs1 = psConsulta2.executeQuery();
                System.out.println(acceso);
                System.out.println(nivelusuario);
            }
            //ps.executeUpdate();
            /**
             * conn = (Connection) ConnectionSQL.getConexion(); conn =
             * (Connection) ConnectionSQL.getConexion(); ps =
             * conn.prepareStatement("DECLARE @resultados BIT; EXEC PDLogear
             * (?), (?), @resultados OUTPUT"); ps.setString(1, user);
             * ps.setString(2, pass); ps.executeUpdate();
             *
             * ps = conn.prepareStatement("SELECT @resultado AS Acceso"); ps=
             * get.boolean(1, acceso);
             
        } catch (Exception e) {
            System.out.println("Error #0001");
            e.printStackTrace();
        }
        return 0;
        */
            
    }
    public static boolean RecCorreo (Usuarios ModelUsers, Contactos ModelContactos)
    {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = (Connection) ConnectionSQL.getConexion();
            ps = conn.prepareStatement("Exec PDActualizarContraGmail ?, ?;");
            ps.setString(1, ModelUsers.getContraseña());
            ps.setString(2, ModelContactos.getCorreo());
            System.out.println("Exitooo");
            ps.executeUpdate();
            System.out.println("Lo lograste");
            return true;

        } catch (SQLException e) {
            System.out.println("Error #J001DA");
            System.out.println(e.toString());
            return false;
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
     public static boolean RecTelefono (Usuarios ModelUsers, Contactos ModelContactos)
    {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = (Connection) ConnectionSQL.getConexion();
            ps = conn.prepareStatement("Exec PDActualizarContraNum ?, ?;");
            ps.setString(1, ModelUsers.getContraseña());
            ps.setString(2, ModelContactos.getNumTelefonico());
            System.out.println("Exitooo");
            ps.executeUpdate();
            System.out.println("Lo lograste");
            return true;

        } catch (SQLException e) {
            System.out.println("Error #J001DA");
            System.out.println(e.toString());
            return false;
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
}
