/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Database.Administrador;
import Database.Clinica;
import Database.Procesos_almacenados;
import Database.Usuarios;
import Ui.JP002_S1_RHP;
import Ui.JP0048_S3_RH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author 50369
 */
public class primer_uso implements ActionListener{
    private Administrador modelAdmin;
    private Usuarios modelUsers;
    private JP0048_S3_RH vistaJP048;
    private JPanel JPContenido;
    private Procesos_almacenados Procesos;
    private HabilitarPaneles PanelesManager;
    
    public primer_uso(Administrador modelAdmin, JPanel JPContenido, Usuarios modelUsers, JP0048_S3_RH vistaJP048,
            Procesos_almacenados Procesos, HabilitarPaneles PanelesManager)
    {
        this.modelAdmin = modelAdmin;
        this.JPContenido = JPContenido;
        this.modelUsers = modelUsers;
        this.PanelesManager = PanelesManager;
        this.Procesos = Procesos;
        this.vistaJP048 = vistaJP048;
        
        this.vistaJP048.getbtnOmitir().addActionListener(this);
        this.vistaJP048.getbtnEmpecemos().addActionListener(this);
        this.vistaJP048.getBtn02_JF048_S3_RH().addActionListener(this);
        
            
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
