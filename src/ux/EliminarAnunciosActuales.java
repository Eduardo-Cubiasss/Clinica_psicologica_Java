/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP021_S3_RH;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class EliminarAnunciosActuales implements ActionListener{
    private JPanel JPContenido;
    private JP021_S3_RH vista21;
    private HabilitarPaneles PanelesManager;  
    
    public EliminarAnunciosActuales(JPanel JPContenido, JP021_S3_RH vista21, HabilitarPaneles PanelesManager)
    {
        this.JPContenido = JPContenido;
        this.vista21 = vista21;
        this.PanelesManager = PanelesManager;       
        this.vista21.getBtn1_JF021_S3_RH().addActionListener(this);
        this.vista21.getBtn2_JF021_S3_RH().addActionListener(this);
        this.vista21.getBtn3_JF021_S3_RH().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista21.getBtn1_JF021_S3_RH())
        {
            PanelesManager.copiaPanel("JP021_S3_RH");
                JPContenido.remove(vista21);
                ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelCreacionDeAnuncios");
                JPContenido.revalidate();
                JPContenido.repaint();
                PanelesManager.restaurarPanelEliminado();
            //Volver un panel anterior
        }
        else if(e.getSource()== vista21.getBtn2_JF021_S3_RH())
        {
            //Eliminar anuncio
        }
        else if(e.getSource()== vista21.getBtn3_JF021_S3_RH())
        {
            //Pos no eliminar y ya
        }
    }
    
}
