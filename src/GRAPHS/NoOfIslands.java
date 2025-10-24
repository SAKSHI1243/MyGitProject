package GRAPHS;
import java.util.*;
public class NoOfIslands {
    public static void bfs(int r, int c, boolean [][]vis, int[][]grid){
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{r,c});
        vis[r][c]=true;
        int []delr={-1,-1,-1,0,1,1,1,0};
        int[]delc={-1,0,1,1,1,0,-1,-1};
        while (!q.isEmpty()){
            int[] cell=q.poll();
            int row=cell[0], col=cell[1];
            for (int i=0;i<8;i++){
                int nr=row+delr[i], nc=col+delc[i];
                if(nr>=0 && nr< grid.length && nc>=0 && nc< grid[0].length && vis[nr][nc]==false && grid[nr][nc]==1){
                    vis[nr][nc]=true;
                    q.add(new int[]{nr, nc});
                }
            }
        }
    }
    public static int islands(int [][]grid){
        int n= grid.length, m= grid[0].length, c=0;
        boolean [][]vis=new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(vis[i][j]==false && grid[i][j]==1){
                    c++;
                    bfs(i,j,vis,grid);
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int [][]grid= {{1,1,0,0,0}, {1,1,0,0,0},{0,0,1,0,0},{0,0,0,1,1}};
        System.out.println(islands(grid));
    }
}