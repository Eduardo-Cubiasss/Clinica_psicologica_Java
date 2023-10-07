/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP039_S3_RH;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author 50369
 */
public class Menu_Secretaria implements ActionListener {

    private JPanel JPContenido;
    private JP039_S3_RH vista39;
    private HabilitarPaneles PanelesManager;
    private CardLayout cardLayout;
    private String panelActual = "vista39";
    private Inicializador init;
    //Declarar Paneles manager

    public Menu_Secretaria(JPanel JPContenido, JP039_S3_RH vista39, HabilitarPaneles PanelesManager, Inicializador init) //Ponerlo en la clase para indicar que se espera usar
    {
        this.JPContenido = JPContenido;
        this.vista39 = vista39;
        this.init = init;
        this.PanelesManager = PanelesManager;
        cardLayout = (CardLayout) JPContenido.getLayout();
        //Hacer this a PanelesManager

        this.vista39.getBtn05_JF039_S3_RH().addActionListener(this);
        this.vista39.getBtn06_JF039_S3_RH().addActionListener(this);
        this.vista39.getBtn08_JF039_S3_RH().addActionListener(this);
        this.vista39.getBtn09_JF039_S3_RH().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista39.getBtn05_JF039_S3_RH()) {
            
            
                         init.mostrarOcultarPanel("panelDetallesDeMiPerfil"); 

            //Botón de mi perfil
            
            
        } else if (e.getSource() == vista39.getBtn06_JF039_S3_RH()) {
            
            init.mostrarOcultarPanel("panelSolicitudesDeEmpleados");  
            
            
            //Botón de solicitud de incapacidades
        } else if (e.getSource() == vista39.getBtn08_JF039_S3_RH()) {
            
            init.mostrarOcultarPanel("panelInicioSesion");  
            
            
            //Botón de Cerrar Sesión, lleva lleva al login dah
        } else if (e.getSource() == vista39.getBtn09_JF039_S3_RH()) {
            
            init.mostrarOcultarPanel("panelBuscadorPacientes");  
            
        }
    }
}
