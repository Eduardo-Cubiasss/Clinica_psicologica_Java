/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Database.Contactos;
import Database.Genero;
import Database.Pacientes;
import Database.Procesos_almacenados;
import Database.Usuarios;
import Ui.JP0048_S3_RH;
import Ui.JP031_S3_RHG;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class ExpedienteDelPaciente implements ActionListener{
    private JPanel JPContenido;
    private Usuarios modelUsers;
    private JP031_S3_RHG vistaJP031;
    private Procesos_almacenados Procesos;
    private HabilitarPaneles PanelesManager;
    private Contactos modelContactos;
    private Pacientes modelPaciente;
   
    
    public ExpedienteDelPaciente(JPanel JPContenido, Pacientes modelPaciente, Usuarios modelUsers, JP031_S3_RHG vistaJP031,
            Procesos_almacenados Procesos, HabilitarPaneles PanelesManager, Contactos modelContactos)
    {
        this.JPContenido = JPContenido;
        this.PanelesManager = PanelesManager;
        this.modelPaciente = modelPaciente;
        this.modelUsers = modelUsers;
        this.vistaJP031 = vistaJP031;
        this.Procesos = Procesos;
        this.modelContactos = modelContactos;
        
        this.vistaJP031.getBtn01_JP031_S3_RH().addActionListener(this);
        this.vistaJP031.getBtn1_JF031_S3_RH().addActionListener(this);
        this.vistaJP031.getBtn2_JF031_S3_RH1().addActionListener(this);
        this.vistaJP031.getBtn3_JF031_S3_RH2().addActionListener(this);
        this.vistaJP031.getBtn4_JF031_S3_RH().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == vistaJP031.getBtn01_JP031_S3_RH())
       {
           modelPaciente.setMensajito(vistaJP031.getTxtEscribirMensaje_JP031_S3_RH().getText());
           System.out.println("Vamos a vel "+modelPaciente.getMensajito());
           Procesos.viewpaciente(modelPaciente, modelUsers, modelContactos, 2);
       }
       else if(e.getSource() == vistaJP031.getBtn4_JF031_S3_RH())
       {
           PanelesManager.copiaPanel("JP024_S3_AF");
                JPContenido.remove(vistaJP031);
                ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelRecetarMedicamentos");
                JPContenido.revalidate();
                JPContenido.repaint();
                PanelesManager.restaurarPanelEliminado();
       }
    }
    
}
