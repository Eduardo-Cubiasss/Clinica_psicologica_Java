/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Reportes.ParaReporte;
import Ui.JP008_S2_AF;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class PersonalClinica implements ActionListener{
    private JPanel JPContenido;
    private JP008_S2_AF vista08;
    private HabilitarPaneles PanelesManager;
    private ParaReporte reporte;
    
    public PersonalClinica(JPanel JPContenido, JP008_S2_AF vista08, HabilitarPaneles PanelesManager, ParaReporte reporte)
    {
        this.JPContenido = JPContenido;
        this.vista08 = vista08;
        this.PanelesManager = PanelesManager;
        this.vista08.Btn006_JF008_S3_AF.addActionListener(this);
        this.vista08.Btn004_JF008_S3_AF.addActionListener(this);
        this.vista08.Btn005_JF008_S3_AF.addActionListener(this);
        this.vista08.Btn001_JF008_S3_AF.addActionListener(this);
        this.vista08.Btn007_JF008_S3_AF.addActionListener(this);
        this.reporte = reporte;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista08.getBtn004_JF008_S3_AF())
        {
            reporte.mostrarReporteSecretaria();
        }
        else if(e.getSource() == vista08.getBtn006_JF008_S3_AF())
        {
            reporte.mostrarReporteTerapeuta();
        }
        
        else if(e.getSource() == vista08.getBtn005_JF008_S3_AF())
        {
                 //Para el buscador de empleados
                PanelesManager.copiaPanel("JP008_S2_AF");
                JPContenido.remove(vista08);
                ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelBuscadorDeEmpleados");
                JPContenido.revalidate();
                JPContenido.repaint();
                PanelesManager.restaurarPanelEliminado();
        }
        
        else if(e.getSource() == vista08.getBtn001_JF008_S3_AF())
        {
                 //Para regresar al anterior
                PanelesManager.copiaPanel("JP008_S2_AF");
                JPContenido.remove(vista08);
                ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelMenuAdmin");
                JPContenido.revalidate();
                JPContenido.repaint();
                PanelesManager.restaurarPanelEliminado();
        }
        
        else if(e.getSource() == vista08.getBtn007_JF008_S3_AF())
        {
                 //Para regresar al anterior
                PanelesManager.copiaPanel("JP008_S2_AF");
                JPContenido.remove(vista08);
                ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelAgregarPerfilesDeUsuario");
                JPContenido.revalidate();
                JPContenido.repaint();
                PanelesManager.restaurarPanelEliminado();
        }
        
        else if(e.getSource() == vista08.getBtn007_JF008_S3_AF())
        {
                 //Para regresar al anterior
                PanelesManager.copiaPanel("JP008_S2_AF");
                JPContenido.remove(vista08);
                ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelBuscadorDeEmpleados");
                JPContenido.revalidate();
                JPContenido.repaint();
                PanelesManager.restaurarPanelEliminado();
        }
        
    }
    
}
