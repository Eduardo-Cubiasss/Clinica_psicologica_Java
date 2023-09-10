/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP035_1_S3_RH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class VisualizarNotas implements ActionListener{
    private JPanel JPContenido;
    private JP035_1_S3_RH vista35;
    
    public VisualizarNotas(JPanel JPContenido, JP035_1_S3_RH vista35)
    {
        this.JPContenido = JPContenido;
        this.vista35 = vista35;
        
        this.vista35.getBtn1_JF035_S3_RH().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista35.getBtn1_JF035_S3_RH())
        {
            //Botón para volver un panel anterior
        }
    }
    
}

