/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP004_S2_AF;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author 50369
 */
public class Menu_Administrador implements ActionListener {

    private JPanel JPContenido;
    private JP004_S2_AF panel;
    private PanelHistory panelHistory;
    private HabilitarPaneles PanelesManager;

    public Menu_Administrador(JPanel JPContenido, JP004_S2_AF panel, HabilitarPaneles PanelesManager) {
        this.JPContenido = JPContenido;
        this.panel = panel;
        this.PanelesManager = PanelesManager;

        this.panel.btn01_JF005_S2_AF.addActionListener(this);
        this.panel.btn02_JF005_S2_AF.addActionListener(this);
        this.panel.btn03_JF005_S2_AF.addActionListener(this);
        this.panel.btn04_JF005_S2_AF.addActionListener(this);
        this.panel.btn05_JF005_S2_AF.addActionListener(this);
        this.panel.btn08_JF023_S3_RH.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.getBtn01_JF005_S2_AF()) {
            // Código para la acción del botón de gestionar persionas 

            PanelesManager.copiaPanel("JP004_S2_AF");
            JPContenido.remove(panel);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelPersonalClinica");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
        } else if (e.getSource() == panel.getBtn02_JF005_S2_AF()) {
            // Código para la acción del botón estadisticas 
        } else if (e.getSource() == panel.getBtn03_JF005_S2_AF()) {
            // Código para la acción del botón Anuncios 
        } else if (e.getSource() == panel.getBtn04_JF005_S2_AF()) {
            // Código para la acción del botón Acerca de la clinica 
            PanelesManager.copiaPanel("JP004_S2_AF");
            JPContenido.remove(panel);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelPersonalClinica");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
        } else if (e.getSource() == panel.getBtn05_JF005_S2_AF()) {
            // Código para la acción del botón comentarios 
        } else if (e.getSource() == panel.getBtn08_JF023_S3_RH()) {
            // Código para la acción del botón cerrar sesion

            // Recupera el panel anterior del historial y muéstralo
            String previousPanel = panelHistory.popPanel();
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, previousPanel);
            JPContenido.revalidate();
            JPContenido.repaint();
        }
    }
}
