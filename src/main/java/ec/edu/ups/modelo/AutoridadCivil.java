/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author NANCY
 */
public class AutoridadCivil extends Persona{
    private String cargo;
    private String correo;
    private String contraseña;
    

    public AutoridadCivil() {
    }

    public AutoridadCivil(String cargo, String correo, String contraseña, String cedula, String nombre, String apellido, String genero, String fechaNacimiento, String direccion, String rol) {
        super(cedula, nombre, apellido, genero, fechaNacimiento, direccion, rol);
        this.cargo = cargo;
        this.correo = correo;
        this.contraseña = contraseña;
    }

   

    

    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return super.toString()+"\nAutoridadCivil{" + "cargo=" + cargo + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + '}';
    }

}
