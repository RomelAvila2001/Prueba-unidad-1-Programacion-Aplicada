/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Participantes;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author NANCY
 */
public class ControladorPartisipantes extends Controlador<Participantes> {

    public ControladorPartisipantes(String ruta) {
        super(ruta);
    }

   
    @Override
    public boolean validar(Participantes obj) {
       return true;
    }
    
}
