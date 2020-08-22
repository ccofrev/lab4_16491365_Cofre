/*
 * Workspace hereda de directorio sin modificaciones mas que el nombre, 
 * basicamente es un contenedor de archivos.
 * las modificaciones en este directorio se revisan y se cargan en el index
 * a solicitud (add). 
 * 
 */
package lab3;

import java.util.List;

/**
 *
 * @author Carlos Cofre <carlos.cofre@usach.cl>
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
