package Taller11;

import java.util.*;

public class DigraphAL extends Digraph {

    LinkedList<Pair<Integer,Integer>> lista[];
    
    public DigraphAL(int vertices) {
        super(vertices);
        this.lista = new LinkedList[vertices]; 
    }
    
    public void addArc(int source, int destination, int weight) {
        if(lista[source]==null){
            lista[source] = new LinkedList();
        }
        lista[source].add(new Pair(destination,weight));
    }

    public ArrayList<Integer> getSuccessors(int vertex) {
        ArrayList<Integer> sucesores = null;
        LinkedList<Pair<Integer, Integer>> filaSucesores = this.lista[vertex];
        
        if (filaSucesores != null){
            for(Pair p: filaSucesores){
                if(sucesores == null){
                    sucesores = new ArrayList<Integer>();
                }
                sucesores.add(0, (Integer)p.first);  
            }            
        }        
        return sucesores;
    }

    public int getWeight(int source, int destination){
        LinkedList<Pair<Integer, Integer>> fila = this.lista[source];

        if(fila != null){
            for(Pair p : fila)                
                if((int)p.first == destination){
                    return (int)p.second;
                }
        }
        
        return 0;
    }
}
