package DP;
import java.util.*;
public class HouseRobber {
    public static int solve(List<Integer>ar) {
        int n=ar.size();
        if(n==0) return 0;
        if(n==1) return ar.get(0);
        int prev=ar.get(0),prev2=0;
        for(int i=1;i<n;i++){
            int pick=ar.get(i);
            if(i>1) pick+=prev;
            int non_pick=prev2;
            int curr=Math.max(pick,non_pick);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
    public static int rob(int []ar){
        int n=ar.length;
        if(n==0) return 0;
        if(n==1) return ar[0];
        List<Integer>arr1= new ArrayList<>();
        List<Integer>arr2=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i!=0) arr1.add(ar[i]);
            if(i!=n-1) arr2.add(ar[2]);
        }
        return Math.max(solve(arr1),solve(arr2));
    }
    public static void main(String[] args) {
        int []ar={1,5,2,1,6};
        System.out.println(rob(ar));
    }
}