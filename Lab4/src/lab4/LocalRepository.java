/*
 * LocalRepository es una extension de un directorio, es decir
 * actua como contenedor de archivos (post commit).
 * Ademas de contener un grupo de archivos traspasados desde el workspace
 * contiene un registro de los cambios y archivos antiguos en forma de commits (en un contenedor).
 * los commits son objetos que almacenan los archivos relacionados con el cambio, ademas de
 * un comentario y timestamp
 */
package lab4;

import java.util.List;

/**
 *
 * @author Carlos Cofre [carlos.cofre@usach.cl]
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
    
    public Commit getLastCommit(){
        return commits.getCommits().get(commits.size() - 1);
    }
      
}
