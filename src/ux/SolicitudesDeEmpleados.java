/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

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
    private JPanel panelActual = null;
    private List<Component> contenidoOriginal;

    public SolicitudesDeEmpleados(JPanel JPContenido, JP014_S2_AF vista14, HabilitarPaneles PanelesManager) {
        this.JPContenido = JPContenido;
        this.vista14 = vista14;
        this.PanelesManager = PanelesManager;
        this.vista14.getBtn1_JF014_S2().addActionListener(this);
        this.vista14.getBtn2_JF014_S2().addActionListener(this);
        this.vista14.getBtn3_JF014_S2().addActionListener(this);
        this.vista14.getBtn4_JF014_S2().addActionListener(this);
        this.vista14.getBtn5_JF014_S2().addActionListener(this);
        this.vista14.getBtnRedactarMensaje().addActionListener(this);
        this.ContenedorPapi = vista14.getContenedorPapi();
        this.ContenedorHijo = vista14.getContenedorHijo();
        contenidoOriginal = new ArrayList<>();
        for (Component component : ContenedorHijo.getComponents()) {
            contenidoOriginal.add(component);

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista14.getBtn1_JF014_S2()) {
            for (Component component : contenidoOriginal) {
                ContenedorPapi.add(component, "ContenedorHijo");
                System.out.println("Si entra al bucle y agrega componentes");
                
            }
            panelActual = ContenedorHijo;
            ContenedorPapi.add(panelActual, "ContenedorHijo");
            CardLayout cardLayout = (CardLayout) ContenedorPapi.getLayout();
            cardLayout.show(ContenedorPapi, "ContenedorHijo");
            System.out.println("Hace el intento de agrgarlo al ContenedorPapi");
        } else if (e.getSource() == vista14.getBtn2_JF014_S2()) {
            panelActual = new JP016_S2_AF();
            ContenedorPapi.add(panelActual, "JP016_S2_AF");
            CardLayout cardLayout = (CardLayout) ContenedorPapi.getLayout();
            cardLayout.show(ContenedorPapi, "JP016_S2_AF");
        } else if (e.getSource() == vista14.getBtn3_JF014_S2()) {
            panelActual = new JP018_S2_AF();
            ContenedorPapi.add(panelActual, "JP018_S2_AF");
            CardLayout cardLayout = (CardLayout) ContenedorPapi.getLayout();
            cardLayout.show(ContenedorPapi, "JP018_S2_AF");
        } else if (e.getSource() == vista14.getBtn4_JF014_S2()) {
            //Botón para ver ventana de mensajes panelVerMensaje
            PanelesManager.copiaPanel("JP014_S2_AF");
            //Lo que esta entre comillas es el JPXX de tu vista actual (la del controlador que estas editando)
            JPContenido.remove(vista14);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelNuevaSolicitudDeEmpleado");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
            //Para ver el mensaje seleccionado en la Jtable
        } else if (e.getSource() == vista14.getBtnRedactarMensaje()) {
            //Botón para ver ventana de mensajes panelVerMensaje
            PanelesManager.copiaPanel("JP014_S2_AF");
            //Lo que esta entre comillas es el JPXX de tu vista actual (la del controlador que estas editando)
            JPContenido.remove(vista14);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelRedactarMensaje");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
            //Para redactar mensaje
        } else if (e.getSource() == vista14.getBtn5_JF014_S2()) {
            PanelesManager.copiaPanel("JP014_S2_AF");
            JPContenido.remove(vista14);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelMenuSec");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
            //Volver al panel anterior
        }
    }

}
