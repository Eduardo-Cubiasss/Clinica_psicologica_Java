/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import ux.AgregarEmpleados;

/**
 *
 * @author 50369
 */
public class JP009_S2_RH extends javax.swing.JPanel {
    
    private AgregarEmpleados controlador;
    
    public JButton getBtn1_JF009_S2_RH() {
        return Btn1_JF009_S2_RH;
    }

    public JButton getBtn2_JF009_S2_RH() {
        return Btn2_JF009_S2_RH;
    }

    public JTextField getTxtNombre_JF009_S2_RH() {
        return TxtNombre_JF009_S2_RH;
    }

    public JTextField getTxtContraseña_JF009_S2_RH() {
        return TxtContraseña_JF009_S2_RH;
    }

    public JTextField getTxtTipoUsuario_JF009_S2_RH1() {
        return TxtTipoUsuario_JF009_S2_RH1;
    }

    public JLabel getLabelNumGenerado_JF009_S2_RH() {
        return LabelNumGenerado_JF009_S2_RH;
    }

    public JTextField getTxtCorreoE_JF009_S2_RH() {
        return TxtCorreoE_JF009_S2_RH;
    }

    public JButton getBtn3_JF009_S2_RH1() {
        return Btn3_JF009_S2_RH1;
    }

    public JButton getBtn4_JF009_S2_RH() {
        return Btn4_JF009_S2_RH;
    }

    
    public JP009_S2_RH(AgregarEmpleados controlador) {
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

        jPanel3 = new javax.swing.JPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Btn1_JF009_S2_RH = new javax.swing.JButton();
        Btn2_JF009_S2_RH = new javax.swing.JButton();
        Btn4_JF009_S2_RH = new javax.swing.JButton();
        TxtCorreoE_JF009_S2_RH = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        LabelImagenPerfil_JF009_S2_RH = new javax.swing.JLabel();
        TxtNombre_JF009_S2_RH = new javax.swing.JTextField();
        TxtContraseña_JF009_S2_RH = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        Btn3_JF009_S2_RH1 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        TxtTipoUsuario_JF009_S2_RH1 = new javax.swing.JTextField();
        LabelNumGenerado_JF009_S2_RH = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        kGradientPanel3.setkEndColor(new java.awt.Color(0, 153, 153));
        kGradientPanel3.setkStartColor(new java.awt.Color(148, 177, 181));

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 968, Short.MAX_VALUE)
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        jPanel3.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 970, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/log.PNG"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 170, 90));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Agregar perfiles de usuario");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        Btn1_JF009_S2_RH.setBackground(new java.awt.Color(255, 255, 255));
        Btn1_JF009_S2_RH.setForeground(new java.awt.Color(255, 255, 255));
        Btn1_JF009_S2_RH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Vector (1).png"))); // NOI18N
        Btn1_JF009_S2_RH.setBorderPainted(false);
        Btn1_JF009_S2_RH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(Btn1_JF009_S2_RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 80));

        Btn2_JF009_S2_RH.setBackground(new java.awt.Color(255, 255, 255));
        Btn2_JF009_S2_RH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ph_note-pencil-bold.png"))); // NOI18N
        Btn2_JF009_S2_RH.setBorderPainted(false);
        Btn2_JF009_S2_RH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(Btn2_JF009_S2_RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 60, 50));

        Btn4_JF009_S2_RH.setBackground(new java.awt.Color(255, 255, 255));
        Btn4_JF009_S2_RH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cancelar.png"))); // NOI18N
        Btn4_JF009_S2_RH.setBorderPainted(false);
        Btn4_JF009_S2_RH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn4_JF009_S2_RH.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                Btn4_JF009_S2_RHComponentShown(evt);
            }
        });
        jPanel3.add(Btn4_JF009_S2_RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 220, 50));

        TxtCorreoE_JF009_S2_RH.setForeground(new java.awt.Color(102, 102, 102));
        TxtCorreoE_JF009_S2_RH.setText("Insertar el correo electrónico");
        TxtCorreoE_JF009_S2_RH.setBorder(null);
        jPanel3.add(TxtCorreoE_JF009_S2_RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 280, 40));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setText("Correo electrónico");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 190, 20));
        jPanel3.add(LabelImagenPerfil_JF009_S2_RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 240, 240));

        TxtNombre_JF009_S2_RH.setForeground(new java.awt.Color(102, 102, 102));
        TxtNombre_JF009_S2_RH.setText("Insertar nombre de usuario");
        TxtNombre_JF009_S2_RH.setBorder(null);
        jPanel3.add(TxtNombre_JF009_S2_RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 270, 40));

        TxtContraseña_JF009_S2_RH.setForeground(new java.awt.Color(102, 102, 102));
        TxtContraseña_JF009_S2_RH.setText("Insertar contraseña");
        TxtContraseña_JF009_S2_RH.setBorder(null);
        jPanel3.add(TxtContraseña_JF009_S2_RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 270, 40));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setText("Usuario");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 90, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setText("Contraseña");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 90, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel9.setText("Tipo de usuario");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 130, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 420, 10));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 420, 10));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 420, 10));

        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 420, 10));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 420, 10));

        Btn3_JF009_S2_RH1.setBackground(new java.awt.Color(255, 255, 255));
        Btn3_JF009_S2_RH1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Agregar.png"))); // NOI18N
        Btn3_JF009_S2_RH1.setBorderPainted(false);
        Btn3_JF009_S2_RH1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(Btn3_JF009_S2_RH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 270, 50));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 420, 10));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("Número de ID generado");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 190, 20));

        TxtTipoUsuario_JF009_S2_RH1.setForeground(new java.awt.Color(102, 102, 102));
        TxtTipoUsuario_JF009_S2_RH1.setText("Insertar tipo de usuario");
        TxtTipoUsuario_JF009_S2_RH1.setBorder(null);
        jPanel3.add(TxtTipoUsuario_JF009_S2_RH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 280, 40));

        LabelNumGenerado_JF009_S2_RH.setBackground(new java.awt.Color(153, 153, 153));
        LabelNumGenerado_JF009_S2_RH.setText("Num");
        jPanel3.add(LabelNumGenerado_JF009_S2_RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 120, 40));

        add(jPanel3, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void Btn4_JF009_S2_RHComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Btn4_JF009_S2_RHComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn4_JF009_S2_RHComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn1_JF009_S2_RH;
    public javax.swing.JButton Btn2_JF009_S2_RH;
    public javax.swing.JButton Btn3_JF009_S2_RH1;
    public javax.swing.JButton Btn4_JF009_S2_RH;
    public javax.swing.JLabel LabelImagenPerfil_JF009_S2_RH;
    public javax.swing.JLabel LabelNumGenerado_JF009_S2_RH;
    public javax.swing.JTextField TxtContraseña_JF009_S2_RH;
    public javax.swing.JTextField TxtCorreoE_JF009_S2_RH;
    public javax.swing.JTextField TxtNombre_JF009_S2_RH;
    public javax.swing.JTextField TxtTipoUsuario_JF009_S2_RH1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JSeparator jSeparator1;
    public javax.swing.JSeparator jSeparator2;
    public javax.swing.JSeparator jSeparator3;
    public javax.swing.JSeparator jSeparator4;
    public javax.swing.JSeparator jSeparator5;
    public javax.swing.JSeparator jSeparator6;
    private keeptoo.KGradientPanel kGradientPanel3;
    // End of variables declaration//GEN-END:variables
}
