/*
 * 
 *   * 
 */
package lab3;

import java.util.List;

/**
 *
 * @author Carlos Cofre <carlos.cofre@usach.cl>
 */
public class RemoteRepository extends Directorio{

    CommitContainer commits;
    
    public RemoteRepository() {
    }

    public RemoteRepository(String nombre) {
        super(nombre);
    }

    public RemoteRepository(String nombre, List archivos) {
        super(nombre, archivos);
    }

    public CommitContainer getCommits() {
        return commits;
    }

    public void setCommits(CommitContainer commits) {
        this.commits = commits;
    }
    
    
    
    
}
