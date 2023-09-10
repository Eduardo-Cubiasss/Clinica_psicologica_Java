/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP039_S3_RH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author 50369
 */
public class Menu_Secretaria implements ActionListener{
    private JPanel JPContenido;
    private JP039_S3_RH vista39;
    
    public Menu_Secretaria(JPanel JPContenido, JP039_S3_RH vista39)
    {
        this.JPContenido = JPContenido;
        this.vista39 = vista39;
        
        this.vista39.getBtn02_JF039_S3_RH().addActionListener(this);
        this.vista39.getBtn03_JF023_S3_RH().addActionListener(this);
        this.vista39.getBtn04_JF039_S3_RH().addActionListener(this);
        this.vista39.getBtn05_JF039_S3_RH().addActionListener(this);
        this.vista39.getBtn06_JF039_S3_RH().addActionListener(this);
        this.vista39.getBtn08_JF039_S3_RH().addActionListener(this);
        this.vista39.getBtn09_JF039_S3_RH().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista39.getBtn02_JF039_S3_RH())
        {
            //Botón para ver ventana de mensajes
        }
        else if (e.getSource()==vista39.getBtn03_JF023_S3_RH())
        {
            //Botón de pruebas
        }
        else if(e.getSource()==vista39.getBtn04_JF039_S3_RH())
        {
            //Botón de calendario
        }
        else if(e.getSource()==vista39.getBtn05_JF039_S3_RH())
        {
            //Botón de mi perfil
        }
        else if(e.getSource()==vista39.getBtn06_JF039_S3_RH())
        {
            //Botón de solicitud de incapacidades
        }
        else if(e.getSource()==vista39.getBtn08_JF039_S3_RH())
        {
            //Botón de Cerrar Sesión, lleva lleva al login dah
        }
        else if(e.getSource()==vista39.getBtn09_JF039_S3_RH())
        {
            //Botón para generar pdf de ayuda
        }
    }
}
