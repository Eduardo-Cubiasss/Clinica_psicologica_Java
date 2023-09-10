/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP028_S3_AF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class AgregarArticulo implements ActionListener{
    private JPanel JPContenido;
    private JP028_S3_AF vista28;
    
    public AgregarArticulo(JPanel JPContenido, JP028_S3_AF vista28)
    {
        this.JPContenido = JPContenido;
        this.vista28 = vista28;
        
        this.vista28.getBtn1_JF028_S3_AF().addActionListener(this);
        this.vista28.getBtn2_JF028_S3_AF().addActionListener(this);
        this.vista28.getBtn3_JF028_S3_AF().addActionListener(this);
        this.vista28.getBtn4_JF028_S3_AF().addActionListener(this);
        this.vista28.getBtn5_JF028_S3_AF().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource()== vista28.getBtn1_JF028_S3_AF())
     {
         //Botón para volver a un panel anterior
     }
     else if(e.getSource()== vista28.getBtn2_JF028_S3_AF())
     {
         //Botón para editar el texto del documento
     }
     else if(e.getSource()== vista28.getBtn3_JF028_S3_AF())
     {
         //Botón para editar el nombre del articulo
     }
     else if(e.getSource()== vista28.getBtn4_JF028_S3_AF())
     {
         //Botón para guardar todos los cambios
     }
     else if(e.getSource()== vista28.getBtn5_JF028_S3_AF())
     {
         //Botón para editar la imagen del articulo
     }
     
    }
    
}
