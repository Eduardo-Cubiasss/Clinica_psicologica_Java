/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import ux.RegAdmin_JF002;

/**
 *
 * @author 50369
 */
public class JP002_S1_RHP extends javax.swing.JPanel {

    private RegAdmin_JF002 controlador;

    public JTextField getTxtNombre_JF002_S1_RH() {
        return TxtNombre_JF002_S1_RH;
    }

    public JTextField getTxtUsuario_JF002_S1_RH2() {
        return TxtUsuario_JF002_S1_RH2;
    }

    public JTextField getTxtID_JF002_S1_RH3() {
        return TxtID_JF002_S1_RH3;
    }

    public JPasswordField getPassField_Contraseña_JF002_S1_RH() {
        return PassField_Contraseña_JF002_S1_RH;
    }

    public JPasswordField getPassField_ConfirmarContra_JF002_S1_RH() {
        return PassField_ConfirmarContra_JF002_S1_RH;
    }

    public JButton getBtn1_JF002_S1_RH() {
        return Btn1_JF002_S1_RH;
    }

    public JButton getBtn2_JF002_S1_RH() {
        return Btn2_JF002_S1_RH;
    }

    public JP002_S1_RHP(RegAdmin_JF002 controlador) {
        this.controlador = controlador;
        initComponents();
    }

    /**
     * Creates new form JP002_S1_RHP
     */
    public JP002_S1_RHP() {
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        JP001_S1_RH = new javax.swing.JPanel();
        TxtNombre_JF002_S1_RH = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtUsuario_JF002_S1_RH2 = new javax.swing.JTextField();
        TxtID_JF002_S1_RH3 = new javax.swing.JTextField();
        PassField_ConfirmarContra_JF002_S1_RH = new javax.swing.JPasswordField();
        PassField_Contraseña_JF002_S1_RH = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Btn1_JF002_S1_RH = new javax.swing.JButton();
        Btn2_JF002_S1_RH = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1120, 540));
        setPreferredSize(new java.awt.Dimension(1120, 540));
        setLayout(new java.awt.CardLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(148, 177, 181));
        kGradientPanel1.setkGradientFocus(100);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 102));
        kGradientPanel1.setkTransparentControls(false);

        JP001_S1_RH.setBackground(new java.awt.Color(255, 255, 255));
        JP001_S1_RH.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 102, 102)));
        JP001_S1_RH.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        TxtNombre_JF002_S1_RH.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        TxtNombre_JF002_S1_RH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        TxtNombre_JF002_S1_RH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TxtNombre_JF002_S1_RH.setSelectionColor(new java.awt.Color(0, 0, 0));
        TxtNombre_JF002_S1_RH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombre_JF002_S1_RHActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("<html> REGISTRARSE COMO ADMINISTRADOR <br>    ");

        TxtUsuario_JF002_S1_RH2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        TxtUsuario_JF002_S1_RH2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        TxtUsuario_JF002_S1_RH2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TxtUsuario_JF002_S1_RH2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuario_JF002_S1_RH2ActionPerformed(evt);
            }
        });

        TxtID_JF002_S1_RH3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        TxtID_JF002_S1_RH3.setForeground(new java.awt.Color(153, 153, 153));
        TxtID_JF002_S1_RH3.setText("Elige un ID único");
        TxtID_JF002_S1_RH3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        TxtID_JF002_S1_RH3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TxtID_JF002_S1_RH3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtID_JF002_S1_RH3ActionPerformed(evt);
            }
        });

        PassField_ConfirmarContra_JF002_S1_RH.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        PassField_ConfirmarContra_JF002_S1_RH.setToolTipText("");
        PassField_ConfirmarContra_JF002_S1_RH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        PassField_Contraseña_JF002_S1_RH.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        PassField_Contraseña_JF002_S1_RH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        PassField_Contraseña_JF002_S1_RH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassField_Contraseña_JF002_S1_RHActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Nombre");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Usuario");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Contraseña");

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Crea el ID de tu clínica");

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Confirmar contraseña");

        Btn1_JF002_S1_RH.setBackground(new java.awt.Color(255, 255, 255));
        Btn1_JF002_S1_RH.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Btn1_JF002_S1_RH.setForeground(new java.awt.Color(255, 255, 255));
        Btn1_JF002_S1_RH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RegistrarseClarito.png"))); // NOI18N
        Btn1_JF002_S1_RH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Btn1_JF002_S1_RH.setBorderPainted(false);
        Btn1_JF002_S1_RH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn1_JF002_S1_RH.setInheritsPopupMenu(true);
        Btn1_JF002_S1_RH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn1_JF002_S1_RHMouseClicked(evt);
            }
        });
        Btn1_JF002_S1_RH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1_JF002_S1_RHActionPerformed(evt);
            }
        });

        Btn2_JF002_S1_RH.setBackground(new java.awt.Color(255, 255, 255));
        Btn2_JF002_S1_RH.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Btn2_JF002_S1_RH.setForeground(new java.awt.Color(255, 255, 255));
        Btn2_JF002_S1_RH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IniciarSesionTrns.png"))); // NOI18N
        Btn2_JF002_S1_RH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 50, true));
        Btn2_JF002_S1_RH.setBorderPainted(false);
        Btn2_JF002_S1_RH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn2_JF002_S1_RH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2_JF002_S1_RHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP001_S1_RHLayout = new javax.swing.GroupLayout(JP001_S1_RH);
        JP001_S1_RH.setLayout(JP001_S1_RHLayout);
        JP001_S1_RHLayout.setHorizontalGroup(
            JP001_S1_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP001_S1_RHLayout.createSequentialGroup()
                .addGroup(JP001_S1_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP001_S1_RHLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JP001_S1_RHLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(Btn1_JF002_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(JP001_S1_RHLayout.createSequentialGroup()
                .addGroup(JP001_S1_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP001_S1_RHLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(JP001_S1_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtID_JF002_S1_RH3, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(PassField_ConfirmarContra_JF002_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(PassField_Contraseña_JF002_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(TxtUsuario_JF002_S1_RH2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(TxtNombre_JF002_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(JP001_S1_RHLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(Btn2_JF002_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 66, Short.MAX_VALUE))
        );
        JP001_S1_RHLayout.setVerticalGroup(
            JP001_S1_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP001_S1_RHLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(TxtNombre_JF002_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtUsuario_JF002_S1_RH2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PassField_Contraseña_JF002_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PassField_ConfirmarContra_JF002_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(TxtID_JF002_S1_RH3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn1_JF002_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn2_JF002_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MINDLINK");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html>\nBienvenido a la mejor experiencia\n<br>\n\n\n\n");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogitoGrande.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(JP001_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(JP001_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        add(kGradientPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void Btn2_JF002_S1_RHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2_JF002_S1_RHActionPerformed
        ux.Abrirvistas.abrir("JF001_S1_AF");
    }//GEN-LAST:event_Btn2_JF002_S1_RHActionPerformed

    private void Btn1_JF002_S1_RHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1_JF002_S1_RHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn1_JF002_S1_RHActionPerformed

    private void Btn1_JF002_S1_RHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn1_JF002_S1_RHMouseClicked

    }//GEN-LAST:event_Btn1_JF002_S1_RHMouseClicked

    private void PassField_Contraseña_JF002_S1_RHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassField_Contraseña_JF002_S1_RHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassField_Contraseña_JF002_S1_RHActionPerformed

    private void TxtID_JF002_S1_RH3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtID_JF002_S1_RH3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtID_JF002_S1_RH3ActionPerformed

    private void TxtUsuario_JF002_S1_RH2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuario_JF002_S1_RH2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuario_JF002_S1_RH2ActionPerformed

    private void TxtNombre_JF002_S1_RHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombre_JF002_S1_RHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombre_JF002_S1_RHActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn1_JF002_S1_RH;
    private javax.swing.JButton Btn2_JF002_S1_RH;
    private javax.swing.JPanel JP001_S1_RH;
    private javax.swing.JPasswordField PassField_ConfirmarContra_JF002_S1_RH;
    private javax.swing.JPasswordField PassField_Contraseña_JF002_S1_RH;
    private javax.swing.JTextField TxtID_JF002_S1_RH3;
    private javax.swing.JTextField TxtNombre_JF002_S1_RH;
    private javax.swing.JTextField TxtUsuario_JF002_S1_RH2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
