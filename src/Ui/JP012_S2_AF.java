/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import ux.BuscadorEmpleados;
import ux.PanelesInicializador;

/**
 *
 * @author LENOVO
 */
public class JP012_S2_AF extends javax.swing.JPanel {

  
    private BuscadorEmpleados controlador;
    private PanelesInicializador str;

    public JP012_S2_AF(BuscadorEmpleados controlador) {
        initComponents();
        this.controlador = controlador;
        
        str = new PanelesInicializador();
        
         // Establecer el valor de str aquí después de haberlo creado
        str.setJP012_S2_AF(this);
    }
    
    
    
    
    public JP012_S2_AF() {
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
        btn3_JF012 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn1_JF012 = new javax.swing.JButton();
        btn2_JF012 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(1120, 540));
        setMinimumSize(new java.awt.Dimension(1120, 540));
        setPreferredSize(new java.awt.Dimension(1120, 540));
        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1120, 540));
        jPanel1.setMinimumSize(new java.awt.Dimension(1120, 540));
        jPanel1.setPreferredSize(new java.awt.Dimension(1120, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn3_JF012.setBackground(new java.awt.Color(255, 255, 255));
        btn3_JF012.setForeground(new java.awt.Color(255, 255, 255));
        btn3_JF012.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Vector.png"))); // NOI18N
        btn3_JF012.setBorderPainted(false);
        jPanel1.add(btn3_JF012, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/log.PNG"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 170, 90));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Escribe el nombre o ID del empleado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        jTable1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Sánchez Cerén"}
            },
            new String [] {
                "Sara Herrera"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 450, 40));

        btn1_JF012.setBackground(new java.awt.Color(255, 255, 255));
        btn1_JF012.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ph_note-pencil-bold.png"))); // NOI18N
        btn1_JF012.setBorderPainted(false);
        jPanel1.add(btn1_JF012, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, -1, -1));

        btn2_JF012.setBackground(new java.awt.Color(255, 255, 255));
        btn2_JF012.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pe.PNG"))); // NOI18N
        btn2_JF012.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_JF012ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2_JF012, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 47, 61));

        jPanel2.setBackground(new java.awt.Color(200, 232, 232));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 1120, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a.PNG"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 40, 40));

        jTextField1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jTextField1.setText("          S");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 420, 50));

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn2_JF012ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2_JF012ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2_JF012ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn1_JF012;
    public javax.swing.JButton btn2_JF012;
    public javax.swing.JButton btn3_JF012;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
