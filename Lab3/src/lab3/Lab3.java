/*
 * 
 * 
 * 
 */
package lab3;
import java.time.LocalDateTime; 
/**
 *
 * @author ccofr
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Archivo ar1 = new Archivo("ar1", LocalDateTime.now(), "hola\nEste es un archivo de texto\nfin" );
        System.out.println("Archivo:\n" + ar1.toString());
    }
    
}
