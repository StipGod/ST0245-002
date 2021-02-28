public class Taller5 
{
    public static int suma (int[]array){
	int sum=0;
	for(int i=0;i< array.length ;i++){
	    sum+=array[i];
	}
        return sum;
    }

    public static void mul (int num){
	for(int i=1;i<=num;i++){
	    System.out.println(num+" x "+i+" = "+( num*i ));
	}
    }

    public static int[] insertionSort (int[] array){
	int j=0;
	int temp=0;
	for(int i=0;i<array.length;i++){
	    j = i;
	    temp = array[j];
	    while(j > 1 && array[j-1] > temp){
		array[j] = array[j-1];
		j -- ;
	    }
	    array[j] = temp;
	}
	return array;
    }
}