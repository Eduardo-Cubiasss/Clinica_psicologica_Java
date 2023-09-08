/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import ux.DetallesDeMiPerfil;
import ux.PanelesInicializador;
import ux.SolicitudesAprobadas2;
import ux.LimiteCaracteres;
import ux.Hints;
import ux.Validaciones;

/**
 *
 * @author LENOVO
 */
public class JP025_S3_RH extends javax.swing.JPanel {

    
    private DetallesDeMiPerfil controlador;
    private PanelesInicializador str;
    private Hints hint;
    private LimiteCaracteres Limite;

    public JTextField getTxtContraNueva_JF025_S3_RH() {
        return TxtContraNueva_JF025_S3_RH;
    }

    public void setTxtContraNueva_JF025_S3_RH(String texto) {
        TxtContraNueva_JF025_S3_RH.setText(texto);
    }

    public JTextField getTxtContraseñaActual_JF025_S3_RH() {
        return TxtContraseñaActual_JF025_S3_RH;
    }

    public void setTxtContraseñaActual_JF025_S3_RH(JTextField TxtContraseñaActual_JF025_S3_RH) {
        this.TxtContraseñaActual_JF025_S3_RH = TxtContraseñaActual_JF025_S3_RH;
    }

    public JTextField getTxtDescrip_JF025_S3_RH() {
        return TxtDescrip_JF025_S3_RH;
    }

    public void setTxtDescrip_JF025_S3_RH(JTextField TxtDescrip_JF025_S3_RH) {
        this.TxtDescrip_JF025_S3_RH = TxtDescrip_JF025_S3_RH;
    }

    public JButton getBtnotrasconfig() {
        return Btnotrasconfig;
    }

    public void setBtnotrasconfig(JButton Btnotrasconfig) {
        this.Btnotrasconfig = Btnotrasconfig;
    }


    public JButton getBtn03_JF025_S3_RH() {
        return Btnotrasconfig;
    }

    public void setBtn03_JF025_S3_RH(JButton btn03_JF025_S3_RH) {
        this.Btnotrasconfig = btn03_JF025_S3_RH;
    }

    public JButton getBtn04_JF025_S3_RH() {
        return btn04_JF025_S3_RH;
    }

    public void setBtn04_JF025_S3_RH(JButton btn04_JF025_S3_RH) {
        this.btn04_JF025_S3_RH = btn04_JF025_S3_RH;
    }

    public JButton getBtn05_JF025_S3_RH() {
        return btn05_JF025_S3_RH;
    }

    public void setBtn05_JF025_S3_RH(JButton btn05_JF025_S3_RH) {
        this.btn05_JF025_S3_RH = btn05_JF025_S3_RH;
    }

    public JButton getBtn1_JF025_S3_RH() {
        return Btn1_JF025_S3_RH;
    }

    public void setBtn1_JF025_S3_RH(JButton Btn1_JF025_S3_RH) {
        this.Btn1_JF025_S3_RH = Btn1_JF025_S3_RH;
    }

    public JPanel getJP01_Foto_JF025_S3_RH() {
        return JP01_Foto_JF025_S3_RH;
    }

    public void setJP01_Foto_JF025_S3_RH(JPanel JP01_Foto_JF025_S3_RH) {
        this.JP01_Foto_JF025_S3_RH = JP01_Foto_JF025_S3_RH;
    }

    public JPanel getJP02_Firma_JF025_S3_RH() {
        return JP02_Firma_JF025_S3_RH;
    }

    public void setJP02_Firma_JF025_S3_RH(JPanel JP02_Firma_JF025_S3_RH) {
        this.JP02_Firma_JF025_S3_RH = JP02_Firma_JF025_S3_RH;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
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
    
    
    
    
    public JP025_S3_RH(DetallesDeMiPerfil controlador) {
        this.hint = hint;
        
        initComponents();
        this.controlador = controlador;
        
        str = new PanelesInicializador();
        
         // Establecer el valor de str aquí después de haberlo creado
        str.setJP025_S3_RH(this);
    LimiteCaracteres limiteDescripcion = new LimiteCaracteres(TxtDescrip_JF025_S3_RH, 0, 300);
        new Validaciones(getTxtDescrip_JF025_S3_RH(), "SoloLetras");
        hint.addHint(getTxtDescrip_JF025_S3_RH(), "Describase brevemente");
        
        LimiteCaracteres limiteContraseña1 = new LimiteCaracteres(TxtContraseñaActual_JF025_S3_RH, 0, 16);
        hint.addHint(getTxtContraseñaActual_JF025_S3_RH(), "Ingrese su contraseña actual");

        LimiteCaracteres limiteContraseña2 = new LimiteCaracteres(TxtContraNueva_JF025_S3_RH, 0, 16);
        hint.addHint(getTxtContraNueva_JF025_S3_RH(), "Ingrese su contraseña nueva");
    }
    
    
    
    public JP025_S3_RH() {
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
        btn05_JF025_S3_RH = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        JP02_Firma_JF025_S3_RH = new javax.swing.JPanel();
        JP01_Foto_JF025_S3_RH = new javax.swing.JPanel();
        btn04_JF025_S3_RH = new javax.swing.JButton();
        Btnotrasconfig = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1120, 640));
        setMinimumSize(new java.awt.Dimension(1120, 640));
        setPreferredSize(new java.awt.Dimension(1120, 640));
        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1120, 640));
        jPanel1.setMinimumSize(new java.awt.Dimension(1120, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(1120, 640));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("Detalles de mi perfil");

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1122, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Cambiar contraseña");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Acerca de mi");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/log.PNG"))); // NOI18N

        Btn1_JF025_S3_RH.setBackground(new java.awt.Color(255, 255, 255));
        Btn1_JF025_S3_RH.setForeground(new java.awt.Color(255, 255, 255));
        Btn1_JF025_S3_RH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Vector (1).png"))); // NOI18N
        Btn1_JF025_S3_RH.setBorderPainted(false);
        Btn1_JF025_S3_RH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        TxtDescrip_JF025_S3_RH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        TxtDescrip_JF025_S3_RH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDescrip_JF025_S3_RHActionPerformed(evt);
            }
        });

        TxtContraNueva_JF025_S3_RH.setForeground(new java.awt.Color(153, 153, 153));
        TxtContraNueva_JF025_S3_RH.setText("Nueva contraseña");
        TxtContraNueva_JF025_S3_RH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));

        TxtContraseñaActual_JF025_S3_RH.setForeground(new java.awt.Color(153, 153, 153));
        TxtContraseñaActual_JF025_S3_RH.setText("Contraseña actual");
        TxtContraseñaActual_JF025_S3_RH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));

        btn05_JF025_S3_RH.setBackground(new java.awt.Color(255, 255, 255));
        btn05_JF025_S3_RH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizarNegro.png"))); // NOI18N
        btn05_JF025_S3_RH.setBorderPainted(false);

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setText("Descripción");

        JP02_Firma_JF025_S3_RH.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout JP02_Firma_JF025_S3_RHLayout = new javax.swing.GroupLayout(JP02_Firma_JF025_S3_RH);
        JP02_Firma_JF025_S3_RH.setLayout(JP02_Firma_JF025_S3_RHLayout);
        JP02_Firma_JF025_S3_RHLayout.setHorizontalGroup(
            JP02_Firma_JF025_S3_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );
        JP02_Firma_JF025_S3_RHLayout.setVerticalGroup(
            JP02_Firma_JF025_S3_RHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

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

        btn04_JF025_S3_RH.setBackground(new java.awt.Color(255, 255, 255));
        btn04_JF025_S3_RH.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        btn04_JF025_S3_RH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/+Negro.png"))); // NOI18N
        btn04_JF025_S3_RH.setText("Actualizar");
        btn04_JF025_S3_RH.setBorderPainted(false);

        Btnotrasconfig.setBackground(new java.awt.Color(255, 255, 255));
        Btnotrasconfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Primerusoiiir.png"))); // NOI18N
        Btnotrasconfig.setBorderPainted(false);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setText("Otras configuraciones");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(117, 117, 117)
                                        .addComponent(JP01_Foto_JF025_S3_RH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addComponent(TxtDescrip_JF025_S3_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(184, 184, 184)
                                                .addComponent(jLabel1))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addComponent(jLabel2)
                                        .addGap(329, 329, 329)
                                        .addComponent(jLabel5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(Btn1_JF025_S3_RH)
                                        .addGap(366, 366, 366)
                                        .addComponent(jLabel3)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(JP02_Firma_JF025_S3_RH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TxtContraNueva_JF025_S3_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TxtContraseñaActual_JF025_S3_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(52, 52, 52)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(479, 479, 479)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(321, 321, 321)
                                .addComponent(btn04_JF025_S3_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(Btnotrasconfig))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel6))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(559, 559, 559)
                .addComponent(btn05_JF025_S3_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Btn1_JF025_S3_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3)))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(TxtDescrip_JF025_S3_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17)
                            .addComponent(jLabel1))
                        .addComponent(JP01_Foto_JF025_S3_RH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn04_JF025_S3_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Btnotrasconfig)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(TxtContraseñaActual_JF025_S3_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtContraNueva_JF025_S3_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JP02_Firma_JF025_S3_RH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn05_JF025_S3_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void TxtDescrip_JF025_S3_RHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDescrip_JF025_S3_RHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDescrip_JF025_S3_RHActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn1_JF025_S3_RH;
    public javax.swing.JButton Btnotrasconfig;
    public javax.swing.JPanel JP01_Foto_JF025_S3_RH;
    public javax.swing.JPanel JP02_Firma_JF025_S3_RH;
    public javax.swing.JTextField TxtContraNueva_JF025_S3_RH;
    public javax.swing.JTextField TxtContraseñaActual_JF025_S3_RH;
    public javax.swing.JTextField TxtDescrip_JF025_S3_RH;
    public javax.swing.JButton btn04_JF025_S3_RH;
    public javax.swing.JButton btn05_JF025_S3_RH;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JPanel jPanel1;
    public keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
