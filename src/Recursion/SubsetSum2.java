package Recursion;
import java.util.*;
public class SubsetSum2 {
    public static void solve(int []nums,List<Integer> curr, List<List<Integer>> res, int i,HashMap<List<Integer>,Integer> mp){
        if(nums.length==i){
            List<Integer> copy= new ArrayList<>(curr);
            if(!mp.containsKey(copy)){
                res.add(new ArrayList<>(copy));
                mp.put(copy,1);
            }
            return;
        }
        curr.add(nums[i]);
        solve(nums,curr,res,i+1,mp);
        curr.remove(curr.size()-1);
        solve(nums,curr,res,i+1,mp);
    }
    public static List<List<Integer>> findSubset(int []nums){
        List<List<Integer>> res=new ArrayList<>();
        HashMap<List<Integer>,Integer> mp=new HashMap<>();
        solve(nums,new ArrayList<>(),res,0,mp);
        return res;
    }
    public static void main(String[] args) {
        int []nums={1,2,2};
        List<List<Integer>> ans= findSubset(nums);
        System.out.print(ans);
    }
}
