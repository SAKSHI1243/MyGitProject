package GRAPHS;
import java.util.*;
public class PrimsAlgorithm {
    public static class Pair{
        int node;
        int distance;
        Pair(int node, int distance){
            this.node=node;
            this.distance=distance;
        }
    }
    public static int primsAlgo(int v, ArrayList<ArrayList<ArrayList<Integer>>>adj){
        PriorityQueue<Pair>pq=new PriorityQueue<>((x,y)->x.distance-y.distance);
        int vis[]= new int[v];
        int sum=0;
        pq.add(new Pair(0,0));
        while (!pq.isEmpty()){
            int wt=pq.peek().distance;
            int node=pq.peek().node;
            pq.poll();
            if(vis[node]==1) continue;
            vis[node]=1;
            sum+=wt;
            for (int i = 0; i < adj.get(node).size(); i++) {
                int edW=adj.get(node).get(i).get(1), adjNode=adj.get(node).get(i).get(0);
                if(vis[adjNode]==0) pq.add(new Pair(edW,adjNode));
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
        System.out.println(primsAlgo(5,adj));
    }
}