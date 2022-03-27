/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerestructuraunionbusqueda;



/**
 *
 * @author jstca
 */
public class Punto2D 
{
	
	// Representacion del ADT
	private double x;
	private double y;
        private String representante; 
        private String nombre;
        private boolean areConnected; //TO DO: Revisar qué tan necesario y eficiente es tener esta variable, además de posibles usos
        final double DMAX = 0.3; //Se elige la distancia máxima entre los puntos
	
	// Constructores
	public Punto2D() {
            this.x=0;
            this.y=0;
            
        }// Crea el punto (0,0)
	
        //TO DO: Evaluar si usar un nombre para cada punto es funcional, necesario y eficiente
	public Punto2D(double x, double y, String nombre) { 
		this.x = x;
		this.y = y;
                this.nombre = nombre;
                representante = nombre; // Cada punto se tendrá inicialmente a sí mismo como 
                boolean areConnectec = false;
	}
	
	// API del ADT
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
        public String getNombre(){
            return nombre;
        }
	public double distancia(Punto2D p) {
		return Math.sqrt( (x-p.getX())*(x-p.getX()) + (y-p.getY())*(y-p.getY()) );
	}
        
        //TO DO: Revisar como funciona el método al introducir ambos punto.
        public Boolean IsConnected(Punto2D a, Punto2D b)
        {
            //Se revisará si el punto está conectado con el especificado mediante el representante que tengan
            if(a.getNombre()==b.getNombre()) 
                return true;    
            else
                return false;
            
        }
	
        //TO DO: Revisar si es mejor que devuelva el nombre o el punto 2D al que se está conectado
        //TO DO: Hacer que funcione para un conjunto, después de hacer el conjunto claro xd
        public String find()
        {
            //Se buscará el representante del conjunto al que pertenece el punto a, si está sola me devuelve su nombre
           return nombre;
        }
        
        
        //TO DO: Revisar qué se hace en caso de que esté más lejos que DMAX
        public void union(Punto2D a, Punto2D b)
        {
            //Creará una nueva conexión entre dos puntos 2D
            //a.getNombre();
            //b.getNombre();
            //Se unirá si la distancia entre ambos puntos es menora una establecida.
            if(a.distancia(b) >= DMAX)
                //Se establece como "padre" de a, b
                a.nombre = b.nombre;
           
            
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
 }       
