package lab4;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.*;


public class reader {

    LinkedList<Double> x = new LinkedList();
    LinkedList<Double> y = new LinkedList();
    LinkedList<Double> z = new LinkedList();
    LinkedList<abejita> abejas=new LinkedList();

    public void getCordenadas(String dir) throws IOException{
        
            Path ruta = Paths.get(dir); 
            String txtString = Files.readString(ruta, StandardCharsets.UTF_8);
            String[] cordenadas = txtString.split(","); 
        
            try{
                x.addFirst(Double.parseDouble(cordenadas[0]));
                y.addFirst(Double.parseDouble(cordenadas[1]));
                z.addFirst(Double.parseDouble(cordenadas[2]));
                abejita abeja=new abejita(Double.parseDouble(cordenadas[0]),Double.parseDouble(cordenadas[1]),Double.parseDouble(cordenadas[2]));
                abejas.addFirst(abeja);
            } catch (Exception e){
            }
        }
    public void run(){
        double minX=(double)Collections.min(x);
        double maxX=(double)Collections.max(x);

        double minY=(double)Collections.min(y);
        double maxY=(double)Collections.max(y);

        double minZ=(double)Collections.min(z);
        double maxZ=(double)Collections.max(z);

        ArrayList<Double> mins=new ArrayList();
        mins.add(minX);
        mins.add(minY);
        mins.add(minZ);
        double midX=(minX-maxX)/2;
        double midY=(maxY-minY)/2;
        double midZ=(maxZ-minZ)/2;
        double ph=Math.sqrt(Math.pow((midX)*111325,2)+Math.pow((midY)*111325,2));
        double diagonal=Math.sqrt(Math.pow(ph,2)+Math.pow((midZ),2));
        if (diagonal>100) {
            octree Octree=new octree();
            Octree.Octree(abejas,mins,midX,midY,midZ);
        } else {
            choque(abejas);
        }
    }
    public void choque(LinkedList<abejita> abejas) {
        System.out.println("Estas abejas estan en riesgo de chocarse:");
        for (abejita abeja:abejas) {
            System.out.println(abejas.poll().getX()+","+abejas.poll().getY()+","+abejas.poll().getZ());
        }
    }

    }
