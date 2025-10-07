package BST;
import java.util.*;
public class MinMax {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static void findMin(Node root){
        if(root==null)return;
        int min=root.data;
        int max=root.data;
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node node=q.poll();
            if(node.left!=null) {
                min=Math.min(min,node.left.data);
                q.add(node.left);
            }
            if(node.right!=null){
                max=Math.max(max,node.right.data);
                q.add(node.right);
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
    public static void main(String[] args) {
        Node root= new Node(5);
        root.left=new Node(3);
        root.right=new Node(8);
        root.left.left=new Node(2);
        root.left.right=new Node(42);
        root.right.left=new Node(1);
        root.right.right=new Node(10);
        findMin(root);

    }
}