package GRAPHS;
import java.util.*;
public class DetectCycleDFS {
    public static boolean isCycle(int v, ArrayList<ArrayList<Integer>>adj){
        boolean []vis=new boolean[v];
        for (int i = 0; i < v; i++) {
            if(vis[i]==false){
                if(dfs(i,-1,vis,adj)) return true;
            }
        }
        return false;
    }
    public static boolean dfs(int node, int parent, boolean[]vis, ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;
        for (int i: adj.get(node)) {
            if(vis[i]==false){
                if(dfs(i,node,vis,adj)==true) return true;
            }
            else if(node!=i) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        System.out.print(isCycle(4,adj));
    }
}