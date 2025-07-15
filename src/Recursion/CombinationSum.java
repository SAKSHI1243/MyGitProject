package Recursion;
import java.util.*;
class CombinationSum{
    public static void solve(int []nums, List<Integer> curr,List<List<Integer>> res, int i, int target){
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(i>=nums.length || target<0) return;
        if(nums[i]<=target){
            curr.add(nums[i]);
            solve(nums,curr,res,i,target-nums[i]);
            curr.remove(curr.size()-1);
        }
        solve(nums,curr,res,i+1,target);
    }
    public static List<List<Integer>> findCombinationSum(int []nums, int target){
        List<List<Integer>> res= new ArrayList<>();
        solve(nums,new ArrayList<>(),res,0, target);
        return res;
    }
    public static void main(String[] args) {
        int []nums={2,3,6,7};
        List<List<Integer>> res= findCombinationSum(nums,7);
        for (List<Integer> seq:res) System.out.print(seq);
    }
}