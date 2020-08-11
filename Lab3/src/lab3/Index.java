/*
 * 
 *   * 
 */
package lab3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Cofré <carlos.cofre@usach.cl>
 */
public class Index {
    
    private String nombre;
    static List<Commit> commits;

    
    public Index(){
        this.commits = new ArrayList<Commit>();
    }

    public Index(String nombre) {
        this.nombre = nombre;
    }
    
    public Index(List<Commit> listaCommit) {
        this.commits = listaCommit;
    }

    public List getListaCommit() {
        return commits;
    }

    public void setListaCommit(List<Commit> commits) {
        this.commits = commits;
    }
    
    public void addToListaCommit(Commit commit){
        (this.commits).add(commit);
    }
    
    
    
    
    
}
