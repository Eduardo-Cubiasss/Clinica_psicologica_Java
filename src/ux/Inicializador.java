package ux;

import Database.Administrador;
import Database.Clinica;
import Database.Contactos;
import Database.Procesos_almacenados;
import Database.Usuarios;
import Ui.JF_000_S7_GU;
import Ui.SplashScreen;
import Ui.JP001_S1_AFP;
import Ui.JP002_S1_RHP;
import Ui.JP003_2_S1_RH;
import Ui.JP003_S1_RH;
import Ui.JP004_S2_AF;
import Ui.JP005_2_S2_RH;
import Ui.JP023_S3_RH;
import Ui.JP039_S3_RH;

import javax.swing.JPanel;
import java.util.Stack;

public class Inicializador {
    private PanelesInicializador panelesInicializador;
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

    // Paneles
    private JPanel JP001_S1_AFP;
    private JPanel JP002_S1_RHP;
    private JPanel JP004_S2_AF;
    private JPanel JP005_2_S2_RH;
    private JPanel JP023_S3_RH;
    private JPanel JP039_S3_RH;

    public Inicializador(JF_000_S7_GU vista) {
        this.vista = vista;
        panelHistory = new PanelHistory();
        habilitarPaneles = new HabilitarPaneles();
        // Crea las instancias de los modelos
        Usuarios modelUsers = new Usuarios();
        Procesos_almacenados Procesos = new Procesos_almacenados();
        Administrador modelAdmin = new Administrador();
        Clinica modelClinica = new Clinica();
        Contactos ModelContactos = new Contactos();
        panelesInicializador = new PanelesInicializador();

        // Paneles
        SplashScreen panelSplash = new SplashScreen(vista.JPContenido);
        JP001_S1_AFP panelInicioSesion = new JP001_S1_AFP(controladorLogin);
        JP002_S1_RHP panelRegistro = new JP002_S1_RHP(controladorRegistrar);
        JP004_S2_AF panelMenuAdmin = new JP004_S2_AF(controladorMenuAd);
        JP005_2_S2_RH panelRec1Telefono = new JP005_2_S2_RH(controladorRec_tel1);
        JP023_S3_RH panelMenuTp = new JP023_S3_RH(controladorMenuTp);
        JP039_S3_RH panelMenuSec = new JP039_S3_RH(controladorMenuSec);
        JP003_S1_RH panelvalCorreo = new JP003_S1_RH(controladorValCorreo);
        JP003_2_S1_RH panelCorreoenviado = new JP003_2_S1_RH(controladorCorreoenviado);
        vista.JPContenido.add(panelSplash, "panelSplash");
        
        // Controladores
        controladorLogin = new Login(modelUsers, vista.JPContenido, Procesos, panelInicioSesion, panelHistory, habilitarPaneles, vista);
        controladorRegistrar = new RegAdmin_JF002(modelAdmin, modelUsers, modelClinica, panelRegistro, vista.JPContenido, Procesos, panelHistory, habilitarPaneles, vista);
        controladorMenuAd = new Menu_Administrador(vista.JPContenido, panelMenuAdmin, panelHistory);
        controladorMenuTp = new Menu_Terapeuta(vista.JPContenido);
        controladorMenuSec = new Menu_Secretaria(vista.JPContenido);
        controladorValCorreo = new ValidarCorreo(ModelContactos, panelvalCorreo, Procesos, vista.JPContenido);
        controladorCorreoenviado = new RecGmail(modelUsers, ModelContactos, panelCorreoenviado, Procesos, vista.JPContenido);
        controladorRec_tel1 = new ValidarNum(vista.JPContenido);
        controladorAnuncios1 = new Anuncios1(vista.JPContenido);

        

        // Agregar paneles a la vista
        vista.JPContenido.add(panelSplash, "panelSplash");
        habilitarPaneles.agregarPanel("panelInicioSesion", panelInicioSesion);
        vista.JPContenido.add(panelInicioSesion, "panelInicioSesion");
        habilitarPaneles.agregarPanel("panelRegistro", panelRegistro);
        vista.JPContenido.add(panelRegistro, "panelRegistro");
        habilitarPaneles.agregarPanel("panelMenuAdmin", panelMenuAdmin);
        vista.JPContenido.add(panelMenuAdmin, "panelMenuAdmin");
        habilitarPaneles.agregarPanel("panelRec1Telefono", panelRec1Telefono);
        vista.JPContenido.add(panelRec1Telefono, "panelRec1Telefono");
        habilitarPaneles.agregarPanel("panelMenuTp", panelMenuTp);
        vista.JPContenido.add(panelMenuTp, "panelMenuTp");
        habilitarPaneles.agregarPanel("panelMenuSec", panelMenuSec);
        vista.JPContenido.add(panelMenuSec, "panelMenuSec");
    }
}
