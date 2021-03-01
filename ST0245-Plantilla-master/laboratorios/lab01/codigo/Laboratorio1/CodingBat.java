public class CodingBat{

    //RECURSION 1

public int strCount(String str, String sub) {
    if(str.length()<sub.length())
    return 0;
    
    if(str.substring(0, sub.length()).equals(sub))
    return 1 + strCount(str.substring(sub.length()), sub);

        return strCount(str.substring(1), sub);
 }

public boolean strCopies(String str, String sub, int n) {
    if(n == 0)
    return true;
  
    if(str.length() < sub.length())
    return false;
  
    if(str.substring(0, sub.length()).equals(sub))
    return strCopies(str.substring(1), sub, n-1);
  
    return strCopies(str.substring(1), sub, n);
 }

public int fibonacci(int n) {
    if(n==0){
      return 0;
    }else if (n == 1) {
            return 1 ;  
      }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
 }

public int sumDigits(int n) {
    if(n==0){
        return 0;
    }
    return (n % 10) + sumDigits(n/10);
 }

public int powerN(int base, int n) {
    if(n==1){
      return base;
    }else{
    return base*powerN(base,n-1);
    }
  }
//RECURSION 2
public boolean groupNoAdj(int start, int[] nums, int target) {
    if (target==0){
    return true;
  }else if(start<nums.length){
     return groupNoAdj(start+2,nums,target-nums[start])|| groupNoAdj(start+1,nums,target);
  }else{
    return false;
  }
}
public boolean groupSum(int start, int[] nums, int target) {
    if (target==0){
      return true;
    }else if(start<nums.length){
      return groupSum(start+1,nums,target-nums[start])||groupSum(start+1,nums,target);
    }else{
      return false;
    }
 }

 public boolean groupSum5(int start, int[] nums, int target) {
    if(start >= nums.length)
        return target == 0;

    if(nums[start] % 5 == 0) {
        if(start <= nums.length - 2 && nums[start+1] == 1)
            return groupSum5(start+2, nums, target - nums[start]);

        return groupSum5(start+1, nums, target - nums[start]);
    }

    if(groupSum5(start+1, nums, target - nums[start]))
        return true;

    if(groupSum5(start+1, nums, target))
        return true;

    return false;
 }

public boolean groupSumClump(int start, int[] nums, int target) {
    if(start >= nums.length)
        return target == 0;

    int i = start;
    int sum = 0;

    while(i < nums.length && nums[start] == nums[i]) {
        sum += nums[i];
        i++;
    }

    if(groupSumClump(i, nums, target - sum))
        return true;

    if(groupSumClump(i, nums, target))
        return true;

    return false;
 }

public boolean groupSum6(int start, int[] nums, int target) {
 
    if(start >= nums.length)
    return target == 0;
  
    if(nums[start] == 6)
    return groupSum6(start+1, nums, target - 6);
  
    if(groupSum6(start+1, nums, target - nums[start]))
    return true;
  
    if(groupSum6(start+1, nums, target))
    return true;
  
    return false;
  }
}