/*
 * Clase commit, almacena los archivos involucrados en un cambio desde 
 * el workspace hacia el local repository.
 * Almacena un comentario, un comentario y un usuario ademas de una lista de 
 * archivos.
 */
package lab3;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Carlos Cofre <carlos.cofre@usach.cl>
 */
public class Commit {
    private Usuario usuario;
    private LocalDateTime timestamp;
    private String comentario;
    private List<Archivo> archivos;

    public Commit() {
    }

    public Commit(Usuario usuario, LocalDateTime timestamp, String comentario, List archivos) {
        this.usuario = usuario;
        this.timestamp = timestamp;
        this.comentario = comentario;
        this.archivos = archivos;
    }
    
    public Commit(Usuario usuario, String comentario, List archivos) {
        this.usuario = usuario;
        this.timestamp = LocalDateTime.now();
        this.comentario = comentario;
        this.archivos = archivos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getTsUltimaModificacion() {
        return timestamp;
    }

    public void setTsUltimaModificacion(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public List getArchivos() {
        return archivos;
    }

    public void setArchivos(List archivos) {
        this.archivos = archivos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.timestamp);
        return hash;
    }

    @Override
    public String toString() {
        return "Commit{\n\t" + usuario + ",\n\ttimestamp: " + timestamp + ",\n\tcomentario: " + comentario + ",\n\tarchivos: " + archivos + "\n}";
    }

    
    
    
    
    
    
}
