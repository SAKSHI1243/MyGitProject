package GRAPHS;
import java.util.*;
public class MinEffortPath {
    static class Tuple{
        int distance, row, col;
        Tuple(int distance, int row, int col){
            this.distance=distance;
            this.row=row;
            this.col=col;
        }
    }
    public static int path(int [][]heights){
        int n=heights.length, m=heights[0].length;
        int [][]dist= new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) dist[i][j]=(int)1e9;
        }
        PriorityQueue<Tuple>pq=new PriorityQueue<>();
        dist[0][0]=0;
        int []dr={-1,0,1,0};
        int []dc={0,1,0,-1};
        pq.add(new Tuple(0,0,0));
        while (!pq.isEmpty()){
            Tuple it=pq.poll();
            int diff=it.distance, row=it.row, col=it.col;
            for (int i = 0; i < 4; i++) {
                int nr=row+dr[i], nc=col+dc[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m){
                    int minEffort=Math.min(Math.abs(heights[row][col]-heights[nr][nc]),diff);
                    if(minEffort<dist[nr][nc]){
                        dist[nr][nc]=minEffort;
                        pq.add(new Tuple(minEffort,nr,nc));
                    }
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[][] heights={{1, 2, 2}, {3, 8, 2}, {5, 3, 5}};
        System.out.print(path(heights));
    }
}