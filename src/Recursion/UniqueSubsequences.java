package Recursion;
import  java.util.*;
public class UniqueSubsequences {
    public static void solve(int []nums, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> result, int i,HashMap<ArrayList<Integer>,Integer>mp){
        if(nums.length==i) {
            if(!mp.containsKey(new ArrayList<>(curr))){
                mp.put(new ArrayList<>(curr),1);
                result.add(new ArrayList<>(curr));
            }
            return;
        }
        curr.add(nums[i]);
        solve(nums,curr,result,i+1,mp);
        curr.remove(curr.size()-1);
        solve(nums,curr,result,i+1,mp);
    }
    public static ArrayList<ArrayList<Integer>> printUnique(int []nums){
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        HashMap<ArrayList<Integer>,Integer> mp= new HashMap<>();
        solve(nums,new ArrayList<>(),result,0,mp);
        return result;
    }
    public static void main(String[] args) {
        int []nums={1,2,2};
        ArrayList<ArrayList<Integer>> res= printUnique(nums);
        for (ArrayList<Integer> seq:res) System.out.print(seq);
    }
}