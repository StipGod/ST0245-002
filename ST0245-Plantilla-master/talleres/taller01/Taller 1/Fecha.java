public class Fecha {

  private int dia;
  private int mes;
  private int anio;

 
  public void Fecha(int d, int m, int a) {
    this.dia = d;
    this.mes = m;
    this.anio = m;
  }

  public int dia() {
    return this.dia;
  }

  public int mes() {
    return this.mes;
  }

  public int anio() {
    return this.anio;
  }

  public int comparar(Fecha otra) {
    int ans;

    String fechaCompleta = String.valueOf(anio) + String.valueOf(mes) + String.valueOf(dia);
    int fechaCompletaInt1=Integer.parseInt(fechaCompleta);  

    String fechaCompleta2 = String.valueOf(otra.anio) + String.valueOf(otra.mes) + String.valueOf(otra.dia);
    int fechaCompletaInt2=Integer.parseInt(fechaCompleta2);
    
    if(fechaCompletaInt1>fechaCompletaInt2)
    {
      ans = -1;

    }else if(fechaCompletaInt1<fechaCompletaInt2){

      ans=1;

    }else{

      ans=0;

    }
    
    return ans;
  }

  public String toString() 
    {
        String ans = mes+"/"+dia+"/"+anio;
        return ans;
    }
}