package DP;
import java.util.*;
public class FrogJump2 {
    public static int solveMemo(int idx,List<Integer>height,int []dp,int k){
        if(idx==0) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int mmSteps=Integer.MAX_VALUE;
        for (int j = 1; j<=k; j++) {
            if(idx-j>=0){
                int jump=solveMemo(idx-j,height,dp,k)+Math.abs(height.get(idx)- height.get(idx-j));
                mmSteps=Math.min(jump,mmSteps);
            }
        }
        return dp[idx]=mmSteps;
    }
    public static int memoization(List<Integer>height,int k){
    int n=height.size();
    int []dp=new int[n];
    Arrays.fill(dp,-1);
    return solveMemo(n-1,height,dp,k);
    }
    public static int solveTab(int n,List<Integer>height,int []dp,int k){
        dp[0]=0;
        for(int i=1;i<n;i++){
            int mmSteps=Integer.MAX_VALUE;
            for(int j=1;j<=k;j++){
                if(i-j>=0){
                    int jump=dp[i-j]+Math.abs(height.get(i)- height.get(i-j));
                    mmSteps=Math.min(mmSteps,jump);
                }
            }
            dp[i]=mmSteps;
        }
        return dp[n-1];
    }
    public static int tabulation(List<Integer>height,int k){
        int n=height.size();
        int []dp=new int[n];
        Arrays.fill(dp,-1);
        return solveTab(n,height,dp,k);
    }
    public static void main(String[] args) {
        List<Integer>height=Arrays.asList(30,10, 60, 10, 60, 50);
        int k=2;
        int x=memoization(height,k);
        int y=tabulation(height,k);
        System.out.println(x);
        System.out.println(y);
    }
}