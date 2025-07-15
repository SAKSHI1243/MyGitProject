package Recursion;
import java.util.*;
public class CombinationSum2 {
    public static void solve(int []nums,List<Integer>curr,List<List<Integer>> res, int i, int target){
        if(target==0){
                res.add(new ArrayList<>(curr));
                return;
        }
        if(i>= nums.length|| target<0) return;
            curr.add(nums[i]);
            solve(nums,curr,res,i+1,target-nums[i]);
            curr.remove(curr.size()-1);
            int j=i+1;
            while(j< nums.length && nums[j]==nums[i]) j++;
        solve(nums,curr,res,j,target);
    }
    public static List<List<Integer>> findCombination(int []nums, int target){
        Arrays.sort(nums);
        List<List<Integer>> res= new ArrayList<>();
        solve(nums,new ArrayList<>(),res,0,target);
        return res;
    }
    public static void main(String[] args) {
        int []nums={2,5,2,1,2};
        List<List<Integer>> res=findCombination(nums,5);
        for (List<Integer> seq:res) System.out.print(seq);
    }
}