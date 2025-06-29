package Backtacking;

import java.util.ArrayList;
import java.util.List;

public class printPermutations {
    //mtd1
    public static void printPer(String str, String t) {
        if (str.isEmpty()) {
            System.out.print(t+" ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            String rem = left + right;
            printPer(rem, t + ch);
        }
    }
    //mtd2
    public void helper(int[]nums, List<Integer> ds, boolean[]isValid, List<List<Integer>> ans){
        if(ds.size()== nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i< nums.length;i++){
            if(isValid[i]==false){
                ds.add(nums[i]);
                isValid[i]=true;
                helper(nums,ds,isValid,ans);
                isValid[i]=false;
                ds.remove(ds.size()-1);
            }
        }
    }
    public List<List<Integer>>permute(int []nums){
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> ds= new ArrayList<>();
        boolean[] isValid= new boolean[nums.length];
        helper(nums, ds, isValid, ans);
        return ans;
    }
    //mtd3
    public void helper2(int []nums, int idx, List<List<Integer>> ans){
        if(idx== nums.length-1){
            List<Integer> l= new ArrayList<>();
            for(int i=0;i< nums.length;i++) l.add(nums[i]);
            ans.add(l);
            return;
        }
        for(int i=idx; i<nums.length;i++){
        swap(i, idx, nums);
        helper2(nums,idx+1, ans);
        swap(i, idx,nums);
        }
    }
    public  List<List<Integer>>permute2(int []nums){
        List<List<Integer>> ans= new ArrayList<>();
        helper2(nums,0,ans);
        return ans;
    }
    public void swap(int i,int j , int[]nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        String str = "abc";
        printPer(str, "");
        System.out.println();
        printPermutations obj= new printPermutations();
        int []ar={1,2,3};
        List<List<Integer>> result=obj.permute(ar);
        System.out.println(result);
       printPermutations obj2= new printPermutations();
        List<List<Integer>> result2=obj2.permute2(ar);
        System.out.println(result2);
    }
}