package GRAPHS;
import java.util.*;
public class TopoSort {
    public static void dfs(int node,ArrayList<ArrayList<Integer>>adj,int []vis, Stack<Integer>st){
        vis[node]=1;
        for (Integer it: adj.get(node)){
            if(vis[it]==0) dfs(it,adj,vis,st);
        }
        st.push(node);
    }
    public static ArrayList<Integer> topoSort(int v,ArrayList<ArrayList<Integer>>adj){
        int []vis=new int[v];
        Stack<Integer>st=new Stack<>();
        for (int i=0;i<v;i++) {
            if(vis[i]==0) dfs(i,adj,vis,st);
        }
        ArrayList<Integer> li=new ArrayList<>();
        while (!st.isEmpty()) li.add(st.pop());
        return li;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i <=5 ; i++) adj.add(new ArrayList<>());
        adj.get(5).add(0);
        adj.get(5).add(2);
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(1);
        adj.get(4).add(0);
        ArrayList<Integer> li=topoSort(6,adj);
        for (Integer it:li) System.out.print(it+" ");
    }
}