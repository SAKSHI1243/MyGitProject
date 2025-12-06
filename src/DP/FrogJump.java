package DP;
import java.util.*;
public class FrogJump {
    //memoization
    public static int solve(int idx,int []h, int []dp){
        if(idx<=0) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int j2=Integer.MAX_VALUE;
        int j1=solve(idx-1,h,dp)+Math.abs(h[idx]-h[idx-1]);
        if(idx>1) j2=solve(idx-2,h,dp)+Math.abs(h[idx]-h[idx-2]);
        dp[idx]= Math.min(j1,j2);
        return dp[idx];
    }
    public static int frogJump(int []h) {
        if(h==null||h.length==0) return 0;
        int n= h.length;
        int []dp= new int[n];
        Arrays.fill(dp,-1);
        return solve(n-1,h,dp);
    }
    //tabulation
    public static int frogJump2(int []height){
        if(height==null||height.length==0) return 0;
        int n= height.length;
        if(n==1) return 0;
        int []dp=new int[n];
        dp[0]=0;
        for(int i=1;i<n;i++){
            int j2=Integer.MAX_VALUE;
            int j1=dp[i-1]+Math.abs(height[i]-height[i-1]);
            if(i>1) j2=dp[i-2]+Math.abs(height[i]-height[i-2]);
            dp[i]=Math.min(j1,j2);
        }
        return dp[n-1];
    }
    //space optimization
    public static int frogJump3(int []height){
        if(height==null||height.length==0) return 0;
        int n= height.length;
        int prev=0,prev2=0;
        if(n==1) return 0;
        for(int i=1;i<n;i++){
            int j2=Integer.MAX_VALUE;
            int j1=prev+Math.abs(height[i]-height[i-1]);
            if(i>1) j2=prev2+Math.abs(height[i]-height[i-2]);
            int curr=Math.min(j1,j2);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
    public static void main(String[] args) {
        int []height={7,5,1,2,6};
        System.out.println(frogJump(height));
        System.out.println(frogJump2(height));
        System.out.println(frogJump3(height));
    }
}