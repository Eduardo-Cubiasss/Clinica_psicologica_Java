/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP032_S3_AF;
import java.awt.CardLayout;
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
     private HabilitarPaneles PanelesManager;
    
    
    public RedactarMensaje(JPanel JPContenido, JP032_S3_AF vista32,  HabilitarPaneles PanelesManager)
    {
        this.JPContenido = JPContenido;
        this.vista32 = vista32;
      this.PanelesManager = PanelesManager;  
        this.vista32.getBtn1_JF028_S3_AF().addActionListener(this);
        this.vista32.getjButton1().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista32.getBtn1_JF028_S3_AF())
        {
            
            PanelesManager.copiaPanel("JP032_S3_AF");
            //Lo que esta entre comillas es el JPXX de tu vista actual (la del controlador que estas editando)
            JPContenido.remove(vista32);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelSolicitudesDeEmpleados");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
            //Volver un panel anterior
        }
        else if(e.getSource()== vista32.getjButton1())
        {
            //Enviar mensaje
        }
    }
    
}
