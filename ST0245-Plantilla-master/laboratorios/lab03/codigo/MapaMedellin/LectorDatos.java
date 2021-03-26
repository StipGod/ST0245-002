import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.lang.Object;
import java.util.*;


public class LectorDatos
{
    public static HashMap<Long, Nodo> leerNodos() {
        HashMap<Long, Nodo> Nodos = new HashMap<>();
        try{
            FileReader f  = new FileReader("Nodos.txt");
            BufferedReader lector = new BufferedReader(f);
            String linea;
            int numFila = 0;
            while((linea = lector.readLine()) != null) { 
                if(numFila != 0) {
                    String[] data = linea.split(" "); 
                    Long id = Long.parseLong(data[0]);
                    Nodo v = new Nodo(id);
                    Nodos.put(v.id, v);
                }
                numFila++;
            }
            lector.close();
            return Nodos;
        }catch (IOException e) {
            System.out.println("Asegurece de tener el documento ''Nodos.txt''");
        }
        return Nodos;
    }  

    
 
    public static ArrayList<Triplet<Long, Long, Double>> leerArcos() {
        ArrayList<Triplet<Long, Long, Double>> arcos = new ArrayList<>();
        try{
            FileReader f  = new FileReader("Arcos.txt");
            BufferedReader lector = new BufferedReader(f);
            String linea;
            int numFila = 0;
            while((linea = lector.readLine()) != null) { //O(n)
                if(numFila != 0) {
                    String[] data = linea.split(" "); //O(n*m)
                    Long origen = Long.parseLong(data[0]);
                    Long destino = Long.parseLong(data[1]);
                    Double distancia = Double.parseDouble(data[2]);
                    Triplet<Long, Long, Double> a = new Triplet(origen, destino, distancia);
                    arcos.add(a); //add() es O(1)
                }
                numFila++;
            }    
            lector.close();
        }catch (IOException e) {
            System.out.println("Asegurece de tener el documento ''Arcos''");
        }
        return arcos;
    }
}
    
