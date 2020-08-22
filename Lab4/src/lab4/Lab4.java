/*
 * Clase main donde además se implementa la interfaz de usuario por consola.
 * 
 * 
 */
package lab4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ccofr
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
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
                System.out.println("> Usuario: " + usuario.getNombre() + " <" + usuario.getMail() + ">");
                System.out.println("> Nombre: " + nombreRepositorio);
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
                System.out.println("6.\tcrear nuevo archivo");
                System.out.println("7.\tlog");
                System.out.println("8.\treiniciar");
                System.out.println("10.\tsalir");
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
                        System.out.println("Se agregan archivos elegibles.");
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
                        if(!(repositorio.getLocalRepository().getCommits().getCommits().size()<1)){
                            sn.nextLine();
                            System.out.println(Git.log(repositorio));
                            sn.nextLine();
                        }else{
                            System.out.println("Nada que mostrar");
                            sn.nextLine();
                            navegacion=4;
                            break;
                        }
                        
                        break;
                        
                        
                    case 8:
                        System.out.println("Se reinicia el menu");
                        sn.nextLine();
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
