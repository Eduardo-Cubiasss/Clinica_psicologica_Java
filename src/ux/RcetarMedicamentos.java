/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Database.Procesos_almacenados;
import Database.RecetasMedicas;
import Reportes.ParaReporte;
import Ui.JP036_S3_AF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class RcetarMedicamentos implements ActionListener{
    private JPanel JPContenido;
    private JP036_S3_AF vista36;
    private ParaReporte reporte;
    private RecetasMedicas modelRecetas;
    private Procesos_almacenados proceso;
    private Inicializador init;
    
    public RcetarMedicamentos(JPanel JPContenido, JP036_S3_AF vista36, ParaReporte reporte, RecetasMedicas modelRecetas, Procesos_almacenados proceso, 
            Inicializador init)
    {
        this.JPContenido = JPContenido;
        this.modelRecetas = modelRecetas;
        this.reporte = reporte;
        this.vista36 = vista36;
        this.proceso = proceso;
        this.init = init;
        this.vista36.btn1_JF036.addActionListener(this);
        this.vista36.btnagregar.addActionListener(this);
        this.vista36.getBtn3_JF012_A().addActionListener(this);
                
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista36.getBtnagregar())
        {
           this.modelRecetas.setNombrePadecimiento(vista36.getTxtNombreMedicamento_JP036_S3_AF().getText());
           this.modelRecetas.setMwedicamentos(vista36.getTxtIndicaciones_JP036_S3_AF().getText());
           this.modelRecetas.setDescripcion(vista36.getTxtHorario_JP036_S3_AF().getText());
            proceso.agregarecetas(modelRecetas);
        }
        else if (e.getSource() == vista36.getBtn1_JF036())
        {
            this.reporte.mostrarReporteReceta(vista36.getTxtBuscar_JP036());
        }
        else if (e.getSource() == vista36.getBtn3_JF012_A())
        {
            init.mostrarOcultarPanel("panelExpedienteDelPaciente");
        }
    }
    
}
