package DP;
import java.util.*;
public class fibonacci {
    //space optimized T(n)=O(n), S(n)=1
    public static int optimized(int n){
        if(n<=1) return n;
        int prev1=0, prev2=1;
        for (int i=2; i<n ; i++) {
            int curr=prev1+prev2;
            prev1=prev2;
            prev2=curr;
        }
        return prev2;
    }
    //tabulation T(n)=O(n), S(n)=O(n)
    public static int tabulation(int n){
        int []dp= new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int i = 2; i <n ; i++) dp[i]=dp[i-1]+dp[i-2];
        return dp[n];
    }
    //memoization T(n)=O(n), S(n)=O(2n)
    public static int fibo(int n, int[]dp){
        if(n<=1) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
    }
    public static void main(String[] args) {
        int n=10;
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fibo(n,dp));
    }
}