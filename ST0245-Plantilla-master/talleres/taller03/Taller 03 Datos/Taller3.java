public class Taller3 {
    
    public static void torresDeHannoi(int n) {
        torresDeHannoiAux(n, 1, 2, 3);
    }

    private static void torresDeHannoiAux(int n, int origen, int intermedio, int destino) {
                if(n==1)
            {
              System.out.println("Disk 1 from "+ origen + " to " + destino);
            }else{
              torresDeHannoiAux(n-1,origen,destino,intermedio);
              System.out.println("Disk " +n+ " from "+ origen + " to " + destino);
              torresDeHannoiAux(n-1,intermedio,origen,destino);
            }
    }
    
     public static void permutation(String str) {
            permutationAux("", str); 
    }
    
    private static void permutationAux(String prefix, String str) {
	int n = str.length();
	if (n == 0)
	    System.out.println(prefix);
	else {
	    for (int i = 0; i<n; i++){
		permutationAux( prefix + String.valueOf(str.charAt(i)) , str.substring(0, i) + str.substring( i+1 , n));
              }
         }
	}
    }
    
