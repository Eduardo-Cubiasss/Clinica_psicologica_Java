/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Database.ActividadesLaborales;
import Database.Administrador;
import Database.Contactos;
import Database.Genero;
import Database.Procesos_almacenados;
import Database.Usuarios;
import Ui.JF_000_S7_GU;
import Ui.JP001_S1_AFP;
import Ui.JP002_S1_RHP;
import Ui.JP0048_S3_RH;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author 50369
 */
public class Login implements ActionListener {

    private Usuarios modelUsers;
    private JPanel JPContenido;
    private Procesos_almacenados Procesos;
    private Genero modelGenero;
    private Contactos modelContactos;
    private ActividadesLaborales modelActivty;
    private Administrador modelAdmin;
    private JP001_S1_AFP panelRegistro;
    private JP0048_S3_RH panelprimeruso;
    private PanelHistory panelHistory;
    private HabilitarPaneles PanelesManager;
    private JF_000_S7_GU vista;

    public void enableLoginPanel() {
        panelRegistro.setEnabled(true);
    }

    public Login(Usuarios modelUsers, JPanel JPContenido, Procesos_almacenados Procesos,
            JP001_S1_AFP panelRegistro, PanelHistory panelHistory, HabilitarPaneles PanelesManager, JF_000_S7_GU vista,
            JP0048_S3_RH panelprimeruso, Genero modelGenero, Contactos modelContactos, ActividadesLaborales modelActivty,
            Administrador modelAdmin) {
        this.modelUsers = modelUsers;
        this.JPContenido = JPContenido;
        this.Procesos = Procesos;
        this.panelRegistro = panelRegistro;
        this.panelHistory = panelHistory;
        this.PanelesManager = PanelesManager;
        this.panelprimeruso = panelprimeruso;
        this.modelGenero = modelGenero;
        this.modelContactos = modelContactos;
        this.modelActivty = modelActivty;
        this.modelAdmin = modelAdmin;
        this.vista = vista;

        this.panelRegistro.getBtn2_JF001_S1_AF().addActionListener(this);
        this.panelRegistro.getbtn3_JF001_S1_AF().addActionListener(this);
        this.panelRegistro.getbtn4_JF001_S1_AF().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelRegistro.getBtn2_JF001_S1_AF()) {
            modelUsers.setUserName(panelRegistro.getTxtUsuario_JF001_S1_AF().getText());
            modelUsers.setContraseña(new String(panelRegistro.getPass_JF001_S1_AF().getPassword()));
            Procesos.Logear(modelUsers);
            int caso = 2;
            ///Aqui irán los setters hacía los Jtextfiel del primer uso
            Procesos.CRUDprimeruso(modelUsers, modelContactos, modelActivty, modelGenero, 1, modelAdmin);
            ///Aqui Acaban
            Procesos.PrimerUso(modelUsers, caso);
            //Aqui van los setters
            this.panelprimeruso.setTxtCorreoElectronico_jp0048_RH(modelContactos.getCorreo());
            this.panelprimeruso.setTxtActiLabo_JP0048(modelActivty.getActiviadadLaboral());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String fechaTexto = panelprimeruso.getTxtFechaNa_JP0048().getText();

            if (!fechaTexto.isEmpty()) { // Comprobamos si la cadena no está vacía
                try {
                    Date fechaNacimiento = sdf.parse(fechaTexto);
                    if (fechaNacimiento != null) {
                        modelAdmin.setFNacimiento(new java.sql.Date(fechaNacimiento.getTime()));
                    } else {
                        // El texto no es una fecha válida, maneja el error aquí
                        // Puedes mostrar un mensaje de error al usuario o tomar otra acción apropiada
                    }
                } catch (ParseException ex) {
                    // Ocurrió un error al analizar la fecha, maneja la excepción aquí
                }
            } else {
                // El texto está vacío, maneja el error aquí si es necesario
                // Puedes mostrar un mensaje de error al usuario o tomar otra acción apropiada
            }

            this.panelprimeruso.setTxtDui_JP0048(modelAdmin.getDUI());
            this.panelprimeruso.setTxtNumTel_JP0048(modelContactos.getNumTelefonico());
            this.panelprimeruso.CmbxGenero.setSelectedIndex(modelGenero.getGenero());
            //
            int Acceso = modelUsers.getAcceso();
            int Nivel = modelUsers.getResultado();
            int Primeruso = modelUsers.getPrimerUso();
            if (Acceso == 1) {
                switch (Nivel) {
                    case 1:
                        if (Primeruso == 1) {
                            PanelesManager.copiaPanel("JP001_S1_AFP");
                            JPContenido.remove(panelRegistro);
                            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelPrimerUso");
                        } else {
                            PanelesManager.copiaPanel("JP001_S1_AFP");
                            JPContenido.remove(panelRegistro);
                            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelMenuAdmin");
                        }
                        break;
                    case 2:
                        if (Primeruso == 1) {
                            PanelesManager.copiaPanel("JP001_S1_AFP");
                            JPContenido.remove(panelRegistro);
                            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelPrimerUso");
                        } else {
                            PanelesManager.copiaPanel("JP001_S1_AFP");
                            JPContenido.remove(panelRegistro);
                            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelMenuTp");
                        }
                        break;
                    case 3:
                        if (Primeruso == 1) {
                            PanelesManager.copiaPanel("JP001_S1_AFP");
                            JPContenido.remove(panelRegistro);
                            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelPrimerUso");
                        } else {
                            PanelesManager.copiaPanel("JP001_S1_AFP");
                            JPContenido.remove(panelRegistro);
                            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelMenuSec");
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Tu usuario es de tipo paciente, usa la aplicación de móvil para acceder a él por favor", "Usuario inválido", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
                JPContenido.revalidate();
                JPContenido.repaint();
                PanelesManager.restaurarPanelEliminado();
            } else {
                JOptionPane.showMessageDialog(null, "Se sugiere visitar la página donde se explica a detalle cada error que puede experimentar usted como usuario", "ERROR JF001DA", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (e.getSource() == panelRegistro.getbtn3_JF001_S1_AF()) {

            PanelesManager.copiaPanel("JP001_S1_AFP");
            System.out.println("Si copia el inicio sesiom");
            JPContenido.remove(panelRegistro);
            System.out.println("Si elimina el panel");
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelRegistro");
            System.out.println("Abro panelRegisro");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
            System.out.println();
            System.out.println("Se restaura panel");
        } else if (e.getSource() == panelRegistro.getbtn4_JF001_S1_AF()) {
            //PanelesManager.eliminarPanel("panelInicioSesion");
            PanelesManager.copiaPanel("JP001_S1_AFP");
            JPContenido.remove(panelRegistro);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelvalCorreo");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
        }
    }
}
