package GRAPHS;
import java.util.*;
public class CycleDetectionBFS {
    public static boolean isCyclic(int v, ArrayList<ArrayList<Integer>>adj){
        int []indegree=new int[v];
        for (int i = 0; i < v; i++) {
            for (int it:adj.get(i)) indegree[it]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for (int i=0;i<v;i++){
            if(indegree[i]==0) q.add(i);
        }
        int cnt=0;
        while (!q.isEmpty()){
            int node=q.poll();
            cnt++;
            for (int it: adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0) q.add(it);
            }
        }
        return cnt!=v;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for (int i = 0; i < 4; i++) adj.add(new ArrayList<>());
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(1);
        System.out.print(isCyclic(4,adj));
    }
}