package GRAPHS;
import java.util.*;
public class ShortestDistanceInBinaryMaze {
    public static class Tuple{
        int first,second,third;
        Tuple(int first, int second, int third){
            this.first=first;
            this.second=second;
            this.third=third;
        }
    }
    public static int shortestPath(int [][]grid, int []src, int[] dest){
        if(src[0]==dest[0] && src[1]==dest[1]) return 0;
        int n= grid.length,m= grid[0].length;
        int [][]dist= new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j=0;j<m;j++) dist[i][j]=(int)1e9;
        }
        dist[src[0]][src[1]]=0;
        Queue<Tuple>q= new LinkedList<>();
        q.add(new Tuple(0,src[0],src[1]));
        int []dr={-1,0,1,0};
        int []dc={0,1,0,-1};
        while (!q.isEmpty()) {
            Tuple it = q.poll();
            int d = it.first, r = it.second, c = it.third;
            for (int i = 0; i < 4; i++) {
                int newr = r + dr[i], newc = c + dc[i];
                if (newr >= 0 && newr < n && newc >= 0 && newc < m && grid[newr][newc] == 1 && d + 1 < dist[newr][newc]) {
                    dist[newr][newc] = 1 + d;
                    if (dest[0] == newr && dest[1] == newc) return 1 + d;
                    q.add(new Tuple(1 + d, newr, newc));
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []src={0,1};
        int []dest={2,2};
        int [][]grid={{1,1,1,1},{1,1,0,1},{1,1,1,1},{1,1,0,0},{1,0,0,1}};
        System.out.println(shortestPath(grid,src,dest));
    }
}