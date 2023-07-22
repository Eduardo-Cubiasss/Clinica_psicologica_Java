package ux;

import Ui.JP001_S1_AFP;
import Ui.JP002_S1_RHP;

public class Hints_Herencia {
    private JP001_S1_AFP vista1;
    private JP002_S1_RHP vista2;

    public Hints_Herencia(JP001_S1_AFP vista1, JP002_S1_RHP vista2) {
        this.vista1 = vista1;
        this.vista2 = vista2;
        
        Hints.addHint(vista1.TxtUsuario_JF001_S1_AF, "Ingrese su usuario");   
        Hints.addHint(vista2.TxtID_JF002_S1_RH3, "Ingrese un id único");
    }
}
