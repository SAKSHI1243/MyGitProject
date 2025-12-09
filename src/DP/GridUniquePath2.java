package DP;
import java.util.*;
public class GridUniquePath2 {
    //memoization
    public static int func(int i,int j,int [][]dp,int [][]obstacle){
        if(i<0 || j<0 || obstacle[i][j]==1) return 0;
        if(i==0 && j==0) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        int up=func(i-1,j,dp,obstacle),left=func(i,j-1,dp,obstacle);
        return dp[i][j]=up+left;
    }
    public static int uniquePath(int [][]obstacle){
        int m=obstacle.length,n= obstacle[0].length;
        int [][]dp= new int [m][n];
        for (int []row:dp) Arrays.fill(row,-1);
        return func(m-1,n-1,dp,obstacle);
    }
    //tabulation
    public static int solve(int m,int n,int [][]dp,int [][]obstacle){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(obstacle[i][j]==1){
                    dp[i][j]=0;
                    continue;
                }
                if(i==0 && j==0){
                    dp[i][j]=1;
                    continue;
                }
                   int up=(i>0)?dp[i-1][j]:0;
                   int left=(j>0)?dp[i][j-1]:0;
                   dp[i][j]=up+left;
            }
        }
        return dp[m-1][n-1];
    }
    public static int uniquePath2(int [][]obstacle){
        int m=obstacle.length,n= obstacle[0].length;
        int [][]dp= new int [m][n];
        return solve(m,n,dp,obstacle);
    }
    public static void main(String[] args) {
        int [][]obstacle={{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePath(obstacle));
        System.out.println(uniquePath2(obstacle));
    }
}