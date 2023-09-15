/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP011_S2_RH;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class AnunciosActuales implements ActionListener{
    private JPanel JPContenido;
    private JP011_S2_RH vista11;
    private HabilitarPaneles PanelesManager;  
    
    public AnunciosActuales(JPanel JPContenido, JP011_S2_RH vista11, HabilitarPaneles PanelesManager)
    {
        this.JPContenido = JPContenido;
        this.vista11 = vista11;
        this.PanelesManager = PanelesManager;   
        this.vista11.getBtn1_JF011_S2_RH().addActionListener(this);
        this.vista11.getBtn2_JF011_S2_RH().addActionListener(this);
        this.vista11.getBtn3_JF011_S2_RH().addActionListener(this);
        this.vista11.getBtn4_JF011_S2_RH().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista11.getBtn1_JF011_S2_RH())
        {
            PanelesManager.copiaPanel("JP011_S2_RH");
                JPContenido.remove(vista11);
                ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelCreacionDeAnuncios");
                JPContenido.revalidate();
                JPContenido.repaint();
                PanelesManager.restaurarPanelEliminado();
            //Pa volver al menú de admin gr
        }
        else if (e.getSource() == vista11.getBtn2_JF011_S2_RH())
        {
            //Pa cambiar el titulo del anuncio actual
        }
        else if (e.getSource() == vista11.getBtn3_JF011_S2_RH())
        {
            //Pa guardar todos los cambios hechos
        }
        else if (e.getSource() == vista11.getBtn4_JF011_S2_RH())
        {
            //Pa agregar la imagen del anuncio
        }
    }
    
}
