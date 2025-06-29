package ARRAYS;
import java.util.*;
public class LargestConsecutiveSequence {
    //brute-force approach -> O(n^2)
    public static boolean linearSearch(int []nums, int num){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num) return true;
        }
        return false;
    }
    public static int longestSubarray(int []nums){
        int max=0;
        for(int i=0;i<nums.length;i++){
            int x= nums[i],c=1;
            for(int j=0;j<nums.length;j++){
                while(linearSearch(nums,x+1)){
                    x++;c++;
                }
                max=Math.max(max,c);
            }
        }
        return max;
    }
    //better approach
    public static int longestSubarray2(int []nums){
        int c=1,max=1;
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]) continue;
            else if(nums[i-1]+1==nums[i]) c++;
            else c=1;
            max= Math.max(max,c);
        }
        return max;
    }
    //using HashSet
    public static int longestSubarray3(int []nums){
        if(nums.length==0) return 0;
        int max=0;
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++) set.add(nums[i]);
        for(int num :set){
            if(!set.contains(num -1)){
                int c=1;
                int x= num;
                while(set.contains(x+1)){
                    x++;
                    c++;
                }
                max=Math.max(max,c);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int []nums={100,4,200,3,1,2};
        int x=longestSubarray3(nums);
        System.out.print(x);

    }
}
