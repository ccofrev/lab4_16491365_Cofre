/*
 * 
 *   * 
 */
package lab3;

import java.util.HashMap;

/**
 *
 * @author Carlos Cofré <carlos.cofre@usach.cl>
 */
public class Index {
    
    //confirmado (committed), modificado (modified), y preparado (staged).
    final int STAGED = 1, MODIFIED = 2, COMMITED = 3;
    
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

    @Override
    public String toString() {
        return "Index{" + "nombre=" + nombre + ", archivos=" + archivos + '}';
    }
    
    
    
    
    
    
}
