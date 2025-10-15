package GRAPHS;
import java.util.*;
public class RottenOrange {
  public static int rottenOranges(int [][]grid){
      if(grid.length==0||grid==null) return 0;
      int r=grid.length, c=grid[0].length;
      int fresh=0;
      Queue<int[]>q=new LinkedList<>();
      for (int i = 0; i < r; i++) {
          for (int j = 0; j < c; j++) {
              if(grid[i][j]==2) q.add(new int[]{i,j});
              if(grid[i][j]!=0) fresh++;
          }
      }
      if(fresh==0) return 0;
      int minutes=0,rotten=0;
      int []dx={0,0,1,-1};
      int []dy={1,-1,0,0};
      while (!q.isEmpty()){
          int size=q.size();
          rotten+=size;
          for (int i = 0; i < size; i++) {
              int []point=q.poll();
              for (int j = 0; j <4 ; j++) {
                  int x=point[0]+dx[j];
                  int y=point[1]+dy[j];
                  if(x<0||y<0||x>=r||y>=r||grid[x][y]==0||grid[x][y]==2) continue;
                  grid[x][y]=2;
                  q.add(new int[]{x,y});
              }
          }
          if(!q.isEmpty()) minutes++;
      }
      return fresh==rotten?minutes:-1;
  }
    public static void main(String[] args) {
        int arr[][]={ {2,1,1} , {1,1,0} , {0,1,1} };
        System.out.print(rottenOranges(arr));
    }
}