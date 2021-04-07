package Taller09;

import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.*;
import java.util.HashMap;
public class GestorDeArchivos{
public static void main(String[] args) throws IOException{
    
    Path ruta = Paths.get("usda-dc-directory.csv"); 
    String texto_en_string = Files.readString(ruta, StandardCharsets.UTF_8);
    String[] separado_por_lineas = texto_en_string.split("\n"); 
    HashMap<String, String> tabla_de_hash = new HashMap<String,String>();
    
    for (String linea : separado_por_lineas){
        String[] columnas = linea.split(",");
        String apellido = columnas[0];
        String nombre = columnas[1];
        String telefono = columnas[3];
        tabla_de_hash.put(nombre+" "+apellido, telefono);
    }
    
    for (String nombre_y_apellido : tabla_de_hash.keySet())
        System.out.println(nombre_y_apellido + ": " + tabla_de_hash.get(nombre_y_apellido));
    }
}