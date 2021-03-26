public class Nodo {    
    Long id;
    //double x; //Según los parámetros en el lab, estos datos son irrelevantes por ahora
    //double y;
    //String name;  
    public Nodo(Long id) {
        this.id = id;
        //this.x = x;
        //this.y = y;
        //this.name = name;
    }
    public String toString(){
        return "{Vertice: [Id->"+id.toString()+"]}";
    }
}
