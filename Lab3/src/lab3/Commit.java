/*
 * 
 *   * 
 */
package lab3;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Carlos Cofré <carlos.cofre@usach.cl>
 */
public class Commit {
    private Archivo archivo;
    private Usuario usuario;
    private LocalDateTime tsUltimaModificacion;
    private String comentario;
    private List listaCambios;
}
