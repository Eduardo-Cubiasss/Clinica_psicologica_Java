/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Database.Anuncios;
import Database.Procesos_almacenados;
import Ui.JP006_S2_AF;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class CreacionDeAnuncios implements ActionListener{
    private JPanel JPContenido;
    private JP006_S2_AF vista06;
      private HabilitarPaneles PanelesManager;   
      private Procesos_almacenados procesos;
      private AnunciosActuales AnunciosController;
      private Anuncios modelAnuncio;
   
    public CreacionDeAnuncios(JPanel JPContenido, JP006_S2_AF vista06, HabilitarPaneles PanelesManager)
    {
        this.JPContenido = JPContenido;
        this.vista06 = vista06;
        this.PanelesManager = PanelesManager;        
        this.vista06.getBtn001_JF006_S2_AF().addActionListener(this);
        this.vista06.getBtn2_JF006_S2_AF().addActionListener(this);
        this.vista06.getBtn3_JF006_S2_AF().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista06.getBtn001_JF006_S2_AF())
        {
             PanelesManager.copiaPanel("JP006_S2_AF");
                JPContenido.remove(vista06);
                ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelMenuAdmin");
                JPContenido.revalidate();
                JPContenido.repaint();
                PanelesManager.restaurarPanelEliminado();
            //Boton de la casita, es para devolverte al menú de administrador
        }
        else if (e.getSource() == vista06.getBtn2_JF006_S2_AF())
        {   
            procesos.GenerarAnuncios(modelAnuncio, AnunciosController);
            PanelesManager.copiaPanel("JP006_S2_AF");
                JPContenido.remove(vista06);
                ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelAnunciosActuales");
                JPContenido.revalidate();
                JPContenido.repaint();
                PanelesManager.restaurarPanelEliminado();
            // Botón de agregar anuncios
        }
        else if (e.getSource() == vista06.getBtn3_JF006_S2_AF())
        {
            PanelesManager.copiaPanel("JP006_S2_AF");
                JPContenido.remove(vista06);
                ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelEliminarAnunciosActuales");
                JPContenido.revalidate();
                JPContenido.repaint();
                PanelesManager.restaurarPanelEliminado();
            //Botón de eliminar anuncios
        }
    }
    
}
