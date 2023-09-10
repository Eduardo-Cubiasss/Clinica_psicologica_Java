/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP014_S2_AF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class SolicitudesDeEmpleados implements ActionListener{
    private JPanel JPContenido;
    private JP014_S2_AF vista14;
    
    public SolicitudesDeEmpleados(JPanel JPContenido, JP014_S2_AF vista14)
    {
        this.JPContenido = JPContenido;
        this.vista14 = vista14;
        
        this.vista14.getBtn1_JF014_S2().addActionListener(this);
        this.vista14.getBtn2_JF014_S2().addActionListener(this);
        this.vista14.getBtn3_JF014_S2().addActionListener(this);
        this.vista14.getBtn4_JF014_S2().addActionListener(this);
        this.vista14.getBtn5_JF014_S2().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()== vista14.getBtn1_JF014_S2())
       {
           //Para ver los mensajes recibidos 
       }
       else if(e.getSource()== vista14.getBtn2_JF014_S2())
       {
           //Para ver los mensajes aprovados
       }
       else if(e.getSource()== vista14.getBtn3_JF014_S2())
       {
           //Para ver los mensajes eliminados
       }
       else if(e.getSource()== vista14.getBtn4_JF014_S2())
       {
           //Para ver el mensaje seleccionado en la Jtable
       }
       else if(e.getSource()== vista14.getBtn5_JF014_S2())
       {
           //Volver al panel anterior
       }
    }
    
}
