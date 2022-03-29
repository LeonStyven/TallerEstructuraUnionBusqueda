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
public class ConjuntoPuntos {
    
    //variables para el uso del conjunto
    private int n;
    private int count;
    private Punto2D[] conjunto;
    private int[] parent;

    //Accesores para los vectores
    public Punto2D[] getConjunto() {
        return conjunto;
    }

    public int[] getParent() {
        return parent;
    }

    public int[] getSize() {
        return size;
    }
    private int[] size;

    //Al constructor se le debe pasar un arreglo donde se encuentran los puntos que se quieren convertir en un conjunto
    public ConjuntoPuntos(Punto2D[] conjunto, double DMAX)
    {
        n = conjunto.length;
        count = n;
        this.conjunto = conjunto;
        parent = new int[conjunto.length];
        size = new int[conjunto.length];
        
        //Se llenan los arreglos de padres y de tamaño
        for (int i = 0; i < conjunto.length; i++) {
            parent[i] = i;
            size[i] = 1;
        }
        
    //CLUSTERIZAR LOS NODOS
    Convertir(DMAX);
    }
    
    //Obtener el arreglo de padres
    
    
    //Analizar si 2 puntos ya estan conectados
    public boolean Connected(Punto2D p, Punto2D q){
        
        //Un punto esta conectado con otro si sus padres son los mismos
        if(Find(p)==Find(q))
            return true;    
        else
            return false;
    }
    
    //Encontrar el indice donde se encuentra el padre
    public int Find(Punto2D p){
        int result = -1;
        for(int i = 0; i < conjunto.length; i++){
            if (conjunto[i].equals(p)) result = i;
        }
        return result;
    }
    
    //Contar la cantidad de arboles
    public int Count(Punto2D p)
    {return count;}
    
    //unir 2 nodos del arbol
    
    public void Union(Punto2D p, Punto2D q) 
    {
    //Para unir dos puntos se cambia el representante de uno de ellos.
    //Se debe comparar que esten a la distancia correcta
    //Buscar las raices y comparar que los nodos esten separados
    int rootP = Find(p);
    int rootQ = Find(q);
    if (rootP == rootQ) return;

    // Hacer que la raiz del arbol grande sea la raiz del arbol pequeño
    if (size[rootP] < size[rootQ]) {
        parent[rootP] = rootQ;
        size[rootQ] += size[rootP];
    }
    else {
        parent[rootQ] = rootP;
        size[rootP] += size[rootQ];
    }
    //Resta a la cantidad total de arboles los que ya están conectados
    count--;

    }
    
    //Recibe el parametro del maximo de distancia para unir
    public void Convertir(double DMAX){
        for(int i = 0; i<n; i++){
            for(int j = i+1; i<n; i++){
                //Se valida que el tamaño este en el rango y que el nodo no esté unido a otro
                if((conjunto[i].distancia(conjunto[j]) <= DMAX && //Comprobar el rango
                        j == Find(conjunto[j]))){ //Comprobar que el nodo este libre
                    Union(conjunto[i],conjunto[j]);
                }
            }
        }
    }
}
