package GRAPHS;
import java.util.*;
public class ConnectedGraph {
    public static int connected(int v, int[][]edges){
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for (int i = 0; i < v; i++) adj.add(new ArrayList<>());
        boolean []visited=new boolean[v+1];
        int connected=0;
        for (int[]e:edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        for (int i = 0; i < v; i++) {
            if(!visited[i]) {
                connected++;
                dfs(i,visited,adj);
            }
        }
        return connected;
    }
    public static void dfs(int node, boolean[]vis,ArrayList<ArrayList<Integer>>adj){
        vis[node]=true;
        for (int i : adj.get(node)) {
            if (vis[i]==false) dfs(i,vis,adj);
        }
    }
    public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
    int [][]edges={{0,1},{1,2},{3,4}};
   System.out.print(connected(5,edges));
    }
}