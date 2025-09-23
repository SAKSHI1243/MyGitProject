package ARRAYS;
import java.util.*;
public class largestSubarray {
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
    public static int findLengthOfLargestSubarray(int[]ar, long k){
        int l=0,r=0,len=0;
        long sum=ar[0];
        while (r<ar.length){
            while (l<=r && sum>k){
                sum-=ar[l];
                l++;
            }
            if(sum==k) len=Math.max(len,r-l+1);
            r++;
            if (r<ar.length) sum+=ar[r];
        }
        return len;
    }
    public static void main(String[] args) {
        int []nums={10,5,2,7,1,9};
        int y=findLengthOfLargestSubarray(nums,15);
        System.out.println(y);
    }
}
