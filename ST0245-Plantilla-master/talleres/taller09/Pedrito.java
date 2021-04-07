package taller09;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

// Nota: Hacen falta algunas partes de las lineas de codigo, estas estan
// indicadas con una linea, ¡debes completarlas!
public class Pedrito {

    public static void main(String args[]){
        Pedrito3();
        Pedrito4();
        }

    public static void agregar(HashMap empresas,String key, String value){
        empresas.put(key, value);
    }

    
    public static boolean buscar(HashMap empresas,String key){
        return empresas.containsKey(key);
    }

    public static boolean contieneValue(HashMap empresas,String value){
        return empresas.containsValue(value);
    } 

    public static void Pedrito3(){
        HashMap<String,String> empresasPedro = new HashMap();
        agregar(empresasPedro,"Google", "Estados Unidos");
        if(buscar(empresasPedro, "Google")){
            System.out.println(empresasPedro.get("Google"));}
        if(buscar(empresasPedro, "Motorola")){
            System.out.println(empresasPedro.get("Motorola"));}
    }

    public static void Pedrito4(){
        HashMap<String,String> empresasPedro = new HashMap();
        agregar(empresasPedro,"Google", "Estados Unidos");
        agregar(empresasPedro,"La locura", "Colombia");
        agregar(empresasPedro,"Nokia", "Finlandia");
        agregar(empresasPedro,"Sony", "Japon");

        Set<String> claves = empresasPedro.keySet();

        Collection<String> paises = empresasPedro.values();

        if(paises.contains("Estados Unidos")){

            for(String clave : claves){
                String paisActual = empresasPedro.get(clave);
                if(paisActual.equals("Estados Unidos")){
                    System.out.println(clave);

                }
            }

        }
        else{
            System.out.println("El pais no esta en el hashmap");
        }
        if(paises.contains("India")){

            for(String clave : claves){
                String paisActual = empresasPedro.get(clave);
                if(paisActual.equals("India")){
                    System.out.println(clave);

                }
            }
        }
        else{
            System.out.println("El pais no esta en el hashmap");
        }
    }
}