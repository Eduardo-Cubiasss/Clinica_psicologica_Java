package ux;

import Database.Administrador;
import Database.Clinica;
import Database.Contactos;
import Database.Procesos_almacenados;
import Database.Usuarios;
import javax.swing.JTextField;
import Ui.JF_000_S7_GU;
import Ui.JP001_S1_AFP;
import Ui.JP002_S1_RHP;
import Ui.JP003_2_S1_RH;
import Ui.JP003_S1_RH;
import Ui.JP004_S2_AF;
import Ui.JP023_S3_RH;
import Ui.JP039_S3_RH;
import Ui.SplashScreen;
import java.awt.CardLayout;
import java.util.Stack;
import javax.swing.JPanel;

public class Inicializador {
    
    
    private PanelHistory panelHistory;
    private Login controladorLogin;
    private RegAdmin_JF002 controladorRegistrar;
    private Menu_Administrador controladorMenuAd;
    private Menu_Terapeuta controladorMenuTp;
    private Menu_Secretaria controladorMenuSec;
    private ValidarCorreo controladorValCorreo;
    private RecGmail controladorCorreoenviado;
    private Hints_Herencia hintsHerencia;
    private JF_000_S7_GU vista;
    

    JTextField textField1 = new JTextField();
    ExtensionCorreo validacionCorreo = new ExtensionCorreo(textField1);

    JTextField textField = new JTextField();
    int limiteCaracteres = 12;
    LimiteCaracteres validacionLimite = new LimiteCaracteres(textField, limiteCaracteres);

    public Inicializador(JF_000_S7_GU vista) {
        this.vista = vista;
        panelHistory = new PanelHistory();
        
        
        //Me quede en la parte en que configuraba los controladores, me queda configurar las clases der cada controlador para que acoplen a panelH¬istorial
        SplashScreen panelSplash = new SplashScreen(vista.JPContenido);
        // Crea las instancias de los modelos
        Usuarios modelUsers = new Usuarios();
        Procesos_almacenados Procesos = new Procesos_almacenados();
        Administrador modelAdmin = new Administrador();
        Clinica modelClinica = new Clinica();
        Contactos ModelContactos = new Contactos();

        vista.JPContenido.add(panelSplash, "panelSplash");

        JP001_S1_AFP panelInicioSesion = new JP001_S1_AFP(controladorLogin);
        vista.JPContenido.add(panelInicioSesion, "panelInicioSesion");

        JP002_S1_RHP panelRegistro = new JP002_S1_RHP(controladorRegistrar);
        vista.JPContenido.add(panelRegistro, "panelRegistro");

        JP004_S2_AF panelMenuAdmin = new JP004_S2_AF(controladorMenuAd);
        vista.JPContenido.add(panelMenuAdmin, "panelMenuAdmin");

        JP023_S3_RH panelMenuTp = new JP023_S3_RH(controladorMenuTp);
        vista.JPContenido.add(panelMenuTp, "panelMenuTp");

        JP039_S3_RH panelMenuSec = new JP039_S3_RH(controladorMenuSec);
        vista.JPContenido.add(panelMenuSec, "panelMenuSec");

        JP003_S1_RH panelvalCorreo = new JP003_S1_RH(controladorValCorreo);
        vista.JPContenido.add(panelvalCorreo, "panelvalCorreo");

        JP003_2_S1_RH panelCorreoenviado = new JP003_2_S1_RH(controladorCorreoenviado);
        vista.JPContenido.add(panelCorreoenviado, "panelCorreoenviado");

        // Crea una instancia del controlador Login y pasa los componentes necesarios
        controladorLogin = new Login(modelUsers, vista.JPContenido, Procesos, panelInicioSesion, panelHistory);
        // Crea una instancia del controlador RegAdmin_JF002 y pasa los modelos necesarios
        controladorRegistrar = new RegAdmin_JF002(modelAdmin, modelUsers, modelClinica, panelRegistro, vista.JPContenido, Procesos, panelHistory);
        controladorMenuAd = new Menu_Administrador(vista.JPContenido, panelMenuAdmin, panelHistory);
        controladorMenuTp = new Menu_Terapeuta(vista.JPContenido);
        controladorMenuSec = new Menu_Secretaria(vista.JPContenido);
        controladorValCorreo = new ValidarCorreo(ModelContactos, panelvalCorreo, Procesos, vista.JPContenido);
        controladorCorreoenviado = new RecGmail(modelUsers, ModelContactos, panelCorreoenviado, Procesos, vista.JPContenido);

        // Aquí mandamos todos los paneles
        hintsHerencia = new Hints_Herencia(panelInicioSesion, panelRegistro);

    }

}
