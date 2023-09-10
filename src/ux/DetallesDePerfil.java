/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP010_S2_AF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class DetallesDePerfil implements ActionListener{
    private JPanel JPContenido;
    private JP010_S2_AF vista10;
    
    public DetallesDePerfil(JPanel JPContenido, JP010_S2_AF vista10)
    {
        this.JPContenido = JPContenido;
        this.vista10 = vista10;
        
        this.vista10.getBtn1_JF010_AF().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista10.getBtn1_JF010_AF())
            //Esto es para volver al menú de administradooor
        {
        }
    }
    
}
