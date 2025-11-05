package ARRAYS;
import java.util.*;
public class twoSum {
    public  static int[]twosum(int[]digits, int target){
        HashMap<Integer,Integer>mp=new HashMap<>();
        for (int i = 0; i < digits.length; i++) {
            if(mp.containsKey(target-digits[i]))  return new int[]{mp.get(target-digits[i]),i};
            mp.put(digits[i],i);
        }
        return new int[0];
    }
public static List<int[]> allPairs(int []ar, int target){
        List<int[]>result=new ArrayList<>();
        int left=0,right=ar.length-1;
        while (left<right){
            int sum=ar[left]+ar[right];
            if(target==sum){
                int l=ar[left],r=ar[right];
                if(left<right && ar[left]==l) left++;
                if(left<right && ar[right]==r) right--;
            }
            else if(sum<target)left++;
            else right--;
        }
        return result;
}
    public static void main(String[] args) {
    int []list={1,0,-1,0,-2,2};
     int []x= twosum(list,0);
    for(int i=0;i<x.length;i++) System.out.print(x[i]+" ");
    System.out.println();
    List<int[]>ans=allPairs(list,0);
    for (int[] a:ans) System.out.print(Arrays.toString(a));
    }
}