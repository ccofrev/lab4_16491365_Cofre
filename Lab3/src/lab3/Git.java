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
public class Git {
    public static Repositorio init(String nombre){
        Workspace workspace = new Workspace("Workspace");
        Index index = new Index("Index");
        LocalRepository localRepository = new LocalRepository("Local Repository");
        RemoteRepository remoteRepository = new RemoteRepository("Remote Repository");
        
        return new Repositorio(nombre, workspace, index, localRepository, remoteRepository);
    }
    
    /*
    public static Repositorio add(List<String> nArchivos){
        
    }*/
}
