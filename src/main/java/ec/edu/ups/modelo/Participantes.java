/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author NANCY
 */
public class Participantes extends Persona{

    private String estadoCivil;

    public Participantes(String estadoCivil, String cedula, String nombre, String apellido, String genero, String fechaNacimiento, String direccion, String rol) {
        super(cedula, nombre, apellido, genero, fechaNacimiento, direccion, rol);
        this.estadoCivil = estadoCivil;
    }


    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    

    @Override
    public String toString() {
        return super.toString()+"Participantes{" + "estadoCivil=" + estadoCivil + '}';
    }
    
    
    
}
