/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import ux.FormularioInicio;
import ux.PanelesInicializador;
import ux.SolicitudesDeIncapacidadRedactar;
import ux.PanelesInicializador;
import ux.primer_uso;

/**
 *
 * @author 50369
 */
public class JP0048_S3_RH extends javax.swing.JPanel {

    private primer_uso controlador;
    private PanelesInicializador str;

    public JP0048_S3_RH(primer_uso controlador) {
        initComponents();
        this.controlador = controlador;
        
        str = new PanelesInicializador();
        
         // Establecer el valor de str aquí después de haberlo creado
        str.setJP0048_S3_RH(this);
    }
    
    
    
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
        return jComboBox1;
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
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
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCorreoElectronico_jp0048_RH1 = new javax.swing.JTextField();
        txtActiLabo_JP49 = new javax.swing.JTextField();
        txtNumTel_JP49 = new javax.swing.JTextField();
        txtFechaNa_JP49 = new javax.swing.JTextField();
        txtDui_JP49 = new javax.swing.JTextField();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        btn02_JF048_S3_RH1 = new javax.swing.JButton();
        btnOmitir1 = new javax.swing.JButton();
        btnEmpecemos1 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1120, 540));
        setMinimumSize(new java.awt.Dimension(1120, 540));
        setPreferredSize(new java.awt.Dimension(1120, 540));
        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Genero", "Masculino", "Femenino", "Prefiero no decirlo", " ", " " }));

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

        txtNumTel_JP0048.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtFechaNa_JP0048.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtDui_JP0048.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        kGradientPanel2.setkEndColor(new java.awt.Color(0, 153, 153));
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 153, 153));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn02_JF048_S3_RH.setBackground(new java.awt.Color(0, 153, 153));
        btn02_JF048_S3_RH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/log out.png"))); // NOI18N
        btn02_JF048_S3_RH.setBorderPainted(false);
        kGradientPanel2.add(btn02_JF048_S3_RH, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 165, -1));

        btnOmitir.setBackground(new java.awt.Color(255, 255, 255));
        btnOmitir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnOmitir.png"))); // NOI18N
        btnOmitir.setBorderPainted(false);

        btnEmpecemos.setBackground(new java.awt.Color(255, 255, 255));
        btnEmpecemos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnEmpecemos.png"))); // NOI18N
        btnEmpecemos.setBorderPainted(false);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Correo Electrónico");

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setText("Dui");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setText("Fecha de nacimiento");

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel12.setText("Número telefónico");

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel13.setText("Actividad laboral");

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel14.setText("Género");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap(349, Short.MAX_VALUE)
=======
                .addContainerGap(323, Short.MAX_VALUE)
>>>>>>> c5e0d18f3d6255267af5ee838afd53ed08430541
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(283, 283, 283))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(260, 260, 260))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(243, 243, 243)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btnOmitir, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(btnEmpecemos, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtDui_JP0048)
                                .addComponent(txtCorreoElectronico_jp0048_RH, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFechaNa_JP0048, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(158, 158, 158)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtActiLabo_JP0048)
                                .addComponent(txtNumTel_JP0048)
                                .addComponent(jComboBox1, 0, 301, Short.MAX_VALUE))
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
<<<<<<< HEAD
                    .addComponent(jLabel9)
                    .addComponent(jLabel13))
=======
                    .addComponent(txtActiLabo_JP0048, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreoElectronico_jp0048_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumTel_JP0048, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaNa_JP0048, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDui_JP0048, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
>>>>>>> c5e0d18f3d6255267af5ee838afd53ed08430541
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtActiLabo_JP0048, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreoElectronico_jp0048_RH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumTel_JP0048, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaNa_JP0048, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDui_JP0048, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(btnOmitir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEmpecemos, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel1, "card2");

        jPanel2.setMaximumSize(new java.awt.Dimension(1120, 540));
        jPanel2.setMinimumSize(new java.awt.Dimension(1120, 540));
        jPanel2.setPreferredSize(new java.awt.Dimension(1120, 540));
        jPanel2.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Genero", "Masculino", "Femenino", "Prefiero no decirlo", " ", " " }));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/log.PNG"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("Antes de empezar necesitamos cierta ");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setText("información para mejorar nuestros servicios");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setText("Llena el formulario que nos servirá más adelante");

        txtCorreoElectronico_jp0048_RH1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtCorreoElectronico_jp0048_RH1.setText("Correo Electrónico");
        txtCorreoElectronico_jp0048_RH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoElectronico_jp0048_RH1ActionPerformed(evt);
            }
        });

        txtActiLabo_JP49.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtActiLabo_JP49.setText("Actividad Laboral");

        txtNumTel_JP49.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtNumTel_JP49.setText("Número telefónico");

        txtFechaNa_JP49.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtFechaNa_JP49.setText("Fecha de nacimiento");

        txtDui_JP49.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtDui_JP49.setText("Dui");

        kGradientPanel3.setkEndColor(new java.awt.Color(0, 153, 153));
        kGradientPanel3.setkStartColor(new java.awt.Color(0, 153, 153));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn02_JF048_S3_RH1.setBackground(new java.awt.Color(0, 153, 153));
        btn02_JF048_S3_RH1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/log out.png"))); // NOI18N
        btn02_JF048_S3_RH1.setBorderPainted(false);
        kGradientPanel3.add(btn02_JF048_S3_RH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 165, -1));

        btnOmitir1.setBackground(new java.awt.Color(255, 255, 255));
        btnOmitir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnOmitir.png"))); // NOI18N
        btnOmitir1.setBorderPainted(false);

        btnEmpecemos1.setBackground(new java.awt.Color(255, 255, 255));
        btnEmpecemos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnEmpecemos.png"))); // NOI18N
        btnEmpecemos1.setBorderPainted(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtDui_JP49, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaNa_JP49, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreoElectronico_jp0048_RH1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(134, 134, 134)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtActiLabo_JP49)
                            .addComponent(txtNumTel_JP49, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnOmitir1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(btnEmpecemos1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(268, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(283, 283, 283))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(260, 260, 260))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(297, 297, 297)))
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addGap(75, 75, 75)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(txtFechaNa_JP49, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtActiLabo_JP49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreoElectronico_jp0048_RH1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(txtNumTel_JP49, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDui_JP49, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEmpecemos1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOmitir1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel3, "card2");

        add(jPanel2, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoElectronico_jp0048_RHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoElectronico_jp0048_RHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoElectronico_jp0048_RHActionPerformed

    private void txtCorreoElectronico_jp0048_RH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoElectronico_jp0048_RH1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoElectronico_jp0048_RH1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn02_JF048_S3_RH;
    public javax.swing.JButton btn02_JF048_S3_RH1;
    public javax.swing.JButton btnEmpecemos;
    private javax.swing.JButton btnEmpecemos1;
    public javax.swing.JButton btnOmitir;
    private javax.swing.JButton btnOmitir1;
    public javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public keeptoo.KGradientPanel kGradientPanel2;
    public keeptoo.KGradientPanel kGradientPanel3;
    public javax.swing.JTextField txtActiLabo_JP0048;
    public javax.swing.JTextField txtActiLabo_JP49;
    public javax.swing.JTextField txtCorreoElectronico_jp0048_RH;
    public javax.swing.JTextField txtCorreoElectronico_jp0048_RH1;
    public javax.swing.JTextField txtDui_JP0048;
    public javax.swing.JTextField txtDui_JP49;
    public javax.swing.JTextField txtFechaNa_JP0048;
    public javax.swing.JTextField txtFechaNa_JP49;
    public javax.swing.JTextField txtNumTel_JP0048;
    public javax.swing.JTextField txtNumTel_JP49;
    // End of variables declaration//GEN-END:variables
}
