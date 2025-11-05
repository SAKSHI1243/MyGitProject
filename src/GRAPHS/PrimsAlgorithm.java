package GRAPHS;
import java.util.*;
public class PrimsAlgorithm {
    static class Pair{
        int distance,node;
        Pair(int distance, int node){
            this.distance=distance;
            this.node=node;
        }
    }
    public static int minimumWtSum(int v, ArrayList<ArrayList<ArrayList<Integer>>>adj){
        int sum=0;
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.distance- b.distance);
        pq.add(new Pair(0,0));
        int []vis=new int[v];
        while (!pq.isEmpty()){
            Pair x=pq.poll();
            int wt=x.distance, node=x.node;
            if(vis[node]==1) continue;
            vis[node]=1;
            sum+=wt;
            for (int i=0;i<adj.get(node).size();i++){
                int w=adj.get(node).get(i).get(1);
                int n=adj.get(node).get(i).get(0);
                if(vis[n]==0) pq.add(new Pair(w,n));
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<ArrayList<Integer>>> adj= new ArrayList<>();
        int [][]edges={{0, 1, 2}, {0, 2, 1}, {1, 2, 1}, {2, 3, 2}, {3, 4, 1}, {4, 2, 2}};
        for (int i = 0; i < 5; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < 6; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];
            ArrayList<Integer> tmp1 = new ArrayList<Integer>();
            ArrayList<Integer> tmp2 = new ArrayList<Integer>();
            tmp1.add(v);
            tmp1.add(w);
            tmp2.add(u);
            tmp2.add(w);
            adj.get(u).add(tmp1);
            adj.get(v).add(tmp2);
        }
        System.out.println(minimumWtSum(5,adj));
    }
}