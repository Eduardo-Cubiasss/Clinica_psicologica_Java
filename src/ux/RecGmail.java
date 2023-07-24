/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Database.Contactos;
import Database.Procesos_almacenados;
import Database.Usuarios;
import Ui.JF003_2_S1_RH;
import Ui.JF003_S1_RH;
import Ui.JP003_2_S1_RH;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author 50369
 */
public class RecGmail implements ActionListener {

    private Usuarios modelUsers;
    private Contactos ModelContactos;
    private JP003_2_S1_RH vistaJF003;
    private Procesos_almacenados Procesos;
    private JPanel JPContenido;

    public RecGmail(Usuarios modelUsers, Contactos ModelContactos, JP003_2_S1_RH vistaJF003, Procesos_almacenados Procesos, JPanel JPContenido) {
        this.modelUsers = modelUsers;
        this.ModelContactos = ModelContactos;
        this.vistaJF003 = vistaJF003;
        this.Procesos = Procesos;
        this.JPContenido = JPContenido;
        this.vistaJF003.Btn1_JF003_2_S1_RH.addActionListener(this);
        System.out.println("Se hace this en las clases");
    }

    
    /*Aqui te deji¿o el link de nuestro repositorio https://github.com/L3AC/VetSoft-Java.git Gerson :)*/
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vistaJF003.Btn1_JF003_2_S1_RH) {
            
            System.out.println(ModelContactos.getNumeroRandom());
            System.out.println(vistaJF003.TxtCodigoCorreo_JF003_2_S1_RH2.getText());
                     
            String Codigofake = vistaJF003.TxtCodigoCorreo_JF003_2_S1_RH2.getText();
            String Codigoreal = ModelContactos.getNumeroRandom();
            
            if (Codigoreal.equals(Codigofake)) {
                ModelContactos.setCorreo(ModelContactos.getCorreo());
                modelUsers.setContraseña(vistaJF003.PassField_ConfirmarContra_JF003_3_S1_RH1.getText());
                System.out.println("Sea metio al if porque ambos codigos son iguales");
                Procesos.RecCorreo(modelUsers, ModelContactos);
                JOptionPane.showMessageDialog(null, "Intenta iniciar sesión por favor", "Sugerencia", JOptionPane.INFORMATION_MESSAGE);
                ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelInicioSesion");
            } else {
                JOptionPane.showMessageDialog(null, "Intentalo de nuevo", "J001GU", JOptionPane.INFORMATION_MESSAGE);
               ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelvalCorreo");
            }

        } else if (e.getSource() == vistaJF003.Btn2_JF003_2_S1_RH) {
              ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelRegistro");
        }

    }

}
