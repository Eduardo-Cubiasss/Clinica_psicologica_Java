/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

/**
 *
 * @author LENOVO
 */
public class JF025_S3_RH extends javax.swing.JFrame {

    /**
     * Creates new form JF025_S3_RH
     */
    public JF025_S3_RH() {
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
        jLabel3 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Btn1_JF025_S3_RH = new javax.swing.JButton();
        TxtDescrip_JF025_S3_RH = new javax.swing.JTextField();
        TxtContraNueva_JF025_S3_RH = new javax.swing.JTextField();
        TxtContraseñaActual_JF025_S3_RH = new javax.swing.JTextField();
        btn03_JF025_S3_RH = new javax.swing.JButton();
        btn05_JF025_S3_RH = new javax.swing.JButton();
        btn02_JF025_S3_RH = new javax.swing.JButton();
        btn04_JF025_S3_RH = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        JP02_Firma_JF025_S3_RH = new javax.swing.JPanel();
        JP01_Foto_JF025_S3_RH = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("Detalles de mi perfil");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 970, 40));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Cambiar contraseña");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Acerca de mi");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/log.PNG"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 170, 90));

        Btn1_JF025_S3_RH.setBackground(new java.awt.Color(255, 255, 255));
        Btn1_JF025_S3_RH.setForeground(new java.awt.Color(255, 255, 255));
        Btn1_JF025_S3_RH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Vector (1).png"))); // NOI18N
        Btn1_JF025_S3_RH.setBorderPainted(false);
        Btn1_JF025_S3_RH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(Btn1_JF025_S3_RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 80));

        TxtDescrip_JF025_S3_RH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        TxtDescrip_JF025_S3_RH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDescrip_JF025_S3_RHActionPerformed(evt);
            }
        });
        jPanel1.add(TxtDescrip_JF025_S3_RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 380, 180));

        TxtContraNueva_JF025_S3_RH.setForeground(new java.awt.Color(153, 153, 153));
        TxtContraNueva_JF025_S3_RH.setText("Nueva contraseña");
        TxtContraNueva_JF025_S3_RH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(TxtContraNueva_JF025_S3_RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 330, 40));

        TxtContraseñaActual_JF025_S3_RH.setForeground(new java.awt.Color(153, 153, 153));
        TxtContraseñaActual_JF025_S3_RH.setText("Contraseña actual");
        TxtContraseñaActual_JF025_S3_RH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(TxtContraseñaActual_JF025_S3_RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 330, 40));

        btn03_JF025_S3_RH.setBackground(new java.awt.Color(255, 255, 255));
        btn03_JF025_S3_RH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EditPencil.png"))); // NOI18N
        btn03_JF025_S3_RH.setBorderPainted(false);
        jPanel1.add(btn03_JF025_S3_RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 50, 50));

        btn05_JF025_S3_RH.setBackground(new java.awt.Color(255, 255, 255));
        btn05_JF025_S3_RH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizarNegro.png"))); // NOI18N
        btn05_JF025_S3_RH.setBorderPainted(false);
        jPanel1.add(btn05_JF025_S3_RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, 80, 50));

        btn02_JF025_S3_RH.setBackground(new java.awt.Color(255, 255, 255));
        btn02_JF025_S3_RH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EditPencil.png"))); // NOI18N
        btn02_JF025_S3_RH.setBorderPainted(false);
        btn02_JF025_S3_RH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn02_JF025_S3_RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 50, 50));

        btn04_JF025_S3_RH.setBackground(new java.awt.Color(255, 255, 255));
        btn04_JF025_S3_RH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/+Negro.png"))); // NOI18N
        btn04_JF025_S3_RH.setBorderPainted(false);
        jPanel1.add(btn04_JF025_S3_RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 80, 50));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setText("Descripción");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, -1, -1));

        JP02_Firma_JF025_S3_RH.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout JP02_Firma_JF025_S3_RHLayout = new javax.swing.GroupLayout(JP02_Firma_JF025_S3_RH);
        JP02_Firma_JF025_S3_RH.setLayout(JP02_Firma_JF025_S3_RHLayout);
        JP02_Firma_JF025_S3_RHLayout.setHorizontalGroup(
            JP02_Firma_JF025_S3_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        JP02_Firma_JF025_S3_RHLayout.setVerticalGroup(
            JP02_Firma_JF025_S3_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(JP02_Firma_JF025_S3_RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 210, 50));

        JP01_Foto_JF025_S3_RH.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout JP01_Foto_JF025_S3_RHLayout = new javax.swing.GroupLayout(JP01_Foto_JF025_S3_RH);
        JP01_Foto_JF025_S3_RH.setLayout(JP01_Foto_JF025_S3_RHLayout);
        JP01_Foto_JF025_S3_RHLayout.setHorizontalGroup(
            JP01_Foto_JF025_S3_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        JP01_Foto_JF025_S3_RHLayout.setVerticalGroup(
            JP01_Foto_JF025_S3_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        jPanel1.add(JP01_Foto_JF025_S3_RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 210, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtDescrip_JF025_S3_RHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDescrip_JF025_S3_RHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDescrip_JF025_S3_RHActionPerformed

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
            java.util.logging.Logger.getLogger(JF025_S3_RH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF025_S3_RH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF025_S3_RH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF025_S3_RH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF025_S3_RH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn1_JF025_S3_RH;
    private javax.swing.JPanel JP01_Foto_JF025_S3_RH;
    private javax.swing.JPanel JP02_Firma_JF025_S3_RH;
    private javax.swing.JTextField TxtContraNueva_JF025_S3_RH;
    private javax.swing.JTextField TxtContraseñaActual_JF025_S3_RH;
    private javax.swing.JTextField TxtDescrip_JF025_S3_RH;
    private javax.swing.JButton btn02_JF025_S3_RH;
    private javax.swing.JButton btn03_JF025_S3_RH;
    private javax.swing.JButton btn04_JF025_S3_RH;
    private javax.swing.JButton btn05_JF025_S3_RH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
