/*
 * 
 *   
 */
package lab3;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Carlos Cofré <carlos.cofre@usach.cl>
 */
public class Archivo {
    private String nombre;
    private LocalDateTime tsUltimaModificacion;
    private String contenido;

    public Archivo() {
    }

    public Archivo(String nombre, LocalDateTime tsUltimaModificacion, String contenido) {
        this.nombre = nombre;
        this.tsUltimaModificacion = tsUltimaModificacion;
        this.contenido = contenido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getTsUltimaModificacion() {
        return tsUltimaModificacion;
    }

    public void setTsUltimaModificacion(LocalDateTime tsUltimaModificacion) {
        this.tsUltimaModificacion = tsUltimaModificacion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = tsUltimaModificacion.format(myFormatObj);
        return "Archivo{" + "nombre=" + nombre + ", tsUltimaModificacion=" + formattedDate + ", contenido=" + contenido + '}';
    }
    
    
    
}
