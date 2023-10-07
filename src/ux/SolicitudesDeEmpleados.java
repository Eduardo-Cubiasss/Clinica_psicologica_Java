/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.Deriv_JP014_S2_AF;
import Ui.JP014_S2_AF;
import Ui.JP016_S2_AF;
import Ui.JP018_S2_AF;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class SolicitudesDeEmpleados implements ActionListener {

    private JPanel JPContenido;
    private JP014_S2_AF vista14;
    private HabilitarPaneles PanelesManager;
    private JPanel ContenedorPapi;
    private JPanel ContenedorHijo;
    private JP018_S2_AF vista18;
    private JP016_S2_AF vista16;
    private Deriv_JP014_S2_AF vista141;
    private Inicializador init;

    public SolicitudesDeEmpleados(JPanel JPContenido, JP014_S2_AF vista14, HabilitarPaneles PanelesManager, Inicializador init,
            JP018_S2_AF vista18, JP016_S2_AF vista16, Deriv_JP014_S2_AF vista141) {
        this.JPContenido = JPContenido;
        this.vista14 = vista14;
        this.vista18 = vista18;
        this.vista16 = vista16;
        this.vista141 = vista141;
        this.init = init;
        this.PanelesManager = PanelesManager;
        this.vista14.getBtn1_JF014_S2().addActionListener(this);
        this.vista14.getBtn2_JF014_S2().addActionListener(this);
        this.vista14.getBtn3_JF014_S2().addActionListener(this);
        this.vista14.getBtn5_JF014_S2().addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista14.getBtn1_JF014_S2()) {
            
        } else if (e.getSource() == vista14.getBtn2_JF014_S2()) {
            
            //ContenedorPapi.add(panelActual, "JP016_S2_AF");
           
        } else if (e.getSource() == vista14.getBtn3_JF014_S2()) {
           
           // ContenedorPapi.add(panelActual, "JP018_S2_AF");
            
        } 
        else if (e.getSource() == vista14.getBtn5_JF014_S2()) {
            CardLayout cardLayout = (CardLayout) JPContenido.getLayout();
            cardLayout.show(JPContenido, "panelMenuSec");
            
           
            //Volver al panel anterior
        }//else if (e.getSource() == vista14.getBtn4_JF014_S2()) {
            // Botón para ver ventana de mensajes panelVerMensaje
            
            // Lo que está entre comillas es el JPXX de tu vista actual (la del controlador que estás editando)
            //CardLayout cardLayout = (CardLayout) JPContenido.getLayout();
            //cardLayout.show(JPContenido, "panelNuevaSolicitudDeEmpleado");
            //Para ver el mensaje seleccionado en la Jtable
        //} else if (e.getSource() == vista14.getBtnRedactarMensaje()) {
            // Botón para ver ventana de mensajes panelVerMensaje
            //PanelesManager.copiaPanel("JP014_S2_AF");
            // Lo que está entre comillas es el JPXX de tu vista actual (la del controlador que estás editando)
            //CardLayout cardLayout = (CardLayout) JPContenido.getLayout();
            //cardLayout.show(JPContenido, "panelRedactarMensaje");
            //Para redactar mensaje
        //} 
    }

}
