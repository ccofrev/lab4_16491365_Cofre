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
    private List<Directorio> subdirectorios;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Archivo> getArchivos() {
        return archivos;
    }

    public void setArchivos(List<Archivo> archivos) {
        this.archivos = archivos;
    }

    public List<Directorio> getSubdirectorios() {
        return subdirectorios;
    }

    public void setSubdirectorios(List<Directorio> subdirectorios) {
        this.subdirectorios = subdirectorios;
    }
    
    public void addArchivos(List<Archivo> archivos){
        for(int i=0; i<archivos.size(); i++)
            (this.archivos).add(archivos.get(i));
    }
    
    public void addArchivo(Archivo archivo){
        (this.archivos).add(archivo);
    }
    
    public void addSubiderecotorios(List<Directorio> subdirectorios){
        for(int i=0; i<subdirectorios.size(); i++)
            (this.subdirectorios).add(subdirectorios.get(i));
    }
    
    public void addSubdirectorio(Directorio subdirectorio){
        (this.subdirectorios).add(subdirectorio);
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
    
    public List<Archivo> getArchivos(List<String> nombresArchivos){
        List<Archivo> salida = new ArrayList<Archivo>();
        for(int i=0; i < nombresArchivos.size(); i++) {
            salida.add(getArchivo(nombresArchivos.get(i)));
        }
        return salida;
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
