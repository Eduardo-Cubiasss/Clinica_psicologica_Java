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
import Ui.JF002_S1_RH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author 50369
 */
public class RegAdmin_JF002 implements ActionListener {

    private Administrador modelAdmin;
    private Usuarios modelUsers;
    private Clinica modelClinica;
    private JF002_S1_RH vistaJF002;
    private Procesos_almacenados Procesos;

    public RegAdmin_JF002(Administrador modelAdmin, Usuarios modelUsers, Clinica modelClinica, JF002_S1_RH vistaJF002, Procesos_almacenados Procesos) {
        this.modelAdmin = modelAdmin;
        this.modelUsers = modelUsers;
        this.modelClinica = modelClinica;
        this.vistaJF002 = vistaJF002;
        this.Procesos = Procesos;
        this.vistaJF002.Btn1_JF002_S1_RH.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaJF002.Btn1_JF002_S1_RH) {
            modelAdmin.setNombre(vistaJF002.TxtNombre_JF002_S1_RH.getText());
            modelUsers.setUserName(vistaJF002.TxtUsuario_JF002_S1_RH2.getText());
            modelUsers.setContraseña(vistaJF002.PassField_Contraseña_JF002_S1_RH.getText());
            modelClinica.setIDClinica(vistaJF002.TxtID_JF002_S1_RH3.getText());

            System.out.println("antes de ejecutar el metodo");
            Procesos.In_admin_clinica_users(modelAdmin, modelUsers, modelClinica);
            System.out.println("Después de ejecutar");
        }
    }
}
