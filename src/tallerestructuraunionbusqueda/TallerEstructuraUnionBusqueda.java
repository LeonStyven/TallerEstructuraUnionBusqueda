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
 * @author jstca
 */
public class TallerEstructuraUnionBusqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BufferedReader bufferLectura = null;
        final String SEPARADOR = ",";
        File doc = new File("ejemplos\\datapoints-100.csv");
            
        try{
            
            // Abrir el .csv en buffer de lectura
            bufferLectura = new BufferedReader(new FileReader("ejemplos\\datapoints-100.csv"));
            
            // Leer una linea del archivo
            String linea = bufferLectura.readLine();
            
            
            while (linea != null) {
                  // Sepapar la linea leída con el separador definido previamente
                  String[] campos = linea.split(SEPARADOR); 
                  Punto2D punto = new Punto2D(Double.parseDouble(campos[0]),Double.parseDouble(campos[1]),"A");
                  

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
