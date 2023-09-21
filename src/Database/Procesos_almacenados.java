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
import java.util.ArrayList;
import java.util.List;
import microsoft.sql.Types;
import ux.Resultado;

/**
 *
 * @author 50369
 */
public class Procesos_almacenados {

    private Resultado resultado;
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

    public void SaberID(Usuarios modelusuarios, Administrador modelAdmin) {
        Connection conn = null;
        CallableStatement cs = null;
        try {
            conn = ConnectionSQL.getConexion();
            cs = conn.prepareCall("{CALL ObtenerIDAdministrador(?, ?)}");

            cs.setString(1, modelusuarios.getUserName());
            cs.registerOutParameter(2, java.sql.Types.INTEGER);

            cs.execute();

            // Obtener el resultado del parámetro de salida
            int IDAdministrador = cs.getInt(2);
            modelAdmin.setIDUsuario(IDAdministrador);
            System.out.println("Este es el ID " + (IDAdministrador));
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

    public void SaberIDTer(Usuarios modelusuarios, Terapeutas modelTerapeuta) {
        Connection conn = null;
        CallableStatement cs = null;
        try {
            conn = ConnectionSQL.getConexion();
            cs = conn.prepareCall("{CALL ObtenerIDTerapeuta(?, ?)}");

            cs.setString(1, modelusuarios.getUserName());
            cs.registerOutParameter(2, java.sql.Types.INTEGER);

            cs.execute();

            // Obtener el resultado del parámetro de salida
            int IDAdministrador = cs.getInt(2);
            modelTerapeuta.setIDTerapeuta(IDAdministrador);
            System.out.println("Este es el ID de la terpeuta" + (IDAdministrador));
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

    public void SaberIDSecre(Usuarios modelusuarios, Secretarias ModelSecret) {
        Connection conn = null;
        CallableStatement cs = null;
        try {
            conn = ConnectionSQL.getConexion();
            cs = conn.prepareCall("{CALL ObtenerIDSecretaria(?, ?)}");

            cs.setString(1, modelusuarios.getUserName());
            cs.registerOutParameter(2, java.sql.Types.INTEGER);

            cs.execute();

            // Obtener el resultado del parámetro de salida
            int IDAdministrador = cs.getInt(2);
            ModelSecret.setIDSecretaria(IDAdministrador);
            System.out.println("Este es el ID de la secretaria" + (IDAdministrador));
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
            int resultado = cs.getInt(3);  // Obtener el valor de salida @resultado, resultado puede devolver 0 y 1. 1 si existe el usuario y 0 si no existe
            int ventana = cs.getInt(4);    // Obtener el valor de salida @ventana, resultado puede devolver 1, 2, 3, 4, es para diferenciar el nivel de usuario

            modelousuarios.setAcceso(ventana);
            modelousuarios.setResultado(resultado);
            System.out.println(resultado);
            System.out.println(ventana);
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

    public List<Resultado> Pacientes(Pacientes modelPaciente, int operacion, String textoBusqueda) {
        {
            Connection conn = null;
            PreparedStatement ps = null;
            List<Resultado> resultados = new ArrayList<>();

            try {
                conn = ConnectionSQL.getConexion();

                switch (operacion) {
                    case 1:
                        ps = conn.prepareStatement("SELECT IdPaciente, nombre, apellido FROM TbPacientes WHERE nombre LIKE ?;");
                        ps.setString(1, "%" + textoBusqueda + "%");
                        ResultSet rs = ps.executeQuery();
                        System.out.println("%" + textoBusqueda + "%");
                        while (rs.next()) {
                            int id = rs.getInt("IdPaciente");
                            String nombre = rs.getString("nombre");
                            String apellido = rs.getString("apellido");

                            // Crea un objeto Resultado y agrégalo a la lista de resultados
                            Resultado resultado = new Resultado(id, nombre, apellido);
                            resultados.add(resultado);
                        }

                        break;

                    case 2: // 2 para select

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

            return resultados;
        }

    }

    public int viewpaciente(Pacientes modelpaciente, Usuarios modelousuarios, Contactos modelContactos, int operacion) {

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = ConnectionSQL.getConexion();

            switch (operacion) {
                case 1: // 1 para recibir
                    try (
                            CallableStatement cs = conn.prepareCall("{CALL PDinforPacienteview(?, ?, ?, ?, ?, ?)}")) {

                        cs.setInt(1, modelpaciente.getIDpaciente());
                        cs.registerOutParameter(2, java.sql.Types.VARCHAR);
                        cs.registerOutParameter(3, java.sql.Types.DATE);
                        cs.registerOutParameter(4, java.sql.Types.VARCHAR);
                        cs.registerOutParameter(5, java.sql.Types.VARBINARY);
                        cs.setString(6, modelpaciente.getMensajito()); // Valor para el último parámetro

                        cs.execute();

                        String nombre = cs.getString(2);
                        Date fechaNacimiento = cs.getDate(3);
                        String correo = cs.getString(4);
                        byte[] imagen = cs.getBytes(5);

                        // Haz lo que necesites con los valores obtenidos, como mostrarlos o asignarlos a objetos.
                        modelpaciente.setNombre(nombre);
                        modelpaciente.setFnacimiento(fechaNacimiento);
                        modelContactos.setCorreo(correo);
                        modelousuarios.setFPerfil(imagen);

                        // La variable 'imagen' contiene la imagen en formato byte[] que puedes usar según tus necesidades.
                    } catch (Exception e) {
                        System.out.println("Error #J00DA");
                        JOptionPane.showMessageDialog(null, "Error inesperado al cargar datos, reinicie su aplicación", "Error: J000DA", JOptionPane.WARNING_MESSAGE);

                    }
                    break;

                case 2: // 2 para enviar mensajes
                    // Realizar la consulta
                    System.out.println("No sé que pasa, estamos en el modelo Procesos " + modelpaciente.getIDpaciente() + modelpaciente.getMensajito());
                    ps = conn.prepareStatement("EXEC PDenviarmensajedeCariño ?, ?");
                    ps.setInt(1, modelpaciente.getIDpaciente());
                    ps.setString(2, modelpaciente.getMensajito());
                    ps.executeUpdate();
                    break;

                default:
                    // Manejar un caso no válido
                    JOptionPane.showMessageDialog(null, "Operación no válida", "Error", JOptionPane.ERROR_MESSAGE);
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
        return 0;
    }

    public void agregarecetas(RecetasMedicas recetas) {

        Connection conn = null;
        CallableStatement cs = null;

        try {
            conn = ConnectionSQL.getConexion();
            cs = conn.prepareCall("INSERT INTO TbRecetasMedicas(Padecimiento, Descripcion, NombreMedicamento) VALUES (?,?,?)");
            cs.setString(1, recetas.getNombrePadecimiento());
            cs.setString(2, recetas.getDescripcion());
            cs.setString(3, recetas.getMwedicamentos());

            cs.executeUpdate();
            JOptionPane.showMessageDialog(null, "Receta guardada", "Exito", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            System.out.println("Error #J00DA");
            JOptionPane.showMessageDialog(null, "Error innesperado al cargar datos, reinicie su aplicación", "Error: J000DA", JOptionPane.INFORMATION_MESSAGE);

            e.printStackTrace();
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

    public int Acercademi(Usuarios modelousuarios, int operacion) {

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = ConnectionSQL.getConexion();

            switch (operacion) {
                case 1: // 1 para recibir
                    try (
                            CallableStatement cs = conn.prepareCall("SELECT TOP 1 Descripcion FROM TbUsuarios Where UserName = ?")) {

                        cs.setString(1, modelousuarios.getUserName());
                        cs.registerOutParameter(2, java.sql.Types.VARBINARY);

                        cs.execute();

                        String Descripcion = cs.getString(2);

                        modelousuarios.setDescripcion(Descripcion);

                        // La variable 'imagen' contiene la imagen en formato byte[] que puedes usar según tus necesidades.
                    } catch (Exception e) {
                        System.out.println("Error #J00DA");
                        JOptionPane.showMessageDialog(null, "Error inesperado al cargar datos, reinicie su aplicación", "Error: J000DA", JOptionPane.WARNING_MESSAGE);

                    }
                    break;

                case 2: // 2 para enviar mensajes
                    // Realizar la consulta

                    ps = conn.prepareStatement("EXEC PDCambiarContraseña ?, ?, ?");
                    ps.setString(1, modelousuarios.getUserName());
                    ps.setString(2, modelousuarios.getContraseña());
                    ps.setString(2, modelousuarios.getContrafake());
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Cierra sesión para comprobar tu cambio de contraseña", "Sgurencia", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 3: // 2 para enviar mensajes
                    // Realizar la consulta

                    ps = conn.prepareStatement("EXEC PDDetallesperfil ?, ?");
                    ps.setString(1, modelousuarios.getUserName());
                    ps.setString(2, modelousuarios.getDescripcion());
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Cierra sesión para comprobar tu cambio de contraseña", "Sgurencia", JOptionPane.INFORMATION_MESSAGE);
                    break;

                default:
                    // Manejar un caso no válido
                    JOptionPane.showMessageDialog(null, "Operación no válida", "Error", JOptionPane.ERROR_MESSAGE);
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
        return 0;
    }

    public boolean AgregarEmpleado(Administrador modelAdmin, Empleado modelEmpleado, Usuarios modelUsuario, Contactos modelContactos) {
        Connection conn = null;
        CallableStatement cs = null;
        try {
            conn = ConnectionSQL.getConexion();
            cs = conn.prepareCall("{CALL PDCrearEmpleado(?, ?, ?, ?, ?, ?, ?)}");

            // Configura los parámetros del procedimiento almacenado
            cs.setInt(1, modelAdmin.getIDUsuario());
            cs.setString(2, modelContactos.getCorreo());
            cs.setString(3, modelEmpleado.getUsername());
            cs.setString(4, modelEmpleado.getContraseña());
            cs.setInt(5, modelEmpleado.getNivel());
            cs.setString(6, modelEmpleado.getNombre());
            cs.setBytes(7, modelEmpleado.getFotoPerfil());
            // Ejecuta el procedimiento almacenado
            cs.execute();

            // Si llega hasta aquí sin excepciones, la inserción se realizó con éxito
            return true;
        } catch (SQLException e) {
            // Manejo de excepciones en caso de error
            e.printStackTrace();
            return false;
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

    public List<Resultado> Empleados(Empleado modelEmpleado, int operacion, String textoBusqueda) {
        {
            Connection conn = null;
            PreparedStatement ps = null;
            List<Resultado> resultados = new ArrayList<>();

            try {
                conn = ConnectionSQL.getConexion();

                switch (operacion) {
                    case 1:
                        ps = conn.prepareStatement("SELECT ID, Nombre, DUI, NombreDeActividad, IDUsuarioEm, Edad \n"
                                + "FROM VistaEmpleadosConActividad\n"
                                + "WHERE Nombre LIKE ?;");
                        ps.setString(1, "%" + textoBusqueda + "%");
                        ResultSet rs = ps.executeQuery();
                        System.out.println("%" + textoBusqueda + "%");
                        while (rs.next()) {
                            int idUsuario = rs.getInt("ID");
                            String Nombre = rs.getString("Nombre");
                            String DUI = rs.getString("DUI");
                            String ActividadLaboral = rs.getString("NombreDeActividad");
                            int IDUsuarioEm = rs.getInt("IDUsuarioEm");
                            int Edad = rs.getInt("Edad");

                            modelEmpleado.setNombre(Nombre);
                            modelEmpleado.setDUI(DUI);
                            modelEmpleado.setIdEmpleado(idUsuario);
                            modelEmpleado.setActividadLab(ActividadLaboral);
                            modelEmpleado.setIDUsuario(IDUsuarioEm);
                            modelEmpleado.setEdad(Edad);
                            System.out.println(modelEmpleado.getNombre() + " " + modelEmpleado.getEdad() + " " + " " + " " + " " + " ");
                            // Crea un objeto Resultado y agrégalo a la lista de resultados
                            Resultado resultado = new Resultado(idUsuario, Nombre, ActividadLaboral);
                            resultados.add(resultado);
                        }

                        break;

                    case 2: // 2 para select a la demas información

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

            return resultados;
        }

    }

    public void VerNotasPac(Pacientes modelPaciente, AgendasPersonales modelAgendas) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = ConnectionSQL.getConexion();

            ps = conn.prepareStatement("SELECT TOP 1 Contenido FROM TbAgendasPersonales WHERE IDPaciente = ?;");
            ps.setInt(1, modelPaciente.getIDpaciente());
            rs = ps.executeQuery();

            while (rs.next()) {
                String Contenido = rs.getString("Contenido");
                modelAgendas.setContenido(Contenido);
                System.out.println("Llegue hasta aqui " + Contenido);
            }
        } catch (Exception e) {
            System.out.println("Error #J00DA");
            JOptionPane.showMessageDialog(null, "Error: J000DA", "El paciente aún no ha escrito en su agenda", JOptionPane.INFORMATION_MESSAGE);

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public boolean AgregarAnuncio(Anuncios modelAnuncios) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean insercionExitosa = false; // Agregamos una variable para indicar el éxito de la inserción

        try {
            conn = ConnectionSQL.getConexion();

            ps = conn.prepareStatement("INSERT INTO TbAnuncio(Titulo, Imagen) VALUES (?, ?)");
            ps.setString(1, modelAnuncios.getTitulo());
            ps.setBytes(2, modelAnuncios.getImagen());
            int filasAfectadas = ps.executeUpdate();

            // Si una fila o más fueron afectadas, consideramos que la inserción fue exitosa
            if (filasAfectadas > 0) {
                insercionExitosa = true;
            }
        } catch (Exception e) {
            System.out.println("Error #J00DA");
            JOptionPane.showMessageDialog(null, "Error: J000DA", "El paciente aún no ha escrito en su agenda", JOptionPane.INFORMATION_MESSAGE);

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return insercionExitosa; // Devolvemos true si la inserción fue exitosa, de lo contrario, false
    }

    public boolean AgregarArticulo(Articulos modelArt, Terapeutas modelTer, int caso) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean insercionExitosa = false; // Inicialmente asumimos que la inserción falló

        try {
            conn = ConnectionSQL.getConexion();

            ps = conn.prepareStatement("EXEC PDArticulosInsertOupdate ?, ?, ?, ?, ?, ?");
            ps.setInt(1, (modelTer.getIDTerapeuta()));
            ps.setString(2, modelArt.getTitulo());
            ps.setString(3, modelArt.getDescripcion());
            ps.setBytes(4, modelArt.getImagen());
            ps.setInt(5, modelArt.getIDArticulo());
            ps.setInt(6, caso);

            int filasAfectadas = ps.executeUpdate();

            // Verificamos si al menos una fila fue afectada (la inserción se realizó con éxito)
            if (filasAfectadas > 0) {
                insercionExitosa = true;
            }
        } catch (Exception e) {
            System.out.println("Error #J00DA");
            JOptionPane.showMessageDialog(null, "Error: J000DA", "Error inesperado, verifique que la imagen sea JPEG", JOptionPane.INFORMATION_MESSAGE);

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return insercionExitosa; // Devolvemos el valor booleano
    }

    public void RedactarPermiso(Incapacidades modelIncap, Usuarios modelUsers) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = ConnectionSQL.getConexion();

            ps = conn.prepareStatement("EXEC PDPermiso ?, ?, ?");
            ps.setString(2, modelIncap.getMensaje());
            ps.setString(1, modelIncap.getAsunto());
            ps.setInt(3, modelUsers.getIDUsuario());

            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error #J00DA");
            JOptionPane.showMessageDialog(null, "Error: J000DA", "Error innesperado, reinicie la aplicación", JOptionPane.INFORMATION_MESSAGE);

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void SaberIDUsuario(Usuarios modelUsers) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = ConnectionSQL.getConexion();

            ps = conn.prepareStatement("SELECT TOP 1 IDUsuario FROM TbUsuarios WHERE UserName = ?");
            ps.setString(1, modelUsers.getUserName());
            rs = ps.executeQuery();
            System.out.println("Este es el username ingresado " + modelUsers.getUserName());
            while (rs.next()) {
                int Contenido = rs.getInt("IDUsuario");
                modelUsers.setIDUsuario(Contenido);
            }
        } catch (Exception e) {
            System.out.println("Error #J00DA");
            JOptionPane.showMessageDialog(null, "Error: J000DA", "Error innesperado, verifique que el username no este vacio", JOptionPane.INFORMATION_MESSAGE);

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void SaberIDClinica(Clinica modelClinica, Usuarios modelUsers) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = ConnectionSQL.getConexion();

            ps = conn.prepareStatement("SELECT TOP 1 IDClinica FROM VistaClinicaUsuario WHERE IDUsuario = ?;");
            ps.setInt(1, modelUsers.getIDUsuario());
            rs = ps.executeQuery();
            System.out.println("El IDUsuario es: " + modelUsers.getIDUsuario());
            while (rs.next()) {
                String IDclinica = rs.getString("IDClinica");
                modelClinica.setIDClinica(IDclinica);
            }
        } catch (Exception e) {
            System.out.println("Error #J00DA");
            JOptionPane.showMessageDialog(null, "Error: J000DA", "Error innesperado, este usuario no tiene una clinica, crea otra cuenta", JOptionPane.INFORMATION_MESSAGE);

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void VerExpe(Expedientes modelExp, Pacientes modelPaci) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = ConnectionSQL.getConexion();

            ps = conn.prepareStatement("SELECT TOP 1 Contenido FROM TbExpedientes where IDPaciente = ?");
            ps.setInt(1, modelPaci.getIDpaciente());
            rs = ps.executeQuery();

            while (rs.next()) {
                String Contenido = rs.getString("Contenido");
                modelExp.setContenido(Contenido);
            }
        } catch (Exception e) {
            System.out.println("Error #J00DA");
            JOptionPane.showMessageDialog(null, "Error: J000DA", "Error al cargar los datos del expediente", JOptionPane.INFORMATION_MESSAGE);

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void EscribirExpe(Pacientes modelPacie, Terapeutas modelTerap, Expedientes modelExp) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = ConnectionSQL.getConexion();

            ps = conn.prepareStatement("EXEC InsertarActualizarExpediente ?, ?, ?");
            ps.setInt(1, modelPacie.getIDpaciente());
            ps.setString(2, modelExp.getContenido());
            ps.setInt(3, modelTerap.getIDUsuario());

            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error #J00DA");
            JOptionPane.showMessageDialog(null, "Error: J000DA", "Error innesperado, Vuelva al menú e intenté más tadre", JOptionPane.INFORMATION_MESSAGE);

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
