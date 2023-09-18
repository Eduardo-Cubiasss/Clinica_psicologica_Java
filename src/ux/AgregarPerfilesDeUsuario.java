/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Database.Administrador;
import Database.Contactos;
import Database.Empleado;
import Database.Procesos_almacenados;
import Database.Usuarios;
import Ui.JP009_S2_RH;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class AgregarPerfilesDeUsuario implements ActionListener {

    private JPanel JPContenido;
    private Procesos_almacenados procesos;
    private HabilitarPaneles PanelesManager;
    private Empleado modelEmpleado;
    private JP009_S2_RH vista09;
    private Usuarios modelUsers;
    private Administrador modelAdmin;
    private Contactos modelContactos;

    public AgregarPerfilesDeUsuario(JPanel JPContenido, Procesos_almacenados procesos, HabilitarPaneles PanelesManager, Empleado modelEmpleado, JP009_S2_RH vista09, 
            Usuarios modelUsers, Administrador modelAdmin, Contactos modelContactos) {
        this.JPContenido = JPContenido;
        this.PanelesManager = PanelesManager;
        this.modelEmpleado = modelEmpleado;
        this.modelAdmin = modelAdmin;
        this.modelContactos = modelContactos;
        this.procesos = procesos;
        this.vista09 = vista09;
        this.modelUsers = modelUsers;

        this.vista09.Btn3_JF009_S2_RH1.addActionListener(this);
        this.vista09.Btn4_JF009_S2_RH.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista09.getBtn3_JF009_S2_RH1()) {
            modelEmpleado.setUsername(vista09.getTxtNombre_JF009_S2_RH().getText());
            modelEmpleado.setContraseña(vista09.getTxtContraseña_JF009_S2_RH1().getText());
            modelContactos.setCorreo(vista09.getTxtCorreoE_JF009_S2_RH().getText());
            modelEmpleado.setNivel(vista09.getjComboBox1().getSelectedIndex());
            modelEmpleado.setNombre(vista09.getTxNombre_JF009_S2_RH().getText());
            System.out.println(modelEmpleado.getContraseña());
            System.out.println(modelEmpleado.getUsername());
            procesos.AgregarEmpleado(modelAdmin, modelEmpleado, modelUsers, modelContactos);
        } else if (e.getSource() == vista09.getBtn4_JF009_S2_RH()) {
            vista09.getTxtNombre_JF009_S2_RH().setText(""); // Establece el JTextField en blanco
            vista09.getTxtContraseña_JF009_S2_RH().setText(""); // Establece el JTextField en blanco
            vista09.getTxtCorreoE_JF009_S2_RH().setText(""); // Establece el JTextField en blanco
            vista09.getjComboBox1().setSelectedIndex(0); // Establece el JComboBox en su primer elemento (o el que desees)
        }
        
        else if (e.getSource() == vista09.getBtn1_JF009_S2_RH()) {
             //Para regresar al anterior
            PanelesManager.copiaPanel("JP009_S2_RH");
            JPContenido.remove(vista09);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelPersonalClinica");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
        }
        
    }

}
