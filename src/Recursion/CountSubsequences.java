package Recursion;
import java.util.*;
public class CountSubsequences {
    public static void solve(int []nums,ArrayList<Integer>curr,ArrayList<ArrayList<Integer>>res,int i){
        if(nums.length==i){
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        solve(nums,curr,res,i+1);
        curr.remove(curr.size()-1);
        solve(nums,curr,res,i+1);
    }
    public static ArrayList<ArrayList<Integer>> findSubsequence(int []nums){
        ArrayList<ArrayList<Integer>> res= new ArrayList<>();
        solve(nums,new ArrayList<>(),res,0);
        return res;
    }
    public static int findCountSubsequences(int []nums, int k){
        ArrayList<ArrayList<Integer>> res=findSubsequence(nums);
        int c=0;
        for (ArrayList<Integer> seq:res){
            int s=0;
            for (int i = 0; i < seq.size(); i++) s+=seq.get(i);
            if( seq.size()>0 && s==k) c++;
        }
        return c;
    }
    public static boolean findCount(int []nums, int k){
        ArrayList<ArrayList<Integer>> res=findSubsequence(nums);
        int c=0;
        for (ArrayList<Integer> seq:res){
            int s=0;
            for (int i = 0; i < seq.size(); i++) s+=seq.get(i);
            if( seq.size()>0 && s==k) c++;
        }
        if(c>0) return true;
        return false;
    }
    public static void main(String[] args) {
        int []nums={4,3,9,2};
        System.out.println(findCount(nums,10));
        System.out.println(findCountSubsequences(nums,9));
    }
}