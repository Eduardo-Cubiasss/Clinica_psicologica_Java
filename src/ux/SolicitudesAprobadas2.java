/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP018_S2_AF;
import java.awt.CardLayout;
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
     private HabilitarPaneles PanelesManager;
     
    public SolicitudesAprobadas2(JPanel JPContenido, JP018_S2_AF vista18, HabilitarPaneles PanelesManager)
    {
        this.JPContenido = JPContenido;
        this.vista18 = vista18;
    this.PanelesManager = PanelesManager;
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
            PanelesManager.copiaPanel("JP018_S2_AF");
            //Lo que esta entre comillas es el JPXX de tu vista actual (la del controlador que estas editando)
            JPContenido.remove(vista18);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelSolicitudesDeEmpleados");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
             
            //Botón para ver los recibidos
        }
        
        else if(e.getSource()== vista18.getBtn3_JF018_S2())
        {
            
             PanelesManager.copiaPanel("JP018_S2_AF");
            //Lo que esta entre comillas es el JPXX de tu vista actual (la del controlador que estas editando)
            JPContenido.remove(vista18);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelSolicitudAprobada");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
            //Botón para ver las solicitudes eliminadas
        }
        else if(e.getSource()== vista18.getBtn4_JF018_S2())
        {
            PanelesManager.copiaPanel("JP018_S2_AF");
            //Lo que esta entre comillas es el JPXX de tu vista actual (la del controlador que estas editando)
            JPContenido.remove(vista18);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelSolicitudAprobadaMensaje");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
            //Botón para abrir solicitud
        }
        else if(e.getSource()== vista18.getBtn5_JF018_S2())
        {
            PanelesManager.copiaPanel("JP018_S2_AF");
            //Lo que esta entre comillas es el JPXX de tu vista actual (la del controlador que estas editando)
            JPContenido.remove(vista18);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelSolicitudesDeEmpleados");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
            //Botón para volver un panel atrás
        }
    }
    
}
