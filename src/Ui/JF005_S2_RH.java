/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

/**
 *
 * @author allan
 */
public class JF005_S2_RH extends javax.swing.JFrame {

    /**
     * Creates new form JF004_S2_RH
     */
    public JF005_S2_RH() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JP001_S1_RH = new javax.swing.JPanel();
        TxtTelefonoRegister_JF005_S2_RH = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtCodigoTel_JF005_S2_RH = new javax.swing.JTextField();
        PassField_ConfirmarContra_JF005_S2_RH = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        Btn2_JF005_S2_RH = new javax.swing.JButton();
        Btn1_JF005_S2_RH = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 102, 102));
        kGradientPanel1.setkGradientFocus(50);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MINDLINK");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 247, 65));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html>\nBienvenido a la mejor experiencia\n<br>\n\n\n\n");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        JP001_S1_RH.setBackground(new java.awt.Color(255, 255, 255));
        JP001_S1_RH.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JP001_S1_RH.setForeground(new java.awt.Color(0, 102, 102));
        JP001_S1_RH.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        TxtTelefonoRegister_JF005_S2_RH.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        TxtTelefonoRegister_JF005_S2_RH.setForeground(new java.awt.Color(153, 153, 153));
        TxtTelefonoRegister_JF005_S2_RH.setText("Número de telefono registrado");
        TxtTelefonoRegister_JF005_S2_RH.setToolTipText("");
        TxtTelefonoRegister_JF005_S2_RH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        TxtTelefonoRegister_JF005_S2_RH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TxtTelefonoRegister_JF005_S2_RH.setDoubleBuffered(true);
        TxtTelefonoRegister_JF005_S2_RH.setDragEnabled(true);
        TxtTelefonoRegister_JF005_S2_RH.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        TxtTelefonoRegister_JF005_S2_RH.setSelectionColor(new java.awt.Color(0, 0, 0));
        TxtTelefonoRegister_JF005_S2_RH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTelefonoRegister_JF005_S2_RHActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("RECUPERA TU CONTRASEÑA");

        TxtCodigoTel_JF005_S2_RH.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        TxtCodigoTel_JF005_S2_RH.setForeground(new java.awt.Color(153, 153, 153));
        TxtCodigoTel_JF005_S2_RH.setText("Código enviado a tu número de telefono");
        TxtCodigoTel_JF005_S2_RH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        TxtCodigoTel_JF005_S2_RH.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TxtCodigoTel_JF005_S2_RH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodigoTel_JF005_S2_RHActionPerformed(evt);
            }
        });

        PassField_ConfirmarContra_JF005_S2_RH.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        PassField_ConfirmarContra_JF005_S2_RH.setForeground(new java.awt.Color(153, 153, 153));
        PassField_ConfirmarContra_JF005_S2_RH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        PassField_ConfirmarContra_JF005_S2_RH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PassField_ConfirmarContra_JF005_S2_RH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassField_ConfirmarContra_JF005_S2_RHActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Confirmar nueva contraseña");

        Btn2_JF005_S2_RH.setBackground(new java.awt.Color(255, 255, 255));
        Btn2_JF005_S2_RH.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Btn2_JF005_S2_RH.setForeground(new java.awt.Color(255, 255, 255));
        Btn2_JF005_S2_RH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Registrarse2.png"))); // NOI18N
        Btn2_JF005_S2_RH.setText("Registrarse");
        Btn2_JF005_S2_RH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Btn2_JF005_S2_RH.setBorderPainted(false);
        Btn2_JF005_S2_RH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn2_JF005_S2_RH.setInheritsPopupMenu(true);

        Btn1_JF005_S2_RH.setBackground(new java.awt.Color(255, 255, 255));
        Btn1_JF005_S2_RH.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Btn1_JF005_S2_RH.setForeground(new java.awt.Color(255, 255, 255));
        Btn1_JF005_S2_RH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnIngresar2.png"))); // NOI18N
        Btn1_JF005_S2_RH.setText("Ingresar");
        Btn1_JF005_S2_RH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 50, true));
        Btn1_JF005_S2_RH.setBorderPainted(false);
        Btn1_JF005_S2_RH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn1_JF005_S2_RH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1_JF005_S2_RHActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(0, 102, 102));
        jButton3.setText("¿Quieres probar otro método de recuperación?");
        jButton3.setBorder(null);

        javax.swing.GroupLayout JP001_S1_RHLayout = new javax.swing.GroupLayout(JP001_S1_RH);
        JP001_S1_RH.setLayout(JP001_S1_RHLayout);
        JP001_S1_RHLayout.setHorizontalGroup(
            JP001_S1_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP001_S1_RHLayout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 101, Short.MAX_VALUE))
            .addGroup(JP001_S1_RHLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(JP001_S1_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtTelefonoRegister_JF005_S2_RH)
                    .addComponent(jLabel10)
                    .addComponent(TxtCodigoTel_JF005_S2_RH, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .addComponent(PassField_ConfirmarContra_JF005_S2_RH))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP001_S1_RHLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JP001_S1_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP001_S1_RHLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP001_S1_RHLayout.createSequentialGroup()
                        .addGroup(JP001_S1_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Btn2_JF005_S2_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn1_JF005_S2_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(118, 118, 118))))
        );
        JP001_S1_RHLayout.setVerticalGroup(
            JP001_S1_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP001_S1_RHLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel4)
                .addGap(46, 46, 46)
                .addComponent(TxtTelefonoRegister_JF005_S2_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(TxtCodigoTel_JF005_S2_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PassField_ConfirmarContra_JF005_S2_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Btn1_JF005_S2_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn2_JF005_S2_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        kGradientPanel1.add(JP001_S1_RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, -10, 450, 620));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logitooo 2 (1).png"))); // NOI18N
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 450, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtTelefonoRegister_JF005_S2_RHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTelefonoRegister_JF005_S2_RHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTelefonoRegister_JF005_S2_RHActionPerformed

    private void TxtCodigoTel_JF005_S2_RHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodigoTel_JF005_S2_RHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodigoTel_JF005_S2_RHActionPerformed

    private void PassField_ConfirmarContra_JF005_S2_RHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassField_ConfirmarContra_JF005_S2_RHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassField_ConfirmarContra_JF005_S2_RHActionPerformed

    private void Btn1_JF005_S2_RHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1_JF005_S2_RHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn1_JF005_S2_RHActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JF005_S2_RH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF005_S2_RH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF005_S2_RH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF005_S2_RH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF005_S2_RH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn1_JF005_S2_RH;
    private javax.swing.JButton Btn2_JF005_S2_RH;
    private javax.swing.JPanel JP001_S1_RH;
    private javax.swing.JPasswordField PassField_ConfirmarContra_JF005_S2_RH;
    private javax.swing.JTextField TxtCodigoTel_JF005_S2_RH;
    private javax.swing.JTextField TxtTelefonoRegister_JF005_S2_RH;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
