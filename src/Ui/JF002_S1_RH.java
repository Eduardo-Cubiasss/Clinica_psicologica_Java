package Ui;


public class JF002_S1_RH extends javax.swing.JFrame {

    
    public JF002_S1_RH() {
        initComponents();
       
       
        
        
    }

   
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        kGradientPanel1.setkEndColor(new java.awt.Color(148, 177, 181));
        kGradientPanel1.setkGradientFocus(100);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 102));
        kGradientPanel1.setkTransparentControls(false);
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        Btn1_JF002_S1_RH.setBackground(new java.awt.Color(0, 153, 153));
        Btn1_JF002_S1_RH.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Btn1_JF002_S1_RH.setForeground(new java.awt.Color(255, 255, 255));
        Btn1_JF002_S1_RH.setText("Registrarse");
        Btn1_JF002_S1_RH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Btn1_JF002_S1_RH.setBorderPainted(false);
        Btn1_JF002_S1_RH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn1_JF002_S1_RH.setInheritsPopupMenu(true);

        Btn2_JF002_S1_RH.setBackground(new java.awt.Color(0, 153, 153));
        Btn2_JF002_S1_RH.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Btn2_JF002_S1_RH.setForeground(new java.awt.Color(255, 255, 255));
        Btn2_JF002_S1_RH.setText("Iniciar sesión");
        Btn2_JF002_S1_RH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 50, true));
        Btn2_JF002_S1_RH.setBorderPainted(false);
        Btn2_JF002_S1_RH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JP001_S1_RHLayout = new javax.swing.GroupLayout(JP001_S1_RH);
        JP001_S1_RH.setLayout(JP001_S1_RHLayout);
        JP001_S1_RHLayout.setHorizontalGroup(
            JP001_S1_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP001_S1_RHLayout.createSequentialGroup()
                .addGroup(JP001_S1_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP001_S1_RHLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(Btn1_JF002_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JP001_S1_RHLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(Btn2_JF002_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JP001_S1_RHLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(JP001_S1_RHLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(JP001_S1_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP001_S1_RHLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(427, 427, 427))
                    .addGroup(JP001_S1_RHLayout.createSequentialGroup()
                        .addGroup(JP001_S1_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PassField_Contraseña_JF002_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtUsuario_JF002_S1_RH2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JP001_S1_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel12)
                                .addComponent(jLabel11)
                                .addComponent(jLabel9)
                                .addComponent(jLabel1)
                                .addComponent(PassField_ConfirmarContra_JF002_S1_RH)
                                .addComponent(TxtID_JF002_S1_RH3, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                                .addComponent(TxtNombre_JF002_S1_RH)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        JP001_S1_RHLayout.setVerticalGroup(
            JP001_S1_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP001_S1_RHLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtNombre_JF002_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtUsuario_JF002_S1_RH2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PassField_Contraseña_JF002_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PassField_ConfirmarContra_JF002_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtID_JF002_S1_RH3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Btn1_JF002_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn2_JF002_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel1.add(JP001_S1_RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, -8, 468, 610));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MINDLINK");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 89, 247, 65));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html>\nBienvenido a la mejor experiencia\n<br>\n\n\n\n");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 160, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logitooo 2 (1).png"))); // NOI18N
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 267, 435, 199));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF002_S1_RH().setVisible(true);
            }
        });
    }
    
     

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
