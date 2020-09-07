/*
 * Se considera esta clase especial para almacenar commit y mantenerlos ordenados 
 * dentro de las zonas de trabajo donde se cargan los efectos de un commit.
 * se compone de una lista con commits.
 * Un elemento de esta clase es lo que hace la diferencia entre un directorio normal
 * y una zona de tipo repositorio.
 */
package Modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Cofre [carlos.cofre@usach.cl]
 */
public class CommitContainer {
    List<Commit> commits;

    public CommitContainer() {
        commits = new ArrayList<Commit>();
    }

    public List<Commit> getCommits() {
        return commits;
    }

    public void setCommits(List<Commit> commits) {
        this.commits = commits;
    }
    
    public void addCommit(Commit commit){
        commits.add(commit);
    }
    
    public int size(){
        return commits.size();
    }
    
}
