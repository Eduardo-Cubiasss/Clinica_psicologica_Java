/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP018_S2_AF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class SolicitudesAprobadas2 implements ActionListener{
    private JPanel JPContenido;
    private JP018_S2_AF vista18;
    
    public SolicitudesAprobadas2(JPanel JPContenido, JP018_S2_AF vista18)
    {
        this.JPContenido = JPContenido;
        this.vista18 = vista18;
    
        this.vista18.getBtn1_JF018_S2().addActionListener(this);
        this.vista18.getBtn2_JF018_S2().addActionListener(this);
        this.vista18.getBtn3_JF018_S2().addActionListener(this);
        this.vista18.getBtn4_JF018_S2().addActionListener(this);
        this.vista18.getBtn5_JF018_S2().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista18.getBtn1_JF018_S2())
        {
            //Botón para ver los recibidos
        }
        else if(e.getSource()== vista18.getBtn2_JF018_S2())
        {
            //Botón para ver las solicitudes aprobadas
        }
        else if(e.getSource()== vista18.getBtn3_JF018_S2())
        {
            //Botón para ver las solicitudes eliminadas
        }
        else if(e.getSource()== vista18.getBtn4_JF018_S2())
        {
            //Botón para abrir solicitud
        }
        else if(e.getSource()== vista18.getBtn5_JF018_S2())
        {
            //Botón para volver un panel atrás
        }
    }
    
}
