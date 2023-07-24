/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Database.Contactos;
import Database.Procesos_almacenados;
import Ui.JF003_S1_RH;
import Ui.JP003_S1_RH;
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
import ux.DatoRandom;

/**
 *
 * @author 50369
 */
public class ValidarCorreo implements ActionListener {

    private Contactos ModelContactos;
    private JP003_S1_RH vistaJF003;
    private Procesos_almacenados Procesos;
    private JPanel JPContenido;

    public ValidarCorreo(Contactos ModelContactos, JP003_S1_RH vistaJF003, Procesos_almacenados Procesos, JPanel JPContenido) {
        this.ModelContactos = ModelContactos;
        this.Procesos = Procesos;
        this.vistaJF003 = vistaJF003;
        this.JPContenido = JPContenido;
        this.vistaJF003.Btn1_JF003_S1_RH.addActionListener(this);
        this.vistaJF003.Btn2_JF003_S1_RH.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaJF003.Btn1_JF003_S1_RH) {
            ModelContactos.setCorreoVal(vistaJF003.TxtCorreoRegister_JF003_S1_RH.getText());

            Procesos.ValCorreo(ModelContactos);
            String CorreoNoVer = ModelContactos.getCorreoVal();
            String Correo = ModelContactos.getCorreo();
            DatoRandom datoRandom = new DatoRandom(ModelContactos);
            datoRandom.DatoRandom(ModelContactos, 5);

            System.out.println("Aqui se genera el código de verificacion y el codigo es" + ModelContactos.getNumeroRandom());
            if (CorreoNoVer.equals(Correo)) {
                try {
                    String Nrandom = ModelContactos.getNumeroRandom();
                    
                    //Preparar las cosas
                    String correoEmisor = "mindlinkoficial@gmail.com";
                    String contraseñaEmisor = "inblyssyqjiszhds";
                    String CorreoReceptor = vistaJF003.TxtCorreoRegister_JF003_S1_RH.getText();
                    String asunto = "Recuperación de contraseña";
                    String mensaje = "Bievenido a la recuperación de contraseña, si olvidaste la contraseña ingresa este código para acceder y cambiar la contraseña: " + Nrandom;

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
                    ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelCorreoenviado");
                } catch (Exception i) {
                    
                    JOptionPane.showMessageDialog(null, "J022DA ", "Error al enviar correo", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        else if (e.getSource() == vistaJF003.Btn2_JF003_S1_RH)
        {
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelRegistro");
        }

    }
}
