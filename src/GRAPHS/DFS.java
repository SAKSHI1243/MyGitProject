package GRAPHS;
import java.util.*;
public class DFS {
    public static void dfs(int node, boolean []vis, ArrayList<Integer>ls,ArrayList<ArrayList<Integer>>adj){
        vis[node]=true;
        ls.add(node);
        for(Integer i:adj.get(node)) {
            if(vis[i]==false) dfs(i,vis,ls,adj);
        }
    }
    public static ArrayList<Integer> dfsGraph(int v,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> ls=new ArrayList<>();
        boolean []vis=new boolean[v+1];
        vis[0]=true;
        dfs(0,vis,ls,adj);
        return ls;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i < 5; i++) adj.add(new ArrayList<>());
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);
        ArrayList<Integer>ans=dfsGraph(5,adj);
        for(int i:ans) System.out.print(i+" ");
    }
}