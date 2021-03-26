package punto2lab3;
import java.util.LinkedList;
import java.util.Scanner; 

public class listaTecladoMalo {

    public static void main (String args[]){
        Scanner Scan = new Scanner(System.in);
        System.out.println("Ingresar string:");
        String textoACorregir = Scan.next();
        System.out.println(tecladoMalo(textoACorregir));
        }

    public static String tecladoMalo(String textoMalo){

        LinkedList<String> list = new LinkedList<>();
        boolean inicio = true;
        String str = "";

        for(int i = 0; i<textoMalo.length();i++){
            char caracter = textoMalo.charAt(i);
            if(i!=textoMalo.length()-1){
                if(caracter=='['||caracter==']'){
                    if(inicio){
                        list.addFirst(str);
                        str = "";
                    }else{
                        list.add(str);
                        str = "";
                    }   
                    if(caracter == '['){
                            inicio = true;
                        }else {
                            inicio = false;
                        }
                        }else{
                        str += caracter;
                    }
            }else{
                if(caracter!='[' && caracter!=']'){
                    str += caracter;
                }
                if(inicio){
                    list.addFirst(str);
                    str = "";
                }else{
                    list.add(str);
                    str = "";
                }
            }
        }      
    String answer = "";

    for(int i = 0; i<list.size();i++){
        answer = answer + list.get(i);
        }

    return answer;
    }
}
