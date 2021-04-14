package Proyecto;

import java.io.IOException;

public class LossyCompression {

    public static void main(String[] args) throws IOException{
        
        LectorCVS.printMatriz(downScale(3, LectorCVS.getDataset("test.csv")));
    }

    public static String[][] upScale(int rateOfUpscale,String[][] image){
        
        String newImage[][] = new String[image.length*rateOfUpscale][image[0].length*rateOfUpscale];
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
            String aux = image[i][j];
                for(int x=rateOfUpscale*j;x<(rateOfUpscale*j)+rateOfUpscale;x++){
                    for(int z=i*rateOfUpscale;z<i*rateOfUpscale+rateOfUpscale;z++){
                    newImage[x][z] = aux;
                    }
                }
            }
        }
        return newImage;
    }

    public static String[][] downScale(int rateOfDownscale,String[][] image){
    
        String newImage[][] = new String[(image.length)/rateOfDownscale][(image[0].length)/rateOfDownscale];
        
        int total = 0;
        int cont = 0;
        for(int i=0;i<newImage.length;i++){
            for(int j=0;j<newImage[i].length;j++){
                for(int x=i*rateOfDownscale;x<(rateOfDownscale*i)+rateOfDownscale;x++){
                    for(int z=j*rateOfDownscale;z<j*rateOfDownscale+rateOfDownscale;z++){
                            if (image[x][z]!=null) {
                                total += Integer.parseInt(image[x][z]);
                                cont +=1;
                            }  
                        }
                    }
                    String promedio = Integer.toString(total/cont);
                    newImage[i][j] = promedio;
                    total = 0;
                    cont = 0;
                }
            }
        return newImage;
        }   
    }

