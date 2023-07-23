package ux;

import Database.Administrador;
import Database.Clinica;
import Database.Procesos_almacenados;
import Database.Usuarios;
import javax.swing.JTextField;
import Ui.JF_000_S7_GU;
import Ui.JP001_S1_AFP;
import Ui.JP002_S1_RHP;

public class Inicializador {

    private Login controladorLogin;
    private RegAdmin_JF002 controladorRegistrar;
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

        // Crea la instancia del JPanel JP001_S1_AFP
        JP001_S1_AFP panelInicioSesion = new JP001_S1_AFP();
        vista.JPContenido.add(panelInicioSesion, "panelInicioSesion");

        // Crea una instancia del controlador Login y pasa los componentes necesarios
        controladorLogin = new Login(modelUsers, panelInicioSesion.getBtn2_JF001_S1_AF(),
                panelInicioSesion.getTxtUsuario_JF001_S1_AF(), panelInicioSesion.getPass_JF001_S1_AF(),
                vista.JPContenido, Procesos, panelInicioSesion.getbtn3_JF001_S1_AF());

        // Crea una instancia del JP002_S1_RHP y pasa el controladorRegistrar
        JP002_S1_RHP panelRegistro = new JP002_S1_RHP(controladorRegistrar);

        // Crea una instancia del controlador RegAdmin_JF002 y pasa los modelos necesarios
        controladorRegistrar = new RegAdmin_JF002(modelAdmin, modelUsers, modelClinica, panelRegistro, vista.JPContenido, Procesos);

        // Asocia la instancia de JP002_S1_RHP al JPContenido
        vista.JPContenido.add(panelRegistro, "panelRegistro");
        
        // Crea la instancia de Hints_Herencia pasando las instancias de JP001_S1_AFP y JP002_S1_RHP
        hintsHerencia = new Hints_Herencia(panelInicioSesion, panelRegistro);
    }
}
