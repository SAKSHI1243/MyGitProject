package GRAPHS;
import java.util.*;
public class NetworkDelay {
    public static int networkDelayTime(int [][]times, int n, int k){
        ArrayList<ArrayList<int[]>>adj= new ArrayList<>();
        for (int i = 0; i <=n ; i++)adj.add(new ArrayList<>());
        for (int i = 0; i < times.length; i++) adj.get(times[i][0]).add(new int[]{times[i][1],times[i][2]});
        int []dist= new int[n+1];
        for (int i = 0; i < dist.length; i++) dist[i]=(int)1e9;
        dist[k]=0;
        PriorityQueue<int[]>pq= new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        pq.add(new int[]{0,k});
        while (!pq.isEmpty()){
            int []curr= pq.poll();
            int time=curr[0], node=curr[1];
            for (int []it:adj.get(node)){
                int v=it[0], wt=it[1];
                if(dist[v]>wt+time){
                    dist[v]=wt+time;
                    pq.add(new int[]{dist[v],v});
                }
            }
        }
        int ans=0;
        for (int i = 1; i <=n; i++) {
            if(dist[i]==1e9) return -1;
            ans=Math.max(ans,dist[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int [][] times={{2,1,1},{2,3,1},{3,4,1}};
        int n=4,k=2;
        System.out.println(networkDelayTime(times,n,k));
    }
}