package Recursion;
import java.util.*;
public class CombinationIII {
    public static void solve(int k,int n,List<Integer>curr,List<List<Integer>>ans,int i){
        if(n==0){
            if(curr.size()==k) ans.add(new ArrayList<>(curr));
            return;
        }
        if(i>9) return;
        curr.add(i);
        solve(k,n-i,curr,ans,i+1);
        curr.remove(curr.size()-1);
        solve(k,n,curr,ans,i+1);
    }
    public static List<List<Integer>> combinationSum(int k, int n){
        List<List<Integer>> ans= new ArrayList<>();
        solve(k,n,new ArrayList<>(), ans,1);
        return ans;
    }
    public static void main(String[] args) {
        List<List<Integer>> ans=combinationSum(3,9);
        System.out.print(ans);
    }
}