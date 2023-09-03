/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP023_S3_RH;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author 50369
 */
public class Menu_Terapeuta implements ActionListener{
    private JPanel JPContenido;
    private JP023_S3_RH panel;
    private HabilitarPaneles PanelesManager;
    
    public Menu_Terapeuta(JPanel JPContenido, JP023_S3_RH panel, HabilitarPaneles PanelesManager)
    {
        this.panel = panel;
        this.JPContenido = JPContenido;
        this.PanelesManager = PanelesManager;
        
        this.panel.btn02_JF023_S3_RH.addActionListener(this);
        this.panel.btn03_JF023_S3_RH.addActionListener(this);
        this.panel.btn04_JF023_S3_RH.addActionListener(this);
        this.panel.btn05_JF023_S3_RH.addActionListener(this);
        this.panel.btn06_JF023_S3_RH.addActionListener(this);
        this.panel.btn07_JF023_S3_RH.addActionListener(this);
        this.panel.btn08_JF023_S3_RH.addActionListener(this);
        this.panel.btn09_JF023_S3_RH.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.btn02_JF023_S3_RH) {
            // Código para la acción del botón de ver calendario
        } else if (e.getSource() == panel.btn03_JF023_S3_RH) {
            // Código para la acción del botón de ver pacientes
            PanelesManager.copiaPanel("JP023_S3_RH");
            JPContenido.remove(panel);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelBuscadorPacientes");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
        } else if (e.getSource() == panel.btn04_JF023_S3_RH) {
            // Código para la acción del botón de ver documentos de apoyo
            PanelesManager.copiaPanel("JP023_S3_RH");
            JPContenido.remove(panel);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelDocumentosView");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
        } else if (e.getSource() == panel.btn05_JF023_S3_RH) {
            // Código para la acción del botón de mi perfil
        } else if (e.getSource() == panel.btn06_JF023_S3_RH) {
            // Código para la acción del botón Solicitud de incapacidades
        } else if (e.getSource() == panel.btn07_JF023_S3_RH) {
            // Código para la acción del botón Crear Pruebas
        } else if (e.getSource() == panel.btn08_JF023_S3_RH) {
            // Código para la acción del botón cerrar sesion
        } else if (e.getSource() == panel.btn09_JF023_S3_RH) {
            // Código para la acción del botón generar PDF
        }
    }
}
