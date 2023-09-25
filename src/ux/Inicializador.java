package ux;

import Database.ActividadesLaborales;
import Database.Administrador;
import Database.AgendasPersonales;
import Database.Anuncios;
import Database.Articulos;
import Database.Citas;
import Database.Clinica;
import Database.Comentarios;
import Database.Contactos;
import Database.Empleado;
import Database.Expedientes;
import Database.Genero;
import Database.Incapacidades;
import Database.Llaves;
import Database.Opciones;
import Database.Pacientes;
import Database.Preguntas;
import Database.Procesos_almacenados;
import Database.Pruebas;
import Database.RecetasMedicas;
import Database.Respuestas;
import Database.Resultados;
import Database.Secretarias;
import Database.Terapeutas;
import Database.TipoUsuarios;
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
import Ui.JP035_S3_RH;
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
import java.awt.CardLayout;
import java.util.Map;

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
    private VisualizarNotas controladorVisualizarNota;
    private Resultado resultado;
    private Empleado modelEmpleado;
    private ActividadesLaborales ActividadLaboral;
    private Administrador modelAdmin;
    private AgendasPersonales AgendaPersonal;
    private Anuncios Anuncios;
    private Articulos Articulo;
    private Citas Citas;
    private Clinica modelClinica;
    private Comentarios Comentarios;
    private Contactos ModelContactos;
    private Expedientes Expedientes;
    private Genero modelGenero;
    private Incapacidades Incapacidades;
    private Llaves Llaves;
    private Opciones Opciones;
    private Pacientes modelPaciente;
    private Preguntas Pregunta;
    private Procesos_almacenados Procesos;
    private Pruebas Pruebas;
    private RecetasMedicas recetas;
    private Respuestas Respuestas;
    private Resultados resultados;
    private Secretarias Secretarias;
    private Terapeutas Terapeutas;
    private TipoUsuarios TipoUser;
    private Usuarios modelUsers;
    private JPanel panelActual = null;

    private Stack<JPanel> historialPaneles = new Stack<>();

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
        Empleado modelEmpleado = new Empleado();
        Resultados resultados = new Resultados();
        AgendasPersonales AgendaPersonal = new AgendasPersonales();
        Anuncios Anuncios = new Anuncios();
        Articulo = new Articulos();
        Citas Citas = new Citas();
        Comentarios Comentarios = new Comentarios();
        Expedientes Expedientes = new Expedientes();
        Incapacidades Incapacidades = new Incapacidades();
        Llaves Llaves = new Llaves();
        Opciones Opciones = new Opciones();
        Preguntas Pregunta = new Preguntas();
        Pruebas Pruebas = new Pruebas();
        Respuestas Respuestas = new Respuestas();
        Secretarias Secretarias = new Secretarias();
        Terapeutas Terapeutas = new Terapeutas();
        TipoUsuarios TipoUser = new TipoUsuarios();
        //Estadisticas controladorEstadistica = new Estadisticas();
        panelesInicializador = new PanelesInicializador();
        Hints hint = new Hints();

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
        JP035_1_S3_RH PanelvisualizarNota = new JP035_1_S3_RH(controladorVisualizarNota);
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
        controladorLogin = new Login(modelUsers, vista.JPContenido, Procesos, panelInicioSesion, panelHistory, habilitarPaneles, vista, panelPrimerUso, modelGenero, ModelContactos, modelActivity, modelAdmin, hint, panelDetallesDeMiPerfil, Terapeutas, modelEmpleado, modelClinica, Secretarias,
                this);
        controladorRegistrar = new RegAdmin_JF002(modelAdmin, modelUsers, modelClinica, panelRegistro, vista.JPContenido, Procesos, panelHistory, habilitarPaneles, vista, this);
        controladorMenuAd = new Menu_Administrador(vista.JPContenido, panelMenuAdmin, habilitarPaneles);
        controladorMenuSec = new Menu_Secretaria(vista.JPContenido, panelMenuSec, habilitarPaneles);
        controladorValCorreo = new ValidarCorreo(ModelContactos, panelvalCorreo, Procesos, vista.JPContenido, habilitarPaneles);
        controladorCorreoenviado = new RecGmail(modelUsers, ModelContactos, panelCorreoenviado, Procesos, vista.JPContenido, habilitarPaneles);
        controladorRec_tel1 = new ValidarNum(vista.JPContenido);
        controladorAnuncios1 = new Anuncios1(vista.JPContenido);
        controladorvisualizarnotas = new VisualizarNotas(vista.JPContenido, PanelvisualizarNota, habilitarPaneles);
        controladorDocumentosView = new DocumentosDeApoyo(vista.JPContenido, habilitarPaneles, panelDocumentosView, Procesos, Articulo);
        controladorMenuTp = new Menu_Terapeuta(vista.JPContenido, panelMenuTp, habilitarPaneles, controladorDocumentosView, Articulo, Procesos);
        controladorSeccionDeComentarios = new SeccionDeComentarios(vista.JPContenido, panelSeccionDeComentarios, habilitarPaneles);
        controladorPersonalClinica = new PersonalClinica(vista.JPContenido, panelPersonalClinica, habilitarPaneles, reporte);
        controladorAgregarPerfilesDeUsuario = new AgregarPerfilesDeUsuario(vista.JPContenido, Procesos, habilitarPaneles, modelEmpleado, panelAgregarPerfilesDeUsuario, modelUsers, modelAdmin, ModelContactos);
        controladorDetallesDePerfil = new DetallesDePerfil(vista.JPContenido, panelDetallesDePerfil, habilitarPaneles, modelEmpleado);
        controladorAnunciosActuales = new AnunciosActuales(vista.JPContenido, panelAnunciosActuales, habilitarPaneles, Anuncios, Procesos);
        controladorMBActualizarUsuario = new MBActualizarUsuario(vista.JPContenido);
        controladorMBEliminarUsuario = new MBEliminarUsuario(vista.JPContenido);
        controladorBuscadorEmpleados = new BuscadorEmpleados(vista.JPContenido, panelBuscadorDeEmpleados, modelEmpleado, modelActivity, Procesos, habilitarPaneles, resultado, panelDetallesDePerfil);
        controladorSolicitudesDeEmpleados = new SolicitudesDeEmpleados(vista.JPContenido, panelSolicitudesDeEmpleados, habilitarPaneles);
        controladorNuevaSolicitudDeEmpleado = new NuevaSolicitudDeEmpleado(vista.JPContenido, panelNuevaSolicitudDeEmpleado, habilitarPaneles);
        controladorSolicitudesAprobadas = new SolicitudesAprobadas(vista.JPContenido, panelSolicitudAprobada, habilitarPaneles);
        controladorVerSolicitudAprobada = new VerSolicitudAprobada(vista.JPContenido, panelSolicitudAprobadaMensaje);
        controladorSolicitudesAprobadas2 = new SolicitudesAprobadas2(vista.JPContenido, panelSolicitudesAprobadas2, habilitarPaneles);
        controladorVerSolicitudRechazada = new VerSolicitudRechazada(vista.JPContenido, panelSolicitudesRechazadas);
        controladorEliminarAnunciosActuales = new EliminarAnunciosActuales(vista.JPContenido, panelEliminarAnunciosActuales, habilitarPaneles, Procesos, Anuncios);
        controladorEstadisticas = new Estadisticas(vista.JPContenido, panelEstadisticas, habilitarPaneles, reporte);
        controladorBuscadorPacientes = new BuscadorPacientes(vista.JPContenido, modelPaciente, panelBuscadorPacientes, habilitarPaneles, Procesos, resultado, modelUsers, ModelContactos, panelExpedienteDelPaciente);
        controladorDetallesDeMiPerfil = new DetallesDeMiPerfil(vista.JPContenido, panelDetallesDeMiPerfil, modelUsers, Procesos, habilitarPaneles);
        controladorAgregarArticulo = new AgregarArticulo(vista.JPContenido, panelAgregarArticulo, habilitarPaneles, Articulo, Procesos, Terapeutas);
        controladorMBEliminarArticulo = new MBEliminarArticulo(vista.JPContenido);
        controladorCreacionDeAnuncios = new CreacionDeAnuncios(vista.JPContenido, panelCreacionDeAnuncios, habilitarPaneles, controladorAnunciosActuales, Anuncios, Procesos, controladorEliminarAnunciosActuales);
        controladorEliminarDocumentosDeApoyo = new EliminarDocumentosDeApoyo(vista.JPContenido, panelEliminarDocumentosDeApoyo, habilitarPaneles);
        controladorActualizarArticulo = new ActualizarArticulo(vista.JPContenido, panelActualizarArticulo, Articulo, Procesos, Terapeutas);
        controladorExpedienteDelPaciente = new ExpedienteDelPaciente(vista.JPContenido, modelPaciente, modelUsers, panelExpedienteDelPaciente, Procesos, habilitarPaneles, ModelContactos, panelVisualizarNotas, AgendaPersonal, Expedientes, panelEscribirEnTuAgendaPersonal);
        controladorRedactarMensaje = new RedactarMensaje(vista.JPContenido, panelRedactarMensaje, habilitarPaneles, modelUsers, Incapacidades, Procesos);
        controladorCreacionDePruebas = new CreacionDePruebas(vista.JPContenido, panelCreacionDePruebas, habilitarPaneles);
        controladorEscribirEnTuAgendaPersonal = new EscribirEnTuAgendaPersonal(vista.JPContenido, panelEscribirEnTuAgendaPersonal, habilitarPaneles, Procesos, Terapeutas, modelPaciente, Expedientes);
        controladorRcetarMedicamentos = new RcetarMedicamentos(vista.JPContenido, panelRecetarMedicamentos, reporte, recetas, Procesos);
        controladorCambiosPruebasActuales = new CambiosPruebasActuales(vista.JPContenido, PanelPruebasActualesCambios);
        controladorMBEliminarPrueba = new MBEliminarPrueba(vista.JPContenido);
        controladorVerMensajes = new VerMensajes(vista.JPContenido, panelVerMensaje, habilitarPaneles);
        controladorVerMensajeCH = new VerMensajeCH(vista.JPContenido, panelVerMensajeCH, habilitarPaneles);
        controladorMBEliminarCita = new MBEliminarCita(vista.JPContenido);
        controladorCrearCita = new CrearCita(vista.JPContenido, panelCrearCita, habilitarPaneles);
        controladorEstadisticaDeCitas = new EstadisticaDeCitas(vista.JPContenido, panelEstadisticaDeCitas);
        controladorPruebasDF = new PruebasDF(vista.JPContenido, panelPruebasDF, habilitarPaneles);
        controladorSolicitudesDeIncapacidadRedactar = new SolicitudesDeIncapacidadRedactar(vista.JPContenido, panelSolicitudesDeIncapacidadRedactar);
        controladorFormularioInicio = new FormularioInicio(vista.JPContenido);
        controladorPrimerUso = new primer_uso(modelAdmin, vista.JPContenido, modelUsers, panelPrimerUso, Procesos, habilitarPaneles, modelGenero, ModelContactos, modelActivity);

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

 public void abrirPanel(JPanel JPContenido, String nombrePanel, String nombrePanelActual) {
    //JPanel panelActual = panelMap.get(nombrePanelActual);
    
    if (panelActual != null) {
        JPContenido.remove(panelActual); // Oculta el panel actual
    }
    
   // JPanel panelNuevo = panelMap.get(nombrePanel);
   // if (panelNuevo != null) {
     //   JPContenido.add(panelNuevo, nombrePanel); // Agrega el nuevo panel al JPContenido
       // ((CardLayout) JPContenido.getLayout()).show(JPContenido, nombrePanel); // Muestra el nuevo panel
        //JPContenido.revalidate();
        //JPContenido.repaint();
    }




    //private JPanel obtenerPanel(String nombrePanel) {
        // Aquí debes implementar la lógica para obtener el panel correspondiente
        // basado en su nombre. Esto puede variar dependiendo de cómo estés
        // estructurando tu código y tus paneles.
        // Devuelve el panel deseado.
      //  return null;
    //}
}
