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
    private JButton btnLogin;
    private JButton btnregistarse;
    private JButton btnreccontra;
    private JTextField txtUsuario;
    private JPasswordField txtContraseña;
    private JPanel JPContenido;
    private Procesos_almacenados Procesos;
    private JP002_S1_RHP panelRegistro;

    public Login(Usuarios modelUsers, JButton btnLogin, JTextField txtUsuario, JPasswordField txtContraseña,
            JPanel JPContenido, Procesos_almacenados Procesos, JButton btnregistarse, JButton btnreccontra) {
        this.modelUsers = modelUsers;
        this.btnLogin = btnLogin;
        this.btnregistarse = btnregistarse;
        this.txtUsuario = txtUsuario;
        this.txtContraseña = txtContraseña;
        this.JPContenido = JPContenido;
        this.Procesos = Procesos;
        this.btnreccontra = btnreccontra;

        // Agrega el ActionListener al botón btnLogin
        this.btnLogin.addActionListener(this);
        this.btnregistarse.addActionListener(this);
        this.btnreccontra.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin) {
            modelUsers.setUserName(txtUsuario.getText());
            modelUsers.setContraseña(new String(txtContraseña.getPassword()));
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
        else if(e.getSource() == btnregistarse)
        {
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelRegistro");
        }
                else if(e.getSource() == btnreccontra)
        {
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelvalCorreo");
        }
    }
}
