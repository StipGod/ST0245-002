import java.util.LinkedList;
import java.io.*;

public class NoLossComp {
    
    public static void main(String[] args) throws IOException{
        
        LinkedList<DLC> szs = new LinkedList<>();    
        szs = Lz77("Le voy a dar un pico",40,40);
        System.out.println(decoderLz77(szs));    
        
    }
    public static LinkedList<DLC> Lz77(String foto,int searchBuffer,int lookBuffer) {
        LinkedList<DLC> ans = new LinkedList<>();
        int pos = 0;
        int i = 0;
        while(pos<foto.length()){
            ans.add(repeatedChar(foto, searchBuffer, lookBuffer, pos));
            if(ans.get(i).getL()==0){
                pos += 1;
            }else{
            pos += ans.get(i).getL();
            }
            i++;
        }
        return ans;
    }

public static DLC repeatedChar(String cadena,int searchBuffer,int lookBuffer,int pos) {
    for (int i = lookBuffer; i > 0; i--) {
        for (int j = searchBuffer; j > 0; j--) {
            if((pos-j)>=0 && (pos+i)<cadena.length() && (pos-j+i) < cadena.length()){
                if(cadena.substring(pos,pos+i).equalsIgnoreCase(cadena.substring(pos-j,pos-j+i))){
                    if((pos)+i == cadena.length()){
                        System.out.println(pos);
                        System.out.println(i);
                        DLC ans = new DLC(j,i,'*');
                        return ans;
                    }else{
                    DLC ans = new DLC(j,i,cadena.charAt(pos+i));
                    return ans;
                    }
                }
            }
        }
    }
    DLC ans = new DLC(0,0,cadena.charAt(pos));
    return ans;
}

public static String decoderLz77(LinkedList<DLC> dlc) {    
    String decodedString = "";
    int iiiii = dlc.size();
    for (int i = 0; i < iiiii; i++) {
        DLC aux = dlc.poll();
        if(aux.getD()==0 && aux.getL()==0){
            decodedString += aux.getC();
        }else if(aux.getD()<aux.getL()){
            for (int j = aux.getL(); j > 0; j--) {
                decodedString += decodedString.charAt(decodedString.length()-aux.getD());
            }
        }else{
            decodedString += decodedString.substring(decodedString.length() - aux.getD(),decodedString.length() - aux.getD() + aux.getL());
        }
        
    }
    return decodedString;
}
public static String[][] toMatrizLz(String txtString) {
    
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
public static LinkedList<LC> compressionLC(String[] foto) {
    LinkedList<LC> ans = new LinkedList<>();
    int cont = 0;
    boolean same = false;
    LC obj1 = new LC(cont, foto[0]);
    ans.add(obj1);
    for (int i = 1; i < foto.length; i++) {
        if((foto[i]+1) != null)    
            if(foto[i]==foto[i+1]){
                if(same){
                    cont++;
                }else{
                    cont+=2;
                    same = true;
                }
            }else{
                if(same){
                    LC obj = new LC(cont, foto[i-1]);
                    ans.add(obj);
                    cont = 0;
                    same = false;
                }else{
                    LC obj = new LC(1, foto[i]);
                    ans.add(obj);
                }
        }
    }
    return ans;
    
}
public static LinkedList<String> decompressionLC(LinkedList<LC> comp) {
    LinkedList<String> ans = new LinkedList<>();
    int size = comp.size();
    for (int i = 0; i < size; i++) {
        LC aux = comp.poll();
        for (int j = 0; j < aux.getL(); j++) {
            ans.add(aux.getC());
        }
    }
    return ans;
    
}

public static String[][] toMatrizLC(LinkedList<String> matriz) {
    int columnas = Integer.parseInt(matriz.removeLast());
    String[][] ans = new String[columnas][columnas/matriz.size()];

    for (int i = 0;i<columnas;i++){
        for (int j = 0;j<columnas/matriz.size();j++) {
            ans[i][j]=matriz.poll();
        }
    }
        return ans;
    
}
}