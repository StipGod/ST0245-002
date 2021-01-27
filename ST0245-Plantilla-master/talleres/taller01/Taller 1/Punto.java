import java.lang.Math;
public class Punto {

    private double x, y;

    public void setPunto(double x, double y) 
    {
        this.x = x;
        this.y = y;
    }

    public double getx() 
    {
        return this.x;
    }

    public double gety() 
    {
        return this.y;
    }

    public double radioPolar() 
    {
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }
    
    public double anguloPolar() 
    {
      return Math.atan(y/x);
    }

    public double distanciaEuclidiana(Punto otro) 
    {
        return Math.sqrt( Math.pow((otro.getx()-x),2)+Math.pow((otro.gety()-y),2));
    }
}