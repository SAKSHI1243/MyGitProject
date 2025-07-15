package Recursion;
import java.util.*;
public class SumOfSubset {
    public static void solve(int []nums,List<Integer> curr,List<List<Integer>> res, int i){
        if(nums.length==i){
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        solve(nums, curr, res, i+1);
        curr.remove(curr.size()-1);
        solve(nums,curr,res,i+1);
    }
    public static List<Integer> findSubset(int []nums){
        List<List<Integer>> res= new ArrayList<>();
        solve(nums,new ArrayList<>(),res,0);
        List<Integer> newList= new ArrayList<>();
        for (List<Integer>seq:res){
            int sum=0;
            for (int i=0;i<seq.size();i++) sum+= seq.get(i);
            newList.add(sum);
        }
        return newList;
    }
    public static void main(String[] args) {
        int []nums={2,3};
        List<Integer> res= findSubset(nums);
        System.out.print(res);
    }
}