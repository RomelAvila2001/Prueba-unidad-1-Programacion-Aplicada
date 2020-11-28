/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.AutoridadCivil;
import ec.edu.ups.modelo.Matrimonio;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author NANCY
 */
public class ControladorAutoridad extends Controlador<AutoridadCivil> {

    public ControladorAutoridad(String ruta) {
        super(ruta);
    }

    @Override
    public boolean validar(AutoridadCivil obj) {
        return true;
    }
    
    public AutoridadCivil iniciarSesion(String correo, String contrase) {
        for (var autoridad : (List<AutoridadCivil>) findAll()) {
            if (autoridad.getCorreo().equals(correo) && autoridad.getContraseña().equals(contrase)) {
                return autoridad;
            }
        }
        return null; 
   }
    
}
