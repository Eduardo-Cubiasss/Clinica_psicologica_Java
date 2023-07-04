/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Database.Procesos_almacenados;
import Database.Usuarios;
import Ui.JF001_S1_AF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author 50369
 */
public class Login implements ActionListener{
    private Usuarios modelUsers;
    private JF001_S1_AF vistaJF001;
    private Procesos_almacenados Procesos;
    
    public Login(Usuarios modelUsers, JF001_S1_AF vistaJF001, Procesos_almacenados Procesos)
    {
        this.vistaJF001 = vistaJF001;
        this.Procesos = Procesos;
        this.modelUsers = modelUsers;
        this.vistaJF001.Btn2_JF001_S1_AF.addActionListener((ActionListener) this);
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaJF001.Btn2_JF001_S1_AF) {
            modelUsers.setUserName(vistaJF001.TxtUsuario_JF001_S1_AF.getText());
            modelUsers.setContraseña(vistaJF001.Pass_JF001_S1_AF.getText());

            System.out.println("antes de ejecutar el metodo");
            Procesos.Logear(modelUsers);
            System.out.println("Después de ejecutar");
        }
    }
}
