package Recursion;
import java.util.*;
public class Subsequences {
    public static void main(String[] args) {
        int []nums={2,3};
        ArrayList<ArrayList<Integer>> result=printSubsequences(nums);
        for (ArrayList<Integer> sub:result) System.out.print(sub);
    }
    public static ArrayList<ArrayList<Integer>> printSubsequences(int []nums){
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        solve(nums,new ArrayList<>(),result,0);
        return result;
    }
    public static void solve(int []nums, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result, int i){
        if(nums.length==i){
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[i]);
        solve(nums,current,result,i+1);
        current.remove(current.size()-1);
        solve(nums,current,result,i+1);
    }
}