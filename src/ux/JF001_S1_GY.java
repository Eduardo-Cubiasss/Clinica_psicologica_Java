/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Database.ConnectionSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Ui.JF001_S1_AF;
import java.sql.Connection;

/**
 *
 * import java.sql.Types;
 *
 * @author 50369
 */
public class JF001_S1_GY {

    public static void IniciarSesion() {
        JF001_S1_AF variables = new JF001_S1_AF();
        String user = variables.UserName;
        String pass = variables.Contraseña;
        boolean acceso = false;

        PreparedStatement ps;
        Connection conn;
        try {

            conn = ConnectionSQL.getConexion();
            ps = conn.prepareStatement("DECLARE @resultado BIT; EXEC PDLogear ?, ?, @resultado OUTPUT;");
            ps.setString(1, user);
            ps.setString(2, pass);

            // Realizar una consulta adicional para obtener el resultado
            PreparedStatement psConsulta = conn.prepareStatement("SELECT @resultado AS Acceso;");
            ResultSet rs = psConsulta.executeQuery();

            if (rs.next()) {
                acceso = rs.getBoolean("Acceso");
            }
            ps.executeUpdate();
            /**
             * conn = (Connection) ConnectionSQL.getConexion(); conn =
             * (Connection) ConnectionSQL.getConexion(); ps =
             * conn.prepareStatement("DECLARE @resultados BIT; EXEC PDLogear
             * (?), (?), @resultados OUTPUT"); ps.setString(1, user);
             * ps.setString(2, pass); ps.executeUpdate();
             *
             * ps = conn.prepareStatement("SELECT @resultado AS Acceso"); ps=
             * get.boolean(1, acceso);
             */
        } catch (Exception e) {
            System.out.println("Error #0001");
            e.printStackTrace();
        }
    }
}
