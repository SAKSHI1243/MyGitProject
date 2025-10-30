package GRAPHS;
import java.util.*;
public class EventualSafeNodes {
    public static ArrayList<Integer> eventualSafeNodes(int v, ArrayList<ArrayList<Integer>>adj){
        ArrayList<ArrayList<Integer>>rev=new ArrayList<>();
        for (int i = 0; i < v; i++) rev.add(new ArrayList<>());
        int []indegree=new int[v];
        for (int i = 0; i < v; i++) {
            for (int it:adj.get(i)){
                rev.get(it).add(i);
                indegree[i]++;
            }
        }
        Queue<Integer>q=new LinkedList<>();
        ArrayList<Integer>safe=new ArrayList<>();
        for (int i = 0; i < v; i++) {
            if(indegree[i]==0) q.add(i);
        }
        while (!q.isEmpty()){
            int node=q.poll();
            safe.add(node);
            for (int it:rev.get(node)) {
                indegree[it]--;
                if(indegree[it]==0) q.add(it);
            }
        }
        Collections.sort(safe);
        return safe;
    }
    public static void main(String[] args) {
        int V = 12;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(2).add(4);
        adj.get(3).add(4);
        adj.get(3).add(5);
        adj.get(4).add(6);
        adj.get(5).add(6);
        adj.get(6).add(7);
        adj.get(8).add(1);
        adj.get(8).add(9);
        adj.get(9).add(10);
        adj.get(10).add(8);
        adj.get(11).add(9);
        ArrayList<Integer>ans=eventualSafeNodes(V,adj);
        for (int i:ans) System.out.print(i+" ");
    }
}