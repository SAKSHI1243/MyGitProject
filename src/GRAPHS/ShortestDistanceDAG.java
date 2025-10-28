package GRAPHS;
import java.util.*;
public class ShortestDistanceDAG {
    public static int[] findShortestDistance(int [][]edges, int n, int m){
        ArrayList<ArrayList<int[]>> adj= new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < m; i++) adj.get(edges[i][0]).add(new  int[]{edges[i][1],edges[i][2]});
        int []indegree=new int[n];
        for (int i = 0; i < n; i++) {
            for (int[] it:adj.get(i)) indegree[it[0]]++;
        }
        Queue<Integer>q= new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if(indegree[i]==0) q.add(i);
        }
        int []topo= new int[n];
        int c=0;
        while (!q.isEmpty()){
            int node=q.poll();
            topo[c++]=node;
            for (int[] i:adj.get(node)) {
                indegree[i[0]]--;
                if(indegree[i[0]]==0) q.add(i[0]);
            }
        }
        int []dist= new int[n];
        for (int i = 0; i < n; i++) dist[i]=(int)1e9;
        dist[0]=0;
        for (int i = 0; i <n ; i++) {
            int node=topo[i];
            if(dist[node]!=(int)1e9){
                for (int[] it:adj.get(node)){
                    if(dist[node]+it[1]<dist[it[0]]) dist[it[0]]=dist[node]+it[1];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if(dist[i]==1e9) dist[i]=-1;
        }
        return dist;
    }
    public static void main(String[] args) {
        int [][]edges={{0,1,2},{0,4,1},{4,5,4},{4,2,2},{1,2,3},{2,3,6},{5,3,1}};
        int n=6, m=7;
        int []ans=findShortestDistance(edges,n,m);
        for (int i=0;i< ans.length;i++) System.out.print(ans[i]+" ");
    }
}