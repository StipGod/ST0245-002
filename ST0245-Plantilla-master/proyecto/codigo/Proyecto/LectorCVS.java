package Proyecto;

import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.*;

public class LectorCVS{
public static void main(String[] args) throws IOException{
    
}
public static String[][] getDataset(String nombreArchivo) throws IOException{
    Path ruta = Paths.get(nombreArchivo); 
    String txtString = Files.readString(ruta, StandardCharsets.UTF_8);
    String[] txtLineas = txtString.split("\n"); 
    String[] columnas = txtLineas[0].split(",");
    String matriz[][] = new String[txtLineas.length][columnas.length];

    for (int i = 0;i<txtLineas.length;i++){
        String[] col = txtLineas[i].split(",");
        for (int j = 0;j<col.length;j++) {
            matriz[i][j]=col[0];
        }
    }
        return matriz;
}

public static String toString(String[][] matriz){
    String ans = "";
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            ans += matriz[i][j]+",";
        }
        ans += "\n";
    }
    return ans;
}

public static void printMatriz(String[][] matriz){
    System.out.print(toString(matriz));
}

}