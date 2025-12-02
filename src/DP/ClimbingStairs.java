package DP;
import java.util.*;
public class ClimbingStairs {
    public static int optimized(int n){
        if(n<=1) return n;
        int prev1=1, prev2=1;
        for (int i=2;i<=n;i++){
            int curr=prev1+prev2;
            prev1=prev2;
            prev2=curr;
        }
        return prev2;
    }
    public static void main(String[] args) {
        int n=3;
        int []dp= new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i<=n ; i++) dp[i]=dp[i-1]+dp[i-2];
        System.out.println(dp[n]);
        System.out.println(optimized(n));
    }
}