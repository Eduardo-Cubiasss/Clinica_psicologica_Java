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

    public Menu_Administrador(JPanel JPContenido, JP004_S2_AF panel, PanelHistory panelHistory) {
        this.JPContenido = JPContenido;
        this.panel = panel;
        this.panelHistory = panelHistory; 

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
            // Código para la acción del botón Btn01_JF005_S2_AF
        } else if (e.getSource() == panel.getBtn02_JF005_S2_AF()) {
            // Código para la acción del botón Btn02_JF005_S2_AF
        } else if (e.getSource() == panel.getBtn03_JF005_S2_AF()) {
            // Código para la acción del botón Btn03_JF005_S2_AF
        } else if (e.getSource() == panel.getBtn04_JF005_S2_AF()) {
            // Código para la acción del botón Btn04_JF005_S2_AF
        } else if (e.getSource() == panel.getBtn05_JF005_S2_AF()) {
            // Código para la acción del botón Btn05_JF005_S2_AF
        } else if (e.getSource() == panel.getbtn08_JF023_S3_RH()) {
            // Agrega el panel actual al historial antes de cambiar de panel
            panelHistory.pushPanel("panelMenuAdmin");

            JPContenido.remove(panel);
            // Recupera el panel anterior del historial y muéstralo
            String previousPanel = panelHistory.popPanel();
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, previousPanel);
            JPContenido.revalidate();
            JPContenido.repaint();
        }
    }
}
