/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP015_1_S2_RH;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class NuevaSolicitudDeEmpleado implements ActionListener{
    private JPanel JPContenido;
    private JP015_1_S2_RH vista15;
     private HabilitarPaneles PanelesManager;
    
    public NuevaSolicitudDeEmpleado(JPanel JPContenido, JP015_1_S2_RH vista15, HabilitarPaneles PanelesManager)
    {
        this.JPContenido = JPContenido;
        this.vista15 = vista15;
     this.PanelesManager = PanelesManager;   
        this.vista15.getBtn1_JF015_S2_RH().addActionListener(this);
        this.vista15.getBtn2_JF015_S2_RH().addActionListener(this);
        this.vista15.getBtn3_JF015_S2_RH().addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista15.getBtn1_JF015_S2_RH())
        {
            //Botón para ver ventana de mensajes panelVerMensaje
            PanelesManager.copiaPanel("JP015_1_S2_RH");
            //Lo que esta entre comillas es el JPXX de tu vista actual (la del controlador que estas editando)
            JPContenido.remove(vista15);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelSolicitudesDeEmpleados");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
            //Botón para volver al panel anterior
        }
        else if(e.getSource() == vista15.getBtn2_JF015_S2_RH())
        {
            
            //Aceptar solicitud de permiso de empleado
        }
        else if(e.getSource() == vista15.getBtn2_JF015_S2_RH())
        {
            //Rechazar solicitud de permiso de empledao
        }
    }
    
}
