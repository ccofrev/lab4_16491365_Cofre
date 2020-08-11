/*
 * Repositorio se refiere al proyecto completo, es decir, el conjunto de 
 * archivos, zonas y commits que conforman un proyecto en git.
 * no confundir con local y remote repository, que apuntan a las zonas en particular
 * 
 */
package lab3;

/**
 *
 * @author Carlos Cofré <carlos.cofre@usach.cl>
 */
public class Repositorio {
    private String nombre;
    private Workspace workspace;
    private Index index;
    private LocalRepository localRepository;
    private RemoteRepository remoteRepository;

    public Repositorio() {
    }

    public Repositorio(String nombre) {
        this.nombre = nombre;
    }

    public Repositorio(String nombre, Workspace workspace, Index index, LocalRepository localRepository, RemoteRepository remoteRepository) {
        this.nombre = nombre;
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
        
    
}
