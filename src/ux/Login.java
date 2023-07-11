/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Database.Procesos_almacenados;
import Database.Usuarios;
import Ui.JF001_S1_AF;
import Ui.JF004_S2_AF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author 50369
 */
public class Login implements ActionListener {

    private Usuarios modelUsers;
    private JF001_S1_AF vistaJF001;
    private Procesos_almacenados Procesos;

    public Login(Usuarios modelUsers, JF001_S1_AF vistaJF001, Procesos_almacenados Procesos) {
        this.vistaJF001 = vistaJF001;
        this.Procesos = Procesos;
        this.modelUsers = modelUsers;
        this.vistaJF001.Btn2_JF001_S1_AF.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaJF001.Btn2_JF001_S1_AF) {
            System.out.println("Llega hasta aqui");
            modelUsers.setUserName(vistaJF001.TxtUsuario_JF001_S1_AF.getText());
            modelUsers.setContraseña(vistaJF001.Pass_JF001_S1_AF.getText());
            Procesos.Logear(modelUsers);
            int Acceso = modelUsers.getAcceso();
            int Nivel = modelUsers.getResultado();
            System.out.println("Llega hata aki");
            if (Acceso == 1) {
                switch (Nivel) {
                    case 1:
                        Abrirvistas.abrir("JF004_S2_AF");
                        break;
                    case 2:
                        Abrirvistas.abrir("JF039_S3_RH");
                        break;
                    case 3:
                        Abrirvistas.abrir("JF023_S3_RH");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Tu usuario es de tipo paciente, usa la aplicación de movil para acceder a él por favor", "Usuario invalido", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Se sugiere visitar la página donde se explica a detalle cada error que puede experimentar usted como usuario", "ERROR JF001DA", JOptionPane.INFORMATION_MESSAGE);
            }

            

        }
    }
}
