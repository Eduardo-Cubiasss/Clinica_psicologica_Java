/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Database.ConnectionSQL;
import java.sql.PreparedStatement;
import java.sql.Connection;
import Ui.JF002_S1_RH;
import javax.swing.JFrame;

/**
 *
 * @author 50369
 */
public class JF002_S1_GY {

    public static void RegistrarUsuarios() {

        JF002_S1_RH variables = new JF002_S1_RH();
        variables.obtenerTexto();
        String nombre = variables.getNombre();
        String usuario = variables.getUsuario();
        String contraseña = variables.getContraseña();
        String rcontra = variables.getRContraseña();
        String idclinica = variables.getIdClinica();
        JFrame ventanaActual = variables.getVentana();

        if (contraseña.equals(rcontra)) {

            Connection conn = null;
            PreparedStatement ps = null;
            try {
                conn = (Connection) ConnectionSQL.getConexion();
                ps = conn.prepareStatement("EXEC PDRegistrarAdmin ?, ?, ?, ?");
                ps.setString(1, nombre);
                ps.setString(2, usuario);
                ps.setString(3, contraseña);
                ps.setString(4, idclinica);
                ps.executeUpdate();
                System.out.println("Lo lograste");
                Abrirvistas.abrir("JF001_S1_AF", ventanaActual);

            } catch (Exception e) {
                System.out.println("Error #J001GU");
                e.printStackTrace();
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
        } else {
            System.out.println("Error #0001: Las contraseñas no coinciden, vuelva a intentarlo");
        }

    }
}
