/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerestructuraunionbusqueda;



/**
 *
 * @author Julian Esteban Gómez Lopez - Julian Styven Colorado Agudelo
 * @IDs 000438304 - 000420606
 */
public class Punto2D 
{	
	// Representacion del ADT
	private double x;
	private double y;
        private String representante; 
        //final double DMAX = 0.3; //Se elige la distancia máxima entre los puntos
	
	// Constructores
	public Punto2D() {
            this.x=0;
            this.y=0;
            
        }// Crea el punto (0,0)
	
        //TO DO: Evaluar si usar un nombre para cada punto es funcional, necesario y eficiente
	public Punto2D(double x, double y) { //Se pide a la hora de crear un punto el valor de x, y y el nombre (de momento)
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
        public String getRepresentante(){
            return representante;
        }

	public double distancia(Punto2D p) {
		return Math.sqrt( (x-p.getX())*(x-p.getX()) + (y-p.getY())*(y-p.getY()) );
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

        
	
 }       
