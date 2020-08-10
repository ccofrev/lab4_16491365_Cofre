/*
 * 
 *   * 
 */
package lab3;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Carlos Cofré <carlos.cofre@usach.cl>
 */
public class Commit {
    private Archivo archivo;
    private Usuario usuario;
    private LocalDateTime tsUltimaModificacion;
    private String comentario;
    private List archivos;

    public Commit() {
    }

    public Commit(Archivo archivo, Usuario usuario, LocalDateTime tsUltimaModificacion, String comentario, List archivos) {
        this.archivo = archivo;
        this.usuario = usuario;
        this.tsUltimaModificacion = tsUltimaModificacion;
        this.comentario = comentario;
        this.archivos = archivos;
    }

    public Archivo getArchivo() {
        return archivo;
    }

    public void setArchivo(Archivo archivo) {
        this.archivo = archivo;
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
    
    
    
}
