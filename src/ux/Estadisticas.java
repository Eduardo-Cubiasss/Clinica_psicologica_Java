/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP022_S3_AF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class Estadisticas implements ActionListener{
    private JPanel JPContenido;
    private JP022_S3_AF vista22;
    
    public Estadisticas(JPanel JPContenido, JP022_S3_AF vista22)
    {
        this.JPContenido = JPContenido;
        this.vista22 = vista22;
        
        this.vista22.getBtn001_JF22_S3_AF().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista22.getBtn001_JF22_S3_AF())
        {
            //Botón para volver un panel anterior (Al)
        }
    }
    
}
