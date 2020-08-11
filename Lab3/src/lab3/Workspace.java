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
public class Workspace extends Directorio{

    public Workspace() {
    }

    public Workspace(String nombre) {
        super(nombre);
    }

    public Workspace(String nombre, List archivos) {
        super(nombre, archivos);
    }
    
}
