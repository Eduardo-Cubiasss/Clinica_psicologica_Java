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
import javax.swing.JOptionPane;

/**
 *
 * @author 50369
 */
public class Procesos_almacenados {

    int CorreoVal = 0;

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
            JOptionPane.showMessageDialog(null, "Error J001GU", "Error al crear el usuario", JOptionPane.INFORMATION_MESSAGE);
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

    public int Logear(Usuarios modelousuarios) {

        int acceso = 0;
        int nivelusuario = 0;
        PreparedStatement ps;
        Connection conn;
        try {
            conn = ConnectionSQL.getConexion();
            ps = conn.prepareStatement("DECLARE @resultado INT; DECLARE @ventana INT; EXEC PDLogear ?, ?, @resultado OUTPUT, @ventana   ; SELECT @resultado AS acceso; SELECT @ventana AS abrirventana;");
            ps.setString(1, modelousuarios.getUserName());
            ps.setString(2, modelousuarios.getContraseña());

            //ResultSet rs = ps.executeQuery("SELECT @resultado AS acceso");
            //ResultSet rs1 = ps.executeQuery("SELECT @ventana AS abrirventana");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // acceso = rs.getInt(1); // Obtener el valor de la variable de salida @resultado
                // modelousuarios.setAcceso(acceso);
                //System.out.println(acceso);

                modelousuarios.setAcceso(1);
                modelousuarios.setResultado(2);
                System.out.println("ACESOOOOOOOOO" + rs.getInt("acceso"));
                //  System.out.println("ACESOOOOOOOOO"+rs.getInt("abrirventana") );

            }
            /*
            while(rs1.next()){
                nivelusuario = rs1.getInt(1);
                modelousuarios.setResultado(nivelusuario);
                System.out.println(nivelusuario);
            }*/

        } catch (Exception e) {
            System.out.println("Error #J00DA");
            JOptionPane.showMessageDialog(null, "Error: J000DA", "Credenciales incorrectas", JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
        }
        return 0;

    }

    public boolean RecCorreo(Usuarios modelUsers, Contactos ModelContactos) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = (Connection) ConnectionSQL.getConexion();
            ps = conn.prepareStatement("Exec PDActualizarContraGmail ?, ?;");
            ps.setString(1, modelUsers.getContraseña());
            ps.setString(2, ModelContactos.getCorreo());
            System.out.println("Exitooo en el cambio de contraseña");
            ps.executeUpdate();
            System.out.println("Lo lograste");
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "J001GU", "Error al actualizar contraseña", JOptionPane.INFORMATION_MESSAGE);
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

    public boolean RecTelefono(Usuarios ModelUsers, Contactos ModelContactos) {
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
            JOptionPane.showMessageDialog(null, "J001DA ", "Error al enviar mensaje", JOptionPane.INFORMATION_MESSAGE);
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

    public boolean ValCorreo(Contactos ModelContactos) {

        PreparedStatement ps;
        Connection conn;
        try {
            conn = ConnectionSQL.getConexion();
            ps = conn.prepareStatement("DECLARE @CorreoExis INT; EXEC PdBuscarCorreo ?, @CorreoExis OUTPUT; SELECT @CorreoExis AS Correoexistente;");
            ps.setString(1, ModelContactos.getCorreoVal());

            //ResultSet rs = ps.executeQuery("SELECT @resultado AS acceso");
            //ResultSet rs1 = ps.executeQuery("SELECT @ventana AS abrirventana");
            ResultSet rs = ps.executeQuery();

            System.out.println(ModelContactos.getCorreoVal());
            System.out.println(ModelContactos.getCorreo());
            while (rs.next()) {
                int Correo1 = rs.getInt("Correoexistente");

                if (Correo1 == 1) {
                    ModelContactos.setCorreo(ModelContactos.getCorreoVal());
                } else {
                    System.out.println("Erroraso en modelo");

                    JOptionPane.showMessageDialog(null, "J022DA ", "Error al enviar correo", JOptionPane.INFORMATION_MESSAGE);
                }
                System.out.println(ModelContactos.getCorreoVal());
                System.out.println(ModelContactos.getCorreo());
            }
            /*
            while(rs1.next()){
                nivelusuario = rs1.getInt(1);
                modelousuarios.setResultado(nivelusuario);
                System.out.println(nivelusuario);
            }*/

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "J00DA ", "Error con la base de datos", JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
        }
        return false;
    }

    public boolean valTelefono(Contactos ModelContactos) {
        int TelefonoVal = 0;
        PreparedStatement ps;
        Connection conn;
        try {
            conn = ConnectionSQL.getConexion();
            ps = conn.prepareStatement("DECLARE @CorreoExis INT; EXEC PdBuscarCorreo ?, @CorreoExis OUTPUT; SELECT @CorreoExis AS Correoexistente;");
            ps.setString(1, ModelContactos.getNumTelefonicoVal());

            //ResultSet rs = ps.executeQuery("SELECT @resultado AS acceso");
            //ResultSet rs1 = ps.executeQuery("SELECT @ventana AS abrirventana");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // acceso = rs.getInt(1); // Obtener el valor de la variable de salida @resultado
                // modelousuarios.setAcceso(acceso);
                //System.out.println(acceso);
                if (TelefonoVal == 1) {
                    ModelContactos.setNumTelefonico(ModelContactos.getNumTelefonicoVal());
                } else {
                    JOptionPane.showMessageDialog(null, "J022DA ", "Error al enviar mensaje", JOptionPane.INFORMATION_MESSAGE);
                }

            }
            /*
            while(rs1.next()){
                nivelusuario = rs1.getInt(1);
                modelousuarios.setResultado(nivelusuario);
                System.out.println(nivelusuario);
            }*/

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "J00DA ", "Error con la base de datos", JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
        }
        return false;
    }

}
