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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author 50369
 */
public class RecGmail implements ActionListener {

    private Usuarios modelUsers;
    private Contactos ModelContactos;
    private JF003_2_S1_RH vistaJF003;
    private Procesos_almacenados Procesos;

    public RecGmail(Usuarios modelUsers, Contactos ModelContactos, JF003_2_S1_RH vistaJF003, Procesos_almacenados Procesos) {
        this.modelUsers = modelUsers;
        this.ModelContactos = ModelContactos;
        this.vistaJF003 = vistaJF003;
        this.Procesos = Procesos;
        this.vistaJF003.Btn1_JF003_2_S1_RH.addActionListener(this);
        System.out.println("Se hace this en las clases");
    }

    
    /*Aqui te deji¿o el link de nuestro repositorio https://github.com/L3AC/VetSoft-Java.git Gerson :)*/
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vistaJF003.Btn1_JF003_2_S1_RH) {
            JOptionPane.showMessageDialog(null," oslddfsdfs", "J001GU", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Ocurre al presionar el boton");
            System.out.println(ModelContactos.getNumeroRandom());
            System.out.println(vistaJF003.TxtCodigoCorreo_JF003_2_S1_RH2.getText());
            System.out.println("Los dos codigo de arriba son los que existen en el codigo enviado por el usuario y el codigo de la tabla contactos");         
            String Codigofake = vistaJF003.TxtCodigoCorreo_JF003_2_S1_RH2.getText();
            String Codigoreal = ModelContactos.getNumeroRandom();
            JOptionPane.showMessageDialog(null, Codigofake + " " + Codigoreal, "J001GU", JOptionPane.INFORMATION_MESSAGE);
            if (Codigoreal.equals(Codigofake)) {
                ModelContactos.setCorreo(ModelContactos.getCorreo());
                modelUsers.setContraseña(vistaJF003.PassField_ConfirmarContra_JF003_3_S1_RH1.getText());
                System.out.println("Sea metio al if porque ambos codigos son iguales");
                Procesos.RecCorreo(modelUsers, ModelContactos);
                JOptionPane.showMessageDialog(null, "Intenta iniciar sesión por favor", "Sugerencia", JOptionPane.INFORMATION_MESSAGE);
                Abrirvistas.abrir("JF002_S1_RH");
            } else {
                JOptionPane.showMessageDialog(null, "Intentalo de nuevo", "J001GU", JOptionPane.INFORMATION_MESSAGE);
                Abrirvistas.abrir("JF003_S1_RH");
            }

        } else if (e.getSource() == vistaJF003.Btn2_JF003_2_S1_RH) {
            Abrirvistas.abrir("JF002_S1_RH");
        }

    }

}
