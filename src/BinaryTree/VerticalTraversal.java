package BinaryTree;
import java.util.*;
public class VerticalTraversal {
    static class Pair{
        Node node;
        int hd;
        Pair(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static List<List<Integer>> verticalOrder(Node root){
        List<List<Integer>> result= new ArrayList<>();
        if(root==null) return result;
        Map<Integer,List<Integer>> mp= new TreeMap<>();
        Queue<Pair>q= new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair curr=q.poll();
            Node node=curr.node;
            int hd=curr.hd;
            if(!mp.containsKey(hd)) mp.put(hd,new ArrayList<>());
            mp.get(hd).add(node.data);
            if(node.left!=null) q.add(new Pair(node.left,hd-1));
            if(node.right!=null) q.add(new Pair(node.right,hd+1));
        }
        result.addAll(mp.values());
        return result;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.right.right=new Node(6);
        root.left.right=new Node(5);
        List<List<Integer>> result=verticalOrder(root);
        for(List<Integer>i:result) System.out.print(i);
    }
}