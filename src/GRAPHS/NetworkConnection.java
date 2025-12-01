package GRAPHS;
import java.util.*;
public class NetworkConnection {
    int findParent(int []parent, int x){
        if(x!=parent[x]) parent[x]=findParent(parent,parent[x]);
        return parent[x];
    }
    void union(int []parent, int []rank, int u, int v){
        int pu=findParent(parent,u), pv=findParent(parent,v);
        if(pu==pv) return;
        if(rank[pu]<rank[pv]) parent[pu]=pv;
        else if(rank[pv]<rank[pu]) parent[pv]=pu;
        else{
            parent[pu]=pv;
            rank[pv]++;
        }
    }
      public int makeConnections(int n, int[][]connections){
       if (connections.length<n-1) return -1;
       int []rank= new int[n];
       int []parent= new int[n];
       for (int i = 0; i < n; i++) parent[i]=i;
       for (int []edge:connections) union(parent,rank,edge[0],edge[1]);
       HashSet<Integer>component= new HashSet<>();
       for (int i = 0; i < n; i++) component.add(findParent(parent,i));
       return component.size()-1;
    }
    public static void main(String[] args) {
        int [][]connections={{0,1},{0,2},{0,3},{1,3},{4,5}};
        NetworkConnection n=new NetworkConnection();
        System.out.println(n.makeConnections(6,connections));
    }
}