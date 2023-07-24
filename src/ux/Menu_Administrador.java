/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JP004_S2_AF;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author 50369
 */
public class Menu_Administrador implements ActionListener {

    private JPanel JPContenido;
    private JP004_S2_AF panel;
    private JButton Btn01_JF005_S2_AF;
    private JButton Btn02_JF005_S2_AF;
    private JButton Btn03_JF005_S2_AF;
    private JButton Btn04_JF005_S2_AF;
    private JButton Btn05_JF005_S2_AF;
    private JButton btn08_JF023_S3_RH;

    public Menu_Administrador(JPanel JPContenido) {
        this.JPContenido = JPContenido;
        this.panel = panel;

        Btn01_JF005_S2_AF = new JButton("Botón 01");
        Btn02_JF005_S2_AF = new JButton("Botón 02");
        Btn03_JF005_S2_AF = new JButton("Botón 03");
        Btn04_JF005_S2_AF = new JButton("Botón 04");
        Btn05_JF005_S2_AF = new JButton("Botón 05");
        btn08_JF023_S3_RH = new JButton("Botón 08");

        Btn01_JF005_S2_AF.addActionListener(this);
        Btn02_JF005_S2_AF.addActionListener(this);
        Btn03_JF005_S2_AF.addActionListener(this);
        Btn04_JF005_S2_AF.addActionListener(this);
        Btn05_JF005_S2_AF.addActionListener(this);
        btn08_JF023_S3_RH.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Btn01_JF005_S2_AF) {
            // Código para la acción del botón Btn01_JF005_S2_AF
        } else if (e.getSource() == Btn02_JF005_S2_AF) {
            // Código para la acción del botón Btn02_JF005_S2_AF
        } else if (e.getSource() == Btn03_JF005_S2_AF) {
            // Código para la acción del botón Btn03_JF005_S2_AF
        } else if (e.getSource() == Btn04_JF005_S2_AF) {
            // Código para la acción del botón Btn04_JF005_S2_AF
        } else if (e.getSource() == Btn05_JF005_S2_AF) {
            // Código para la acción del botón Btn05_JF005_S2_AF
        } else if (e.getSource() == btn08_JF023_S3_RH) {
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelInicioSesion");
        }

    }
}
