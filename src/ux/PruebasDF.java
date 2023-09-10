/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP045_S3_RH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class PruebasDF implements ActionListener{
    private JPanel JPContenido;
    private JP045_S3_RH vista45;
    
    public PruebasDF(JPanel JPContenido, JP045_S3_RH vista45)
    {
        this.JPContenido = JPContenido;
        this.vista45 = vista45;
        
        this.vista45.getBtn01_JF045_S3_RH().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista45.getBtn01_JF045_S3_RH())
        {
            //Botón de volver a un panel anterior
        }
    }
    
}
