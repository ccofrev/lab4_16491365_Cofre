/*
 * 
 *   * 
 */
package lab3;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Carlos Cofré <carlos.cofre@usach.cl>
 */
public class Commit {
    private Usuario usuario;
    private LocalDateTime tsUltimaModificacion;
    private String comentario;
    private List<Archivo> archivos;

    public Commit() {
    }

    public Commit(Usuario usuario, LocalDateTime tsUltimaModificacion, String comentario, List archivos) {
        this.usuario = usuario;
        this.tsUltimaModificacion = tsUltimaModificacion;
        this.comentario = comentario;
        this.archivos = archivos;
    }
    
    public Commit(Usuario usuario, String comentario, List archivos) {
        this.usuario = usuario;
        this.tsUltimaModificacion = LocalDateTime.now();;
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
        return tsUltimaModificacion;
    }

    public void setTsUltimaModificacion(LocalDateTime tsUltimaModificacion) {
        this.tsUltimaModificacion = tsUltimaModificacion;
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
        hash = 41 * hash + Objects.hashCode(this.tsUltimaModificacion);
        return hash;
    }

    
    
    
    
    
}
