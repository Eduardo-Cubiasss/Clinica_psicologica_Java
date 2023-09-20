/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Database.Articulos;
import Database.Procesos_almacenados;
import Database.Terapeutas;
import Ui.JP028_S3_AF;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class AgregarArticulo implements ActionListener{
    private JPanel JPContenido;
    private JP028_S3_AF vista28;
    private HabilitarPaneles PanelesManager;   
    private Articulos modelArticulo;
    private Procesos_almacenados procesos;
    private Terapeutas modelTer;
    public AgregarArticulo(JPanel JPContenido, JP028_S3_AF vista28, HabilitarPaneles PanelesManager, Articulos modelArticulo, Procesos_almacenados procesos, Terapeutas modelTer)
    {
        this.JPContenido = JPContenido;
        this.vista28 = vista28;
        this.modelArticulo = modelArticulo;
        this.procesos = procesos;
        this.PanelesManager = PanelesManager;            
        this.modelTer = modelTer;
        this.vista28.getBtn1_JF028_S3_AF().addActionListener(this);
        this.vista28.getBtn4_JF028_S3_AF().addActionListener(this);
        this.vista28.getBtn5_JF028_S3_AF().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource()== vista28.getBtn1_JF028_S3_AF())
     {
         PanelesManager.copiaPanel("JP028_S3_AF");
            JPContenido.remove(vista28);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelDocumentosView");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
         //Botón para volver a un panel anterior
     }
     else if(e.getSource()== vista28.getBtn4_JF028_S3_AF())
     {
         modelArticulo.setTitulo(vista28.getjTextField2().getText());
         modelArticulo.setDescripcion(vista28.getjTextField1().getText());
         //modelArticulo.setImagen(Imagen);
         procesos.AgregarArticulo(modelArticulo, modelTer, 1);
         //Botón para guardar todos los cambios
     }
     else if(e.getSource()== vista28.getBtn5_JF028_S3_AF())
     {
         //Botón para editar la imagen del articulo
     }
     
    }
    
}
