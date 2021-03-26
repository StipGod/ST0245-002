public class Triplet <A, B, C> { 
   public final A x;
   public final B y; 
   public final C z; //Distancia
    
    
    
   public Triplet(A x, B y, C z) { 
        this.x = x; 
        this.y = y; 
        this.z = z;
    } 
    
    public String toStringJS(){
        String msg = "["+x.toString()+","+y.toString()+", Distancia: "+z.toString()+"]";
        return msg;
    }
} 
