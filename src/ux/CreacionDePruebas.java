/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP033_S3_RH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class CreacionDePruebas implements ActionListener{
    private JPanel JPContenido;
    private JP033_S3_RH vista33;
    
    public CreacionDePruebas(JPanel JPContenido, JP033_S3_RH vista33)
    {
        this.JPContenido = JPContenido;
        this.vista33 = vista33;
        
        this.vista33.getBtn001_JF033_S3_RH().addActionListener(this);
        this.vista33.getBtn002_JF033_S3_RH().addActionListener(this);
        this.vista33.getBtn003_JF033_S3_RH().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista33.Btn001_JF033_S3_RH)
        {
            //Volver a un panel anterior (menú)
        }
        else if(e.getSource()== vista33.Btn002_JF033_S3_RH)
        {
            //Agregar prueba
        }
        else if(e.getSource()== vista33.Btn003_JF033_S3_RH)
        {
            //Eliminar prueba
        }
    }
    
}
