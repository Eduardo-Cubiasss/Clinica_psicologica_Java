/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Database.Administrador;
import Database.Clinica;
import Database.Procesos_almacenados;
import Database.Usuarios;
import Ui.JP002_S1_RHP;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author 50369
 */
public class RegAdmin_JF002 implements ActionListener {

    private Administrador modelAdmin;
    private Usuarios modelUsers;
    private Clinica modelClinica;
    private JP002_S1_RHP vistaJP002;
    private JPanel JPContenido;
    private Procesos_almacenados Procesos;
    private PanelHistory panelHistory;
    private HabilitarPaneles PanelesManager; 

    public RegAdmin_JF002(Administrador modelAdmin, Usuarios modelUsers, Clinica modelClinica, JP002_S1_RHP vistaJP002,
            JPanel JPContenido, Procesos_almacenados Procesos, PanelHistory panelHistory) {
        this.modelAdmin = modelAdmin;
        this.modelUsers = modelUsers;
        this.modelClinica = modelClinica;
        this.vistaJP002 = vistaJP002;
        this.JPContenido = JPContenido;
        this.Procesos = Procesos;
        this.panelHistory = panelHistory;

        // Asociar el controlador a los botones de la vista
        this.vistaJP002.getBtn1_JF002_S1_RH().addActionListener(this);
        this.vistaJP002.getBtn2_JF002_S1_RH().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaJP002.getBtn1_JF002_S1_RH()) {
            modelAdmin.setNombre(vistaJP002.getTxtNombre_JF002_S1_RH().getText());
            modelUsers.setUserName(vistaJP002.getTxtUsuario_JF002_S1_RH2().getText());
            modelUsers.setContraseña(new String(vistaJP002.getPassField_Contraseña_JF002_S1_RH().getPassword()));
            modelClinica.setIDClinica(vistaJP002.getTxtID_JF002_S1_RH3().getText());

            System.out.println("Antes de ejecutar el método");
            Procesos.In_admin_clinica_users(modelAdmin, modelUsers, modelClinica);
            System.out.println("Después de ejecutar el método");

            // Agrega el panel actual al historial antes de cambiar de panel
            panelHistory.pushPanel("vistaJP002");

            vistaJP002.setEnabled(false);
            // Muestra el panel "panelMenuAdmin"
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelMenuAdmin");
            System.out.println("Llega hasata aqui, abre panelMenuAdmin");
            JPContenido.revalidate();
            JPContenido.repaint();

        } else if (e.getSource() == vistaJP002.getBtn2_JF002_S1_RH()) {
            PanelesManager.deshabilitarPanel("panelRegistro");
            // Recupera el panel anterior del historial y muéstralo
            String previousPanel = panelHistory.popPanel();
            PanelesManager.habilitarPanel("panelInicioSesion");
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelInicioSesion");
            System.out.println("Llega hasta donde se invoca panelInicioSesion");
            JPContenido.revalidate();
            JPContenido.repaint();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo crear tu usuario", "Error J000DA", JOptionPane.ERROR_MESSAGE);
            PanelesManager.deshabilitarPanel("panelRegistro");
            // Recupera el panel anterior del historial y muéstralo
            String previousPanel = panelHistory.popPanel();
            PanelesManager.habilitarPanel("panelInicioSesion");
            
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelInicioSesion");
            System.out.println("Llega hasta donde se invoca panelInicioSesion");
            JPContenido.revalidate();
            JPContenido.repaint();

        }
    }

}
