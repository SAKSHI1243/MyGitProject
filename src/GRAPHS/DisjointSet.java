package GRAPHS;
import java.util.*;
public class DisjointSet {
    List<Integer>rank= new ArrayList<>();
     List<Integer>parent= new ArrayList<>();
    List<Integer>size= new ArrayList<>();
     public DisjointSet(int n){
        for (int i=0;i<=n;i++) {
            rank.add(0);
            size.add(1);
            parent.add(i);
        }
    }
    public int findParent(int node){
         if(node==parent.get(node)) return node;
         int ulp=findParent(parent.get(node));
         parent.set(node,ulp);
         return parent.get(node);
    }
    public void unionByRank(int u, int v){
         int ulp_u=findParent(u),ulp_v=findParent(v);
         if(ulp_u==ulp_v) return;
         else if(rank.get(ulp_u)<rank.get(ulp_v)) parent.set(ulp_u,ulp_v);
         else if(rank.get(ulp_v)<rank.get(ulp_u)) parent.set(ulp_v,ulp_u);
         else{
             parent.set(ulp_u,ulp_v);
             rank.set(ulp_u,rank.get(ulp_u)+1);
         }
    }
    public void unionBySize(int u, int v){
         int ulp_u=findParent(u), ulp_v=findParent(v);
         if(ulp_u==ulp_v) return;
         else if(size.get(ulp_u)<size.get(ulp_v)) {
             parent.set(ulp_u,ulp_v);
             size.set(ulp_v,size.get(ulp_u)+size.get(ulp_v));
         }
         else{
             parent.set(ulp_v,ulp_u);
             size.set(ulp_u,size.get(ulp_u)+size.get(ulp_v));
         }
    }
    public static void main(String[] args) {
    DisjointSet ds= new DisjointSet(7);
        ds.unionByRank(1, 2);
        ds.unionByRank(2, 3);
        ds.unionByRank(4, 5);
        ds.unionByRank(6, 7);
        ds.unionByRank(5, 6);
        if (ds.findParent(3) == ds.findParent(7)) System.out.println("Same");
        else System.out.println("Not Same");
        ds.unionByRank(3, 7);
        if (ds.findParent(3) == ds.findParent(7)) System.out.println("Same");
         else System.out.println("Not Same");
    }
}