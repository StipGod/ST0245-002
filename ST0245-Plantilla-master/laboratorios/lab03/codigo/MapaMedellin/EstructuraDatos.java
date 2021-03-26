import java.util.*;
public class EstructuraDatos
{
    private int size;
    public ArrayList<Triplet<Nodo, Nodo, Double>> grafo;
    public EstructuraDatos(HashMap<Long, Nodo> Nodos, ArrayList<Triplet<Long, Long, Double>> arcos){
       this.grafo = new ArrayList<>();
       asignarElementos(Nodos, arcos);
       this.size = grafo.size();
    }  
    public void asignarElementos(HashMap<Long, Nodo> Nodos, ArrayList<Triplet<Long, Long, Double>> arcos){        
        for(Triplet<Long, Long, Double> t: arcos){
            if(Nodos.containsKey(t.x)){
                if(Nodos.containsKey(t.y)){
                   Nodo origen = new Nodo(t.x);
                   Nodo destino = new Nodo(t.y);
                   this.grafo.add(new Triplet<Nodo, Nodo, Double>(origen, destino, t.z));
                }
            }
        }              
    }

    public Double getDistancia(Long origenID, Long destinoID){             
        for(Triplet<Nodo, Nodo, Double> t: this.grafo){            
            if(t.x.id.equals(origenID) && t.y.id.equals(destinoID)){                
                return new Double(t.z);             
            }      
        }
        return null;
    }     
    public int size() {
        return this.size;
    } 
}
