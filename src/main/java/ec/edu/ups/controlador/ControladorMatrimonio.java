/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Matrimonio;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author NANCY
 */
public class ControladorMatrimonio extends Controlador<Matrimonio>{

    
    @Override
    public boolean validar(Matrimonio obj) {
        if(obj.getContrayente1().getEstadoCivil().equalsIgnoreCase("Casado") && obj.getContrayente2().getEstadoCivil().equalsIgnoreCase("Casado") ){
            return false;
        }
        return true;
    }
    
    public int cargarCodigo(){
        if (findAll().size() > 0) {
            return findAll().size() + 1;
        } else {
            return 1;
        }
    }
}
