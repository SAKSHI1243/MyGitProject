package DP;
import java.util.*;
public class MinPathSum {
    //memoization
    public static int solve(int i, int j, int [][]dp, int [][]grid){
        if(i<0||j<0) return (int)1e9;
        if(i==0 && j==0) return grid[0][0];
        if(dp[i][j]!=-1) return dp[i][j];
        int up=grid[i][j]+solve(i-1,j,dp,grid);
        int left=grid[i][j]+solve(i,j-1,dp,grid);
        return dp[i][j]=Math.min(up,left);
    }
    public static int pathSum(int [][]grid){
    int m= grid.length,n= grid[0].length;
    int [][]dp=new int[m][n];
    for (int []row:dp) Arrays.fill(row,-1);
    return solve(m-1,n-1,dp,grid);
    }
    //tabulation
    public static int pathSum2(int [][]grid){
    int m= grid.length,n= grid[0].length;
    int [][]dp=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0&&j==0) dp[i][j]=grid[0][0];
                else{
                    int up=(i>0)?grid[i][j]+dp[i-1][j]:(int)1e9;
                    int left=(j>0)?grid[i][j]+dp[i][j-1]:(int)1e9;
                     dp[i][j]=Math.min(up,left);
                }
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String[] args) {
        int [][]grid={{1,2,3},{4,5,6}};
        System.out.println(pathSum(grid));
        System.out.println(pathSum2(grid));
    }
}