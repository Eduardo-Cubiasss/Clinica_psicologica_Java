/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import Database.Contactos;
import Database.Procesos_almacenados;
import Database.Usuarios;
import ux.ValidarCorreo;

/**
 *
 * @author LENOVO
 */
public class JF003_S1_RH extends javax.swing.JFrame {

    /**
     * Creates new form JF003_S1_RH
     */
    public JF003_S1_RH() {
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
        TxtCorreoRegister_JF003_S1_RH = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Btn1_JF003_S1_RH = new javax.swing.JButton();
        btn3_JF003_S1_RH = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Btn2_JF003_S1_RH = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 102, 102));
        kGradientPanel1.setkGradientFocus(50);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 204, 204));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MINDLINK");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html>\nBienvenido a la mejor experiencia\n<br>\n\n\n\n");

        JP001_S1_RH.setBackground(new java.awt.Color(255, 255, 255));
        JP001_S1_RH.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JP001_S1_RH.setForeground(new java.awt.Color(0, 102, 102));
        JP001_S1_RH.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        TxtCorreoRegister_JF003_S1_RH.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        TxtCorreoRegister_JF003_S1_RH.setForeground(new java.awt.Color(153, 153, 153));
        TxtCorreoRegister_JF003_S1_RH.setText("Correo electrónico registrado");
        TxtCorreoRegister_JF003_S1_RH.setToolTipText("");
        TxtCorreoRegister_JF003_S1_RH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        TxtCorreoRegister_JF003_S1_RH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TxtCorreoRegister_JF003_S1_RH.setDoubleBuffered(true);
        TxtCorreoRegister_JF003_S1_RH.setDragEnabled(true);
        TxtCorreoRegister_JF003_S1_RH.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        TxtCorreoRegister_JF003_S1_RH.setSelectionColor(new java.awt.Color(0, 0, 0));
        TxtCorreoRegister_JF003_S1_RH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCorreoRegister_JF003_S1_RHActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("RECUPERA TU CONTRASEÑA");

        Btn1_JF003_S1_RH.setBackground(new java.awt.Color(255, 255, 255));
        Btn1_JF003_S1_RH.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Btn1_JF003_S1_RH.setForeground(new java.awt.Color(255, 255, 255));
        Btn1_JF003_S1_RH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnIngresar2.png"))); // NOI18N
        Btn1_JF003_S1_RH.setText("Ingresar");
        Btn1_JF003_S1_RH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 50, true));
        Btn1_JF003_S1_RH.setBorderPainted(false);
        Btn1_JF003_S1_RH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn1_JF003_S1_RH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1_JF003_S1_RHActionPerformed(evt);
            }
        });

        btn3_JF003_S1_RH.setBackground(new java.awt.Color(255, 255, 255));
        btn3_JF003_S1_RH.setForeground(new java.awt.Color(0, 102, 102));
        btn3_JF003_S1_RH.setText("¿Quieres probar otro método de recuperación?");
        btn3_JF003_S1_RH.setBorder(null);
        btn3_JF003_S1_RH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("<html> Sigue las siguientes indicaciones para recuperar tu contraseña <br>    ");

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Elige el correo con el que te asociaste");

        Btn2_JF003_S1_RH.setBackground(new java.awt.Color(255, 255, 255));
        Btn2_JF003_S1_RH.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Btn2_JF003_S1_RH.setForeground(new java.awt.Color(255, 255, 255));
        Btn2_JF003_S1_RH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Registrarse2.png"))); // NOI18N
        Btn2_JF003_S1_RH.setText("Registrarse");
        Btn2_JF003_S1_RH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Btn2_JF003_S1_RH.setBorderPainted(false);
        Btn2_JF003_S1_RH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn2_JF003_S1_RH.setInheritsPopupMenu(true);

        javax.swing.GroupLayout JP001_S1_RHLayout = new javax.swing.GroupLayout(JP001_S1_RH);
        JP001_S1_RH.setLayout(JP001_S1_RHLayout);
        JP001_S1_RHLayout.setHorizontalGroup(
            JP001_S1_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP001_S1_RHLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(JP001_S1_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP001_S1_RHLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP001_S1_RHLayout.createSequentialGroup()
                        .addComponent(btn3_JF003_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP001_S1_RHLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(JP001_S1_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP001_S1_RHLayout.createSequentialGroup()
                        .addGroup(JP001_S1_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JP001_S1_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(TxtCorreoRegister_JF003_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP001_S1_RHLayout.createSequentialGroup()
                        .addGroup(JP001_S1_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Btn1_JF003_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn2_JF003_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(130, 130, 130))))
        );
        JP001_S1_RHLayout.setVerticalGroup(
            JP001_S1_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP001_S1_RHLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtCorreoRegister_JF003_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Btn1_JF003_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn2_JF003_S1_RH)
                .addGap(27, 27, 27)
                .addComponent(btn3_JF003_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogitoGrande.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(124, 124, 124)))
                .addComponent(JP001_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(JP001_S1_RH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtCorreoRegister_JF003_S1_RHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCorreoRegister_JF003_S1_RHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCorreoRegister_JF003_S1_RHActionPerformed

    private void Btn1_JF003_S1_RHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1_JF003_S1_RHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn1_JF003_S1_RHActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Contactos ModelContactos = new Contactos();
                JF003_S1_RH vistaJF003 = new JF003_S1_RH();
                Procesos_almacenados Procesos = new Procesos_almacenados();
                ValidarCorreo Validar = new ValidarCorreo(ModelContactos, vistaJF003, Procesos);
                vistaJF003.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn1_JF003_S1_RH;
    public javax.swing.JButton Btn2_JF003_S1_RH;
    private javax.swing.JPanel JP001_S1_RH;
    public javax.swing.JTextField TxtCorreoRegister_JF003_S1_RH;
    private javax.swing.JButton btn3_JF003_S1_RH;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
