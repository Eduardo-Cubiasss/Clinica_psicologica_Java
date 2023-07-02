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
public class Administrador {
    private int IDAdministrador;
    private String Nombre;
    private String Apellido; 
    private String FNacimiento; 
    private String DUI;
    private int IDTipoUsuario;
    private int IDGenero; 
    private int IDClinica; 
    private int IDUsuario; 

    public int getIDAdministrador() {
        return IDAdministrador;
    }

    public void setIDAdministrador(int IDAdministrador) {
        this.IDAdministrador = IDAdministrador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getFNacimiento() {
        return FNacimiento;
    }

    public void setFNacimiento(String FNacimiento) {
        this.FNacimiento = FNacimiento;
    }

    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    public int getIDTipoUsuario() {
        return IDTipoUsuario;
    }

    public void setIDTipoUsuario(int IDTipoUsuario) {
        this.IDTipoUsuario = IDTipoUsuario;
    }

    public int getIDGenero() {
        return IDGenero;
    }

    public void setIDGenero(int IDGenero) {
        this.IDGenero = IDGenero;
    }

    public int getIDClinica() {
        return IDClinica;
    }

    public void setIDClinica(int IDClinica) {
        this.IDClinica = IDClinica;
    }

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }
    
}
