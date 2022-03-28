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
        
        //Switch con opciones para determinar tamaño de n de cada vector a crear.
        String respuesta = "";
        Punto2D[] puntos = null; // Arreglo de puntos leidos del archivo
        
        StdOut.println("Para crear el vector, ingrese el número del tamaño que desea según las opciones dadas para el vector de Puntos2D:\n");
        StdOut.println("Los tamaños soportados son de: \n");
        StdOut.println("1. 100\n");
        StdOut.println("2. 120\n");
        StdOut.println("3. 150\n");
        StdOut.println("4. 200\n");
        StdOut.println("5. 1000\n");
        StdOut.println("6. 2500\n");
        StdOut.println("7. 5000\n");
        
        
        switch(respuesta)
                {
                    case "1": 
                        File doc = new File("ejemplos\\datapoints-100.csv");
                         puntos = new Punto2D[100];
                        break;
                    case "2":
                        File doc1 = new File("ejemplos\\datapoints-120.csv");
                        puntos = new Punto2D[120];
                        break;
                    case "3":
                        File doc2 = new File("ejemplos\\datapoints-150.csv");
                        puntos = new Punto2D[150];
                        break;
                    case "4":
                        File doc3 = new File("ejemplos\\datapoints-200.csv");
                        puntos = new Punto2D[200];
                        break;
                    case "5":
                        File doc4 = new File("ejemplos\\datapoints-1000.csv");
                        puntos = new Punto2D[1000];
                        break;
                    case "6":
                        File doc5 = new File("ejemplos\\datapoints-2500.csv");
                        puntos = new Punto2D[2500];
                        break;
                    case "7":
                        File doc6 = new File("ejemplos\\datapoints-5000.csv");
                        puntos = new Punto2D[5000];
                        break;
                    default:
                        break;
                }
        
        
        
            //Obtener el archivo separado por comas
            BufferedReader bufferLectura = null;
            final String SEPARADOR = ",";

            //FALTA HACER QUE SE SELECCIONE
            File doc = new File("ejemplos\\datapoints-100.csv");

            try{
                int counter = 0;//Contador de puntos

                // Abrir el .csv en buffer de lectura
                bufferLectura = new BufferedReader(new FileReader("ejemplos\\datapoints-100.csv"));

                // Leer una linea del archivo
                String linea = bufferLectura.readLine();

                while (linea != null) {
                      // Sepapar la linea leída con el separador definido previamente
                      String[] campos = linea.split(SEPARADOR); 
                      Punto2D punto = new Punto2D(Double.parseDouble(campos[0]),Double.parseDouble(campos[1]));

                      puntos[counter] = punto;
                      counter ++;
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