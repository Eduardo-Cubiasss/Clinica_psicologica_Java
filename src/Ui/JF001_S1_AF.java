/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;
import Database.Procesos_almacenados;
import Database.Usuarios;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import ux.Abrirvistas;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import ux.Login;

/**
 *
 * @author 50369
 */
public class JF001_S1_AF extends javax.swing.JFrame {
    private String UserName;
    private String Contraseña;
    JFrame ventanaActual = (JFrame) SwingUtilities.getWindowAncestor(this);
    public JF001_S1_AF() {
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

        jLabel4 = new javax.swing.JLabel();
        JP001_S1_AF = new javax.swing.JPanel();
        TxtUsuario_JF001_S1_AF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Btn2_JF001_S1_AF = new javax.swing.JButton();
        btn4_JF001_S1_AF = new javax.swing.JButton();
        btn3_JF001_S1_AF = new javax.swing.JButton();
        Pass_JF001_S1_AF = new javax.swing.JPasswordField();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel4.setText("“Cuando no somos capaces ya de cambiar una situación, nos enfrentamos al reto de cambiar nosotros mismos”");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        setExtendedState(6);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JP001_S1_AF.setBackground(new java.awt.Color(255, 255, 255));
        JP001_S1_AF.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 102, 102)));
        JP001_S1_AF.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        JP001_S1_AF.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtUsuario_JF001_S1_AF.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        TxtUsuario_JF001_S1_AF.setText("Usuario");
        TxtUsuario_JF001_S1_AF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        TxtUsuario_JF001_S1_AF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TxtUsuario_JF001_S1_AF.setSelectionColor(new java.awt.Color(0, 0, 0));
        TxtUsuario_JF001_S1_AF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuario_JF001_S1_AFActionPerformed(evt);
            }
        });
        JP001_S1_AF.add(TxtUsuario_JF001_S1_AF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 400, 40));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Iniciar Sesión");
        JP001_S1_AF.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 140, 30));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Contraseña");
        JP001_S1_AF.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        Btn2_JF001_S1_AF.setBackground(new java.awt.Color(255, 255, 255));
        Btn2_JF001_S1_AF.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Btn2_JF001_S1_AF.setForeground(new java.awt.Color(255, 255, 255));
        Btn2_JF001_S1_AF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnIngresarClari.png"))); // NOI18N
        Btn2_JF001_S1_AF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 50, true));
        Btn2_JF001_S1_AF.setBorderPainted(false);
        Btn2_JF001_S1_AF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn2_JF001_S1_AF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn2_JF001_S1_AFMouseClicked(evt);
            }
        });
        Btn2_JF001_S1_AF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2_JF001_S1_AFActionPerformed(evt);
            }
        });
        JP001_S1_AF.add(Btn2_JF001_S1_AF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 220, 40));

        btn4_JF001_S1_AF.setBackground(new java.awt.Color(255, 255, 255));
        btn4_JF001_S1_AF.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        btn4_JF001_S1_AF.setForeground(new java.awt.Color(0, 102, 102));
        btn4_JF001_S1_AF.setText("¿Se te ha olvidado la contraseña?");
        btn4_JF001_S1_AF.setBorderPainted(false);
        btn4_JF001_S1_AF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4_JF001_S1_AFActionPerformed(evt);
            }
        });
        JP001_S1_AF.add(btn4_JF001_S1_AF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 210, 20));

        btn3_JF001_S1_AF.setBackground(new java.awt.Color(255, 255, 255));
        btn3_JF001_S1_AF.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btn3_JF001_S1_AF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnRegisterAdmin.png"))); // NOI18N
        btn3_JF001_S1_AF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn3_JF001_S1_AF.setBorderPainted(false);
        btn3_JF001_S1_AF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3_JF001_S1_AF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3_JF001_S1_AFActionPerformed(evt);
            }
        });
        JP001_S1_AF.add(btn3_JF001_S1_AF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 290, 33));

        Pass_JF001_S1_AF.setText("Contraseña");
        Pass_JF001_S1_AF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Pass_JF001_S1_AF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pass_JF001_S1_AFActionPerformed(evt);
            }
        });
        JP001_S1_AF.add(Pass_JF001_S1_AF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 400, 40));

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 102, 102));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("Bienvenido a la experiencia con");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogitoGrande.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel3)
                .addGap(49, 49, 49)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        JP001_S1_AF.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 470, 590));

        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("“Cuando no somos capaces ya de cambiar una situación, ");
        JP001_S1_AF.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, -1, 30));

        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText(" nos enfrentamos al reto de cambiar nosotros mismos”");
        JP001_S1_AF.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 310, -1));

        getContentPane().add(JP001_S1_AF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtUsuario_JF001_S1_AFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuario_JF001_S1_AFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuario_JF001_S1_AFActionPerformed

    private void btn3_JF001_S1_AFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3_JF001_S1_AFActionPerformed
        
        
    }//GEN-LAST:event_btn3_JF001_S1_AFActionPerformed

    private void Pass_JF001_S1_AFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pass_JF001_S1_AFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pass_JF001_S1_AFActionPerformed

    private void Btn2_JF001_S1_AFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2_JF001_S1_AFActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_Btn2_JF001_S1_AFActionPerformed

    private void btn4_JF001_S1_AFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4_JF001_S1_AFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn4_JF001_S1_AFActionPerformed

    private void Btn2_JF001_S1_AFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn2_JF001_S1_AFMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_Btn2_JF001_S1_AFMouseClicked

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
            java.util.logging.Logger.getLogger(JF001_S1_AF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF001_S1_AF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF001_S1_AF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF001_S1_AF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                Usuarios modelUsers = new Usuarios();
                Procesos_almacenados Procesos = new Procesos_almacenados();
                JF001_S1_AF vistaJF001 = new JF001_S1_AF();
                System.out.println("Antes de que se ejecute controlador");
                Login Logear = new Login(modelUsers, vistaJF001, Procesos);
                System.out.println("Dejpue");
                vistaJF001.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn2_JF001_S1_AF;
    private javax.swing.JPanel JP001_S1_AF;
    public javax.swing.JPasswordField Pass_JF001_S1_AF;
    public javax.swing.JTextField TxtUsuario_JF001_S1_AF;
    public javax.swing.JButton btn3_JF001_S1_AF;
    private javax.swing.JButton btn4_JF001_S1_AF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
