/*
 * 
 *   * 
 */
package lab3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Cofré <carlos.cofre@usach.cl>
 */
public class Directorio {
    
    private String nombre; 
    private List<Archivo> archivos;

    public Directorio() {
        this.nombre = this.getClass().getName();
        this.archivos = new ArrayList<>();
    }
    
    public Directorio(String nombre) {
        this.nombre = nombre;
        this.archivos = new ArrayList<>();
    }

    
    public Directorio(String nombre, List archivos) {
        this.nombre = nombre;
        this.archivos = archivos;
    }

    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public List<Archivo> getArchivos() {
        return archivos;
    }

    public void setArchivos(List archivos) {
        this.archivos = archivos;
    }
    
    public void addArchivos(List<Archivo> archivos){
        for(int i=0; i<archivos.size(); i++)
            (this.archivos).add(archivos.get(i));
    }
    
    public void addArchivo(Archivo archivo){
        (this.archivos).add(archivo);
    }

    @Override
    public String toString() {
        String contenido = "";
        for(int i=0; i<archivos.size(); i++){
            contenido += ('\t' + archivos.get(i).getNombre() + '\n');
        }
        return( nombre + " {\n" + contenido + "}\n");
    }
    
    public Archivo getArchivo(String nombreArchivo){
        
        for(int i=0; i < archivos.size(); i++) {
            String s = archivos.get(i).getNombre();
            if(nombreArchivo.equals(s)) {
                return archivos.get(i);
            }
        }
        return null;
    }
    
    public boolean isIn(String nombreArchivo){
        for(int i=0; i < archivos.size(); i++) {
            String s = archivos.get(i).getNombre();
            if(nombreArchivo.equals(s)) {
                return true;
                
            }
        }
        return false;
    }
        
    
    
}
