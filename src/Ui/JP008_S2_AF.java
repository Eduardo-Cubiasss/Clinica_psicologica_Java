/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import keeptoo.KGradientPanel;
import ux.ModificarEmpleados;
import ux.PanelesInicializador;
import ux.PersonalClinica;
import ux.SeccionDeComentarios;

/**
 *
 * @author 50369
 */
public class JP008_S2_AF extends javax.swing.JPanel {
    
    
    
    private PersonalClinica controlador;
    private PanelesInicializador str;

    public PersonalClinica getControlador() {
        return controlador;
    }

    public void setControlador(PersonalClinica controlador) {
        this.controlador = controlador;
    }

    public PanelesInicializador getStr() {
        return str;
    }

    public void setStr(PanelesInicializador str) {
        this.str = str;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
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

    public KGradientPanel getkGradientPanel1() {
        return kGradientPanel1;
    }

    public void setkGradientPanel1(KGradientPanel kGradientPanel1) {
        this.kGradientPanel1 = kGradientPanel1;
    }

    public JButton getBtn001_JF008_S3_AF() {
        return Btn001_JF008_S3_AF;
    }

    public void setBtn001_JF008_S3_AF(JButton Btn001_JF008_S3_AF) {
        this.Btn001_JF008_S3_AF = Btn001_JF008_S3_AF;
    }

    public JButton getBtn004_JF008_S3_AF() {
        return Btn004_JF008_S3_AF;
    }

    public void setBtn004_JF008_S3_AF(JButton Btn004_JF008_S3_AF) {
        this.Btn004_JF008_S3_AF = Btn004_JF008_S3_AF;
    }

    public JButton getBtn005_JF008_S3_AF() {
        return Btn005_JF008_S3_AF;
    }

    public void setBtn005_JF008_S3_AF(JButton Btn005_JF008_S3_AF) {
        this.Btn005_JF008_S3_AF = Btn005_JF008_S3_AF;
    }

    public JButton getBtn006_JF008_S3_AF() {
        return Btn006_JF008_S3_AF;
    }

    public void setBtn006_JF008_S3_AF(JButton Btn006_JF008_S3_AF) {
        this.Btn006_JF008_S3_AF = Btn006_JF008_S3_AF;
    }

    public JButton getBtn007_JF008_S3_AF() {
        return Btn007_JF008_S3_AF;
    }

    public void setBtn007_JF008_S3_AF(JButton Btn007_JF008_S3_AF) {
        this.Btn007_JF008_S3_AF = Btn007_JF008_S3_AF;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public void setBtnBuscar(JButton btnBuscar) {
        this.btnBuscar = btnBuscar;
    }
    
    
    
    
    
    

    public JP008_S2_AF(PersonalClinica controlador) {
        initComponents();
        this.controlador = controlador;
        
        str = new PanelesInicializador();
        
         // Establecer el valor de str aquí después de haberlo creado
        str.setJP008_S2_AF(this);
    }
    
    
    
   
    
    
   
    /**
     * Creates new form JP008_S2_AF
     */
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Btn001_JF008_S3_AF = new javax.swing.JButton();
        Btn004_JF008_S3_AF = new javax.swing.JButton();
        Btn005_JF008_S3_AF = new javax.swing.JButton();
        Btn006_JF008_S3_AF = new javax.swing.JButton();
        Btn007_JF008_S3_AF = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1120, 640));
        setMinimumSize(new java.awt.Dimension(1120, 640));
        setPreferredSize(new java.awt.Dimension(1120, 640));
        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1120, 640));
        jPanel1.setMinimumSize(new java.awt.Dimension(1120, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(1120, 640));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(148, 177, 181));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1118, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 1120, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/log.PNG"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 170, 90));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Personal Clínica");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        Btn001_JF008_S3_AF.setBackground(new java.awt.Color(255, 255, 255));
        Btn001_JF008_S3_AF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Btn001_JF008_S3_AF.setForeground(new java.awt.Color(0, 102, 102));
        Btn001_JF008_S3_AF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/uim_clinic-medical (3).png"))); // NOI18N
        Btn001_JF008_S3_AF.setBorder(null);
        Btn001_JF008_S3_AF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(Btn001_JF008_S3_AF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        Btn004_JF008_S3_AF.setBackground(new java.awt.Color(255, 255, 255));
        Btn004_JF008_S3_AF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rrrrr.png"))); // NOI18N
        Btn004_JF008_S3_AF.setBorderPainted(false);
        jPanel1.add(Btn004_JF008_S3_AF, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 160, 160));

        Btn005_JF008_S3_AF.setBackground(new java.awt.Color(255, 255, 255));
        Btn005_JF008_S3_AF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actuuu.PNG"))); // NOI18N
        Btn005_JF008_S3_AF.setBorderPainted(false);
        jPanel1.add(Btn005_JF008_S3_AF, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 510, 210, 60));

        Btn006_JF008_S3_AF.setBackground(new java.awt.Color(255, 255, 255));
        Btn006_JF008_S3_AF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rrrrterap.png"))); // NOI18N
        Btn006_JF008_S3_AF.setBorderPainted(false);
        Btn006_JF008_S3_AF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn006_JF008_S3_AFActionPerformed(evt);
            }
        });
        jPanel1.add(Btn006_JF008_S3_AF, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 400, 170, 180));

        Btn007_JF008_S3_AF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aggg.PNG"))); // NOI18N
        Btn007_JF008_S3_AF.setBorderPainted(false);
        jPanel1.add(Btn007_JF008_S3_AF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 200, 50));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/++.PNG"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, 50, 60));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("Reportes Secretarias");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 160, 40));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("Reportes Terapeutas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 580, 160, 40));

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void Btn006_JF008_S3_AFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn006_JF008_S3_AFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn006_JF008_S3_AFActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn001_JF008_S3_AF;
    public javax.swing.JButton Btn004_JF008_S3_AF;
    public javax.swing.JButton Btn005_JF008_S3_AF;
    public javax.swing.JButton Btn006_JF008_S3_AF;
    public javax.swing.JButton Btn007_JF008_S3_AF;
    public javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
