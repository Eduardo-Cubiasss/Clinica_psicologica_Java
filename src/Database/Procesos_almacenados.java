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
import java.sql.CallableStatement;
import java.sql.Date;
import java.time.LocalDate;

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
            JOptionPane.showMessageDialog(null, "Error J001GU, el usuario ya existe", "Error al crear el usuario", JOptionPane.INFORMATION_MESSAGE);
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

    public void Logear(Usuarios modelousuarios) {
        int acceso = 0;
        int nivelusuario = 0;
        Connection conn = null;
        CallableStatement cs = null;

        try {
            conn = ConnectionSQL.getConexion();
            cs = conn.prepareCall("{CALL PDLogear(?, ?, ?, ?)}");
            cs.setString(1, modelousuarios.getUserName()); // aqui se manda el username para db
            cs.setString(2, modelousuarios.getContraseña()); // aqui se manda la contraseña para db
            cs.registerOutParameter(3, java.sql.Types.INTEGER);  // Para @resultado
            cs.registerOutParameter(4, java.sql.Types.INTEGER);  // Para @ventana

            cs.execute();

            // Obtener los valores de los parámetros de salida
            int resultado = cs.getInt(3);  // Obtener el valor de salida @resultado, resultado puede devolver 0 y 1, 1 si existe el usuario y 0 si no existe
            int ventana = cs.getInt(4);    // Obtener el valor de salida @ventana, resultado puede devolver 1, 2, 3, 4, es para diferenciar el nivel de usuario

            modelousuarios.setAcceso(resultado);
            modelousuarios.setResultado(ventana);

        } catch (Exception e) {
            System.out.println("Error #J00DA");
            JOptionPane.showMessageDialog(null, "Error: J000DA", "Credenciales incorrectas", JOptionPane.INFORMATION_MESSAGE);

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public boolean RecCorreo(Usuarios modelUsers, Contactos ModelContactos) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = (Connection) ConnectionSQL.getConexion();
            ps = conn.prepareStatement("Exec PDActualizarContraGmail ?, ?;");
            ps.setString(1, ModelContactos.getCorreo());
            ps.setString(2, modelUsers.getContraseña());
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
                    System.out.println("O sea que si existe pues");
                } else {
                    System.out.println("Erroraso en modelo");

                    JOptionPane.showMessageDialog(null, "J022DA ", "Error al enviar correo ee", JOptionPane.INFORMATION_MESSAGE);
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

    public int PrimerUso(Usuarios modelousuarios, int operacion) {
        int resultado = 0;
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = ConnectionSQL.getConexion();

            switch (operacion) {
                case 1: // 1 para update
                    // Realizar la actualización
                    ps = conn.prepareStatement("UPDATE TbUsuarios SET Primeruso = ? WHERE Username = ?");
                    ps.setInt(1, modelousuarios.getPrimerUso());
                    ps.setString(2, modelousuarios.getUserName());
                    resultado = ps.executeUpdate();
                    break;

                case 2: // 2 para select
                    // Realizar la consulta
                    ps = conn.prepareStatement("SELECT Primeruso FROM TbUsuarios WHERE Username = ?");
                    ps.setString(1, modelousuarios.getUserName());
                    ResultSet rs = ps.executeQuery();

                    while (rs.next()) {
                        modelousuarios.setPrimerUso(rs.getInt("Primeruso"));
                    }
                    break;

                default:
                    // Manejar un caso no válido
                    JOptionPane.showMessageDialog(null, "Operación no válida: " + operacion, "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: J009UI", "Error inesperado, cierre sesión y vuelva a abrir sesión", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return resultado;
    }

    public void CRUDprimeruso(Usuarios modelousuarios, Contactos modelContactos, ActividadesLaborales modelActivity,
            Genero modelGenero, int operacion, Administrador modelAdministrador) {

        Connection conn = null;
        CallableStatement cs = null;

        switch (operacion) {
            case 1:
                //Case 1 sirve para ver los datos existentes
        try {
                conn = ConnectionSQL.getConexion();
                cs = conn.prepareCall("{CALL PDprimerusoinfo(?, ?, ?, ?, ?, ?, ?)}");
                cs.setString(1, modelousuarios.getUserName()); // aqui se manda el username para db
                cs.registerOutParameter(2, java.sql.Types.VARCHAR);  // Para @Correo
                cs.registerOutParameter(3, java.sql.Types.VARCHAR);  // Para @ActividadLab
                cs.registerOutParameter(4, java.sql.Types.DATE);  // Para @fechadenaci
                cs.registerOutParameter(5, java.sql.Types.VARCHAR);  // Para @Numerodetel
                cs.registerOutParameter(6, java.sql.Types.VARCHAR);  // Para @DUI
                cs.registerOutParameter(7, java.sql.Types.INTEGER);  // Para @Genero

                cs.execute();

                // Obtener los valores de los parámetros de salida
                String Correo = cs.getString(2);  // Obtener correo de tipo Varchar
                String AcividadLab = cs.getString(3);    // Obtener correo de tipo Varchar
                java.sql.Date fechaNacimient = cs.getDate(4);    // Obtener correo de tipo DATE
                String Numerodetel = cs.getString(5);    // Obtener correo de tipo Varchar
                String DUI = cs.getString(6);    // Obtener correo de tipo Varchar
                int genero = cs.getInt(7);    // Obtener genero que es de tipo INT
                
                modelContactos.setCorreo(Correo);
                modelContactos.setNumTelefonico(Numerodetel);
                modelGenero.setGenero(genero);
                modelActivity.setActiviadadLaboral(AcividadLab);
                modelAdministrador.setDUI(DUI);
                modelAdministrador.setFNacimiento(fechaNacimient);

            } catch (Exception e) {
                System.out.println("Error #J00DA");
                JOptionPane.showMessageDialog(null, "Error innesperado al cargar datos, reinicie su aplicación", "Error: J000DA", JOptionPane.INFORMATION_MESSAGE);

                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage(), "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    if (cs != null) {
                        cs.close();
                    }
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            break;
            case 2:
            try {
                conn = ConnectionSQL.getConexion();
                cs = conn.prepareCall("{CALL PDPrimerUso(?, ?, ?, ?, ?, ?, ?)}");
                cs.setString(1, modelousuarios.getUserName()); // aqui se manda el username para db
                cs.setString(2, modelContactos.getCorreo()); // aqui se manda el correo para db
                cs.setString(3, modelActivity.getActiviadadLaboral()); // aqui se manda el correo para db
                cs.setDate(4, (Date) modelAdministrador.getFNacimiento()); // aqui se manda el correo para db
                cs.setString(5, modelContactos.getNumTelefonico()); // aqui se manda el correo para db
                cs.setString(6, modelAdministrador.getDUI()); // aqui se manda el username para db
                cs.setInt(7, modelGenero.getGenero()); // aqui se manda el username para db
                
                cs.execute();

            } catch (Exception e) {
                System.out.println("Error #J00DA");
                JOptionPane.showMessageDialog(null, "Tiene datos ya registrados en el sistema anteriormente", "Error: J015UI", JOptionPane.INFORMATION_MESSAGE);

                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage(), "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    if (cs != null) {
                        cs.close();
                    }
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            break;
        }

    }

}
