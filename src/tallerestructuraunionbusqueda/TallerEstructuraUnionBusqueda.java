/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerestructuraunionbusqueda;

import edu.princeton.cs.algs4.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Julian Esteban Gómez Lopez - Julian Styven Colorado Agudelo
 * @IDs 000438304 - 000420606
 */
public class TallerEstructuraUnionBusqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Obtener el archivo separado por comas
        BufferedReader bufferLectura = null;
        final String SEPARADOR = ",";
        
        //FALTA HACER QUE SE SELECCIONE
        File doc = new File("ejemplos\\datapoints-100.csv");
            
        try{
            
            // Abrir el .csv en buffer de lectura
            bufferLectura = new BufferedReader(new FileReader("ejemplos\\datapoints-100.csv"));
            
            // Leer una linea del archivo
            String linea = bufferLectura.readLine();
                       
            while (linea != null) {
                  // Sepapar la linea leída con el separador definido previamente
                  String[] campos = linea.split(SEPARADOR); 
                  Punto2D punto = new Punto2D(Double.parseDouble(campos[0]),Double.parseDouble(campos[1]));
                  
                  //FALTA GUARDAR LOS PUNTOS

                  // Volver a leer otra línea del fichero
                  linea = bufferLectura.readLine();
                 }
        }catch(Exception error){
            StdOut.print("An error has been ocurred. Code: " + error);
        }
        finally{
            StdIn.readLine();
        }
    }
    
}
/*
        //TO DO: Revisar qué se hace en caso de que esté más lejos que DMAX
        public void union(Punto2D a, Punto2D b) //Para unir dos puntos se cambia el representante de uno de ellos
        {
            //Creará una nueva conexión entre dos puntos 2D
            //a.getNombre();
            //b.getNombre();
            //Se unirá si la distancia entre ambos puntos es menora una establecida.
            if(a.distancia(b) >= DMAX)
                //Se establece como "padre" de a, b
                a.nombre = b.nombre;
           
            
        }
        
        
        public int count() //Esto se usa para los conjuntos, no funciona de momento.
        {
            //Contará la cantidad total de componentes que hay
            int totalComponentes = 0;
            return totalComponentes;
        }
        
*/