package ux;

import Ui.JP001_S1_AFP;
import Ui.JP002_S1_RHP;
import Ui.JP003_S1_RH;
import Ui.JP0048_S3_RH;
import Ui.JP009_S2_RH;
import Ui.JP031_S3_RH;
import Ui.JP024_S3_AF;

public class Hints_Herencia {

    private JP001_S1_AFP vista1;
    private JP002_S1_RHP vista2;
    private JP003_S1_RH vista3;
    private JP0048_S3_RH vista4;
    private JP009_S2_RH vista5;
    private JP031_S3_RH vista6;
    private JP024_S3_AF vista7;

    public Hints_Herencia(JP001_S1_AFP vista1, JP002_S1_RHP vista2, JP003_S1_RH vista3, JP0048_S3_RH vista4, JP009_S2_RH vista5, JP031_S3_RH vista6, JP024_S3_AF vista7) {
        this.vista1 = vista1;
        this.vista2 = vista2;
        this.vista3 = vista3;
        this.vista4 = vista4;
        this.vista5 = vista5;
        this.vista6 = vista6;
        this.vista7 = vista7;

        Hints.addHint(vista1.TxtUsuario_JF001_S1_AF, "Ingrese su usuario");
        Hints.addHint(vista2.TxtID_JF002_S1_RH3, "Ingrese un id único");
        Hints.addHint(vista3.TxtCorreoRegister_JF003_S1_RH, "Correo Electronico registrado");
        Hints.addHint(vista4.txtCorreoElectronico_jp0048_RH, "Correo Electronico");
        Hints.addHint(vista4.txtActiLabo_JP0048, "Actividad laboral");
        Hints.addHint(vista4.txtNumTel_JP0048, "Número telefonico, solo escriba números");
        Hints.addHint(vista4.txtFechaNa_JP0048, "Fecha de Nacimiento");
        Hints.addHint(vista4.txtDui_JP0048, "Dui");
        Hints.addHint(vista5.TxtTipoUsuario_JF009_S2_RH1, "Insertar tipo de usuario");
        Hints.addHint(vista5.TxtContraseña_JF009_S2_RH, "Insertar contraseña");
        Hints.addHint(vista5.TxtCorreoE_JF009_S2_RH, "insertar el correo electrónico");
        Hints.addHint(vista5.TxtNombre_JF009_S2_RH, "Insertar nombre de usuario");

        Hints.addHint(vista6.txtEscribirMensaje_JP031_S3_RH, "Insertar mensaje");

        Hints.addHint(vista7.txtBuscar_JP024, "Buscar paciente");

    }
}
