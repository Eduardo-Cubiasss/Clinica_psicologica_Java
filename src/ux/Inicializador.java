package ux;

import Database.Administrador;
import Database.Clinica;
import Database.Procesos_almacenados;
import Database.Usuarios;
import javax.swing.JTextField;
import Ui.JF_000_S7_GU;
import Ui.JP001_S1_AFP;
import Ui.JP002_S1_RHP;
import Ui.JP004_S2_AF;
import Ui.JP023_S3_RH;
import Ui.JP039_S3_RH;

public class Inicializador {

    private Login controladorLogin;
    private RegAdmin_JF002 controladorRegistrar;
    private Menu_Administrador controladorMenuAd;
    private Menu_Terapeuta controladorMenuTp;
    private Menu_Secretaria controladorMenuSec;
    private Hints_Herencia hintsHerencia;
    private JF_000_S7_GU vista;

    JTextField textField1 = new JTextField();
    ExtensionCorreo validacionCorreo = new ExtensionCorreo(textField1);

    JTextField textField = new JTextField();
    int limiteCaracteres = 12;
    LimiteCaracteres validacionLimite = new LimiteCaracteres(textField, limiteCaracteres);

    public Inicializador(JF_000_S7_GU vista) {
        this.vista = vista;

        // Crea las instancias de los modelos
        Usuarios modelUsers = new Usuarios();
        Procesos_almacenados Procesos = new Procesos_almacenados();
        Administrador modelAdmin = new Administrador();
        Clinica modelClinica = new Clinica();

        // Crea una instancia del JPanel JP001_S1_AFP
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

        // Crea una instancia del controlador Login y pasa los componentes necesarios
       controladorLogin = new Login(modelUsers, panelInicioSesion.getBtn2_JF001_S1_AF(),
                panelInicioSesion.getTxtUsuario_JF001_S1_AF(), panelInicioSesion.getPass_JF001_S1_AF(),
                vista.JPContenido, Procesos, panelInicioSesion.getbtn3_JF001_S1_AF());


        // Crea una instancia del controlador RegAdmin_JF002 y pasa los modelos necesarios
        controladorRegistrar = new RegAdmin_JF002(modelAdmin, modelUsers, modelClinica, panelRegistro, vista.JPContenido, Procesos);
        controladorMenuAd = new Menu_Administrador(vista.JPContenido);
        controladorMenuTp = new Menu_Terapeuta(vista.JPContenido);
        controladorMenuSec = new Menu_Secretaria(vista.JPContenido);
        
        // Asocia la instancia de JP002_S1_RHP al JPContenido
        vista.JPContenido.add(panelRegistro, "panelRegistro");
        
        // Asocia la instancia de JP004_S2_AF al JPContenido
        vista.JPContenido.add(panelMenuAdmin, "panelMenuAdmin");
        
        // Asocia la instancia de JP023_S3_RH al JPContenido
        vista.JPContenido.add(panelMenuTp, "panelMenuTp");
        
        vista.JPContenido.add(panelMenuSec, "panelMenuSec");

        // Aquí mandamos todos los paneles
        //hintsHerencia = new Hints_Herencia(panelInicioSesion, panelRegistro);
    }
}
