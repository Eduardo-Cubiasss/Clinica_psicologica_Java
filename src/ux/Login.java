/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Database.Procesos_almacenados;
import Database.Usuarios;
import Ui.JP001_S1_AFP;
import Ui.JP002_S1_RHP;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author 50369
 */
public class Login implements ActionListener {

    private Usuarios modelUsers;
    private JPanel JPContenido;
    private Procesos_almacenados Procesos;
    private JP001_S1_AFP panelRegistro;

    public Login(Usuarios modelUsers,JPanel JPContenido, Procesos_almacenados Procesos, 
            JP001_S1_AFP panelRegistro) {
        this.modelUsers = modelUsers;
        this.JPContenido = JPContenido;
        this.Procesos = Procesos;
        this.panelRegistro = panelRegistro;

        // Agrega el ActionListener al botón btnLogin
        this.panelRegistro.getBtn2_JF001_S1_AF().addActionListener(this);
        this.panelRegistro.getbtn3_JF001_S1_AF().addActionListener(this);
        this.panelRegistro.getbtn4_JF001_S1_AF().addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelRegistro.getBtn2_JF001_S1_AF()) {
            modelUsers.setUserName(panelRegistro.getTxtUsuario_JF001_S1_AF().getText());
            modelUsers.setContraseña(new String(panelRegistro.getPass_JF001_S1_AF().getPassword()));
            Procesos.Logear(modelUsers);
            int Acceso = modelUsers.getAcceso();
            int Nivel = modelUsers.getResultado();
            if (Acceso == 1) {
                switch (Nivel) {
                    case 1:
                        ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelMenuTp");
                        break;
                    case 2:
                        
                        ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelMenuAdmin");
                        break;
                    case 3:
                        ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelMenuSec");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Tu usuario es de tipo paciente, usa la aplicación de móvil para acceder a él por favor", "Usuario inválido", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Se sugiere visitar la página donde se explica a detalle cada error que puede experimentar usted como usuario", "ERROR JF001DA", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(e.getSource() == panelRegistro.getbtn3_JF001_S1_AF())
        {
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelRegistro");
        }
                else if(e.getSource() == panelRegistro.getbtn4_JF001_S1_AF())
        {
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelvalCorreo");
        }
    }
}
