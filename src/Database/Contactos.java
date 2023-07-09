/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author 50369
 */
public class Contactos {

    private int IDContacto;
    private String Correo;
    private String NumTelefonico;

    public int getIDContacto() {
        return IDContacto;
    }

    public void setIDContacto(int IDContacto) {
        this.IDContacto = IDContacto;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getNumTelefonico() {
        return NumTelefonico;
    }

    public void setNumTelefonico(String NumTelefonico) {
        this.NumTelefonico = NumTelefonico;
    }

}
