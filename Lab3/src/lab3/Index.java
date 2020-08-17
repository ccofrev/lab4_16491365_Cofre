/*
 * 
 *  El index difiere de las demas zonas, se trata de un contenedor de nombres de archivos
 *  y un estado para cada uno. Los estados son  STAGED = 0, MODIFIED = 1, COMMITED = 2;
 *  STAGED se refiere a loa archivos 
 */
package lab3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Carlos Cofre <carlos.cofre@usach.cl>
 */
public class Index {
    
    //confirmado (committed), modificado (modified), y preparado (staged).
    final static int STAGED = 0, MODIFIED = 1, COMMITED = 2;
    
    private String nombre;
    HashMap<String, Integer> archivos = new HashMap<String, Integer>();

    
    public Index() {
    }
    
    public Index(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public HashMap<String, Integer> getArchivos() {
        return archivos;
    }

    public void setArchivos(HashMap<String, Integer> archivos) {
        this.archivos = archivos;
    }
    
    public void addArchivo(String nombreArchivo){
        archivos.put(nombreArchivo, STAGED);
    }
    
    public void addArchivo(String nombreArchivo, int estado){
        archivos.put(nombreArchivo, estado);
    }

    @Override
    public String toString() {
        return "Index{" + "nombre=" + nombre + ", archivos=" + archivos + '}';
    }
    
    

    
    public List<String> getModOrStaged(){
        List<String> salida = new ArrayList<String>();
        for (Map.Entry<String, Integer> archivo : archivos.entrySet()) {
            if(archivo.getValue() == MODIFIED || archivo.getValue() == STAGED)
                salida.add(archivo.getKey());
        }
        return salida;
    }
    
    public List<String> getModified(){
        List<String> salida = new ArrayList<String>();
        for (Map.Entry<String, Integer> archivo : archivos.entrySet()) {
            if(archivo.getValue() == MODIFIED)
                salida.add(archivo.getKey());
        }
        return salida;
    }
    
    public List<String> getStaged(){
        List<String> salida = new ArrayList<String>();
        for (Map.Entry<String, Integer> archivo : archivos.entrySet()) {
            if(archivo.getValue() == STAGED)
                salida.add(archivo.getKey());
        }
        return salida;
    }
    
    public void cambiarEstado(String archivo, int estado){
        archivos.replace(nombre, estado);
       
    }
    
    public void cambiarEstado(List<String> nArchivos, int estado){
        for(int i=0; i<nArchivos.size(); i++)
            archivos.replace(nArchivos.get(i), estado);
    }
    
    
}
