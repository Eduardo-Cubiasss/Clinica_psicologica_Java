/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import ux.PanelesInicializador;
import ux.VisualizarNotas;

/**
 *
 * @author LENOVO
 */
public class JP035_1_S3_RH extends javax.swing.JPanel {

    /**
     * Creates new form JP035_1_S3_RH
     */
    private VisualizarNotas controlador;
    private PanelesInicializador str;

    public JButton getBtn1_JF035_S3_RH() {
        return Btn1_JF035_S3_RH;
    }

    public void setBtn1_JF035_S3_RH(JButton Btn1_JF035_S3_RH) {
        this.Btn1_JF035_S3_RH = Btn1_JF035_S3_RH;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JSlider getjSlider1() {
        return jSlider1;
    }

    public void setjSlider1(JSlider jSlider1) {
        this.jSlider1 = jSlider1;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }
    
    
    
    
    
    
    public JP035_1_S3_RH(VisualizarNotas controlador) {
        initComponents();
        this.controlador = controlador;
        
        str = new PanelesInicializador();
        
         // Establecer el valor de str aquí después de haberlo creado
        str.setJP035_1_S3_RH(this);
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
        jLabel4 = new javax.swing.JLabel();
        Btn1_JF035_S3_RH = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jPanel2 = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(1120, 640));
        setMinimumSize(new java.awt.Dimension(1120, 640));
        setPreferredSize(new java.awt.Dimension(1120, 640));
        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1120, 640));
        jPanel1.setMinimumSize(new java.awt.Dimension(1120, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(1120, 640));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setText("Visualizar notas");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/log.PNG"))); // NOI18N

        Btn1_JF035_S3_RH.setBackground(new java.awt.Color(255, 255, 255));
        Btn1_JF035_S3_RH.setForeground(new java.awt.Color(255, 255, 255));
        Btn1_JF035_S3_RH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Vector (1).png"))); // NOI18N
        Btn1_JF035_S3_RH.setBorderPainted(false);
        Btn1_JF035_S3_RH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSlider1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn1_JF035_S3_RH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(273, 273, 273)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(Btn1_JF035_S3_RH)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn1_JF035_S3_RH;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
