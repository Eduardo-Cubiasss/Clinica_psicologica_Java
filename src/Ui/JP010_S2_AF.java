/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import ux.AgregarPerfilesDeUsuario;
import ux.DetallesDePerfil;
import ux.PanelesInicializador;

/**
 *
 * @author LENOVO
 */
public class JP010_S2_AF extends javax.swing.JPanel {

    private DetallesDePerfil controlador;
    private PanelesInicializador str;

    public JP010_S2_AF(DetallesDePerfil controlador) {
        initComponents();
        this.controlador = controlador;
        
        str = new PanelesInicializador();
        
         // Establecer el valor de str aquí después de haberlo creado
        str.setJP010_S2_AF(this);
    }
    
    
    public JP010_S2_AF() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lb_Nom = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lb_Ape = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lb_eda = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lb_ofi = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lb_dias = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lb_chino = new javax.swing.JLabel();
        btn1_JF010_AF = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1120, 640));
        setMinimumSize(new java.awt.Dimension(1120, 640));
        setPreferredSize(new java.awt.Dimension(1120, 640));
        setLayout(new java.awt.CardLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(1120, 640));
        jPanel1.setMinimumSize(new java.awt.Dimension(1120, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(1120, 640));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(1120, 540));
        jPanel2.setMinimumSize(new java.awt.Dimension(1120, 540));
        jPanel2.setPreferredSize(new java.awt.Dimension(1120, 540));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/log.PNG"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 170, 90));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setText("Detalles de Perfil");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, -1, -1));

        lb_Nom.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lb_Nom.setText("Bob");
        jPanel2.add(lb_Nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Apellidos");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, -1, -1));

        lb_Ape.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lb_Ape.setText("Mataplagas");
        jPanel2.add(lb_Ape, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Edad");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        lb_eda.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lb_eda.setText("25");
        lb_eda.setToolTipText("");
        jPanel2.add(lb_eda, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Oficio");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, -1, -1));

        lb_ofi.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lb_ofi.setText("Secretario");
        jPanel2.add(lb_ofi, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, -1, -1));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setText("Dias de trabajo");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, -1, -1));

        lb_dias.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lb_dias.setText("15");
        jPanel2.add(lb_dias, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, -1, -1));

        jPanel3.setBackground(new java.awt.Color(200, 232, 232));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 1120, 40));

        lb_chino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CH.PNG"))); // NOI18N
        jPanel2.add(lb_chino, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 200, 250));

        btn1_JF010_AF.setBackground(new java.awt.Color(255, 255, 255));
        btn1_JF010_AF.setForeground(new java.awt.Color(255, 255, 255));
        btn1_JF010_AF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Vector.png"))); // NOI18N
        btn1_JF010_AF.setBorderPainted(false);
        jPanel2.add(btn1_JF010_AF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn1_JF010_AF;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel lb_Ape;
    public javax.swing.JLabel lb_Nom;
    private javax.swing.JLabel lb_chino;
    public javax.swing.JLabel lb_dias;
    public javax.swing.JLabel lb_eda;
    public javax.swing.JLabel lb_ofi;
    // End of variables declaration//GEN-END:variables
}
