/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP016_S2_AF;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class SolicitudesAprobadas implements ActionListener{
    private JPanel JPContenido;
    private JP016_S2_AF vista16;
    private HabilitarPaneles PanelesManager;
    
    
    
    public SolicitudesAprobadas(JPanel JPContenido, JP016_S2_AF vista16, HabilitarPaneles PanelesManager)
    {
        this.JPContenido = JPContenido;
        this.vista16 = vista16;
        this.PanelesManager = PanelesManager;
        this.vista16.getBtn1_JF016_S2().addActionListener(this);
        this.vista16.getBtn2_JF016_S2().addActionListener(this);
        this.vista16.getBtn3_JF016_S2().addActionListener(this);
        this.vista16.getBtn4_JF016_S2().addActionListener(this);
        this.vista16.getBtn5_JF016_S2().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista16.getBtn1_JF016_S2())
        {
            PanelesManager.copiaPanel("JP018_S2_AF");
            //Lo que esta entre comillas es el JPXX de tu vista actual (la del controlador que estas editando)
            JPContenido.remove(vista16);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelSolicitudesDeEmpleados");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
            //Botón para ver solicitudes recibidas
        }
        else if(e.getSource() == vista16.getBtn2_JF016_S2())
        {
            PanelesManager.copiaPanel("JP018_S2_AF");
            //Lo que esta entre comillas es el JPXX de tu vista actual (la del controlador que estas editando)
            JPContenido.remove(vista16);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelSolicitudesAprobadas2");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
            //Botón para ver solicitudes aprobadas
        }
        
        else if(e.getSource() == vista16.getBtn4_JF016_S2())
        {
            PanelesManager.copiaPanel("JP018_S2_AF");
            //Lo que esta entre comillas es el JPXX de tu vista actual (la del controlador que estas editando)
            JPContenido.remove(vista16);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelSolicitudesRechazadas");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
            //Botón para abrir un mensaje seleccionado
        }
        else if(e.getSource() == vista16.getBtn5_JF016_S2())
        {
            PanelesManager.copiaPanel("JP018_S2_AF");
            //Lo que esta entre comillas es el JPXX de tu vista actual (la del controlador que estas editando)
            JPContenido.remove(vista16);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelSolicitudesDeEmpleados");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
            //Volver un panel Atrás
        }
         
    }
    
}
