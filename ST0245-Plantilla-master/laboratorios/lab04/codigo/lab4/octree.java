package lab4;

import java.util.ArrayList;
import java.util.LinkedList;

public class octree
{
    private double midX,midY,midZ;
    
    public void Octree(LinkedList<abejita> abejas,ArrayList<Double> mins,double midX,double midY,double midZ) {
        
        this.midX = midX;
        this.midY = midY;
        this.midZ = midZ;

        ArrayList<LinkedList<abejita>> octree=new ArrayList(8);

        for (int i=0;i<8;++i) {
            LinkedList<abejita> ab=new LinkedList();
            octree.add(ab);
        }
        for (int i=0;i<abejas.size();++i) {
            abejita abeja=abejas.poll();
            int sector=getSector(abeja,mins);
            octree.get(sector).addFirst(abeja);
        }
        double diagonal=Math.sqrt(Math.pow((midX)*111300,2)+Math.pow((midY)*111300,2)+Math.pow((midZ),2));

        if (diagonal>100) {
            for (int i = 0; i < 8; i++) {
                if(octree.get(i).size()>1){
                    nuevoOctree(octree.get(i), mins, i);
                }
            }
        }else{
            for (int i = 0; i < 8; i++) {
                if(octree.get(i).size()>0){
                    choque(octree.get(i));
                }
            }
            
        }
        
    }

    private int getSector(abejita abeja,ArrayList<Double> mins) {
        if (abeja.getX()<=mins.get(0)+midX) {
            if (abeja.getY()<=mins.get(1)+midY) {
                if (abeja.getZ()<=mins.get(2)+midZ) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                if (abeja.getZ()<=mins.get(2)+midZ) {
                    return 2;
                } else {
                    return 3;
                }
            }
        } else {
            if (abeja.getY()<=mins.get(1)+midY) {
                if (abeja.getZ()<=mins.get(2)+midZ) {
                    return 4;
                } else {
                    return 5;
                }
            } else {
                if (abeja.getZ()<=mins.get(2)+midZ) {
                    return 6;
                } else {
                    return 7;
                }
            }
        }
    }
    

    public void nuevoOctree(LinkedList<abejita> abejas,ArrayList<Double> mins,int sector) {
        if (sector==0) {
            Octree(abejas,mins,midX/2,midY/2,midZ/2);
        } else if (sector==1) {
            double nuevoH=mins.get(2)+midZ;
            mins.remove(2);
            mins.add(2,nuevoH);
            Octree(abejas,mins,midX/2,midY/2,midZ/2);
        } else if (sector==2) {
            double nuevoW=mins.get(1)+midY;
            mins.remove(1);
            mins.add(1,nuevoW);
            Octree(abejas,mins,midX/2,midY/2,midZ/2);
        } else if (sector==3) {
            double nuevoH=mins.get(2)+midZ;
            mins.remove(2);
            mins.add(2,nuevoH);
            double nuevoW=mins.get(1)+midY;
            mins.remove(1);
            mins.add(1,nuevoW);
            Octree(abejas,mins,midX/2,midY/2,midZ/2);
        } else if (sector==4) {
            double nuevoD=mins.get(0)+midX;
            mins.remove(0);
            mins.add(0,nuevoD);
            Octree(abejas,mins,midX/2,midY/2,midZ/2);
        } else if (sector==5) {
            double nuevoD=mins.get(0)+midX;
            mins.remove(0);
            mins.add(0,nuevoD);
            double nuevoH=mins.get(2)+midZ;
            mins.remove(2);
            mins.add(2,nuevoH);
            Octree(abejas,mins,midX/2,midY/2,midZ/2);
        } else if (sector==6) {
            double nuevoD=mins.get(0)+midX;
            mins.remove(0);
            mins.add(0,nuevoD);
            double nuevoW=mins.get(1)+midY;
            mins.remove(1);
            mins.add(1,nuevoW);
            Octree(abejas,mins,midX/2,midY/2,midZ/2);
        } else {
            double nuevoD=mins.get(0)+midX;
            mins.remove(0);
            mins.add(0,nuevoD);
            double nuevoW=mins.get(1)+midY;
            mins.remove(1);
            mins.add(1,nuevoW);
            double nuevoH=mins.get(2)+midZ;
            mins.remove(2);
            mins.add(2,nuevoH);
            Octree(abejas,mins,midX/2,midY/2,midZ/2);
        }
    }

    public void choque(LinkedList<abejita> abejas) {
        System.out.println("Estas abejas estan en riesgo de chocarse:");
        for (abejita abeja:abejas) {
            System.out.println(abejas.poll().getX()+","+abejas.poll().getY()+","+abejas.poll().getZ());
        }
    }

}

