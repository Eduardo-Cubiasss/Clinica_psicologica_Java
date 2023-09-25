/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Reportes.ParaReporte;
import Ui.JP022_S3_AF;
import java.awt.CardLayout;
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
     private HabilitarPaneles PanelesManager;  
      private ParaReporte reporte;
    public Estadisticas(JPanel JPContenido, JP022_S3_AF vista22, HabilitarPaneles PanelesManager, ParaReporte reporte)
    {
        this.JPContenido = JPContenido;
        this.vista22 = vista22;
        this.PanelesManager = PanelesManager;    
        this.vista22.getBtn001_JF22_S3_AF().addActionListener(this);
        this.vista22.getBtn1().addActionListener(this);
        this.vista22.getBtn2().addActionListener(this);
        this.reporte = reporte;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista22.getBtn001_JF22_S3_AF())
        {
            PanelesManager.copiaPanel("JP022_S3_AF");
                JPContenido.remove(vista22);
                ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelMenuAdmin");
                JPContenido.revalidate();
                JPContenido.repaint();
                PanelesManager.restaurarPanelEliminado();
            //Botón para volver un panel anterior (Al)
        }
        else if(e.getSource() == vista22.getBtn1())
        {
        reporte.mostrarReporteCantArticulo();
        }
        else if(e.getSource() == vista22.getBtn2())
        {
        reporte.mostrarReporteContPermisos();
        }
    }
    
}
