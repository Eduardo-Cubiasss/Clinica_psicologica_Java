/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Database.Empleado;
import Ui.JP010_S2_AF;
import java.awt.CardLayout;
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
    private HabilitarPaneles PanelesManager;
    private Empleado modelEmpleado;

    
    public DetallesDePerfil(JPanel JPContenido, JP010_S2_AF vista10, HabilitarPaneles PanelesManager, Empleado modelEmpleado)
    {
        this.JPContenido = JPContenido;
        this.vista10 = vista10;
        this.PanelesManager = PanelesManager;
        this.modelEmpleado = modelEmpleado;
        this.vista10.getBtn1_JF010_AF().addActionListener(this);
        this.vista10.setTxtNombre(modelEmpleado.getNombre());
        this.vista10.setTxtEdad(String.valueOf(modelEmpleado.getEdad()));
        this.vista10.setTxtOficio(modelEmpleado.getActividadLab());
        this.vista10.setTxtDias(modelEmpleado.getDUI());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista10.getBtn1_JF010_AF())
            
        {
            PanelesManager.copiaPanel("JP010_S2_AF");
                JPContenido.remove(vista10);
                ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelBuscadorDeEmpleados");
                JPContenido.revalidate();
                JPContenido.repaint();
                PanelesManager.restaurarPanelEliminado();
            //Esto es para volver al menú de administradooor
        }
    }
    
}
