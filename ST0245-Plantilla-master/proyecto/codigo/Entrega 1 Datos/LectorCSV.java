import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class LectorCSV
{
    public static void main(String[] args)
    {
        String path = "ganado enfermo CSVs.cvs";
        String line = "";
        try{
            BufferedReader Br = new BufferedReader(new FileReader(path));
            
            while((line = Br.readLine())!=null)
            {
                String[] values = line.split(",");
                for(int i=0; values.length>i;i++)
                {
                    System.out.println(values[i]);
                }
            }   
    } catch(FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e){
        e.printStackTrace();
    }
 }
}

