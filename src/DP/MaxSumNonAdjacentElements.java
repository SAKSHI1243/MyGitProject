package DP;
import java.util.*;
public class MaxSumNonAdjacentElements {
    public static int solve(int []ar, int i, int []dp){
        if(i<0) return 0;
        if(i==0) return ar[0];
        if(dp[i]!=-1) return dp[i];
        int pick=ar[i]+solve(ar,i-2,dp);
        int not_pick=solve(ar,i-1,dp);
        return dp[i]=Math.max(pick,not_pick);
    }
    public static int memoization(int []ar){
        int n=ar.length;
        int []dp= new int[n];
        Arrays.fill(dp,-1);
        return solve(ar,n-1,dp);
    }
    public static int tabulation(int []ar){
        int n=ar.length;
        int []dp= new int[n];
        if(n==1) return ar[0];
        dp[0]=ar[0];
        dp[1]=Math.max(ar[0],ar[1]);
        for(int i=2;i<n;i++) dp[i]=Math.max(ar[i]+dp[i-2],dp[i-1]);
        return dp[n-1];
    }
    public static int spaceOptimization(int []ar){
    int n=ar.length;
    if(n==0) return 0;
    int prev=0,prev2=ar[0];
    for(int i=1;i<n;i++){
        int include=ar[i]+prev;
        int exclude=prev2;
        int curr=Math.max(include,exclude);
        prev=prev2;
        prev2=curr;
    }
    return prev2;
    }
    public static void main(String[] args) {
        int []ar={2,1,4,9};
        System.out.println(memoization(ar));
        System.out.println(tabulation(ar));
        System.out.println(spaceOptimization(ar));
    }
}
