/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import javax.swing.JButton;
import javax.swing.JTextField;
import ux.BuscadorPacientes;
import ux.PanelesInicializador;
import ux.RcetarMedicamentos;

/**
 *
 * @author LENOVO
 */
public class JP036_S3_AF extends javax.swing.JPanel {

    private RcetarMedicamentos controlador;
    private PanelesInicializador str;

    public JButton getBtnagregar() {
        return btnagregar;
    }

    public void setBtnagregar(JButton btnagregar) {
        this.btnagregar = btnagregar;
    }

    public JButton getjButton1() {
        return btnagregar;
    }

    public void setjButton1(JButton jButton1) {
        this.btnagregar = jButton1;
    }

    public JButton getBtn1_JF036() {
        return btn1_JF036;
    }

    public void setBtn1_JF036(JButton btn1_JF036) {
        this.btn1_JF036 = btn1_JF036;
    }

    public JButton getBtn1_JF37() {
        return btn1_JF37;
    }

    public void setBtn1_JF37(JButton btn1_JF37) {
        this.btn1_JF37 = btn1_JF37;
    }

    public JTextField getTxtBuscar_JP036() {
        return txtBuscar_JP036;
    }

    public void setTxtBuscar_JP036(JTextField txtBuscar_JP036) {
        this.txtBuscar_JP036 = txtBuscar_JP036;
    }

    public JTextField getTxtBuscar_JP37() {
        return txtBuscar_JP37;
    }

    public void setTxtBuscar_JP37(JTextField txtBuscar_JP37) {
        this.txtBuscar_JP37 = txtBuscar_JP37;
    }

    public JTextField getTxtHorario_JP036_S3_AF() {
        return txtHorario_JP036_S3_AF;
    }

    public void setTxtHorario_JP036_S3_AF(JTextField txtHorario_JP036_S3_AF) {
        this.txtHorario_JP036_S3_AF = txtHorario_JP036_S3_AF;
    }

    public JTextField getTxtHorario_JP036_S3_AF1() {
        return txtHorario_JP036_S3_AF1;
    }

    public void setTxtHorario_JP036_S3_AF1(JTextField txtHorario_JP036_S3_AF1) {
        this.txtHorario_JP036_S3_AF1 = txtHorario_JP036_S3_AF1;
    }

    public JTextField getTxtIndicaciones_JP036_S3_AF() {
        return txtIndicaciones_JP036_S3_AF;
    }

    public void setTxtIndicaciones_JP036_S3_AF(JTextField txtIndicaciones_JP036_S3_AF) {
        this.txtIndicaciones_JP036_S3_AF = txtIndicaciones_JP036_S3_AF;
    }

    public JTextField getTxtIndicaciones_JP036_S3_AF1() {
        return txtIndicaciones_JP036_S3_AF1;
    }

    public void setTxtIndicaciones_JP036_S3_AF1(JTextField txtIndicaciones_JP036_S3_AF1) {
        this.txtIndicaciones_JP036_S3_AF1 = txtIndicaciones_JP036_S3_AF1;
    }

    public JTextField getTxtNombreMedicamento_JP036_S3_AF() {
        return txtNombreMedicamento_JP036_S3_AF;
    }

    public void setTxtNombreMedicamento_JP036_S3_AF(JTextField txtNombreMedicamento_JP036_S3_AF) {
        this.txtNombreMedicamento_JP036_S3_AF = txtNombreMedicamento_JP036_S3_AF;
    }

    public JTextField getTxtNombreMedicamento_JP036_S3_AF1() {
        return txtNombreMedicamento_JP036_S3_AF1;
    }

    public void setTxtNombreMedicamento_JP036_S3_AF1(JTextField txtNombreMedicamento_JP036_S3_AF1) {
        this.txtNombreMedicamento_JP036_S3_AF1 = txtNombreMedicamento_JP036_S3_AF1;
    }

    
    public JP036_S3_AF(RcetarMedicamentos controlador) {
        initComponents();
        this.controlador = controlador;
        
        str = new PanelesInicializador();
        
         // Establecer el valor de str aquí después de haberlo creado
        str.setJP036_S3_AF(this);
    }
    public JP036_S3_AF() {
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
        btn3_JF012_A = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreMedicamento_JP036_S3_AF = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtHorario_JP036_S3_AF = new javax.swing.JTextField();
        txtIndicaciones_JP036_S3_AF = new javax.swing.JTextField();
        txtBuscar_JP036 = new javax.swing.JTextField();
        btn1_JF036 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btn3_JF012_A1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreMedicamento_JP036_S3_AF1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtHorario_JP036_S3_AF1 = new javax.swing.JTextField();
        txtIndicaciones_JP036_S3_AF1 = new javax.swing.JTextField();
        txtBuscar_JP37 = new javax.swing.JTextField();
        btn1_JF37 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1120, 640));
        setMinimumSize(new java.awt.Dimension(1120, 640));
        setPreferredSize(new java.awt.Dimension(1120, 640));
        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1120, 640));
        jPanel1.setMinimumSize(new java.awt.Dimension(1120, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(1120, 640));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn3_JF012_A.setBackground(new java.awt.Color(255, 255, 255));
        btn3_JF012_A.setForeground(new java.awt.Color(255, 255, 255));
        btn3_JF012_A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Vector.png"))); // NOI18N
        btn3_JF012_A.setBorderPainted(false);
        jPanel1.add(btn3_JF012_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 21, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/log.PNG"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 170, 90));

        jPanel4.setBackground(new java.awt.Color(200, 232, 232));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(200, 232, 232));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/meds 1.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 180, 180));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 260, 690));

        jPanel2.setBackground(new java.awt.Color(200, 232, 232));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 1120, 40));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Busca un padecimiento, para ver una receta predeterminada");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, -1, -1));
        jPanel1.add(txtNombreMedicamento_JP036_S3_AF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 270, 30));

        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pd.PNG"))); // NOI18N
        jPanel1.add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 130, 110));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setText("Recetar Medicamentos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setText("Descripción");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setText("Medicamento");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));
        jPanel1.add(txtHorario_JP036_S3_AF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 270, 30));

        txtIndicaciones_JP036_S3_AF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIndicaciones_JP036_S3_AFActionPerformed(evt);
            }
        });
        jPanel1.add(txtIndicaciones_JP036_S3_AF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 270, 30));

        txtBuscar_JP036.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txtBuscar_JP036.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscar_JP036ActionPerformed(evt);
            }
        });
        jPanel1.add(txtBuscar_JP036, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, 420, 40));

        btn1_JF036.setBackground(new java.awt.Color(255, 255, 255));
        btn1_JF036.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a.PNG"))); // NOI18N
        btn1_JF036.setBorderPainted(false);
        btn1_JF036.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_JF036ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1_JF036, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 560, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("Nombre del padecimiento");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        add(jPanel1, "card2");

        jPanel3.setMaximumSize(new java.awt.Dimension(1120, 640));
        jPanel3.setMinimumSize(new java.awt.Dimension(1120, 640));
        jPanel3.setPreferredSize(new java.awt.Dimension(1120, 640));
        jPanel3.setLayout(new java.awt.CardLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMaximumSize(new java.awt.Dimension(1120, 540));
        jPanel5.setMinimumSize(new java.awt.Dimension(1120, 540));
        jPanel5.setPreferredSize(new java.awt.Dimension(1120, 540));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn3_JF012_A1.setBackground(new java.awt.Color(255, 255, 255));
        btn3_JF012_A1.setForeground(new java.awt.Color(255, 255, 255));
        btn3_JF012_A1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Vector.png"))); // NOI18N
        btn3_JF012_A1.setBorderPainted(false);
        jPanel5.add(btn3_JF012_A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 21, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/log.PNG"))); // NOI18N
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 170, 90));

        jPanel6.setBackground(new java.awt.Color(200, 232, 232));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(200, 232, 232));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/meds 1.png"))); // NOI18N
        jLabel10.setText("jLabel6");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 180, 180));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 260, 690));

        jPanel7.setBackground(new java.awt.Color(200, 232, 232));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 1120, 40));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("Nombre del medicamento");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        txtNombreMedicamento_JP036_S3_AF1.setText("                                  Aspirina");
        jPanel5.add(txtNombreMedicamento_JP036_S3_AF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 240, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pd.PNG"))); // NOI18N
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, 140, 120));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel11.setText("Recetar Medicamentos");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel12.setText("Horario del medicamento");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel13.setText("Indicaciones generales");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));

        txtHorario_JP036_S3_AF1.setText("                          Cada 8 horas");
        jPanel5.add(txtHorario_JP036_S3_AF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 250, 30));

        txtIndicaciones_JP036_S3_AF1.setText("                          Cada 8 horas");
        txtIndicaciones_JP036_S3_AF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIndicaciones_JP036_S3_AF1ActionPerformed(evt);
            }
        });
        jPanel5.add(txtIndicaciones_JP036_S3_AF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 270, 30));

        txtBuscar_JP37.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txtBuscar_JP37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscar_JP37ActionPerformed(evt);
            }
        });
        jPanel5.add(txtBuscar_JP37, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 420, 40));

        btn1_JF37.setBackground(new java.awt.Color(255, 255, 255));
        btn1_JF37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a.PNG"))); // NOI18N
        btn1_JF37.setBorderPainted(false);
        jPanel5.add(btn1_JF37, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, -1, -1));

        jPanel3.add(jPanel5, "card2");

        add(jPanel3, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void txtIndicaciones_JP036_S3_AFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIndicaciones_JP036_S3_AFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIndicaciones_JP036_S3_AFActionPerformed

    private void txtBuscar_JP036ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscar_JP036ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscar_JP036ActionPerformed

    private void txtIndicaciones_JP036_S3_AF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIndicaciones_JP036_S3_AF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIndicaciones_JP036_S3_AF1ActionPerformed

    private void txtBuscar_JP37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscar_JP37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscar_JP37ActionPerformed

    private void btn1_JF036ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_JF036ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1_JF036ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn1_JF036;
    public javax.swing.JButton btn1_JF37;
    private javax.swing.JButton btn3_JF012_A;
    private javax.swing.JButton btn3_JF012_A1;
    public javax.swing.JButton btnagregar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    public javax.swing.JTextField txtBuscar_JP036;
    public javax.swing.JTextField txtBuscar_JP37;
    private javax.swing.JTextField txtHorario_JP036_S3_AF;
    private javax.swing.JTextField txtHorario_JP036_S3_AF1;
    private javax.swing.JTextField txtIndicaciones_JP036_S3_AF;
    private javax.swing.JTextField txtIndicaciones_JP036_S3_AF1;
    private javax.swing.JTextField txtNombreMedicamento_JP036_S3_AF;
    private javax.swing.JTextField txtNombreMedicamento_JP036_S3_AF1;
    // End of variables declaration//GEN-END:variables
}
