package BinaryTree;
import java.util.*;
public class TopView {
    static class Pair{
        Node node;
        int hd;
        Pair(Node node, int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static List<Integer> topView(Node root){
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Map<Integer,Integer>mp=new TreeMap<>();
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(root,0));
        while (!q.isEmpty()){
            Pair curr=q.poll();
            Node node=curr.node;
            int hd=curr.hd;
            if(!mp.containsKey(hd)) mp.put(hd,node.data);
            if(node.left!=null) q.add(new Pair(node.left,hd-1));
            if(node.right!=null) q.add(new Pair(node.right,hd+1));
        }
        ans.addAll(mp.values());
        return ans;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(10);
        root.right.left=new Node(9);
        root.right.right=new Node(11);
        root.left.left.right=new Node(5);
        root.left.left.right.right=new Node(6);
        List<Integer>ans=topView(root);
        for (int i:ans) System.out.print(i+" ");
    }
}