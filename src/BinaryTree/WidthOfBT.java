package BinaryTree;
import java.util.*;
public class WidthOfBT {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    static class Pair<N, I extends Number> {
        Node node;
        int position;

        Pair(Node node, int position) {
            this.node = node;
            this.position = position;
        }
    }
    public static int width(Node root){
        if (root==null) return 0;
        int ans=0;
        Queue<Pair<Node, Number>> q=new LinkedList<>();
        q.add(new Pair<Node, Number>(root,0));
        while (!q.isEmpty()){
            int size=q.size();
            int m=q.peek().position;
            int first=0,last=0;
            for (int i = 0; i < size; i++) {
                int curr_id=q.peek().position-m;
                Node x=q.peek().node;
                q.poll();
                if(i==0) first=curr_id;
                if(i==size-1) last=curr_id;
                if(x.left!=null) q.add(new Pair<>(x.left,2*curr_id+1));
                if (x.right!=null) q.add(new Pair<>(x.right,2*curr_id+2));
            }
            ans=Math.max(ans,last-first+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(3);
        root.right=new Node(2);
        root.left.left=new Node(5);
        root.left.right=new Node(4);
        root.right.right=new Node(9);
        System.out.print(width(root));
    }
}
