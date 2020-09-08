PARA COMPILAR Y EJECUTAR, USAR EL SCRIPT 
"compilaYEjecuta.bat"
Presente en carpeta Lab4 (obviamente se debe tener
instalado JDK y JRE).



Este script es equivalente a ejecutar las siguientes lineas por terminal

javac -d classes -sourcepath src -cp classes src/Modelos/Lab4.java -Xlint


Esta carpeta corresponde al paquete del proyecto. El uso de paquetes se revisó en material de clases y representa gran utilidad para orden de un proyecto especialmente cuando es de gran tamaño. En este caso no se considera necesario dejando todo en un paquete tal como lo genera el IDE, correspondiente al paquete del proyecto, en este caso “lab4”.

Luego de compiladas las clases, se puede ejecutar el programa llamando a la clase main, con el comando java. En este caso, la clase principal lleva por nombre “Lab4”. Así, la ejecución podría hacerse de la siguiente forma

java -cp classes Modelos/Lab4

desde el directorio desde donde se compiló. El programa considera un menú de opciones donde se pueden probar las diferentes implementaciones, según enunciado.


Otra opción de ejecución, es utilizar la versión precompilada, existente en la carpeta del proyecto disponible en repositorio github.
desde la carpeta dist, ejecutando
 
java -jar "Lab4.jar" 

o con doble click sobre Lab4.jar


repositorio del proyecto https://github.com/ccofrev/lab4_16491365_Cofre
