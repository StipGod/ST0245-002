package Taller11;

import java.util.ArrayList;

public class DigraphAM extends Digraph {
    
        private int[][] matriz;
        
    
    public DigraphAM(int size) {
        super(size);
            matriz = new int[size][size];
    }
    
    public void addArc(int source, int destination, int weight) {
        int i = source; 
        int j = destination;
        matriz[i][j] = weight; 
        }                           
    
    public ArrayList<Integer> getSuccessors(int vertex) {
        ArrayList<Integer> respuesta = new ArrayList<Integer>();
        for(int j = 0; j < respuesta.size(); j++)
        if (matriz[vertex][j] != 0)
            respuesta.add(j);
            return respuesta;
    }
    
    public int getWeight(int source, int destination)  {
        int peso = matriz[source][destination];
        return peso;
    }
}