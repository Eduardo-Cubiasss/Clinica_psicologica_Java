/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP027_S3_RH;
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
        
    }
    
}
