/*
 * 
 * 
 * 
 */
package lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        //System.out.println("Salida: " + StringTools.compara("perro\nhola que tal\nn", "perro\nhi caca\nh"));
        
        Archivo ar1 = new Archivo("ar1", "hola\nEste es un archivo de texto\nfin" );
        Archivo ar2 = new Archivo("ar2", "hola\nEste es un archivo de texto\nfin" );
        Archivo ar3 = new Archivo("ar3", "hola\nEste \nfin" );
        
        /*
        if(ar1.equals(ar2)){
            System.out.println("El archivo 1 es igual al archivo 2");
        }
        if(ar1.equals(ar3)){
            System.out.println("El archivo 1 es igual al archivo 3");
        }
        if(ar2.equals(ar3)){
            System.out.println("El archivo 2 es igual al archivo 3");
        }*/
        //Directorio carpeta1 = new Directorio("Carpeta1");
        //carpeta1.addArchivo(ar1);
        //carpeta1.addArchivo(ar2);
        //carpeta1.addArchivo(ar3);
        //Directorio carpeta1 = new Directorio("Carpeta1", Arrays.asList(ar1, ar2, ar3));
        
        //System.out.println(carpeta1.toString());
        
        Usuario usuario = new Usuario("Carlos Cofré");
        Repositorio repo1 = Git.init("Repositorio1", usuario);
        repo1.getWorkspace().addArchivos(Arrays.asList(ar1, ar2, ar3));
        
        System.out.println(repo1.getWorkspace().toString());
        System.out.println(repo1.getLocalRepository().toString());
        System.out.println(repo1.getRemoteRepository().toString());
        
        
        //System.out.println(repo1.getWorkspace().getArchivos().get(1).getNombre());
        Git.add(repo1, Arrays.asList("ar1", "ar6", "ar3"));
        System.out.println(repo1.getIndex().toString());
        
        
        
        
        //System.out.println(StringTools.diferencia2("perrito", "perro"));
        //System.out.println(StringTools.interseccion("perrito", "perro"));
    }
    
}
