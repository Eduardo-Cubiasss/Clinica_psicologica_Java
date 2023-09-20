/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Database.Articulos;
import Database.Procesos_almacenados;
import Database.Terapeutas;
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
     private Articulos modelArticulo;
    private Procesos_almacenados procesos;
    private Terapeutas modelTer;
    
    public ActualizarArticulo(JPanel JPContenido, JP030_S3_AF vista30, Articulos modelArticulo, Procesos_almacenados procesos, Terapeutas modelTer)
    {
        this.JPContenido = JPContenido;
        this.procesos = procesos;
        this.modelTer = modelTer;
        this.modelArticulo = modelArticulo;
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
            //Botón para actualizar el contenido del articulo}
            modelArticulo.setTitulo(vista30.getTxtTitulo().getText()); 
            modelArticulo.setDescripcion(vista30.getTxtDescripcion_JP030_S3_AF().getText());
            //modelArticulo.setImagen(vista30.get);
                procesos.AgregarArticulo(modelArticulo, modelTer, 2);
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
