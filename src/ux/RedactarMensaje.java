/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP032_S3_AF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class RedactarMensaje implements ActionListener{
    private JPanel JPContenido;
    private JP032_S3_AF vista32;
    
    public RedactarMensaje(JPanel JPContenido, JP032_S3_AF vista32)
    {
        this.JPContenido = JPContenido;
        this.vista32 = vista32;
        
        this.vista32.getBtn1_JF028_S3_AF().addActionListener(this);
        this.vista32.getjButton1().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista32.getBtn1_JF028_S3_AF())
        {
            //Volver un panel anterior
        }
        else if(e.getSource()== vista32.getjButton1())
        {
            //Enviar mensaje
        }
    }
    
}
