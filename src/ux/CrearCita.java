/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP043_1_S3_RH;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class CrearCita implements ActionListener{
    private JPanel JPContenido;
    private JP043_1_S3_RH vista43;
    private HabilitarPaneles PanelesManager;
    private Inicializador init;

    
    public CrearCita(JPanel JPContenido, JP043_1_S3_RH vista43, HabilitarPaneles PanelesManager, Inicializador init)
    {
        this.JPContenido = JPContenido;
        this.init = init;
        this.vista43 = vista43;
        this.PanelesManager = PanelesManager;
        this.vista43.getBtn1_JF043_S3_RH().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista43.getBtn1_JF043_S3_RH())
        {
            init.mostrarOcultarPanel("panelMenuSec"); 
            //Botón de volver a un panel anterior
        }
    }
    
}
