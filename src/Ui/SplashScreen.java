/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ux.Inicializador;

public class SplashScreen extends javax.swing.JPanel {

    private int segundosRestantes = 6;
    private JPanel JPContenido; 
    public SplashScreen(JPanel JPContenido) {
        this.JPContenido = JPContenido;
        initComponents();
        startContador();
    }

    public void startContador() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                segundosRestantes--;
                if (segundosRestantes <= 0) {
                    // Oculta el SplashScreen después de que han pasado los 6 segundos
                    ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelAnuncios1");
                }
            }
        });
        timer.setRepeats(true);
        timer.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1120, 540));
        setMinimumSize(new java.awt.Dimension(1120, 540));
        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1120, 540));
        jPanel1.setMinimumSize(new java.awt.Dimension(1120, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Comp 1.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 790, 540));

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
