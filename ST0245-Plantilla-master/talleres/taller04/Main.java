public class Main {
    
public static void main(String[] args) {
    for (int i = 20; i < 40; i++) {

    long inicio = System.currentTimeMillis();

    System.out.println(fibonacci(i));

    long fin = System.currentTimeMillis();

    long total = fin - inicio;

    System.out.println("El tiempo total fue de " + total + " ms");

   }
}  
public static int arrayMax(int[] array, int n) {
    int i, max, temp;
    max = array[n];
    if(n != 0){
        temp = arrayMax(array,n-1 );
        if(temp > max){
            max = temp;
        }
    }
    return max;
}
      
    public static boolean groupSum(int start, int[] nums, int target) {
    if (start<nums.length){
        return target == 0;
    }
        return groupSum(start + 1, nums, target - nums[start]) || groupSum(start + 1 , nums, target );
}
     
public static long fibonacci(int n) {
    if (n <= 1) {
        return 1 ;  
    }else{
        return fibonacci(n-1) + fibonacci(n-2);
    }
  }
}
