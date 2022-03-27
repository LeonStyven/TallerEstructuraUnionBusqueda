/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerestructuraunionbusqueda;

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
