/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import javax.swing.JButton;
import javax.swing.JPanel;
import ux.Ver_Expediente;

/**
 *
 * @author 50369
 */
public class JP031_S3_RHG extends javax.swing.JPanel {
    private Ver_Expediente controlador;

    public JButton getBtn1_JF031_S3_RH() {
        return Btn1_JF031_S3_RH;
    }

    public JPanel getJP01_JF031_S3_RH() {
        return JP01_JF031_S3_RH;
    }

    public JButton getBtn2_JF031_S3_RH1() {
        return Btn2_JF031_S3_RH1;
    }

    public JButton getBtn3_JF031_S3_RH2() {
        return Btn3_JF031_S3_RH2;
    }

    public JButton getBtn4_JF031_S3_RH() {
        return Btn4_JF031_S3_RH;
    }
    
    public JP031_S3_RHG(Ver_Expediente controlador) {
        this.controlador = controlador;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Btn1_JF031_S3_RH = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JP01_JF031_S3_RH = new javax.swing.JPanel();
        Btn4_JF031_S3_RH = new javax.swing.JButton();
        Btn2_JF031_S3_RH1 = new javax.swing.JButton();
        Btn3_JF031_S3_RH2 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1120, 540));
        setMinimumSize(new java.awt.Dimension(1120, 540));
        setPreferredSize(new java.awt.Dimension(1120, 540));
        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1120, 540));
        jPanel1.setMinimumSize(new java.awt.Dimension(1120, 540));
        jPanel1.setPreferredSize(new java.awt.Dimension(1120, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn1_JF031_S3_RH.setBackground(new java.awt.Color(255, 255, 255));
        Btn1_JF031_S3_RH.setForeground(new java.awt.Color(255, 255, 255));
        Btn1_JF031_S3_RH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Vector (1).png"))); // NOI18N
        Btn1_JF031_S3_RH.setBorderPainted(false);
        Btn1_JF031_S3_RH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(Btn1_JF031_S3_RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Expediente del paciente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/log.PNG"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, -1, -1));

        JP01_JF031_S3_RH.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout JP01_JF031_S3_RHLayout = new javax.swing.GroupLayout(JP01_JF031_S3_RH);
        JP01_JF031_S3_RH.setLayout(JP01_JF031_S3_RHLayout);
        JP01_JF031_S3_RHLayout.setHorizontalGroup(
            JP01_JF031_S3_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        JP01_JF031_S3_RHLayout.setVerticalGroup(
            JP01_JF031_S3_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        jPanel1.add(JP01_JF031_S3_RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 920, 310));

        Btn4_JF031_S3_RH.setBackground(new java.awt.Color(255, 255, 255));
        Btn4_JF031_S3_RH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMedicina.png"))); // NOI18N
        Btn4_JF031_S3_RH.setBorderPainted(false);
        Btn4_JF031_S3_RH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(Btn4_JF031_S3_RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 160, 100));

        Btn2_JF031_S3_RH1.setBackground(new java.awt.Color(255, 255, 255));
        Btn2_JF031_S3_RH1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAgenda.png"))); // NOI18N
        Btn2_JF031_S3_RH1.setBorderPainted(false);
        Btn2_JF031_S3_RH1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(Btn2_JF031_S3_RH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 150, 100));

        Btn3_JF031_S3_RH2.setBackground(new java.awt.Color(255, 255, 255));
        Btn3_JF031_S3_RH2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnVerNotas.png"))); // NOI18N
        Btn3_JF031_S3_RH2.setBorderPainted(false);
        Btn3_JF031_S3_RH2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(Btn3_JF031_S3_RH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 150, 100));

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn1_JF031_S3_RH;
    public javax.swing.JButton Btn2_JF031_S3_RH1;
    public javax.swing.JButton Btn3_JF031_S3_RH2;
    public javax.swing.JButton Btn4_JF031_S3_RH;
    public javax.swing.JPanel JP01_JF031_S3_RH;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
