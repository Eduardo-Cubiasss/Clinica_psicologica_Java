/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP019_1_S2_RH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class VerSolicitudRechazada implements ActionListener{
    private JPanel JPContenido;
    private JP019_1_S2_RH vista19;
    
    public VerSolicitudRechazada(JPanel JPContenido, JP019_1_S2_RH vista19)
    {
        this.JPContenido = JPContenido;
        this.vista19 = vista19;
        
        this.vista19.getBtn1_JF019_S2_RH().addActionListener(this);
        this.vista19.getBtn2_JF019_S2_RH().addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista19.getBtn1_JF019_S2_RH())
        {
            //Botón para volver a un panel anterior
        }
        else if(e.getSource()== vista19.getBtn2_JF019_S2_RH())
        {
            //Botón para aceptar solicutud
        }
        
    }
    
}
