/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP017_1_S2_RH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class VerSolicitudAprobada implements ActionListener{
    private JPanel JPContenido;
    private JP017_1_S2_RH vista17;
    
    public VerSolicitudAprobada(JPanel JPContenido, JP017_1_S2_RH vista17)
    {
        this.JPContenido = JPContenido;
        this.vista17 = vista17;
        
        this.vista17.getBtn1_JF017_S2_RH().addActionListener(this);
        this.vista17.getBtn2_JF017_S2_RH().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista17.getBtn1_JF017_S2_RH())
        {
            //Botón para volver a un panel anterior
        }
        else if(e.getSource() == vista17.getBtn2_JF017_S2_RH())
        {
            //Botón para aceptar solicitud
        }
    }
    
}
