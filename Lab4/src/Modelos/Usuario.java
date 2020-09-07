/*
 * Clase usuario maneja datos basicos de identificacion de un usuario
 * para este caso solo su nombre y correo electronico
 * esta entidad es necesaria para las funciones de Git que requieren de identificacion
 * de usuario como el Init y el Commit
 */
package Modelos;

/**
 *
 * @author Carlos Cofre [carlos.cofre@usach.cl]
 */
public class Usuario {
    private String nombre;
    private String mail;

    public Usuario() {
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public Usuario(String nombre, String mail) {
        this.nombre = nombre;
        this.mail = mail;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Usuario: " + nombre + " <" + mail + ">";
    }
    
    
    
    
    
    
}
