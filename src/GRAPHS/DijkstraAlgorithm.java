package GRAPHS;
import java.util.*;
public class DijkstraAlgorithm {
    public static int[]dijkstra(int [][]edges, int n, int src){
      ArrayList<ArrayList<int[]>>adj= new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(new int[]{edges[i][1],edges[i][2]});
            adj.get(edges[i][1]).add(new int[]{edges[i][0],edges[i][2]});
        }
        int []dis= new int[n];
        for (int i = 0; i < n; i++) dis[i]=(int)1e9;
        dis[src]=0;
        PriorityQueue<int[]>pq= new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.add(new int[]{0,src});
        while (!pq.isEmpty()){
            int []curr= pq.poll();
            int d=curr[0], node=curr[1];
            if(d>dis[node]) continue;
            for (int[] it:adj.get(node)){
                int adjNode=it[0], wt=it[1];
                if(d+wt<dis[adjNode]){
                    dis[adjNode]=d+wt;
                    pq.add(new int[]{dis[adjNode],adjNode});
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if(dis[i]==1e9) dis[i]=-1;
        }
        return dis;
    }
    public static void main(String[] args) {
       int[][] edges = {{0,1,4}, {0,2,2}, {1,2,3}, {1,3,1}, {2,3,5}};
       int src = 0;
       int []ans=dijkstra(edges,4,src);
       for (int it:ans) System.out.print(it+" ");
    }
}