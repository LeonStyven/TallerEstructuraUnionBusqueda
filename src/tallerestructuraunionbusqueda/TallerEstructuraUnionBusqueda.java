/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerestructuraunionbusqueda;

import edu.princeton.cs.algs4.StdIn;

import edu.princeton.cs.algs4.StdOut;
/**
 *
 * @author jstca
 */
public class TallerEstructuraUnionBusqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Punto2D p = new Punto2D(5,1,"A");
        Punto2D q = new Punto2D(2,4,"B");
        int respuesta;
        
        StdOut.println("El valor de X del punto p es de: " + p.getX());
        StdOut.println("El valor de Y del punto p es de: " + p.getY());
        StdOut.println("El valor de P es de: " + p.toString());
        StdOut.println("El valor de X del punto q es de: " + q.getX());
        StdOut.println("El valor de Y del punto q es de: " + q.getY());
        StdOut.println("El valor de Q es de: " + q.toString());
        StdOut.println("La distancia entre el punto 2D p y q es de: " + p.distancia(q));
        StdOut.println("El nombre del punto p es de: " + p.getNombre());
        StdOut.println("Si quiere unir los puntos p y q escriba 1");
        respuesta = StdIn.readInt();
        if(respuesta ==1)
        {
            p.union(p,q);
            StdOut.println("La afirmación de que los puntos p y q están conectados es: " + p.IsConnected(p, q));
        }
        else
            StdOut.println("El representante del conjunto p es: " + p.find());
        
        /*
            public static final String SEPARADOR = ",";
            BufferedReader bufferLectura = null;
            try {
             // Abrir el .csv en buffer de lectura
             bufferLectura = new BufferedReader(new FileReader("C:\\Users\\Julian Gómez\\OneDrive - UPB\\Universidad\\4 - Cuarto Semestre\\Estructura de Datos y Algoritmos\\Taller 3\\TallerEstructuraUnionBusqueda"));

             // Leer una linea del archivo
             String linea = bufferLectura.readLine();

             while (linea != null) {
              // Sepapar la linea leída con el separador definido previamente
              String[] campos = linea.split(SEPARADOR); 

              StdOut.println(Arrays.toString(campos));

              // Volver a leer otra línea del fichero
              linea = bufferLectura.readLine();
             }
            } 
            catch (IOException e) {
             e.printStackTrace();
            }
            finally {
             // Cierro el buffer de lectura
             if (bufferLectura != null) {
              try {
               bufferLectura.close();
              } 
              catch (IOException e) {
               e.printStackTrace();
              }
             }
            }

       }
      */  
    }
    
}
