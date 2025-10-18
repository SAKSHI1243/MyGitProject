package GRAPHS;
import java.util.*;
public class Enclaves {
    static class Pair{
        int first,second;
        Pair(int first, int second){
            this.first=first;
            this.second=second;
        }
    }
    public static int enclave(int [][]grid){
        int n= grid.length,m= grid[0].length;
        int vis[][]=new int[n][m];
        int []delRow={0,1,0,-1};
        int []delCol={1,0,-1,0};
     Queue<Pair>q=new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i==0||j==0||i==n-1||j==m-1){
                    if(grid[i][j]==1 ){
                        q.add(new Pair(i,j));
                        vis[i][j]=1;
                    }
                }
            }
        }
        while (!q.isEmpty()) {
            int row = q.peek().first, col = q.peek().second;
            q.remove();
            for (int i = 0; i < 4; i++) {
                int r = row + delRow[i], c = col + delCol[i];
                if (r>=0 && r<grid.length && c>=0 && c<grid[0].length && grid[r][c]==1 && vis[r][c]==0) {
                    q.add(new Pair(r, c));
                    vis[r][c]=1;
                }
            }
        }
        int cnt=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(grid[i][j]==1 && vis[i][j]==0) cnt++;
                }
            }
            return cnt;
    }
    public static void main(String[] args) {
        int grid[][] = {{0, 0, 0, 0}, {1, 0, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}};
        System.out.println(enclave(grid));
    }
}