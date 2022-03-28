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
    private int[] size;

    //Constructor pasandole un arrego de puntos
    public ConjuntoPuntos(Punto2D[] conjunto)
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
    }
    
    public boolean Connected(Punto2D p, Punto2D q){
        
        //Un punto se conecta a otro cambiando su representante por el de su padre 
        if(p.getRepresentante().equals(q.getRepresentante()))
            return true;    
        else
            return false;
    }
    
    public int Find(Punto2D p){
        int result = -1;
        for(int i = 0; i < conjunto.length; i++){
        if (conjunto[i].equals(p)) result = i;
        }
        
        return result;
    }
    public int Count(Punto2D p)
    {
        //Cuenta cuántos puntos totales hay
        return count;
        
    }
    
    //Para unir dos puntos se cambia el representante de uno de ellos.
    //Se debe comparar que esten a la distancia correcta
    public void Union(Punto2D p, Punto2D q) 
    {
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
    
    public void Convertir(){
    TallerEstructuraUnionBusqueda taller = new TallerEstructuraUnionBusqueda(); //Llamar a la clase donde esta el valor maximo de distancia
        
        for(int i = 0; i<n; i++){
            for(int j = i+1; i<n; i++){
            //Validar que el tamaño este en el rango ni sea el mismo punto
            /*
            if((conjunto[i].distancia(conjunto[i+1]) <= taller.DMAX) && conjunto[i].distancia(conjunto[i+1])!=0){
                Union(conjunto[i],conjunto[i+1]);
                i++;
            }*/
            }
        }
    }
}
