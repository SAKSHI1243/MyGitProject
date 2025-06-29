package ARRAYS;
import java.util.*;
public class CountSumSubarray {
    public static int subarray(int []nums, int k){
        HashMap<Integer,Integer> mp= new HashMap<>();
        mp.put(0,1);
        int sum=0,c=0;
        for (int i = 0; i < nums.length ; i++) {
            sum+=nums[i];
            if(mp.containsKey(sum-k)) c+=mp.get(sum-k);
            if(mp.containsKey(sum)) mp.put(sum,mp.get(sum)+1);
            else mp.put(sum,1);
        }
        return c;
    }
    public static void main(String[] args) {
        int []nums={1,2,1,3};
        int x=subarray(nums,3);
       System.out.print(x);
    }
}