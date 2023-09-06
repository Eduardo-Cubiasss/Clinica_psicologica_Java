package ux;

import Database.ActividadesLaborales;
import Database.Administrador;
import Database.Clinica;
import Database.Contactos;
import Database.Empleado;
import Database.Genero;
import Database.Pacientes;
import Database.Procesos_almacenados;
import Database.RecetasMedicas;
import Database.Usuarios;
import Reportes.ParaReporte;
import Ui.JF_000_S7_GU;
import Ui.SplashScreen;
import Ui.JP001_S1_AFP;
import Ui.JP002_S1_RHP;
import Ui.JP003_2_S1_RH;
import Ui.JP003_S1_RH;
import Ui.JP0048_S3_RH;
import Ui.JP004_S2_AF;
import Ui.JP005_2_S2_RH;
import Ui.JP006_S2_AF;
import Ui.JP007_S2_RH;
import Ui.JP008_S2_AF;
import Ui.JP009_S2_RH;
import Ui.JP010_S2_AF;
import Ui.JP011_S2_RH;
import Ui.JP012_A_AF;
import Ui.JP012_E_AF;
import Ui.JP012_S2_AF;
import Ui.JP014_S2_AF;
import Ui.JP015_1_S2_RH;
import Ui.JP016_S2_AF;
import Ui.JP017_1_S2_RH;
import Ui.JP018_S2_AF;
import Ui.JP019_1_S2_RH;
import Ui.JP021_S3_RH;
import Ui.JP022_S3_AF;
import Ui.JP023_S3_RH;
import Ui.JP024_S3_AF;
import Ui.JP025_S3_RH;
import Ui.JP027_S3_RH;
import Ui.JP028_S3_AF;
import Ui.JP029_A_S3_RH;
import Ui.JP029_S3_RH;
import Ui.JP030_S3_AF;
import Ui.JP031_S3_RHG;
import Ui.JP032_S3_AF;
import Ui.JP033_S3_RH;
import Ui.JP034_S3_AF;
import Ui.JP039_S3_RH;
import Ui.JP035_1_S3_RH;
import Ui.JP036_S3_AF;
import Ui.JP037_S3_RH;
import Ui.JP038_S3_AF;
import Ui.JP040_S3_AF;
import Ui.JP041_1_S3_RH;
import Ui.JP042_1_S3_AF;
import Ui.JP043_1_S3_RH;
import Ui.JP044_S3_AF;
import Ui.JP045_S3_RH;
import Ui.JP047_S3_AF;

import javax.swing.JPanel;
import java.util.Stack;

public class Inicializador {
    
    // Se inicializan controladores y clases para el control de paneles
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
    private VisualizarNotas controladorvisualizarnotas;
    private DocumentosDeApoyo controladorDocumentosView;
    private primer_uso controladorPrimerUso;
    private Hints_Herencia hintsHerencia;
    private JF_000_S7_GU vista;
    private CreacionDeAnuncios controladorCreacionDeAnuncios;
    private SeccionDeComentarios controladorSeccionDeComentarios;
    private PersonalClinica controladorPersonalClinica;
    private AgregarPerfilesDeUsuario controladorAgregarPerfilesDeUsuario;
    private DetallesDePerfil controladorDetallesDePerfil;
    private AnunciosActuales controladorAnunciosActuales;
    private MBActualizarUsuario controladorMBActualizarUsuario;
    private MBEliminarUsuario controladorMBEliminarUsuario;
    private BuscadorEmpleados controladorBuscadorEmpleados;
    private SolicitudesDeEmpleados controladorSolicitudesDeEmpleados;
    private NuevaSolicitudDeEmpleado controladorNuevaSolicitudDeEmpleado;
    private SolicitudesAprobadas controladorSolicitudesAprobadas;
    private VerSolicitudAprobada controladorVerSolicitudAprobada;
    private SolicitudesAprobadas2 controladorSolicitudesAprobadas2;
    private VerSolicitudRechazada controladorVerSolicitudRechazada;
    private EliminarAnunciosActuales controladorEliminarAnunciosActuales;
    private Estadisticas controladorEstadisticas;
    private BuscadorPacientes controladorBuscadorPacientes;
    private DetallesDeMiPerfil controladorDetallesDeMiPerfil;
    private AgregarArticulo controladorAgregarArticulo;
    private MBEliminarArticulo controladorMBEliminarArticulo;
    private EliminarDocumentosDeApoyo controladorEliminarDocumentosDeApoyo;
    private ActualizarArticulo controladorActualizarArticulo;
    private ExpedienteDelPaciente controladorExpedienteDelPaciente;
    private RedactarMensaje controladorRedactarMensaje;
    private CreacionDePruebas controladorCreacionDePruebas;
    private EscribirEnTuAgendaPersonal controladorEscribirEnTuAgendaPersonal;
    private RcetarMedicamentos controladorRcetarMedicamentos;
    private CambiosPruebasActuales controladorCambiosPruebasActuales;
    private MBEliminarPrueba controladorMBEliminarPrueba;
    private VerMensajes controladorVerMensajes;
    private VerMensajeCH controladorVerMensajeCH;
    private MBEliminarCita controladorMBEliminarCita;
    private CrearCita controladorCrearCita;
    private EstadisticaDeCitas controladorEstadisticaDeCitas;
    private PruebasDF controladorPruebasDF;
    private SolicitudesDeIncapacidadRedactar controladorSolicitudesDeIncapacidadRedactar;
    private Hints hint;
    private FormularioInicio controladorFormularioInicio;
    private Resultado resultado;
    private Empleado modelEmpleado;
    //Aqui
    
    
    
    private Stack<JPanel> historialPaneles = new Stack<>();
    
    //Variables que contienen paneles
    private JP001_S1_AFP panel1;
    private  JP002_S1_RHP panel2;
    private  JP003_S1_RH panel3;
    private  JP003_2_S1_RH panel3_2;
    private  JP004_S2_AF panel4;
    private  JP005_2_S2_RH panel5;
    private  JP023_S3_RH panel23;
    private  JP039_S3_RH paenl39;
    private  JP035_1_S3_RH panel35p;
    private  JP027_S3_RH panel27;
    private  JP006_S2_AF panel06;
    private  JP007_S2_RH panel07;
    private  JP008_S2_AF panel08;
    private  JP009_S2_RH panel09;
    private  JP010_S2_AF panel10;
    private  JP011_S2_RH panel11;
    private  JP012_A_AF panel12A;
    private  JP012_E_AF panel12E;
    private  JP012_S2_AF panel12;
    private  JP014_S2_AF panel14;
    private  JP015_1_S2_RH panel15;
    private  JP016_S2_AF panel16;
    private  JP017_1_S2_RH panel17;
    private  JP018_S2_AF panel18;
    private  JP019_1_S2_RH panel19;
    private  JP021_S3_RH panel21;
    private  JP022_S3_AF panel22;
    private  JP024_S3_AF panel24;
    private  JP025_S3_RH panel25;
    private  JP028_S3_AF panel28;
    private  JP029_A_S3_RH panel29A;
    private  JP030_S3_AF panel29;
    private  JP030_S3_AF panel30;
    private  JP031_S3_RHG panel31;
    private  JP032_S3_AF panel32;
    private  JP033_S3_RH panel33;
    private  JP034_S3_AF panel34;
    private  JP036_S3_AF panel36;
    private  JP037_S3_RH panel37;
    private  JP038_S3_AF panel38;
    private  JP040_S3_AF panel40;
    private  JP041_1_S3_RH panel41;
    private  JP042_1_S3_AF panel42;
    private  JP043_1_S3_RH panel43;
    private  JP044_S3_AF panel44;
    private  JP045_S3_RH panel45;
    private JP047_S3_AF panel47;
    private JP0048_S3_RH panel48;





    
    // Paneles vacios
    private JPanel JP1;
    private JPanel JP2;
    private JPanel JP3_1;
    private JPanel JP3_2;
    private JPanel JP4;
    private JPanel JP5;
    private JPanel JP23;
    private JPanel JP39;
    private JPanel JP35p;
    private JPanel JP27;
    private JPanel JP06;
    private JPanel JP07;
    private JPanel JP08;
    private JPanel JP09;
    private JPanel JP010;
    private JPanel JP011;
    private JPanel JP012A;
    private JPanel JP012E;
    private JPanel JP012;
    private JPanel JP014;
    private JPanel JP015;
    private JPanel JP016;
    private JPanel JP017;
    private JPanel JP018;
    private JPanel JP019;
    private JPanel JP021;
    private JPanel JP022;
    private JPanel JP024;
    private JPanel JP025;
    private JPanel JP028;
    private JPanel JP029A;
    private JPanel JP029;
    private JPanel JP030;
    private JPanel JP031;
    private JPanel JP032;
    private JPanel JP033;
    private JPanel JP034;
    private JPanel JP036;
    private JPanel JP037;
    private JPanel JP038;
    private JPanel JP040;
    private JPanel JP041;
    private JPanel JP042;
    private JPanel JP043;
    private JPanel JP044;
    private JPanel JP045;
    private JPanel JP047;
    private JPanel JP048;

    private JPanel JP48;
    
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
        Genero modelGenero = new Genero();
        Pacientes modelPaciente = new Pacientes();
        ParaReporte reporte = new ParaReporte();
        RecetasMedicas recetas = new RecetasMedicas();
        
        ActividadesLaborales modelActivity = new ActividadesLaborales();
        panelesInicializador = new PanelesInicializador();
        Hints hint= new Hints();
        
        //Insetamos el valor de los paneles sin modificacion alguna
        panelesInicializador.setJP001_S1_AFP(panel1);
        panelesInicializador.setJP002_S1_RHP(panel2);
        panelesInicializador.setJP003_S1_RH(panel3);
        panelesInicializador.setJP003_2_S1_RH(panel3_2);
        panelesInicializador.setJP004_S2_AF(panel4);
        panelesInicializador.setJP005_2_S2_RH(panel5);
        panelesInicializador.setJP023_S3_RH(panel23);
        panelesInicializador.setJP039_S3_RH(paenl39);
        panelesInicializador.setJP035_1_S3_RH(panel35p);
        panelesInicializador.setJP027_S3_RH(panel27);
        panelesInicializador.setJP006_S2_AF(panel06);
        panelesInicializador.setJP007_S2_RH(panel07);
        panelesInicializador.setJP008_S2_AF(panel08);
        panelesInicializador.setJP009_S2_RH(panel09);
        panelesInicializador.setJP010_S2_AF(panel10);
        panelesInicializador.setJP011_S2_RH(panel11);
        panelesInicializador.setJP012_A_AF(panel12A);
        panelesInicializador.setJP012_E_AF(panel12E);
        panelesInicializador.setJP012_S2_AF(panel12);
        panelesInicializador.setJP014_S2_AF(panel14);
        panelesInicializador.setJP015_1_S2_RH(panel15);
        panelesInicializador.setJP016_S2_AF(panel16);
        panelesInicializador.setJP017_1_S2_RH(panel17);
        panelesInicializador.setJP018_S2_AF(panel18);
        panelesInicializador.setJP019_1_S2_RH(panel19);
        panelesInicializador.setJP021_S3_RH(panel21);
        panelesInicializador.setJP022_S3_AF(panel22);
        panelesInicializador.setJP024_S3_AF(panel24);
        panelesInicializador.setJP025_S3_RH(panel25);
        panelesInicializador.setJP028_S3_AF(panel28);
        panelesInicializador.setJP029_A_S3_RH(panel29A);
        panelesInicializador.setJP029_S3_RH(panel29);
        panelesInicializador.setJP030_S3_AF(panel30);
        panelesInicializador.setJP031_S3_RHG(panel31);
        panelesInicializador.setJP032_S3_AF(panel32);
        panelesInicializador.setJP033_S3_RH(panel33);
        panelesInicializador.setJP034_S3_AF(panel34);
        panelesInicializador.setJP036_S3_AF(panel36);
        panelesInicializador.setJP037_S3_RH(panel37);
        panelesInicializador.setJP038_S3_AF(panel38);
        panelesInicializador.setJP040_S3_AF(panel40);
        panelesInicializador.setJP041_1_S3_RH(panel41);
        panelesInicializador.setJP042_1_S3_AF(panel42);
        panelesInicializador.setJP043_1_S3_RH(panel43);
        panelesInicializador.setJP044_S3_AF(panel44);
        panelesInicializador.setJP045_S3_RH(panel45);
        panelesInicializador.setJP047_S3_AF(panel47);
        panelesInicializador.setJP0048_S3_RH(panel48);

        
        // Asignar paneles desde PanelesInicializador
        this.JP1 = panelesInicializador.getJP001_S1_AFP();
        this.JP2 = panelesInicializador.getJP002_S1_RHP();
        this.JP3_1 = panelesInicializador.getJP003_S1_RH();
        this.JP3_2 = panelesInicializador.getJP003_2_S1_RH();
        this.JP4 = panelesInicializador.getJP004_S2_AF();
        this.JP5 = panelesInicializador.getJP005_2_S2_RH();
        this.JP23 = panelesInicializador.getJP023_S3_RH();
        this.JP39 = panelesInicializador.getJP039_S3_RH();
        this.JP35p = panelesInicializador.getJP035_1_S3_RH();
        this.JP27 = panelesInicializador.getJP027_S3_RH();
        this.JP06 = panelesInicializador.getJP006_S2_AF();
        this.JP07 = panelesInicializador.getJP007_S2_RH();
        this.JP08 = panelesInicializador.getJP008_S2_AF();
        this.JP09 = panelesInicializador.getJP009_S2_RH();
        this.JP010 = panelesInicializador.getJP010_S2_AF();
        this.JP011 = panelesInicializador.getJP011_S2_RH();
        this.JP012A = panelesInicializador.getJP012_A_AF();
        this.JP012E = panelesInicializador.getJP012_E_AF();
        this.JP012 = panelesInicializador.getJP012_S2_AF();
        this.JP014 = panelesInicializador.getJP014_S2_AF();
        this.JP015 = panelesInicializador.getJP015_1_S2_RH();
        this.JP016 = panelesInicializador.getJP016_S2_AF();
        this.JP017 = panelesInicializador.getJP017_1_S2_RH();
        this.JP018 = panelesInicializador.getJP018_S2_AF();
        this.JP019 = panelesInicializador.getJP019_1_S2_RH();
        this.JP021 = panelesInicializador.getJP021_S3_RH();
        this.JP022 = panelesInicializador.getJP022_S3_AF();
        this.JP024 = panelesInicializador.getJP024_S3_AF();
        this.JP025 = panelesInicializador.getJP025_S3_RH();
        this.JP028 = panelesInicializador.getJP028_S3_AF();
        this.JP029A = panelesInicializador.getJP029_A_S3_RH();
        this.JP029 = panelesInicializador.getJP029_S3_RH();
        this.JP030 = panelesInicializador.getJP030_S3_AF();
        this.JP031 = panelesInicializador.getJP031_S3_RHG();
        this.JP032 = panelesInicializador.getJP032_S3_AF();
        this.JP033 = panelesInicializador.getJP033_S3_RH();
        this.JP034 = panelesInicializador.getJP034_S3_AF();
        this.JP036 = panelesInicializador.getJP036_S3_AF();
        this.JP037 = panelesInicializador.getJP037_S3_RH();
        this.JP038 = panelesInicializador.getJP038_S3_AF();
        this.JP040 = panelesInicializador.getJP040_S3_AF();
        this.JP041 = panelesInicializador.getJP041_1_S3_RH();
        this.JP042 = panelesInicializador.getJP042_1_S3_AF();
        this.JP043 = panelesInicializador.getJP043_1_S3_RH();
        this.JP044 = panelesInicializador.getJP044_S3_AF();
        this.JP045 = panelesInicializador.getJP045_S3_RH();
        this.JP047 = panelesInicializador.getJP047_S3_AF();
        this.JP048 = panelesInicializador.getJP0048_S3_RH();
        
        // Paneles
        SplashScreen panelSplash = new SplashScreen(vista.JPContenido);
        JP001_S1_AFP panelInicioSesion = new JP001_S1_AFP(controladorLogin, controladorPrimerUso);
        JP002_S1_RHP panelRegistro = new JP002_S1_RHP(controladorRegistrar);
        JP004_S2_AF panelMenuAdmin = new JP004_S2_AF(controladorMenuAd);
        JP005_2_S2_RH panelRec1Telefono = new JP005_2_S2_RH(controladorRec_tel1);
        JP023_S3_RH panelMenuTp = new JP023_S3_RH(controladorMenuTp);
        JP039_S3_RH panelMenuSec = new JP039_S3_RH(controladorMenuSec);
        JP003_S1_RH panelvalCorreo = new JP003_S1_RH(controladorValCorreo);
        JP003_2_S1_RH panelCorreoenviado = new JP003_2_S1_RH(controladorCorreoenviado);
        // Hacer esto mismo para todas las vistas 
        JP035_1_S3_RH panelVisualizarNotas = new JP035_1_S3_RH(controladorvisualizarnotas);
        JP027_S3_RH panelDocumentosView = new JP027_S3_RH(controladorDocumentosView);
        JP006_S2_AF panelCreacionDeAnuncios = new JP006_S2_AF(controladorCreacionDeAnuncios);
        JP007_S2_RH panelSeccionDeComentarios = new JP007_S2_RH(controladorSeccionDeComentarios);
        JP008_S2_AF panelPersonalClinica = new JP008_S2_AF(controladorPersonalClinica);
        JP009_S2_RH panelAgregarPerfilesDeUsuario = new JP009_S2_RH(controladorAgregarPerfilesDeUsuario);
        JP010_S2_AF panelDetallesDePerfil = new JP010_S2_AF(controladorDetallesDePerfil);
        JP011_S2_RH panelAnunciosActuales = new JP011_S2_RH(controladorAnunciosActuales);
        JP012_A_AF panelMBActualizarUsuario = new JP012_A_AF(controladorMBActualizarUsuario);
        JP012_E_AF panelMBEliminarUsuario = new JP012_E_AF(controladorMBEliminarUsuario);
        JP012_S2_AF panelBuscadorDeEmpleados = new JP012_S2_AF(controladorBuscadorEmpleados);
        JP014_S2_AF panelSolicitudesDeEmpleados = new JP014_S2_AF(controladorSolicitudesDeEmpleados);
        JP015_1_S2_RH panelNuevaSolicitudDeEmpleado = new JP015_1_S2_RH(controladorNuevaSolicitudDeEmpleado);
        JP016_S2_AF panelSolicitudAprobada = new JP016_S2_AF(controladorSolicitudesAprobadas);
        JP017_1_S2_RH panelSolicitudAprobadaMensaje = new JP017_1_S2_RH(controladorVerSolicitudAprobada);
        JP018_S2_AF panelSolicitudesAprobadas2 = new JP018_S2_AF(controladorSolicitudesAprobadas2);
        JP019_1_S2_RH panelSolicitudesRechazadas = new JP019_1_S2_RH(controladorVerSolicitudRechazada);
        JP021_S3_RH panelEliminarAnunciosActuales = new JP021_S3_RH(controladorEliminarAnunciosActuales);
        JP022_S3_AF panelEstadisticas = new JP022_S3_AF(controladorEstadisticas);
        JP024_S3_AF panelBuscadorPacientes = new JP024_S3_AF(controladorBuscadorPacientes);
        JP025_S3_RH panelDetallesDeMiPerfil = new JP025_S3_RH(controladorDetallesDeMiPerfil);
        JP028_S3_AF panelAgregarArticulo = new JP028_S3_AF(controladorAgregarArticulo);
        JP029_A_S3_RH panelMBEliminarArticulo = new JP029_A_S3_RH(controladorMBEliminarArticulo);
        JP029_S3_RH panelEliminarDocumentosDeApoyo = new JP029_S3_RH(controladorEliminarDocumentosDeApoyo);
        JP030_S3_AF panelActualizarArticulo = new JP030_S3_AF(controladorActualizarArticulo);
        JP031_S3_RHG panelExpedienteDelPaciente = new JP031_S3_RHG(controladorExpedienteDelPaciente);
        JP032_S3_AF panelRedactarMensaje = new JP032_S3_AF(controladorRedactarMensaje);
        JP033_S3_RH panelCreacionDePruebas = new JP033_S3_RH(controladorCreacionDePruebas);
        JP034_S3_AF panelEscribirEnTuAgendaPersonal = new JP034_S3_AF(controladorEscribirEnTuAgendaPersonal);
        JP036_S3_AF panelRecetarMedicamentos = new JP036_S3_AF(controladorRcetarMedicamentos);
        JP037_S3_RH PanelPruebasActualesCambios = new JP037_S3_RH(controladorCambiosPruebasActuales);
        JP038_S3_AF panelMBEliminarPruebas = new JP038_S3_AF(controladorMBEliminarPrueba);
        JP040_S3_AF panelVerMensaje = new JP040_S3_AF(controladorVerMensajes);
        JP041_1_S3_RH panelVerMensajeCH = new JP041_1_S3_RH(controladorVerMensajeCH);
        JP042_1_S3_AF panelMBEliminarCita = new JP042_1_S3_AF(controladorMBEliminarCita);
        JP043_1_S3_RH panelCrearCita = new JP043_1_S3_RH(controladorCrearCita);
        JP044_S3_AF panelEstadisticaDeCitas = new JP044_S3_AF(controladorEstadisticaDeCitas);
        JP045_S3_RH panelPruebasDF = new JP045_S3_RH(controladorPruebasDF);
        JP047_S3_AF panelSolicitudesDeIncapacidadRedactar = new JP047_S3_AF(controladorSolicitudesDeIncapacidadRedactar);
        JP0048_S3_RH panelPrimerUso = new JP0048_S3_RH(controladorPrimerUso);
        vista.JPContenido.add(panelSplash, "panelSplash");
        
        
        // Controladores
        controladorLogin = new Login(modelUsers, vista.JPContenido, Procesos, panelInicioSesion, panelHistory, habilitarPaneles, vista, panelPrimerUso, modelGenero, ModelContactos, modelActivity, modelAdmin, hint, panelDetallesDeMiPerfil);
        controladorRegistrar = new RegAdmin_JF002(modelAdmin, modelUsers, modelClinica, panelRegistro, vista.JPContenido, Procesos, panelHistory, habilitarPaneles, vista);
        controladorMenuAd = new Menu_Administrador(vista.JPContenido, panelMenuAdmin, habilitarPaneles);
        controladorMenuTp = new Menu_Terapeuta(vista.JPContenido, panelMenuTp, habilitarPaneles);
        controladorMenuSec = new Menu_Secretaria(vista.JPContenido);
        controladorValCorreo = new ValidarCorreo(ModelContactos, panelvalCorreo, Procesos, vista.JPContenido, habilitarPaneles);
        controladorCorreoenviado = new RecGmail(modelUsers, ModelContactos, panelCorreoenviado, Procesos, vista.JPContenido, habilitarPaneles);
        controladorRec_tel1 = new ValidarNum(vista.JPContenido);
        controladorAnuncios1 = new Anuncios1(vista.JPContenido);
        controladorvisualizarnotas = new VisualizarNotas(vista.JPContenido);
        controladorDocumentosView = new DocumentosDeApoyo(vista.JPContenido, habilitarPaneles, panelDocumentosView);
        controladorCreacionDeAnuncios = new CreacionDeAnuncios(vista.JPContenido);
        controladorSeccionDeComentarios = new SeccionDeComentarios(vista.JPContenido);
        controladorPersonalClinica = new PersonalClinica(vista.JPContenido, panelPersonalClinica,habilitarPaneles, reporte);
        controladorAgregarPerfilesDeUsuario = new AgregarPerfilesDeUsuario(vista.JPContenido, Procesos, habilitarPaneles, modelEmpleado, panelAgregarPerfilesDeUsuario, modelUsers);
        controladorDetallesDePerfil = new DetallesDePerfil(vista.JPContenido);
        controladorAnunciosActuales = new AnunciosActuales(vista.JPContenido);
        controladorMBActualizarUsuario = new MBActualizarUsuario(vista.JPContenido);
        controladorMBEliminarUsuario = new MBEliminarUsuario(vista.JPContenido);
        controladorBuscadorEmpleados = new BuscadorEmpleados(vista.JPContenido);
        controladorSolicitudesDeEmpleados = new SolicitudesDeEmpleados(vista.JPContenido);
        controladorNuevaSolicitudDeEmpleado = new NuevaSolicitudDeEmpleado(vista.JPContenido);
        controladorSolicitudesAprobadas = new SolicitudesAprobadas(vista.JPContenido);
        controladorVerSolicitudAprobada = new VerSolicitudAprobada(vista.JPContenido);
        controladorSolicitudesAprobadas2 = new SolicitudesAprobadas2(vista.JPContenido);
        controladorVerSolicitudRechazada = new VerSolicitudRechazada(vista.JPContenido);
        controladorEliminarAnunciosActuales = new EliminarAnunciosActuales(vista.JPContenido);
        controladorEstadisticas = new Estadisticas(vista.JPContenido);
        controladorBuscadorPacientes = new BuscadorPacientes(vista.JPContenido, modelPaciente, panelBuscadorPacientes, habilitarPaneles, Procesos, resultado, modelUsers, ModelContactos, panelExpedienteDelPaciente);
        controladorDetallesDeMiPerfil = new DetallesDeMiPerfil(vista.JPContenido, panelDetallesDeMiPerfil, modelUsers, Procesos, habilitarPaneles);
        controladorAgregarArticulo = new AgregarArticulo(vista.JPContenido);
        controladorMBEliminarArticulo = new MBEliminarArticulo(vista.JPContenido);
        controladorEliminarDocumentosDeApoyo = new EliminarDocumentosDeApoyo(vista.JPContenido);
        controladorActualizarArticulo = new ActualizarArticulo(vista.JPContenido);
        controladorExpedienteDelPaciente = new ExpedienteDelPaciente(vista.JPContenido, modelPaciente, modelUsers, panelExpedienteDelPaciente, Procesos, habilitarPaneles, ModelContactos);
        controladorRedactarMensaje = new RedactarMensaje(vista.JPContenido);
        controladorCreacionDePruebas = new CreacionDePruebas(vista.JPContenido);
        controladorEscribirEnTuAgendaPersonal = new EscribirEnTuAgendaPersonal(vista.JPContenido);
        controladorRcetarMedicamentos = new RcetarMedicamentos(vista.JPContenido, panelRecetarMedicamentos, reporte, recetas, Procesos);
        controladorCambiosPruebasActuales = new CambiosPruebasActuales(vista.JPContenido);
        controladorMBEliminarPrueba = new MBEliminarPrueba(vista.JPContenido);
        controladorVerMensajes = new VerMensajes(vista.JPContenido);
        controladorVerMensajeCH = new VerMensajeCH(vista.JPContenido);
        controladorMBEliminarCita = new MBEliminarCita(vista.JPContenido);
        controladorCrearCita = new CrearCita(vista.JPContenido);
        controladorEstadisticaDeCitas = new EstadisticaDeCitas(vista.JPContenido);
        controladorPruebasDF = new PruebasDF(vista.JPContenido);
        controladorSolicitudesDeIncapacidadRedactar = new SolicitudesDeIncapacidadRedactar(vista.JPContenido);
        controladorFormularioInicio = new FormularioInicio(vista.JPContenido);
        controladorPrimerUso = new primer_uso(modelAdmin,vista.JPContenido, modelUsers, panelPrimerUso, Procesos, habilitarPaneles, modelGenero, ModelContactos, modelActivity);
        

        // Agregar paneles a la vista
        vista.JPContenido.add(panelSplash, "panelSplash");
        habilitarPaneles.agregarPanel("panelInicioSesion", panelInicioSesion);
        vista.JPContenido.add(panelInicioSesion, "panelInicioSesion");
        habilitarPaneles.agregarPanel("panelRegistro", panelRegistro);
        vista.JPContenido.add(panelRegistro, "panelRegistro");
        habilitarPaneles.agregarPanel("panelMenuAdmin", panelMenuAdmin);
        vista.JPContenido.add(panelMenuAdmin, "panelMenuAdmin");
        habilitarPaneles.agregarPanel("panelvalCorreo", panelvalCorreo);
        vista.JPContenido.add(panelvalCorreo, "panelvalCorreo");
        habilitarPaneles.agregarPanel("panelCorreoenviado", panelCorreoenviado);
        vista.JPContenido.add(panelCorreoenviado, "panelCorreoenviado");
        habilitarPaneles.agregarPanel("panelRec1Telefono", panelRec1Telefono);
        vista.JPContenido.add(panelRec1Telefono, "panelRec1Telefono");
        habilitarPaneles.agregarPanel("panelMenuTp", panelMenuTp);
        vista.JPContenido.add(panelMenuTp, "panelMenuTp");
        habilitarPaneles.agregarPanel("panelMenuSec", panelMenuSec);
        vista.JPContenido.add(panelMenuSec, "panelMenuSec");
        habilitarPaneles.agregarPanel("panelVisualizarNotas", panelVisualizarNotas);
        vista.JPContenido.add(panelVisualizarNotas, "panelVisualizarNotas");
        habilitarPaneles.agregarPanel("panelDocumentosView", panelDocumentosView);
        vista.JPContenido.add(panelDocumentosView, "panelDocumentosView");
        habilitarPaneles.agregarPanel("panelCreacionDeAnuncios", panelCreacionDeAnuncios);
        vista.JPContenido.add(panelCreacionDeAnuncios, "panelCreacionDeAnuncios");
        
        habilitarPaneles.agregarPanel("panelSeccionDeComentarios", panelSeccionDeComentarios);
        vista.JPContenido.add(panelSeccionDeComentarios, "panelSeccionDeComentarios");
        
        habilitarPaneles.agregarPanel("panelPersonalClinica", panelPersonalClinica);
        vista.JPContenido.add(panelPersonalClinica, "panelPersonalClinica");
        
        habilitarPaneles.agregarPanel("panelAgregarPerfilesDeUsuario", panelAgregarPerfilesDeUsuario);
        vista.JPContenido.add(panelAgregarPerfilesDeUsuario, "panelAgregarPerfilesDeUsuario");
        
        habilitarPaneles.agregarPanel("panelDetallesDePerfil", panelDetallesDePerfil);
        vista.JPContenido.add(panelDetallesDePerfil, "panelDetallesDePerfil");
        
        habilitarPaneles.agregarPanel("panelAnunciosActuales", panelAnunciosActuales);
        vista.JPContenido.add(panelAnunciosActuales, "panelAnunciosActuales");
        
        habilitarPaneles.agregarPanel("panelMBActualizarUsuario", panelMBActualizarUsuario);
        vista.JPContenido.add(panelMBActualizarUsuario, "panelMBActualizarUsuario");
        
        habilitarPaneles.agregarPanel("panelMBEliminarUsuario", panelMBEliminarUsuario);
        vista.JPContenido.add(panelMBEliminarUsuario, "panelMBEliminarUsuario");
        
        habilitarPaneles.agregarPanel("panelBuscadorDeEmpleados", panelBuscadorDeEmpleados);
        vista.JPContenido.add(panelBuscadorDeEmpleados, "panelBuscadorDeEmpleados");
        
        habilitarPaneles.agregarPanel("panelSolicitudesDeEmpleados", panelSolicitudesDeEmpleados);
        vista.JPContenido.add(panelSolicitudesDeEmpleados, "panelSolicitudesDeEmpleados");
        
        habilitarPaneles.agregarPanel("panelNuevaSolicitudDeEmpleado", panelNuevaSolicitudDeEmpleado);
        vista.JPContenido.add(panelNuevaSolicitudDeEmpleado, "panelNuevaSolicitudDeEmpleado");
        
         habilitarPaneles.agregarPanel("panelSolicitudAprobada", panelSolicitudAprobada);
        vista.JPContenido.add(panelSolicitudAprobada, "panelSolicitudAprobada");
        
         habilitarPaneles.agregarPanel("panelSolicitudAprobadaMensaje", panelSolicitudAprobadaMensaje);
        vista.JPContenido.add(panelSolicitudAprobadaMensaje, "panelSolicitudAprobadaMensaje");
        
         habilitarPaneles.agregarPanel("panelSolicitudesAprobadas2", panelSolicitudesAprobadas2);
        vista.JPContenido.add(panelSolicitudesAprobadas2, "panelSolicitudesAprobadas2");
        
        habilitarPaneles.agregarPanel("panelSolicitudesRechazadas", panelSolicitudesRechazadas);
        vista.JPContenido.add(panelSolicitudesRechazadas, "panelSolicitudesRechazadas");
        
        habilitarPaneles.agregarPanel("panelEliminarAnunciosActuales", panelEliminarAnunciosActuales);
        vista.JPContenido.add(panelEliminarAnunciosActuales, "panelEliminarAnunciosActuales");
        
        habilitarPaneles.agregarPanel("panelEstadisticas", panelEstadisticas);
        vista.JPContenido.add(panelEstadisticas, "panelEstadisticas");
        
        habilitarPaneles.agregarPanel("panelBuscadorPacientes", panelBuscadorPacientes);
        vista.JPContenido.add(panelBuscadorPacientes, "panelBuscadorPacientes");
     
         habilitarPaneles.agregarPanel("panelDetallesDeMiPerfil", panelDetallesDeMiPerfil);
        vista.JPContenido.add(panelDetallesDeMiPerfil, "panelDetallesDeMiPerfil");
        
         habilitarPaneles.agregarPanel("panelAgregarArticulo", panelAgregarArticulo);
        vista.JPContenido.add(panelAgregarArticulo, "panelAgregarArticulo");
        
         habilitarPaneles.agregarPanel("panelMBEliminarArticulo", panelMBEliminarArticulo);
        vista.JPContenido.add(panelMBEliminarArticulo, "panelMBEliminarArticulo");
       
        habilitarPaneles.agregarPanel("panelEliminarDocumentosDeApoyo", panelEliminarDocumentosDeApoyo);
        vista.JPContenido.add(panelEliminarDocumentosDeApoyo, "panelEliminarDocumentosDeApoyo");
        
         habilitarPaneles.agregarPanel("panelActualizarArticulo", panelActualizarArticulo);
        vista.JPContenido.add(panelActualizarArticulo, "panelActualizarArticulo");
        
        habilitarPaneles.agregarPanel("panelExpedienteDelPaciente", panelExpedienteDelPaciente);
        vista.JPContenido.add(panelExpedienteDelPaciente, "panelExpedienteDelPaciente");
        
        habilitarPaneles.agregarPanel("panelRedactarMensaje", panelRedactarMensaje);
        vista.JPContenido.add(panelRedactarMensaje, "panelRedactarMensaje");
        
        habilitarPaneles.agregarPanel("panelCreacionDePruebas", panelCreacionDePruebas);
        vista.JPContenido.add(panelCreacionDePruebas, "panelCreacionDePruebas");
        
        habilitarPaneles.agregarPanel("panelEscribirEnTuAgendaPersonal", panelEscribirEnTuAgendaPersonal);
        vista.JPContenido.add(panelEscribirEnTuAgendaPersonal, "panelEscribirEnTuAgendaPersonal");
                
        habilitarPaneles.agregarPanel("panelRecetarMedicamentos", panelRecetarMedicamentos);
        vista.JPContenido.add(panelRecetarMedicamentos, "panelRecetarMedicamentos");
        
        habilitarPaneles.agregarPanel("PanelPruebasActualesCambios", PanelPruebasActualesCambios);
        vista.JPContenido.add(PanelPruebasActualesCambios, "PanelPruebasActualesCambios");
        
        habilitarPaneles.agregarPanel("panelMBEliminarPruebas", panelMBEliminarPruebas);
        vista.JPContenido.add(panelMBEliminarPruebas, "panelMBEliminarPruebas");
        
        habilitarPaneles.agregarPanel("panelVerMensaje", panelVerMensaje);
        vista.JPContenido.add(panelVerMensaje, "panelVerMensaje");
        
        habilitarPaneles.agregarPanel("panelVerMensajeCH", panelVerMensajeCH);
        vista.JPContenido.add(panelVerMensajeCH, "panelVerMensajeCH");
        
        habilitarPaneles.agregarPanel("panelMBEliminarCita", panelMBEliminarCita);
        vista.JPContenido.add(panelMBEliminarCita, "panelMBEliminarCita");
        
        habilitarPaneles.agregarPanel("panelCrearCita", panelCrearCita);
        vista.JPContenido.add(panelCrearCita, "panelCrearCita");
        
        habilitarPaneles.agregarPanel("panelEstadisticaDeCitas", panelEstadisticaDeCitas);
        vista.JPContenido.add(panelEstadisticaDeCitas, "panelEstadisticaDeCitas");
        
        habilitarPaneles.agregarPanel("panelPruebasDF", panelPruebasDF);
        vista.JPContenido.add(panelPruebasDF, "panelPruebasDF");
        
        habilitarPaneles.agregarPanel("panelSolicitudesDeIncapacidadRedactar", panelSolicitudesDeIncapacidadRedactar);
        vista.JPContenido.add(panelSolicitudesDeIncapacidadRedactar, "panelSolicitudesDeIncapacidadRedactar");
        
        habilitarPaneles.agregarPanel("panelPrimerUso", panelPrimerUso);
        vista.JPContenido.add(panelPrimerUso, "panelPrimerUso");
        
    }
}
