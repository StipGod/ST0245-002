package laboratorio2;

import java.util.ArrayList;
import java.util.List;

public class codingBat {
//2.1
//CountEvens :
public int countEvens(int[] nums) {
  int par =0;
  for (int n:nums) {
    if(n%2==0){
      ++par;
    }
  }
  return par;
}
//fizzArray:
public int[] fizzArray(int n) {
  int [] mat = new int[n];
  for (int ctr =0; ctr<n; ++ctr){
    mat[ctr] = ctr;
  }
  return mat;
}
//sameEnds:
public boolean sameEnds(int[] nums, int len) {
for (int ctr =0; ctr<len; ++ctr ) {
  if (nums[ctr] != nums[nums.length - len+ctr]){
    return false;
  }
}
return true;
}
//sum28:
public boolean sum28(int[] nums) {
  int suma =0;
  for (int n :nums) {
    if (n ==2){
      suma += n;
    }
  }
  return suma ==8;
}

//only14:
public boolean only14(int[] nums) {
  for (int n : nums) {
    if ((n!=1) && (n!=4)) {
      return false;
    }
  }
  return true;
}
//2.2
//Fix34:
public int[] fix34(int[] nums) {
  List<Integer> a = new ArrayList<Integer>();
  List<Integer> b = new ArrayList<Integer>();
  for (int ctr=0; ctr<nums.length; ctr++){
    if(nums[ctr]==3){
      a.add(ctr);
    }
    if(nums[ctr] ==4){
      b.add(ctr);
    }
  }
  for(int ctr = 0; ctr < a.size(); ++ctr){
    int t =nums[a.get(ctr)+1];
    nums[a.get(ctr)+1]=nums[b.get(ctr)];
    nums[b.get(ctr)]=t;
  }
  return nums;
}
//CanBalance:
public boolean canBalance(int[] nums) {
  int a =0;
  int b =0;
  for(int ctr =0; ctr<nums.length; ++ctr){
    a+=nums[ctr];
  }
  if(a==b){
    return true;
  }
  for(int ctr =0; ctr<nums.length; ++ctr){
    a-= nums[ctr];
    b+= nums[ctr];
    if (a==b){
      return true;
    }
  }
  return false;
}
//MaxSpan
public int maxSpan(int[] nums) {
  int max=0;
  for(int left=0;left <nums.length; ++left){
    for(int right=left; right < nums.length; ++right){
      if(nums[left] == nums[right] && right-left + 1 > max){
        max=right-left+1;
      }
    }
  }
  return max;
}
//LinearIn:
public boolean linearIn(int[] outer, int[] inner) {
  if (inner.length ==0){
    return true;
  }
  boolean ok =false;
  int i =0;
  for(int o =0;o<outer.length; ++o){
    if(inner[i]== outer[o]){
      ++i;
      if(i==inner.length){
        ok=true;
        break;
      }
      continue;
    }
    else if (inner[i] != outer[0]){
      continue;
    }
  }
  return ok;
}
//SquareUp:
public int[] squareUp(int n) {
  int[] a = new int[n*n];
  for(int r =0; r<n; ++r){
    for (int c=0; c<n ;++c){
      if (c<n - r-1){
        a[r*n+c]=0;
      }
      else{
        a[r*n+c]=n-c;
      }
    }
  }
  return a;
}
}
