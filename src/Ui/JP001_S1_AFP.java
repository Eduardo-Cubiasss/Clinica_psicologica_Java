/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import keeptoo.KGradientPanel;
import ux.Login;
import ux.PanelesInicializador;
import ux.primer_uso;

/**
 *
 * 
 */
        
public class JP001_S1_AFP extends javax.swing.JPanel {
    
    private Login controlador;
    private primer_uso controlador2; 
    private JP001_S1_AFP panel;
    private PanelesInicializador str;

    public JButton getBtn2_JF001_S1_AF() {
        return Btn2_JF001_S1_AF;
    }

    public void setBtn2_JF001_S1_AF(JButton Btn2_JF001_S1_AF) {
        this.Btn2_JF001_S1_AF = Btn2_JF001_S1_AF;
    }

    public JPasswordField getPass_JF001_S1_AF() {
        return Pass_JF001_S1_AF;
    }

    public void setPass_JF001_S1_AF(JPasswordField Pass_JF001_S1_AF) {
        this.Pass_JF001_S1_AF = Pass_JF001_S1_AF;
    }

    public JTextField getTxtUsuario_JF001_S1_AF() {
        return TxtUsuario_JF001_S1_AF;
    }

    public void setTxtUsuario_JF001_S1_AF(JTextField TxtUsuario_JF001_S1_AF) {
        this.TxtUsuario_JF001_S1_AF = TxtUsuario_JF001_S1_AF;
    }

    public JButton getBtn4_JF001_S1_AF() {
        return btn4_JF001_S1_AF;
    }

    public void setBtn4_JF001_S1_AF(JButton btn4_JF001_S1_AF) {
        this.btn4_JF001_S1_AF = btn4_JF001_S1_AF;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public KGradientPanel getkGradientPanel1() {
        return kGradientPanel1;
    }

    public void setkGradientPanel1(KGradientPanel kGradientPanel1) {
        this.kGradientPanel1 = kGradientPanel1;
    }

    public JPanel getJP001_S1_AF() {
        return JP001_S1_AF;
    }

    public void setJP001_S1_AF(JPanel JP001_S1_AF) {
        this.JP001_S1_AF = JP001_S1_AF;
    }

    public JButton getBtn3_JF001_S1_AF() {
        return btn3_JF001_S1_AF;
    }

    public void setBtn3_JF001_S1_AF(JButton btn3_JF001_S1_AF) {
        this.btn3_JF001_S1_AF = btn3_JF001_S1_AF;
    }
    
    
    
    
    
    
    /**
     * Creates new form JP001_S1_AFP
     */
    public JP001_S1_AFP(Login controlador, primer_uso controlador2) {
        this.controlador = controlador;
        this.controlador2 = controlador2;
        // Crear una instancia de PanelesInicializador
        str = new PanelesInicializador();
        initComponents();
        
        // Establecer el valor de str aquí después de haberlo creado
        str.setJP001_S1_AFP(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP001_S1_AF = new javax.swing.JPanel();
        TxtUsuario_JF001_S1_AF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Btn2_JF001_S1_AF = new javax.swing.JButton();
        btn4_JF001_S1_AF = new javax.swing.JButton();
        btn3_JF001_S1_AF = new javax.swing.JButton();
        Pass_JF001_S1_AF = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1120, 640));
        setMinimumSize(new java.awt.Dimension(1120, 640));
        setPreferredSize(new java.awt.Dimension(1120, 640));
        setLayout(new java.awt.CardLayout());

        JP001_S1_AF.setBackground(new java.awt.Color(255, 255, 255));
        JP001_S1_AF.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        JP001_S1_AF.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        JP001_S1_AF.setMaximumSize(new java.awt.Dimension(1120, 640));
        JP001_S1_AF.setMinimumSize(new java.awt.Dimension(1120, 640));
        JP001_S1_AF.setPreferredSize(new java.awt.Dimension(1120, 640));

        TxtUsuario_JF001_S1_AF.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        TxtUsuario_JF001_S1_AF.setForeground(new java.awt.Color(204, 204, 204));
        TxtUsuario_JF001_S1_AF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        TxtUsuario_JF001_S1_AF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TxtUsuario_JF001_S1_AF.setSelectionColor(new java.awt.Color(0, 0, 0));
        TxtUsuario_JF001_S1_AF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtUsuario_JF001_S1_AFMousePressed(evt);
            }
        });
        TxtUsuario_JF001_S1_AF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuario_JF001_S1_AFActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Iniciar Sesión");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Contraseña");

        Btn2_JF001_S1_AF.setBackground(new java.awt.Color(255, 255, 255));
        Btn2_JF001_S1_AF.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Btn2_JF001_S1_AF.setForeground(new java.awt.Color(255, 255, 255));
        Btn2_JF001_S1_AF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnIngresar3.png"))); // NOI18N
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

        Pass_JF001_S1_AF.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Pass_JF001_S1_AF.setForeground(new java.awt.Color(204, 204, 204));
        Pass_JF001_S1_AF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Pass_JF001_S1_AF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pass_JF001_S1_AFActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("“Cuando no somos capaces ya de cambiar una situación, ");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText(" nos enfrentamos al reto de cambiar nosotros mismos”");

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 102));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogitoGrande.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Usuario");

        javax.swing.GroupLayout JP001_S1_AFLayout = new javax.swing.GroupLayout(JP001_S1_AF);
        JP001_S1_AF.setLayout(JP001_S1_AFLayout);
        JP001_S1_AFLayout.setHorizontalGroup(
            JP001_S1_AFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP001_S1_AFLayout.createSequentialGroup()
                .addGroup(JP001_S1_AFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP001_S1_AFLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btn4_JF001_S1_AF, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JP001_S1_AFLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(JP001_S1_AFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(TxtUsuario_JF001_S1_AF, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pass_JF001_S1_AF, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(JP001_S1_AFLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(JP001_S1_AFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(JP001_S1_AFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn3_JF001_S1_AF)
                                .addGroup(JP001_S1_AFLayout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(Btn2_JF001_S1_AF, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(JP001_S1_AFLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JP001_S1_AFLayout.setVerticalGroup(
            JP001_S1_AFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP001_S1_AFLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel10)
                .addGap(3, 3, 3)
                .addComponent(TxtUsuario_JF001_S1_AF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pass_JF001_S1_AF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn4_JF001_S1_AF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(Btn2_JF001_S1_AF, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn3_JF001_S1_AF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(126, Short.MAX_VALUE))
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(JP001_S1_AF, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void TxtUsuario_JF001_S1_AFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuario_JF001_S1_AFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuario_JF001_S1_AFActionPerformed

    private void Btn2_JF001_S1_AFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn2_JF001_S1_AFMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn2_JF001_S1_AFMouseClicked

    private void Btn2_JF001_S1_AFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2_JF001_S1_AFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn2_JF001_S1_AFActionPerformed

    private void btn4_JF001_S1_AFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4_JF001_S1_AFActionPerformed
        
    }//GEN-LAST:event_btn4_JF001_S1_AFActionPerformed

    private void btn3_JF001_S1_AFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3_JF001_S1_AFActionPerformed

    }//GEN-LAST:event_btn3_JF001_S1_AFActionPerformed

    private void Pass_JF001_S1_AFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pass_JF001_S1_AFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pass_JF001_S1_AFActionPerformed

    private void TxtUsuario_JF001_S1_AFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtUsuario_JF001_S1_AFMousePressed

    
    }//GEN-LAST:event_TxtUsuario_JF001_S1_AFMousePressed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn2_JF001_S1_AF;
    private javax.swing.JPanel JP001_S1_AF;
    public javax.swing.JPasswordField Pass_JF001_S1_AF;
    public javax.swing.JTextField TxtUsuario_JF001_S1_AF;
    public javax.swing.JButton btn3_JF001_S1_AF;
    private javax.swing.JButton btn4_JF001_S1_AF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}

