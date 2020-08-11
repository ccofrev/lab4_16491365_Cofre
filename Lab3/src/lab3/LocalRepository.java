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

    public LocalRepository() {
    }

    public LocalRepository(String nombre) {
        super(nombre);
    }

    public LocalRepository(String nombre, List archivos) {
        super(nombre, archivos);
    }
    
    
}
