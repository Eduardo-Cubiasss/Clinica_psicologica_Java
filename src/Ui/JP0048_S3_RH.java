/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import ux.Login;
import ux.PanelesInicializador;
import ux.primer_uso;




public class JP0048_S3_RH extends javax.swing.JPanel {
    
     private primer_uso controlador; 
    private PanelesInicializador str;
 
    
    public void setTxtCorreoElectronico_jp0048_RH(String texto) {
        txtCorreoElectronico_jp0048_RH.setText(texto);
    }

    // Setter para el campo de texto txtActiLabo_JP0048
    public void setTxtActiLabo_JP0048(String texto) {
        txtActiLabo_JP0048.setText(texto);
    }

    // Setter para el campo de texto txtNumTel_JP0048
    public void setTxtNumTel_JP0048(String texto) {
        txtNumTel_JP0048.setText(texto);
    }

    // Setter para el campo de texto txtFechaNa_JP0048
    public void setTxtFechaNa_JP0048(String texto) {
        txtFechaNa_JP0048.setText(texto);
    }

    // Setter para el campo de texto txtDui_JP0048
    public void setTxtDui_JP0048(String texto) {
        txtDui_JP0048.setText(texto);
    }
     public JTextField getTxtCorreoElectronico_jp0048_RH() {
        return txtCorreoElectronico_jp0048_RH;
    }

    public JTextField getTxtNumTel_JP0048() {
        return txtNumTel_JP0048;
    }

    public JTextField getTxtDui_JP0048() {
        return txtDui_JP0048;
    }

    public JTextField getTxtActiLabo_JP0048() {
        return txtActiLabo_JP0048;
    }

    public JTextField getTxtFechaNa_JP0048() {
        return txtFechaNa_JP0048;
    }

    public JComboBox getJComboBox1() {
        return CmbxGenero;
    }

    public JButton getbtnOmitir() {
        return btnOmitir;
    }
    
    public JButton getbtnEmpecemos() {
        return btnEmpecemos;
    }

    public JButton getBtn02_JF048_S3_RH() {
        return btn02_JF048_S3_RH;
    }
     
    public JP0048_S3_RH(primer_uso controlador) {
        this.controlador = controlador;
        str = new PanelesInicializador();
        initComponents();
        
        // Establecer el valor de str aquí después de haberlo creado
        str.setJP0048_S3_RH(this);
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
        CmbxGenero = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCorreoElectronico_jp0048_RH = new javax.swing.JTextField();
        txtActiLabo_JP0048 = new javax.swing.JTextField();
        txtNumTel_JP0048 = new javax.swing.JTextField();
        txtFechaNa_JP0048 = new javax.swing.JTextField();
        txtDui_JP0048 = new javax.swing.JTextField();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        btn02_JF048_S3_RH = new javax.swing.JButton();
        btnOmitir = new javax.swing.JButton();
        btnEmpecemos = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1120, 540));
        setMinimumSize(new java.awt.Dimension(1120, 540));
        setPreferredSize(new java.awt.Dimension(1120, 540));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        CmbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Genero", "Masculino", "Femenino", "Prefiero no decirlo", " ", " " }));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/log.PNG"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("Antes de empezar necesitamos cierta ");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("información para mejorar nuestros servicios");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Llena todos los campos del formulario, nos servirá más adelante");

        txtCorreoElectronico_jp0048_RH.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtCorreoElectronico_jp0048_RH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoElectronico_jp0048_RHActionPerformed(evt);
            }
        });

        txtActiLabo_JP0048.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtActiLabo_JP0048.setToolTipText("");

        txtNumTel_JP0048.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtFechaNa_JP0048.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtDui_JP0048.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        kGradientPanel2.setkEndColor(new java.awt.Color(0, 153, 153));
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 153, 153));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn02_JF048_S3_RH.setBackground(new java.awt.Color(0, 153, 153));
        btn02_JF048_S3_RH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/log out.png"))); // NOI18N
        btn02_JF048_S3_RH.setBorderPainted(false);
        kGradientPanel2.add(btn02_JF048_S3_RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 165, -1));

        btnOmitir.setBackground(new java.awt.Color(255, 255, 255));
        btnOmitir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.PNG"))); // NOI18N
        btnOmitir.setBorderPainted(false);
        btnOmitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOmitirActionPerformed(evt);
            }
        });

        btnEmpecemos.setBackground(new java.awt.Color(255, 255, 255));
        btnEmpecemos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnEmpecemos.png"))); // NOI18N
        btnEmpecemos.setBorderPainted(false);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Correo Electrónico");

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel12.setText("Fecha de nacimiento");

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel13.setText("Dui");

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel14.setText("Número Telefónico");

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel15.setText("Actividad Laboral");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnOmitir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(243, 243, 243))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(283, 283, 283))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(260, 260, 260)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtDui_JP0048)
                                .addComponent(txtCorreoElectronico_jp0048_RH, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFechaNa_JP0048, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(158, 158, 158)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtActiLabo_JP0048)
                                .addComponent(txtNumTel_JP0048)
                                .addComponent(CmbxGenero, 0, 301, Short.MAX_VALUE))
                            .addComponent(jLabel15)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(424, 424, 424)
                        .addComponent(btnEmpecemos, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnOmitir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtActiLabo_JP0048, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtCorreoElectronico_jp0048_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel10)
                        .addGap(8, 8, 8)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFechaNa_JP0048, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumTel_JP0048, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDui_JP0048, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(btnEmpecemos, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoElectronico_jp0048_RHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoElectronico_jp0048_RHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoElectronico_jp0048_RHActionPerformed

    private void btnOmitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOmitirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOmitirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> CmbxGenero;
    public javax.swing.JButton btn02_JF048_S3_RH;
    public javax.swing.JButton btnEmpecemos;
    public javax.swing.JButton btnOmitir;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public keeptoo.KGradientPanel kGradientPanel2;
    public javax.swing.JTextField txtActiLabo_JP0048;
    public javax.swing.JTextField txtCorreoElectronico_jp0048_RH;
    public javax.swing.JTextField txtDui_JP0048;
    public javax.swing.JTextField txtFechaNa_JP0048;
    public javax.swing.JTextField txtNumTel_JP0048;
    // End of variables declaration//GEN-END:variables
}
