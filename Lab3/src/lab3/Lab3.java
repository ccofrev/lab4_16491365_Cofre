/*
 * 
 * 
 * 
 */
package lab3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
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
        
        /*
        System.out.println("INICIO\n");
        
        Usuario usuario = new Usuario("Carlos Cofre", "carlos.cofre@usach.cl");
        
        
        System.out.println("\nGIT INIT\n");
        Repositorio repo1 = Git.init("Repositorio1", usuario);
        
        // Se obtienen zonas
        Workspace workspace = repo1.getWorkspace();
        LocalRepository localRepository = repo1.getLocalRepository();
        Index index = repo1.getIndex();
        RemoteRepository remoteRepository = repo1.getRemoteRepository();
        
        
        workspace.addArchivos(Arrays.asList(ar1, ar2, ar3));
        System.out.println(repo1.toString());
        */
        
        /*
        System.out.println(repo1.getWorkspace().toString());
        System.out.println(repo1.getLocalRepository().toString());
        System.out.println(repo1.getRemoteRepository().toString());
        */
        
        //System.out.println(repo1.getWorkspace().getArchivos().get(1).getNombre());
        
        /*
        System.out.println(Git.status(repo1));
        System.out.println("index >> " + index.toString() + "\n");
        
        
        System.out.println("\nGIT ADD (ar1 ar6)\n");
        Git.add(repo1, Arrays.asList("ar1", "ar6"));
        System.out.println(repo1.toString());
        
        
        System.out.println(Git.status(repo1));
        System.out.println("index >> " + index.toString() + "\n");
        
        System.out.println("\nGIT COMMIT\n\n");
        Git.commit(repo1, usuario, "Este es el primer commit");
        System.out.println(repo1.toString());
        
        System.out.println(Git.status(repo1));
        System.out.println("index >> " + index.toString() + "\n");
        
        System.out.println("El contenido inicial del archivo ar1 ");
        System.out.println(workspace.getArchivo("ar1").getContenido() + "\n");
        workspace.getArchivo("ar1").setContenido("Estoy cambiando el contenido del archivo");
        System.out.println("El contenido actual del archivo ar1 ");
        System.out.println(workspace.getArchivo("ar1").getContenido() + "\n");
        
        //Git.add(repo1, "ar1");
        System.out.println(Git.status(repo1));
        System.out.println("index >> " + index.toString() + "\n");
        
        Git.commit(repo1, usuario, "Commit test");
        System.out.println("El contenido actual del archivo ar1:");
        System.out.println(localRepository.getArchivo("ar1").getContenido() + "\n");
        
        
        System.out.println(Git.status(repo1));
        System.out.println("index >> " + index.toString() + "\n");
        
        System.out.println(Git.log(repo1) + "\n");
        */
        //System.out.println(StringTools.diferencia2("perrito", "perro"));
        //System.out.println(StringTools.interseccion("perrito", "perro"));
        
       /*
        ### SIMULACION DE GIT ###
        Escoja su opcion:
        1. add
        2. commit
        3. pull
        4. push
        5. status
        6. Crear nuevo archivo    
        INTRODUZCA SU OPCION: _ 
        */
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        int navegacion = 1; // etapa del menu
        String nombreUsuario = "@desconocido";
        String mailUsuario = "@desconocido";
        String nombreRepositorio = "@desconocido";
        Usuario usuario = new Usuario(nombreUsuario, mailUsuario); //default
        Repositorio repositorio = Git.init(nombreRepositorio, usuario);  // default1
        Utils.falsoClear();
        
        while(!salir)
        switch(navegacion){
       
            case 1:
                System.out.println("### SIMULACION DE GIT ###");
                System.out.println("¿Desea registrarse como usuario?");
                System.out.println("1.\tSI");
                System.out.println("2.\tNO");
                System.out.println("10.\tSalir");
                System.out.print("Ingrese su opcion: ");
                
                opcion = sn.nextInt();
                Utils.falsoClear(); 
                if(opcion==10){
                    navegacion=10;
                    break;
                }else if(opcion==2){
                    
                    navegacion=3;
                    break;
                }
                
                
            case 2:        
                System.out.println("### SIMULACION DE GIT ###");
                System.out.println("Registro nuevo usuario");
                System.out.println("(este nombre se asociara al repositorio GIT)");
                sn.nextLine();
                System.out.print("Nombre: ");
                nombreUsuario = sn.nextLine();
                System.out.print("Correo Electronico: ");
                mailUsuario = sn.nextLine();
                
                Utils.falsoClear();
                System.out.println("Los datos ingresados son");
                System.out.println("> Nombre: " + nombreUsuario);
                System.out.println("> Correo: " + mailUsuario);
                System.out.println("¿Desea confirmar la informacion?");
                System.out.println("1.\tSi");
                System.out.println("2.\tCambiar");
                System.out.println("10.\tSalir");
                System.out.print("Ingrese su opcion: ");
                
                opcion = sn.nextInt();
                Utils.falsoClear(); 
                if(opcion==10){
                    navegacion=10;
                    break;
                }else if(opcion==2){
                    navegacion=2;
                    break;
                }else if(opcion==1){
                    usuario.setNombre(nombreUsuario);
                    usuario.setMail(mailUsuario);
                }
                
            case 3:        
                System.out.println("### SIMULACION DE GIT ###");
                
                if(nombreRepositorio.equals("@desconocido")){
                    System.out.println("Registro nuevo repositorio (Git Init)");
                    nombreRepositorio = sn.nextLine();
                    System.out.print("Nombre: ");
                    nombreRepositorio = sn.nextLine();
                }
                
                
                Utils.falsoClear();
                System.out.println("Los datos ingresados son");
                System.out.println("Usuario: " + usuario.getNombre() + " <" + usuario.getMail() + ">");
                System.out.println("Nombre: " + nombreRepositorio);
                System.out.println("¿Desea confirmar la informacion?");
                System.out.println("1.\tSi");
                System.out.println("2.\tCambiar nombre repositorio");
                System.out.println("3.\tCambiar datos usuario");
                System.out.println("10.\tSalir");
                System.out.print("Ingrese su opcion: ");
                
                opcion = sn.nextInt();
                
                Utils.falsoClear(); 
                if(opcion==10){
                    navegacion=10;
                    break;
                }else if(opcion==2){
                    nombreRepositorio="@desconocido";
                    navegacion=3;
                    break;
                }else if(opcion==3){
                    navegacion=2;
                    break;
                }else if(opcion==1){
                    repositorio = Git.init(nombreRepositorio, usuario);
                }
                
            case 4:

                System.out.println("### SIMULACION DE GIT ###");
                System.out.println("1.\tadd");
                System.out.println("2.\tcommit");
                System.out.println("3.\tpush");
                System.out.println("4.\tpull");
                System.out.println("5.\tstatus");
                System.out.println("6.\tCrear nuevo archivo");
                System.out.println("7.\tLog");
                System.out.println("8.\tReiniciar");
                System.out.println("10.\tSalir");
                System.out.print("Ingrese su opcion: ");
                
                opcion = sn.nextInt();
                Utils.falsoClear(); 
                
                switch(opcion){
                    case 1:
                        sn.nextLine();
                        System.out.println("### SIMULACION DE GIT - ADD ###");
                        if(repositorio.getWorkspace().getArchivos().size()<=1){
                            System.out.println("No hay nada que agregar.");
                            navegacion=4;
                            
                            sn.nextLine();
                            break;
                        }
                        
                        System.out.println("Ingrese nombres de archivos separados\ncon espacio. Solo presione enter si desea agregar\ntodos los archivos.");
                        String archivos = sn.nextLine();
                        
                        if(archivos.contains(" ") && archivos.split(" ").length>1){
                            Git.add(repositorio, Arrays.asList(archivos.split(" ")));
                        }else{
                            Git.add(repositorio, archivos);
                        }
                        System.out.println("Se agregan archivos que coincidan.");
                        sn.nextLine();
                        break;
                    case 2:
                        System.out.println("### SIMULACION DE GIT - COMMIT ###");
                        System.out.println("Ingrese comentario");
                        sn.nextLine();
                        String comentario = sn.nextLine();
                        Git.commit(repositorio, usuario, comentario);
                        
                        System.out.println(repositorio.getLocalRepository().getLastCommit().toString());
                        System.out.println("Commit realizado!" );
                        sn.nextLine();
                        break;
                    case 3:
                        System.out.println("### SIMULACION DE GIT - PUSH ###");
                        System.out.println("Se cambian archivos y commit...");
                        sn.nextLine();
                        Git.push(repositorio);
                        break;
                    case 4:
                        System.out.println("### SIMULACION DE GIT - PULL ###");
                        System.out.println("Se cambian archivos...");
                        sn.nextLine();
                        Git.pull(repositorio);
                        break;
                    case 5:
                        System.out.println("### SIMULACION DE GIT - STATUS ###");
                        System.out.println(Git.status(repositorio));
                        sn.nextLine();
                        sn.nextLine();
                        
                        break;
                    case 6:
                        System.out.println("### SIMULACION DE GIT - NUEVO EN WORKSPACE ###");
                        sn.nextLine();
                        System.out.println("Ingrese nombre de archivo");
                        String nombreArchivo = sn.nextLine();
                        System.out.println("Ingrese contenido de archivo (en linea unica)");
                        String contenidoArchivo = sn.nextLine();
                        
                        Archivo archivo = new Archivo(nombreArchivo, contenidoArchivo);
                        System.out.println(archivo.toString());
                        repositorio.getWorkspace().addArchivo(archivo);
                        System.out.println("Archivo creado!");
                        sn.nextLine();
                        
                        break;
                        
                     case 7:
                        System.out.println("### SIMULACION DE GIT - LOG ###");
                        System.out.println("Se presentan ultimos (5) commit");
                        sn.nextLine();
                        System.out.println(Git.log(repositorio));
                        
                        sn.nextLine();
                        
                        break;
                        
                        
                    case 8:
                        System.out.println("reiniciar");
                        navegacion=1;
                        break;
                }
                
                if(opcion!=10){
                    Utils.falsoClear(); 
                    navegacion=4;
                    break;
                }
                
                
            
                           
            
            case 10:
                System.out.println("### SIMULACION DE GIT ###");
                System.out.println("¿Esta seguro que desea salir?");
                System.out.println("1. SI");
                System.out.println("2. NO");
                
                opcion = sn.nextInt();
                Utils.falsoClear(); 
                if(opcion==2){
                    navegacion=1;
                    break;
                }
                System.out.println("Adios!");
                salir=true;
                
       }
        
    
     

        
        
        
        
    }
    
}
