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
import Ui.JP005_2_S2_RH;
import Ui.JP021_S3_RH;
import Ui.JP023_S3_RH;
import Ui.JP039_S3_RH;
import Ui.SplashScreen;
import java.awt.CardLayout;
import java.util.Stack;
import javax.swing.JPanel;



public class Inicializador {
    
    private HabilitarPaneles habilitarPaneles;
    private PanelHistory panelHistory;
    private Login controladorLogin;
    private RegAdmin_JF002 controladorRegistrar;
    private Menu_Administrador controladorMenuAd;
    private Menu_Terapeuta controladorMenuTp;
    private Menu_Secretaria controladorMenuSec;
    private ValidarCorreo controladorValCorreo;
    private RecGmail controladorCorreoenviado;
    private ValidarNum controladorRec_tel1;
    private Anuncios1 controladorAnuncios1;
    private Hints_Herencia hintsHerencia;
    private JF_000_S7_GU vista;
    private Stack<JPanel> historialPaneles = new Stack<>();


    JTextField textField1 = new JTextField();
    ExtensionCorreo validacionCorreo = new ExtensionCorreo(textField1);

    JTextField textField = new JTextField();
    int limiteCaracteres = 12;
    LimiteCaracteres validacionLimite = new LimiteCaracteres(textField, limiteCaracteres);

    public Inicializador(JF_000_S7_GU vista) {
        this.vista = vista;
        panelHistory = new PanelHistory();
        habilitarPaneles = new HabilitarPaneles();
        
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
        habilitarPaneles.agregarPanel("panelInicioSesion", panelInicioSesion);
        vista.JPContenido.add(panelInicioSesion, "panelInicioSesion");

        JP002_S1_RHP panelRegistro = new JP002_S1_RHP(controladorRegistrar);
        habilitarPaneles.agregarPanel("panelRegistro", panelRegistro);
        vista.JPContenido.add(panelRegistro, "panelRegistro");

        JP004_S2_AF panelMenuAdmin = new JP004_S2_AF(controladorMenuAd);
        habilitarPaneles.agregarPanel("panelMenuAdmin", panelMenuAdmin);
        vista.JPContenido.add(panelMenuAdmin, "panelMenuAdmin");

        JP005_2_S2_RH panelRec1Telefono = new JP005_2_S2_RH(controladorRec_tel1);
        habilitarPaneles.agregarPanel("panelRec1Telefono", panelRec1Telefono);
        vista.JPContenido.add(panelRec1Telefono, "panelRec1Telefono");
        
        JP023_S3_RH panelMenuTp = new JP023_S3_RH(controladorMenuTp);
        habilitarPaneles.agregarPanel("panelMenuTp", panelMenuTp);
        vista.JPContenido.add(panelMenuTp, "panelMenuTp");

        JP039_S3_RH panelMenuSec = new JP039_S3_RH(controladorMenuSec);
        habilitarPaneles.agregarPanel("panelMenuSec", panelMenuSec);
        vista.JPContenido.add(panelMenuSec, "panelMenuSec");

        JP003_S1_RH panelvalCorreo = new JP003_S1_RH(controladorValCorreo);
        habilitarPaneles.agregarPanel("panelvalCorreo", panelvalCorreo);
        vista.JPContenido.add(panelvalCorreo, "panelvalCorreo");

        JP003_2_S1_RH panelCorreoenviado = new JP003_2_S1_RH(controladorCorreoenviado);
        habilitarPaneles.agregarPanel("panelCorreoenviado", panelCorreoenviado);
        vista.JPContenido.add(panelCorreoenviado, "panelCorreoenviado");
        
        JP021_S3_RH panelAnuncios1 = new JP021_S3_RH(controladorAnuncios1);
        habilitarPaneles.agregarPanel("panelAnuncios1", panelAnuncios1);
        vista.JPContenido.add(panelAnuncios1, "panelAnuncios1");
        
        controladorLogin = new Login(modelUsers, vista.JPContenido, Procesos, panelInicioSesion, panelHistory, habilitarPaneles, vista);
        controladorRegistrar = new RegAdmin_JF002(modelAdmin, modelUsers, modelClinica, panelRegistro, vista.JPContenido, Procesos, panelHistory, habilitarPaneles , vista);
        controladorMenuAd = new Menu_Administrador(vista.JPContenido, panelMenuAdmin, panelHistory);
        controladorMenuTp = new Menu_Terapeuta(vista.JPContenido);
        controladorMenuSec = new Menu_Secretaria(vista.JPContenido);
        controladorValCorreo = new ValidarCorreo(ModelContactos, panelvalCorreo, Procesos, vista.JPContenido);
        controladorCorreoenviado = new RecGmail(modelUsers, ModelContactos, panelCorreoenviado, Procesos, vista.JPContenido);
        controladorRec_tel1 = new ValidarNum(vista.JPContenido);
        controladorAnuncios1 = new Anuncios1(vista.JPContenido);
        
        // Aquí mandamos todos los paneles
        
        hintsHerencia = new Hints_Herencia(panelInicioSesion, panelRegistro);

    }

}
