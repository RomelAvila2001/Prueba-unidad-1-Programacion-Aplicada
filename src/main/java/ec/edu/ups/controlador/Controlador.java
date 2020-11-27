/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NANCY
 * @param <T>
 */
public abstract class Controlador <T> {
    private List<T> listaGenerica;

    public Controlador() {
        listaGenerica = new ArrayList<>();
    }
    public abstract boolean validar(T obj);
    
    public void guardarDatos(String ruta) throws FileNotFoundException, IOException {
        FileOutputStream archivo = new FileOutputStream(ruta);
        ObjectOutputStream datos = new ObjectOutputStream(archivo);
        datos.writeObject(listaGenerica);
    }
    
    public void cargarDatos(String ruta) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream archivo = new FileInputStream(ruta);
        ObjectInputStream datos = new ObjectInputStream(archivo);
        listaGenerica= (List<T>) datos.readObject();
    }
    
    public boolean create(T objeto) {
        if(validar(objeto)==true){  
            return listaGenerica.add(objeto);
        } 
        return false;
    }
    
     public T read(T comp){
        try{
            return listaGenerica.stream().filter(objeto->objeto.equals(comp)).findFirst().get();    
        }catch(Exception ex){} 
       return null;
        
    }
     
    public List<T> findAll() {
        return listaGenerica;
    }
    
}
