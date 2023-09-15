/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP034_S3_AF;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class EscribirEnTuAgendaPersonal implements ActionListener{
    private JPanel JPContenido;
    private JP034_S3_AF vista34;
    private HabilitarPaneles PanelesManager;
   
    public EscribirEnTuAgendaPersonal(JPanel JPContenido, JP034_S3_AF vista34, HabilitarPaneles PanelesManager)
    {
        this.JPContenido = JPContenido;
        this.vista34 = vista34;
        this.PanelesManager = PanelesManager;    
        this.vista34.getBtn1_JF034_AF().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista34.getBtn1_JF034_AF())
        {
            PanelesManager.copiaPanel("JP034_S3_AF");
                JPContenido.remove(vista34);
                ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelExpedienteDelPaciente");
                JPContenido.revalidate();
                JPContenido.repaint();
                PanelesManager.restaurarPanelEliminado();
            //Botón para volver a un panel anterior
        }
    }
    
}
