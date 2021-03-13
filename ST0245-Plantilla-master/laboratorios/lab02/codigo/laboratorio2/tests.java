package laboratorio2;

import java.util.concurrent.ThreadLocalRandom;

public class tests {

    public static void main(String[] args) {

        System.out.println("INSERTION SORT");

        for(int i = 10000; i<30000;i+=1000){
        
        int test[] = new int [i];
        int xd = i-1;
        while(xd>=0){
            test[xd] = numeroAleatorio(0,100);
            xd--;
        }

        long inicio = System.currentTimeMillis();

        sorts.insertionSort(test);
        
        long fin = System.currentTimeMillis();
        
        long total = (fin - inicio);
        
        //Esto es para imprimir el arreglo en orden
        //int xdxd = i-1;
        //System.out.println("Arreglo "+i);

        //while(xdxd>=0){
        //    System.out.println("Posicion " +(xdxd+1)+": "+test[xdxd]);
        //    xdxd--;
        //}
        
        System.out.println("Para el arreglo "+i+" El tiempo total fue de " + total + " ms");
        }

        System.out.println("MERGE SORT");

        for(int i = 10000000; i<30000000;i+=1000000){
        
            int testV2[] = new int [i];
            int xdV2 = i-1;
            while(xdV2>=0){
                testV2[xdV2] = numeroAleatorio(0,100);
                xdV2--;
            }
    
            long inicioV2 = System.currentTimeMillis();
    
            sorts.mergeSort(testV2,0,testV2.length-1);
            
            long finV2 = System.currentTimeMillis();
            
            long totalV2 = (finV2 - inicioV2);

            //Esto es para imprimir el arreglo en orden
            //int xdxdV2 = i-1;
            //System.out.println("Arreglo "+i);
    
            //while(xdxdV2>=0){
                //System.out.println("Posicion " +(xdxdV2+1)+": "+testV2[xdxdV2]);
                //xdxdV2--;
            //}
            
            System.out.println("Para el arreglo "+i+" El tiempo total fue de " + totalV2 + " ms");
        }
    }
    public static int numeroAleatorio(int minimo, int maximo) {

        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
}