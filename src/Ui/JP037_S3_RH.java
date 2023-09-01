/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import ux.CambiosPruebasActuales;
import ux.PanelesInicializador;
import ux.PruebasDF;
import ux.RcetarMedicamentos;

/**
 *
 * @author LENOVO
 */
public class JP037_S3_RH extends javax.swing.JPanel {

    
    private CambiosPruebasActuales controlador;
    private PanelesInicializador str;

    public JP037_S3_RH(CambiosPruebasActuales controlador) {
        initComponents();
        this.controlador = controlador;
        
        str = new PanelesInicializador();
        
         // Establecer el valor de str aquí después de haberlo creado
        str.setJP037_S3_RH(this);
    }
   
    
    
    public JP037_S3_RH() {
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
        jLabel5 = new javax.swing.JLabel();
        Btn1_JF037_S3_RH = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JP1_JF037_S3_RH = new javax.swing.JPanel();
        jSlider1_JF037_S3_RH = new javax.swing.JSlider();
        kGradientPanel1 = new keeptoo.KGradientPanel();

        setMaximumSize(new java.awt.Dimension(1120, 540));
        setMinimumSize(new java.awt.Dimension(1120, 540));
        setPreferredSize(new java.awt.Dimension(1120, 540));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1120, 540));
        jPanel1.setMinimumSize(new java.awt.Dimension(1120, 540));
        jPanel1.setPreferredSize(new java.awt.Dimension(1120, 540));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setText("Prueba actuales");

        Btn1_JF037_S3_RH.setBackground(new java.awt.Color(255, 255, 255));
        Btn1_JF037_S3_RH.setForeground(new java.awt.Color(255, 255, 255));
        Btn1_JF037_S3_RH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Vector (1).png"))); // NOI18N
        Btn1_JF037_S3_RH.setBorderPainted(false);
        Btn1_JF037_S3_RH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/log.PNG"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("¿Deseas hacer cambios?");

        JP1_JF037_S3_RH.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout JP1_JF037_S3_RHLayout = new javax.swing.GroupLayout(JP1_JF037_S3_RH);
        JP1_JF037_S3_RH.setLayout(JP1_JF037_S3_RHLayout);
        JP1_JF037_S3_RHLayout.setHorizontalGroup(
            JP1_JF037_S3_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 955, Short.MAX_VALUE)
        );
        JP1_JF037_S3_RHLayout.setVerticalGroup(
            JP1_JF037_S3_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
        );

        jSlider1_JF037_S3_RH.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkGradientFocus(850);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn1_JF037_S3_RH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)))
                        .addGap(303, 303, 303)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JP1_JF037_S3_RH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jSlider1_JF037_S3_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addGap(0, 66, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(Btn1_JF037_S3_RH))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)))
                .addGap(43, 43, 43)
                .addComponent(JP1_JF037_S3_RH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jSlider1_JF037_S3_RH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn1_JF037_S3_RH;
    private javax.swing.JPanel JP1_JF037_S3_RH;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1_JF037_S3_RH;
    public keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
