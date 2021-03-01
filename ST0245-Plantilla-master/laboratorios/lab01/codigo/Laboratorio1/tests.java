import java.util.concurrent.ThreadLocalRandom;

public class tests {

    public static void main(String[] args) {

        for(int i = 1; i<21;i++){
            
        String str1 = cadenaAleatoria(i);
        String str2 = cadenaAleatoria(i);

        long inicio = System.currentTimeMillis();

        System.out.println(laboratorio01.lcsDNA(str1,str2));
        
        long fin = System.currentTimeMillis();
        
        long total = (fin - inicio);
        
        System.out.println("Para "+i+"x"+i+" El tiempo total fue de " + total + " ms");
        }
    }
    public static String cadenaAleatoria(int longitud) {
        
        String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        
        String cadena = "";
        for (int x = 0; x < longitud; x++) {
            int indiceAleatorio = numeroAleatorioEnRango(0, banco.length() - 1);
            char caracterAleatorio = banco.charAt(indiceAleatorio);
            cadena += caracterAleatorio;
        }
        return cadena;
    }
    public static int numeroAleatorioEnRango(int minimo, int maximo) {

        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
}
