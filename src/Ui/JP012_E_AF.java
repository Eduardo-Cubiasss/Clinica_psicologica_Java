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
public class JP012_E_AF extends javax.swing.JPanel {

    /**
     * Creates new form JP012_E_AF
     */
    public JP012_E_AF() {
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
        jPanel3 = new javax.swing.JPanel();
        btn3_JF012E = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn1_JF012_E = new javax.swing.JButton();
        btn2_JF012_E = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1120, 540));
        setMinimumSize(new java.awt.Dimension(1120, 540));
        setPreferredSize(new java.awt.Dimension(1120, 540));
        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1120, 540));
        jPanel1.setMinimumSize(new java.awt.Dimension(1120, 540));
        jPanel1.setPreferredSize(new java.awt.Dimension(1120, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(200, 232, 232));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 1120, 50));

        btn3_JF012E.setBackground(new java.awt.Color(255, 255, 255));
        btn3_JF012E.setForeground(new java.awt.Color(255, 255, 255));
        btn3_JF012E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Vector.png"))); // NOI18N
        btn3_JF012E.setBorderPainted(false);
        jPanel1.add(btn3_JF012E, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/log.PNG"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 170, 90));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("¿Esta seguro que desea eliminar al usuario?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        btn1_JF012_E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Y.PNG"))); // NOI18N
        jPanel1.add(btn1_JF012_E, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 130, 120));

        btn2_JF012_E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.PNG"))); // NOI18N
        jPanel1.add(btn2_JF012_E, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 120, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ddd.PNG"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 570, 310));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/li.PNG"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 580, 40));

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn1_JF012_E;
    public javax.swing.JButton btn2_JF012_E;
    public javax.swing.JButton btn3_JF012E;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
