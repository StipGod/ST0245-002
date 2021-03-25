import java.util.Stack;
public class Taller8{
    public static int polaca(String entrada){
      Stack<Integer> pila = new Stack();
      String ops = "+*/-";
      for (int i = 0; i < entrada.length(); i++){
         if (ops.contains(""+entrada.charAt(i))){
                       
             int last = pila.pop();
             int secondToLast = pila.pop();     
             char op = entrada.charAt(i);
             if (op == '+'){
               pila.push(secondToLast + last);

             }
                 
             if (op == '-'){
               pila.push(secondToLast - last);

             }
             if (op == '*'){
               pila.push(secondToLast * last);

             }
             if (op == '/'){
               pila.push(secondToLast / last);

             }
                
                 
         }      
         else{         
         pila.push(Integer.valueOf(entrada.charAt(i)));
         }
      } 
      return pila.pop();
    }
}

