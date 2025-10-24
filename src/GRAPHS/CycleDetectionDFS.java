package GRAPHS;
import java.util.*;
public class CycleDetectionDFS {
    public static boolean dfs(int node, ArrayList<ArrayList<Integer>>adj, int[]vis, int []pathVis){
        vis[node]=1;
        pathVis[node]=1;
        for (Integer it:adj.get(node)) {
            if(vis[it]==0){
                if(dfs(it,adj,vis,pathVis)==true) return true;
            }
            else if(pathVis[it]==1) return true;
        }
        pathVis[node]=0;
        return false;
    }
   public static boolean isCyclic(int v, ArrayList<ArrayList<Integer>>adj){
       int []vis=new int[v];
       int []pathVis=new int[v];
       for(int i=0;i<v;i++){
           if(vis[i]==0){
               if(dfs(i,adj,vis,pathVis)==true) return true;
           }
       }
       return false;
   }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for (int i = 0; i < 4; i++) adj.add(new ArrayList<>());
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(2);
        adj.get(2).add(3);
        System.out.println(isCyclic(4,adj));
    }
}