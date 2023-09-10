/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP034_S3_AF;
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
    
    public EscribirEnTuAgendaPersonal(JPanel JPContenido, JP034_S3_AF vista34)
    {
        this.JPContenido = JPContenido;
        this.vista34 = vista34;
        
        this.vista34.getBtn1_JF034_AF().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista34.getBtn1_JF034_AF())
        {
            //Botón para volver a un panel anterior
        }
    }
    
}
