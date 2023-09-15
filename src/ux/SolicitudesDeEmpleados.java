/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP014_S2_AF;
import java.awt.CardLayout;
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
        private HabilitarPaneles PanelesManager;

    
    
    
    public SolicitudesDeEmpleados(JPanel JPContenido, JP014_S2_AF vista14,  HabilitarPaneles PanelesManager)
    {
        this.JPContenido = JPContenido;
        this.vista14 = vista14;
        this.PanelesManager = PanelesManager;
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
           //Botón para ver ventana de mensajes panelVerMensaje
            PanelesManager.copiaPanel("JP014_S2_AF");
            //Lo que esta entre comillas es el JPXX de tu vista actual (la del controlador que estas editando)
            JPContenido.remove(vista14);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelSolicitudesAprobadas2");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
           //Para ver los mensajes aprobados
       }
       else if(e.getSource()== vista14.getBtn3_JF014_S2())
       {
           PanelesManager.copiaPanel("JP014_S2_AF");
            //Lo que esta entre comillas es el JPXX de tu vista actual (la del controlador que estas editando)
            JPContenido.remove(vista14);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelSolicitudAprobada");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
           
           //Para ver los mensajes eliminados
       }
       else if(e.getSource()== vista14.getBtn4_JF014_S2())
       {
           //Botón para ver ventana de mensajes panelVerMensaje
            PanelesManager.copiaPanel("JP014_S2_AF");
            //Lo que esta entre comillas es el JPXX de tu vista actual (la del controlador que estas editando)
            JPContenido.remove(vista14);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelNuevaSolicitudDeEmpleado");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
           //Para ver el mensaje seleccionado en la Jtable
       }
       
       else if(e.getSource()== vista14.getBtnRedactarMensaje())
       {
           //Botón para ver ventana de mensajes panelVerMensaje
            PanelesManager.copiaPanel("JP014_S2_AF");
            //Lo que esta entre comillas es el JPXX de tu vista actual (la del controlador que estas editando)
            JPContenido.remove(vista14);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelRedactarMensaje");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
           //Para redactar mensaje
       }
       
       else if(e.getSource()== vista14.getBtn5_JF014_S2())
       {
           PanelesManager.copiaPanel("JP014_S2_AF");
            JPContenido.remove(vista14);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelMenuSec");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
           //Volver al panel anterior
       }
    }
    
}
