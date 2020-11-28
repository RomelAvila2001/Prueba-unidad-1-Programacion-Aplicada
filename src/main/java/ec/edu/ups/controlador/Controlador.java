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
    private String ruta;

    public Controlador(String ruta) {
        listaGenerica = new ArrayList<>();
        this.ruta=ruta;
        cargarDatos();
    }
    public abstract boolean validar(T obj);
    
    public void cargarDatos(){
        try{
            FileInputStream archivo = new FileInputStream(ruta);
            ObjectInputStream datos = new ObjectInputStream(archivo);
            listaGenerica= (List<T>) datos.readObject();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        
    }
    
    public void guardarDatos(String ruta) throws FileNotFoundException, IOException {
        FileOutputStream archivo = new FileOutputStream(ruta);
        ObjectOutputStream datos = new ObjectOutputStream(archivo);
        datos.writeObject(listaGenerica);
    }
    
    
    
    public boolean create(T objeto) {
        if(validar(objeto)==true){  
            return listaGenerica.add(objeto);
        } 
        return false;
    }
    
     public T read(T comp){
        if(listaGenerica.contains(comp)){
            return (T) listaGenerica.stream().filter(obj-> obj.equals(comp)).findFirst().get();
        }
       return null;
        
    }
   
    public void update(T obj, T Eliminar) {
        int index = (listaGenerica.indexOf(Eliminar));
        listaGenerica.remove(index);
        listaGenerica.add(index, obj);
    }
    
    
    public void delete(T objeto) {
        listaGenerica.remove(objeto);
        System.out.println(listaGenerica);
    }

    public List<T> findAll() {
        return listaGenerica;
    }

    public void setListaGenerica(List<T> listaGenerica) {
        this.listaGenerica = listaGenerica;
    }
     
   
    
}
