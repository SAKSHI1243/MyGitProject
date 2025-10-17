package GRAPHS;
import java.util.*;
public class DistanceFrom1 {
    static class Node{
        int first,second,third;
        Node(int first,int second, int third){
            this.first=first;
            this.second=second;
            this.third=third;
        }
    }
    public static int[][] nearest(int [][]grid){
        int n= grid.length, m=grid[0].length;
        int [][]vis=new int[n][m];
        int[][]dis=new int[n][m];
        Queue<Node> q=new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j=0;j<m;j++){
                if(grid[i][j]==1){
                    q.add(new Node(i,j,0));
                    vis[i][j]=1;
                }
                else vis[i][j]=0;
            }
        }
        int []delRow={0,1,0,-1};
        int []delCol={1,0,-1,0};
        while (!q.isEmpty()){
            int r=q.peek().first, c=q.peek().second,steps=q.peek().third;
            q.remove();
            dis[r][c]=steps;
            for (int i = 0; i < 4; i++) {
                int nrow=r+delRow[i], ncol=c+delCol[i];
                if (nrow>=0 && nrow< grid.length && ncol>=0 && ncol<grid[0].length && vis[nrow][ncol]==0 ){
                    vis[nrow][ncol]=1;
                    q.add(new Node(nrow,ncol,steps+1));
                }
            }
        }
        return dis;
    }
    public static void main(String[] args) {
        int [][]grid={{0,1,1,0}, {1,1,0,0}, {0,0,1,1}};
        int [][]ans=nearest(grid);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) System.out.print(ans[i][j]+" ");
            System.out.println();
        }
    }
}