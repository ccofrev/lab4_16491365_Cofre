/*
 * 
 *   * 
 */
package lab3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Cofre <carlos.cofre@usach.cl>
 */
public class CommitContainer {
    List<Commit> commits;
    Directorio old;

    public CommitContainer() {
        commits = new ArrayList<Commit>();
    }

    public CommitContainer(List<Commit> commits, Directorio old) {
        this.commits = commits;
        this.old = old;
    }

    public List<Commit> getCommits() {
        return commits;
    }

    public void setCommits(List<Commit> commits) {
        this.commits = commits;
    }

    public Directorio getOld() {
        return old;
    }

    public void setOld(Directorio old) {
        this.old = old;
    }
    
    public void addCommit(Commit commit){
        commits.add(commit);
    }
    
    public int size(){
        return commits.size();
    }
    
}
