/*
 * 
 * 
 * 
 */
package lab3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ccofr
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Archivo ar1 = new Archivo("ar1", "hola\nEste es un archivo de texto\nfin" );
        System.out.println(ar1.toString());
        System.out.println("Ahora modifico el archivo " + ar1.getNombre());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Lab3.class.getName()).log(Level.SEVERE, null, ex);
        }
        ar1.actualizaContenido(ar1.getContenido() + "\nesta es una linea agregada al final del archivo.");
        System.out.println(ar1.toString());
        */
        System.out.println(StringTools.diferencia("perrito", "perro"));
        System.out.println(StringTools.interseccion("perrito", "perro"));
    }
    
}
