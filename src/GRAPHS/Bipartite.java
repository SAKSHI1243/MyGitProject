package GRAPHS;
import java.util.*;
//odd cycles are always bipartite
public class Bipartite {
    public static boolean check(int v,ArrayList<ArrayList<Integer>> adj){
        int []color=new int[v];
        for (int i = 0; i < v; i++) color[i]=0;
        for (int i = 0; i < v; i++) {
            if(color[i]==0){
                Queue<Integer>q=new LinkedList<>();
                color[0]=1;
                q.add(0);
                while (!q.isEmpty()){
                    int node=q.poll();
                    for (Integer it:adj.get(node)) {
                        if (color[it]==0){
                            color[it]=-color[node];
                            q.add(it);
                        }
                        else if(color[it]==color[node]) return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) adj.add(new ArrayList<>());
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(2).add(3);
        adj.get(3).add(2);
        System.out.println(check(4,adj));
    }
}