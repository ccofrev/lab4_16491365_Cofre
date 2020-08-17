/*
 * 
 *   * 
 */
package lab3;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Carlos Cofre <carlos.cofre@usach.cl>
 */
public class Git {
    public static Repositorio init(String nombre, Usuario usuario){
        Workspace workspace = new Workspace("Workspace");
        Index index = new Index("Index");
        LocalRepository localRepository = new LocalRepository("Local Repository");
        RemoteRepository remoteRepository = new RemoteRepository("Remote Repository");     
        
        return new Repositorio(nombre, usuario, workspace, index, localRepository, remoteRepository);
    }  
    
    public static Repositorio add(Repositorio repositorio, List<String> nombresArchivos){
        Workspace workspace = repositorio.getWorkspace();
        LocalRepository localRepository = repositorio.getLocalRepository();
        Index index = repositorio.getIndex();
        
        for (String nombreArchivo : nombresArchivos){
            if(workspace.contains(nombreArchivo)){      // se revisa si el archivo solicitado esta en ws
                if(localRepository.contains(nombreArchivo)){    // se revisa si esta en lr
                    if(localRepository.getArchivo(nombreArchivo).reemplazable(workspace.getArchivo(nombreArchivo))){
                        index.cambiarEstado(nombreArchivo, index.MODIFIED);
                    }
                    
                }else{
                    index.addArchivo(nombreArchivo, index.STAGED);
                }
            }
        }

        return repositorio;
    }
    
    public static Repositorio add(Repositorio repositorio, String nArchivo){
        List<String> nombresArchivos = Arrays.asList(nArchivo);
        add(repositorio, nombresArchivos);
        return repositorio;
    }

    public static Repositorio commit(Repositorio repositorio, Usuario usuario, String comentario){
        
        Index index = repositorio.getIndex();
        Workspace workspace = repositorio.getWorkspace();
        LocalRepository localRepository = repositorio.getLocalRepository();
        
        List<String> modificadosIndex = index.getModOrStaged();
                    
        Commit commit = new Commit(usuario, comentario, workspace.getArchivos(modificadosIndex));
        localRepository.addCommit(commit);
        repositorio.copiarEntre(modificadosIndex, workspace, localRepository);
        index.cambiarEstado(modificadosIndex, index.COMMITED);       
        
        return repositorio;
    }
    
    public static Repositorio push(Repositorio repositorio){
        LocalRepository localRepository = repositorio.getLocalRepository();
        RemoteRepository remoteRepository = repositorio.getRemoteRepository();
        remoteRepository.setArchivos(localRepository.getArchivos());
        remoteRepository.setCommits(localRepository.getCommits());
        
        return repositorio;
    }
    
    public static Repositorio pull(Repositorio repositorio){
        RemoteRepository remoteRepository = repositorio.getRemoteRepository();
        Workspace workspace = repositorio.getWorkspace();
        workspace.setArchivos(remoteRepository.getArchivos());
        
        return repositorio;          
    }
    
    /*
    Informacion del repositorio (nombre y autor)
    Numero de archivos en el Workspace
    Numero de archivos en el Index
    Numero de commits en el Local Repository
    SI el Remote Repository esta al dia (o no) con los cambios del Local Repository
    */
    public static String status(Repositorio repositorio){
        Workspace workspace = repositorio.getWorkspace();
        Index index = repositorio.getIndex();
        LocalRepository localRepository = repositorio.getLocalRepository();
        
        String nombre = repositorio.getNombre();
        String autor = repositorio.getUsuario().getNombre();
        int numArchivosWS = workspace.getArchivos().size();
        int numArchivosIn = index.getArchivos().size();
        int numArchivosLR = localRepository.getArchivos().size();
        int numCommitsLR = localRepository.getCommits().size();
        int modSinAdd = index.getModOrStaged().size();
        
        String salida = "Repositorio: " + nombre + '\n';
        salida += "Autor: " + autor + '\n';
        salida += "Archivos en Workspace: " + numArchivosWS + '\n';
        salida += "Archivos en Index: " + numArchivosIn + '\n';
        salida += "Archivos en Local Repository: " + numArchivosLR + '\n';
        salida += "Commits en Local Repository: " + numCommitsLR + '\n';
        salida += "Archivos no actualizados: " + modSinAdd + '\n';
        salida += index.getModified().toString()=="[]"?"": "\tModified: "+index.getModified().toString() + '\n';
        salida += index.getStaged().toString()=="[]"?"": "\tNuevo archivo: "+index.getStaged().toString() + '\n';
        
        
        return salida;
    }
       
    
    // extra
    /*
    gitLog
    gitBranch       x
    gitCheckout     x
    gitMerge        x
    */
    
    public static String log(Repositorio repositorio){
        String salida = "";
        LocalRepository localRepository = repositorio.getLocalRepository();
        CommitContainer commits = localRepository.getCommits();
        for(int i=0; i<Math.min(commits.size(),5); i++){
            salida += commits.getCommits().get(i).toString() + '\n';
        }
        return salida;
    }
    
    
    
    
    
    
}
