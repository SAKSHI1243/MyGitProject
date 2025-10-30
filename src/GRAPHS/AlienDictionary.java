package GRAPHS;
import java.util.*;
public class AlienDictionary {
   public static String findOrder(int n, int k, String[] dict){
       ArrayList<ArrayList<Integer>>adj= new ArrayList<>();
       for (int i = 0; i < k; i++) adj.add(new ArrayList<>());
       for (int i = 0; i < n-1; i++) {
           String s1=dict[i],s2=dict[i+1];
           for (int ptr = 0; ptr < Math.min(s1.length(),s2.length()); ptr++) {
               if(s1.charAt(ptr)!=s2.charAt(ptr)){
                   adj.get(s1.charAt(ptr)-'a').add(s2.charAt(ptr)-'a');
                   break;
               }
           }
       }
       String ans="";
       ArrayList<Integer>topo=topoSort(k,adj);
       for (int it:topo)  ans+= (char)(it+(int)'a');
       return ans;
   }
   public static ArrayList<Integer>topoSort(int v, ArrayList<ArrayList<Integer>>adj){
       for (int i = 0; i < v; i++) adj.add(new ArrayList<>());
       int []indegree=new int[v];
       for (int i = 0; i < v; i++) {
           for (int it:adj.get(i)) indegree[it]++;
       }
       Queue<Integer>q= new LinkedList<>();
       ArrayList<Integer>topo= new ArrayList<>();
       for (int i = 0; i < v; i++) {
           if(indegree[i]==0) q.add(i);
       }
       while (!q.isEmpty()){
           int node=q.poll();
           topo.add(node);
           for (int it: adj.get(node)) {
               indegree[it]--;
               if(indegree[it]==0) q.add(it);
           }
       }
       return topo;
   }
    public static void main(String[] args) {
        int N = 5, K = 4;
        String[] dict = {"baa", "abcd", "abca", "cab", "cad"};
        String str=findOrder(N,K,dict);
        for (int i =0;i<str.length();i++) System.out.print(str.charAt(i)+" ");
    }
}