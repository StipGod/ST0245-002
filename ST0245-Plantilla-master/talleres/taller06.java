import java.util.Arrays;

public class taller06 {
    private int size;
    private static final int capacidadDefault = 10;
    private int abejas[]; 
    
    public void arrayList() {
        size = 0;
        abejas = new int[capacidadDefault];
    }     
    
    public int size() {
        return size;
    }   
    
    public void add(int e) {
        if (size == abejas.length){ 
            int[] newAbejas = new int[abejas.length+10]; 
            for(int i = 0; i < abejas.length; i++)
                newAbejas[i] = abejas[i]; 
            abejas = newAbejas;
        }            
        else
            abejas[size] = e;
        size = size + 1;
    }    
    
    public int get(int i) throws Exception {
        if (i < 0 || i >= size)
            throw new Exception("Index out of bounds exception, index = "+i);
        else
            return abejas[i];
    }
    
    public void add(int index, int e) {
        if (index < size && index >=0){

          for(int i = 0; i <=size; i++){
            if (i == size && size == abejas.length){
          extend();
        }

          if(i == index){
            T swap = abejas[i];
            abejas[i] = e;
            abejas[i + 1] = swap;
            i++;
            size++;
        }
        }
    }            
        
    
  
    public void extend() {
        int[] newAbejas = new int[abejas.length+10]; 
            for(int i = 0; i < abejas.length; i++)
                newAbejas[i] = abejas[i]; 
            abejas = newAbejas;
    }

    public void del(int index){
        for(int i = index;i < abejas.length;i++){
            if(abejas[i+1] != null){
              abejas[i+1]=abejas[i];
            }else{
              abejas[i] = null;
            }
          }
    }
}