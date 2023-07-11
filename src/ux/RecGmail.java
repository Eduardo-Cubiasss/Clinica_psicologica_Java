/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Database.Contactos;
import Database.Procesos_almacenados;
import Database.Usuarios;
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
    private JF003_S1_RH vistaJF003;
    private Procesos_almacenados Procesos;

    public RecGmail(Usuarios modelUsers, Contactos ModelContactos, JF003_S1_RH vistaJF003, Procesos_almacenados Procesos) {
        this.modelUsers = modelUsers;
        this.ModelContactos = ModelContactos;
        this.vistaJF003 = vistaJF003;
        this.Procesos = Procesos;
        this.vistaJF003.Btn1_JF003_S1_RH.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaJF003.Btn1_JF003_S1_RH) {
            modelUsers.setContraseña(vistaJF003.PassField_ConfirmarContra_JF003_S1_RH.getText());
            ModelContactos.setCorreo(vistaJF003.TxtCorreoRegister_JF003_S1_RH.getText());
            try {
                String Dato = ux.DatoRandom.generateRandomData(5);
                //Preparar las cosas
                String correoEmisor = "mindlinkoficial@gmail.com";
                String contraseñaEmisor = "inblyssyqjiszhds";
                String CorreoReceptor = vistaJF003.TxtCorreoRegister_JF003_S1_RH.getText();
                String asunto = "Recuperación de contraseña";
                String mensaje = "Bievenido a la recuperación de contaseña, si olvidaste la contraseña ingresa este código para acceder y cambiar la contraseña: " + Dato;

                //Configurar SMTP
                Properties props = new Properties();
                props.setProperty("mail.smtp.host", "smtp.gmail.com");
                props.setProperty("mail.smtp.starls.enable", "true");
                props.setProperty("mail.smtp.port", "465");
                props.setProperty("mail.smtp.auth", "true");
                props.setProperty("mail.smtp.socketFactory.port", "465");
                props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

                //Configurar el envio
                Session session = Session.getDefaultInstance(props);
                MimeMessage message = new MimeMessage(session);
                message.setFrom(new InternetAddress(correoEmisor));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(CorreoReceptor));
                message.setSubject(asunto);
                message.setText(mensaje);

                //Envío del mensaje
                Transport t = session.getTransport("smtp");
                t.connect(correoEmisor, contraseñaEmisor);
                t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
                t.close();

                JOptionPane.showMessageDialog(null, "Correo enviado");
                if(Dato.equals(vistaJF003.PassField_ConfirmarContra_JF003_S1_RH.getText()))
                {
                    Procesos.RecCorreo(modelUsers, ModelContactos);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "J001GU", "Codigo incorrecto", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception i) {
                System.out.println(i.toString());
                JOptionPane.showMessageDialog(null, "J022DA ", "Error al enviar correo", JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }

}
