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
import Ui.JF_000_S7_GU;
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
    private JF_000_S7_GU vista;

    public RegAdmin_JF002(Administrador modelAdmin, Usuarios modelUsers, Clinica modelClinica, JP002_S1_RHP vistaJP002,
            JPanel JPContenido, Procesos_almacenados Procesos, PanelHistory panelHistory, HabilitarPaneles PanelesManager, JF_000_S7_GU vista) {
        this.modelAdmin = modelAdmin;
        this.modelUsers = modelUsers;
        this.modelClinica = modelClinica;
        this.vistaJP002 = vistaJP002;
        this.JPContenido = JPContenido;
        this.Procesos = Procesos;
        this.panelHistory = panelHistory;
        this.PanelesManager = PanelesManager;
        this.vista = vista;

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
            
            PanelesManager.copiaPanel("JP002_S1_RHP");
            JPContenido.remove(vistaJP002);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelMenuAdmin");
            System.out.println("Llega hasata aqui, abre panelMenuAdmin");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado(vista);

        } else if (e.getSource() == vistaJP002.getBtn2_JF002_S1_RH()) {
            PanelesManager.copiaPanel("JP002_S1_RHP");
            System.out.println("Hace una copia del paneles de registrar administrador");
            JPContenido.remove(vistaJP002);
            System.out.println("Elimina registrar admin");
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelInicioSesion");
            System.out.println("Abre inicio de sesion");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado(vista);
            System.out.println("Se restauran componentes y panel de registrar admin");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo crear tu usuario", "Error J000DA", JOptionPane.ERROR_MESSAGE);
            PanelesManager.copiaPanel("panelRegistro");
            JPContenido.remove(vistaJP002);
            
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelInicioSesion");
            System.out.println("Llega hasta donde se invoca panelInicioSesion");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado(vista);

        }
    }

}
