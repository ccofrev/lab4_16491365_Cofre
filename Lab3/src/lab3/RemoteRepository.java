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
public class RemoteRepository extends Directorio{

    public RemoteRepository() {
    }

    public RemoteRepository(String nombre) {
        super(nombre);
    }

    public RemoteRepository(String nombre, List archivos) {
        super(nombre, archivos);
    }
    
    
}
