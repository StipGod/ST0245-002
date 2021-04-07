package Taller09;

public class UnaTablaDeHash
{
    private int[] tabla;

    public UnaTablaDeHash(){
        tabla = new int[10];
    }

    private int funcionHash(String k){
        return ((int) k.charAt(0)) % 10;
    }

    public int get(String k){
        return tabla[funcionHash(k)];
    }

    public void put(String k, int v){
        tabla[funcionHash(k)] = v;
    }
}