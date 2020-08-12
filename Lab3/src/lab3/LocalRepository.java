/*
 * 
 *   * 
 */
package lab3;

import java.util.List;

/**
 *
 * @author Carlos Cofré <carlos.cofre@usach.cl>
 */
public class LocalRepository extends Directorio{

    CommitContainer commits;
    
    public LocalRepository() {
        commits = new CommitContainer();
    }

    public LocalRepository(String nombre) {
        super(nombre);
        commits = new CommitContainer();        
    }

    public LocalRepository(String nombre, List archivos) {
        super(nombre, archivos);
        commits = new CommitContainer();
    }

    public CommitContainer getCommits() {
        return commits;
    }

    public void setCommits(CommitContainer commits) {
        this.commits = commits;
    }
    
    public void addCommit(Commit commit){
        if(commit == null) return;
        this.commits.addCommit(commit);
    }
      
}
