package GRAPHS;
import java.util.*;
public class KruskalAlgo {
 List<Integer>rank,parent,size;
 public KruskalAlgo(int n){
     rank= new ArrayList<>();
     parent=new ArrayList<>();
     size=new ArrayList<>();
     for (int i = 0; i <n; i++) {
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
     int ulp_u=findParent(u), ulp_v=findParent(v);
     if(ulp_u==ulp_v) return;
     else if(rank.get(ulp_u)<rank.get(ulp_v)) parent.set(ulp_u,ulp_v);
     else if(rank.get(ulp_v)<rank.get(ulp_u)) parent.set(ulp_v,ulp_u);
     else {
         parent.set(ulp_u,ulp_v);
         rank.set(ulp_v,rank.get(ulp_v)+1);
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
 public  int kruskal(int V, List<List<List<Integer>>>adj){
     List<int[]>edges=new ArrayList<>();
     for (int i = 0; i < V; i++) {
         for (List<Integer>it:adj.get(i)){
             int v=it.get(0), wt=it.get(1),u=i;
             edges.add(new int[]{wt,u,v});
         }
     }
     edges.sort(Comparator.comparingInt(o->o[0]));
     int sum=0;
     for (int []it:edges) {
         int wt=it[0],u=it[1],v=it[2];
         if(findParent(u)!=findParent(v)){
             sum+=wt;
             unionBySize(u,v);
         }
     }
     return sum;
 }
    public static void main(String[] args) {
        int V=4;
        List<int[]>edges=Arrays.asList(
                new int[]{0, 1, 1},
                new int[]{1, 2, 2},
                new int[]{2, 3, 3},
                new int[]{0, 3, 4}
        );
        List<List<List<Integer>>>adj=new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        for (int []it:edges) {
        int u=it[0];
        int v=it[1];
        int wt=it[2];
        adj.get(u).add(Arrays.asList(v, wt));
        adj.get(v).add(Arrays.asList(u, wt));
        }
        KruskalAlgo k= new KruskalAlgo(V);
        System.out.println(k.kruskal(V,adj));
    }
}