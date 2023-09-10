/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP030_S3_AF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class ActualizarArticulo implements ActionListener{
     private JPanel JPContenido;
     private JP030_S3_AF vista30;
    
    public ActualizarArticulo(JPanel JPContenido, JP030_S3_AF vista30)
    {
        this.JPContenido = JPContenido;
        this.vista30 = vista30;
        
        this.vista30.getBtn1_JF028_S3_AF().addActionListener(this);
        this.vista30.getBtn2_JF028_S3_AF().addActionListener(this);
        this.vista30.getBtn3_JF028_S3_AF().addActionListener(this);
        this.vista30.getBtn4_JF028_S3_AF().addActionListener(this);
        this.vista30.getBtn5_JF028_S3_AF().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista30.getBtn1_JF028_S3_AF())
        {
            //Botón para volver a un panel anterior
        }
        else if(e.getSource()== vista30.getBtn2_JF028_S3_AF())
        {
            //Botón para actualizar el contenido del articulo
        }
        else if(e.getSource()== vista30.getBtn3_JF028_S3_AF())
        {
            //Botón para editar el titulo del ariticulo
        }
        else if(e.getSource()== vista30.getBtn4_JF028_S3_AF())
        {
            //Botón para guardar los cambios
        }
        else if(e.getSource()== vista30.getBtn5_JF028_S3_AF())
        {
            //Botón para actualizar la imagen del articulo
        }
    }
    
}
