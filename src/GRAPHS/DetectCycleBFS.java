package GRAPHS;
import java.util.*;
public class DetectCycleBFS {
    static class Node{
        int first,second;
        Node(int frist, int second){
            this.first=frist;
            this.second=second;
        }
    }
    public static boolean isCycle(int v, List<List<Integer>>adj){
        boolean []vis=new boolean[v];
        Arrays.fill(vis,false);
        int []parent=new int[v];
        Arrays.fill(parent,-1);
        for (int i = 0; i < v; i++) {
            if(vis[i]==false){
                if (check(i,vis,parent,adj)) return true;
            }
        }
        return false;
    }
    public static boolean check(int s, boolean[]vis, int[]parent,List<List<Integer>>adj){
        Queue<Node>q=new LinkedList<>();
        q.add(new Node(s,-1));
        vis[s]=true;
        while (!q.isEmpty()){
            int node=q.peek().first;
            int par=q.peek().second;
            q.remove();
            for (Integer i :adj.get(node)) {
                if(vis[i]==false){
                    q.add(new Node(i,node));
                    vis[i]=true;
                }
                else if(par!=i) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        List<List<Integer>>adj=new ArrayList<>();
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        System.out.print(isCycle(4,adj));
    }
}