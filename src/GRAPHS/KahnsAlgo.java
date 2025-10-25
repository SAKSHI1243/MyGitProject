package GRAPHS;
import java.util.*;
public class KahnsAlgo {
    public static int[] kahnAlgo(int v, ArrayList<ArrayList<Integer>>adj){
        int []indegree=new int[v];
        for (int i = 0; i <v ; i++) {
            for (int it:adj.get(i)) indegree[it]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for (int i = 0; i < v; i++) {
            if(indegree[i]==0) q.add(i);
        }
        int []topo=new int[v];
        int i=0;
        while (!q.isEmpty()){
            int node=q.poll();
            topo[i++]=node;
            for (int it:adj.get(node)){
                indegree[it]--;
                if (indegree[it]==0) q.add(it);
            }
        }
        return topo;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for (int i = 0; i < 6; i++) adj.add(new ArrayList<>());
        adj.get(5).add(2);
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(5).add(0);
        adj.get(4).add(1);
        adj.get(4).add(0);
        int []ans=kahnAlgo(6,adj);
        for (int i :ans) System.out.print(i+" ");
    }
}
