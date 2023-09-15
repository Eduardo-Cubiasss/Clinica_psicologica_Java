/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP027_S3_RH;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class DocumentosDeApoyo implements ActionListener{
    private JPanel JPContenido;
    private HabilitarPaneles PanelesManager;
    private JP027_S3_RH panel;
    
    public DocumentosDeApoyo(JPanel JPContenido, HabilitarPaneles PanelesManager, JP027_S3_RH panel)
    {
        this.JPContenido = JPContenido;
        this.PanelesManager = PanelesManager;
        this.panel = panel;
        
        this.panel.Btn001_JF027_S3_RH.addActionListener(this);
        this.panel.Btn02_JF027_S3_RH.addActionListener(this);
        this.panel.Btn03_JF027_S3_RH.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== panel.getBtn001_JF027_S3_RH())
        {
            PanelesManager.copiaPanel("JP027_S3_RH");
            JPContenido.remove(panel);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelMenuTp");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
            //Botón para volver un panel anterior (menú)
        }
        else if(e.getSource()== panel.getBtn02_JF027_S3_RH())
        {
            PanelesManager.copiaPanel("JP027_S3_RH");
            JPContenido.remove(panel);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelAgregarArticulo");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
            
            //Botón Agregar documento de apoyo
        }
        else if(e.getSource()== panel.getBtn03_JF027_S3_RH())
        {
            PanelesManager.copiaPanel("JP027_S3_RH");
            JPContenido.remove(panel);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelEliminarDocumentosDeApoyo");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
            //Botón eliminar documento de 
        }
        
    }
    
}
