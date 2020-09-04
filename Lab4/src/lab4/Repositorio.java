/*
 * Repositorio se refiere al proyecto completo, es decir, el conjunto de 
 * archivos, zonas y commits que conforman un proyecto en git.
 * no confundir con local y remote repository, que apuntan a esas zonas en particular
 * 
 */
package lab4;

import java.util.List;

/**
 *
 * @author Carlos Cofre [carlos.cofre@usach.cl]
 */
public class Repositorio {
    private String nombre;
    private Usuario usuario;
    private Workspace workspace;
    private Index index;
    private LocalRepository localRepository;
    private RemoteRepository remoteRepository;

    public Repositorio() {
    }

    public Repositorio(String nombre, Usuario usuario) {
        this.nombre = nombre;
        this.usuario = usuario;
    }

    public Repositorio(String nombre, Usuario usuario, Workspace workspace, Index index, LocalRepository localRepository, RemoteRepository remoteRepository) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.workspace = workspace;
        this.index = index;
        this.localRepository = localRepository;
        this.remoteRepository = remoteRepository;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Workspace getWorkspace() {
        return workspace;
    }

    public void setWorkspace(Workspace workspace) {
        this.workspace = workspace;
    }

    public Index getIndex() {
        return index;
    }

    public void setIndex(Index index) {
        this.index = index;
    }

    public LocalRepository getLocalRepository() {
        return localRepository;
    }

    public void setLocalRepository(LocalRepository localRepository) {
        this.localRepository = localRepository;
    }

    public RemoteRepository getRemoteRepository() {
        return remoteRepository;
    }

    public void setRemoteRepository(RemoteRepository remoteRepository) {
        this.remoteRepository = remoteRepository;
    }

    public void copiarEntre(List<String> nArchivos, Directorio zona1, Directorio zona2){
        for(int i=0; i<nArchivos.size(); i++){
                zona2.addArchivo( zona1.getArchivo(nArchivos.get(i)).clon() );
        }
    }
   
    public void copiarEntre(String nombreArchivo, Directorio zona1, Directorio zona2){
            zona2.addArchivo( zona1.getArchivo(nombreArchivo).clon() );
    }

    @Override
    public String toString() {
        return "Repositorio{" + "nombre=" + nombre + ", usuario=" + usuario + ", workspace=" + workspace + ", index=" + index + ", localRepository=" + localRepository + ", remoteRepository=" + remoteRepository + '}';
    }
    
    
    
    
           
    
}
