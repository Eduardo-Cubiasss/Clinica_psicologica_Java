/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP018_S2_AF;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class SolicitudesAprobadas2 implements ActionListener{
    private JPanel JPContenido;
    private JP018_S2_AF vista18;
     private HabilitarPaneles PanelesManager;
     private Inicializador init;
     
    public SolicitudesAprobadas2(JPanel JPContenido, JP018_S2_AF vista18, HabilitarPaneles PanelesManager, Inicializador init)
    {
        this.JPContenido = JPContenido;
        this.vista18 = vista18;
        this.init = init;
    this.PanelesManager = PanelesManager;
        this.vista18.getBtn4_JF018_S2().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()== vista18.getBtn4_JF018_S2())
        {
            init.mostrarOcultarPanel("panelSolicitudAprobadaMensaje");
            
            //Botón para abrir solicitud
        }
       
    }
    
}
