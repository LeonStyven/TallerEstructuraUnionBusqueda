/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerestructuraunionbusqueda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import edu.princeton.cs.algs4.StdOut;

/**
 *
 * @author jstca
 */
public class Punto2D {
	
	// Representacion del ADT
	private double x;
	private double y;
	
	// Constructores
	public Punto2D() {
            this.x=0;
            this.y=0;
        }	// Crea el punto (0,0)
	
	public Punto2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// API del ADT
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double distancia(Punto2D p) {
		return Math.sqrt( (x-p.getX())*(x-p.getX()) + (y-p.getY())*(y-p.getY()) );
	}
        
        public Boolean IsConnected(Punto2D a, Punto2D b)
        {
            //Se revisará si los dos puntos especificados están conectados
            return false;
        }
	
        public Punto2D find(Punto2D a)
        {
            //Se buscará el representante del conjunto al que pertenece el punto a
           return a;
        }
        
        public void union(Punto2D a, Punto2D b)
        {
            //Creará una nueva conexión entre dos puntos 2D
        }
        
        public int count()
        {
            //Contará la cantidad total de componentes que hay
            int totalComponentes = 0;
            return totalComponentes;
        }
        
        
	
	// Metodos heredados de Object
	
	/**
	 * Obtener una representacion textual del objeto
	 * @see java.lang.Object#toString()
	 *
	 * @return
	 */
	public String toString() {
		return "("+getX()+","+getY()+")";
	}
        
        
        public boolean equals(Object q) {
            if (q==null) return false;
            if (!(q instanceof Punto2D)) return false;
            Punto2D r = (Punto2D) q;
            if ( this.distancia(r)<TOL ) return true;
            return false;
        }
        
        
        public static final double TOL = 1E-12;

        
	public static final String SEPARADOR = ",";
        
        //public void lectorArchivos(){
        public static void main(String[] args) {

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
        
        
        
}
