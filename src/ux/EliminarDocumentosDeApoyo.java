/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP029_S3_RH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class EliminarDocumentosDeApoyo implements ActionListener{
    private JPanel JPContenido;
    private JP029_S3_RH vista29;
    
    public EliminarDocumentosDeApoyo(JPanel JPContenido, JP029_S3_RH vista29)
    {
        this.JPContenido = JPContenido;
        this.vista29 = vista29;
        
        this.vista29.getBtn1_JF029_S3_RH().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista29.getBtn1_JF029_S3_RH())
        {
            //Botón para volver a un panel anterior
        }
    }
    
}
