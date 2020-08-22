/*
 * Clase que emula un archivo de texto plano.
 * Se consideran propiedades como el nombre, una etiqueta de tiempo para la creacion
 * del archivo, y una para la ultima modificacion. 
 * eso ademas de un texto que representa el contenido del mismo.
 */
package lab4;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;
import java.util.Objects;
/**
 *
 * @author Carlos Cofre <carlos.cofre@usach.cl>
 */
public class Archivo {
    private String nombre;
    private LocalDateTime tsCreacion;
    private LocalDateTime tsUltimaModificacion;
    private String contenido;

    public Archivo() {
    }

    public Archivo(String nombre) {
        this.nombre = nombre;
        tsCreacion = LocalDateTime.now();
        tsUltimaModificacion = tsCreacion;
    }

    public Archivo(String nombre, String contenido) {
        this.nombre = nombre;
        this.contenido = contenido;
        tsCreacion = LocalDateTime.now();
        tsUltimaModificacion = tsCreacion;
    }
    
    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getTsCreacion() {
        return tsCreacion;
    }

    public void setTsCreacion(LocalDateTime tsCreacion) {
        this.tsCreacion = tsCreacion;
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
    
    public void actualizaContenido(String contenido) {
        this.contenido = contenido;
        this.tsUltimaModificacion = LocalDateTime.now();
    } 
    
    @Override
    public String toString() {
        DateTimeFormatter formatoTs = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String tsCreacionFormateada = tsCreacion.format(formatoTs);
        String tsUMFormateada = tsUltimaModificacion.format(formatoTs);
        return "Archivo{\n\t" + "Nombre: " + nombre + ",\n\tCreacion: " + tsCreacionFormateada +  ",\n\tUltima Modificacion: " + tsUMFormateada + ",\n\tContenido:\n\t\t" + contenido.replace("\n", "\n\t\t") + "\n\t}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        final Archivo other = (Archivo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }

        if (!Objects.equals(this.contenido, other.contenido)) {
            return false;
        }
        return true;
    }    
    
    public boolean reemplazable(Archivo archivo){
        if(archivo==null)return true;
        return (!this.equals(archivo) && tsCreacion.compareTo(archivo.getTsCreacion())>=0);        
    }

    
    
    
}
