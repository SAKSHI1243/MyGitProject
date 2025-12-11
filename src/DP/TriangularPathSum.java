package DP;
import java.util.*;
public class TriangularPathSum {
   //memoization
    public static int solve(int i, int j,List<List<Integer>>triangle,int n,int [][]dp){
    if(dp[i][j]!=-1) return dp[i][j];
    if(i==n-1) return triangle.get(i).get(j);
    int down=triangle.get(i).get(j)+solve(i+1,j,triangle,n,dp);
    int diag=triangle.get(i).get(j)+solve(i+1,j+1,triangle,n,dp);
    return dp[i][j]=Math.min(diag,down);
    }
    public static int findPath(List<List<Integer>>triangle){
        int n=triangle.size();
        int [][]dp=new int[n][n];
        for(int []row:dp) Arrays.fill(row,-1);
        return solve(0,0,triangle,n,dp);
    }
    //tabulation
    public static int findPath2(List<List<Integer>>triangle){
        int n=triangle.size();
        int [][]dp=new int[n][n];
        for (int j=0;j<n;j++) dp[n-1][j]=triangle.get(n-1).get(j);
        for(int i=n-2;i>=0;i--){
            for (int j=i;j>=0;j--){
            int down=triangle.get(i).get(j)+dp[i+1][j];
            int diag=triangle.get(i).get(j)+dp[i+1][j+1];
            dp[i][j]=Math.min(down,diag);
            }
        }
        return dp[0][0];
    }
    public static void main(String[] args) {
     List<List<Integer>>list= new ArrayList<>();
     list.add(Arrays.asList(1));
     list.add(Arrays.asList(4,7));
     list.add(Arrays.asList(6,5,7));
     list.add(Arrays.asList(4,1,8,3));
     System.out.println(findPath(list));
     System.out.println(findPath2(list));
    }
}