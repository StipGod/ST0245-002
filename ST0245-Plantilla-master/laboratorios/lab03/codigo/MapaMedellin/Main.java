import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
 class Main
{
    public static EstructuraDatos main(){
        HashMap<Long, Nodo> Nodo = LectorDatos.leerNodos();
        ArrayList<Triplet<Long, Long, Double>> arcos = LectorDatos.leerArcos();
        EstructuraDatos medellin = new EstructuraDatos(Nodo, arcos);    
        
        Double a = medellin.getDistancia(new Long(573427554), new Long(573427555)); //Debe dar 14.5973182469
        System.out.println("La distancia entre los dos vertices con los ID ingresados es de: " + a);
        
        return medellin;
    }
}
 