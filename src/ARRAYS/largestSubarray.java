package ARRAYS;
import java.util.*;
public class largestSubarray {
    public static int longestSubarray(int []nums, int k){
       int[] prefixSum= new int[nums.length];
       int max=0;
       prefixSum[0]=nums[0];
       for(int i=1;i<nums.length;i++)  prefixSum[i]=prefixSum[i-1]+nums[i];
       for(int i=0;i<prefixSum.length;i++){
           if(prefixSum[i]==k) max= Math.max(max,i+1);
           for(int j=0;j<i;j++){
               if(prefixSum[i]-prefixSum[j]== k)  max= Math.max(max,i-j);
           }
       }
       return max;
    }
    public static int largestSubarray(int []nums, int k){
        HashMap<Integer,Integer> mp= new HashMap<>();
        mp.put(0,-1);
        int max=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(mp.containsKey(sum-k)) max=Math.max(max,i-mp.get(sum-k));
            mp.putIfAbsent(sum,i);
        }
        return max;
    }
    public static void main(String[] args) {
        int []nums={10,5,2,7,1,9};
        int y=largestSubarray(nums,15);
        System.out.println(y);
    }
}
