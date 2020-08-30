Antes del uso del programa, se debe compilar las clases. Para esto, se puede ejecutar javac en un nivel superior de la carpeta contenedora de los archivos .java que componen el proyecto Lab4/src.

javac -cp . lab4/Lab4.java

 Esta carpeta corresponde al paquete del proyecto. El uso de paquetes se revisó en material de clases y representa gran utilidad para orden de un proyecto especialmente cuando es de gran tamaño. En este caso no se considera necesario dejando todo en un paquete tal como lo genera el IDE, correspondiente al paquete del proyecto, en este caso “lab4”. 
 
Luego de compiladas las clases, se puede ejecutar el programa llamando a la clase main, con el comando java.
En este caso, la clase principal lleva por nombre “Lab4”. Así, la ejecución podría hacerse de la siguiente forma

java -cp . lab4/Lab4

desde el directorio desde donde se compiló.
El programa considera un menú de opciones donde se pueden probar las diferentes implementaciones, según enunciado.


repositorio del proyecto
https://github.com/ccofrev/lab4_16491365_Cofre
