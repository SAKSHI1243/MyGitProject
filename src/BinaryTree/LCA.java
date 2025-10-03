package BinaryTree;
import java.util.*;
public class LCA {
     static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    public static Node lca(Node root, Node p, Node q){
         Node x=null;
         List<Node> l1=solve(root,p);
         List<Node> l2=solve(root,q);
            if(l1.isEmpty()||l2.isEmpty()) return null;
            else{
                for (int i=0;i<Math.min(l1.size(),l2.size());i++){
                    if(l1.get(i).data==l2.get(i).data) x=l1.get(i);
                }
            }
            return x;
    }
    public static List<Node> solve(Node root, Node x){
         List<Node>ar=new ArrayList<>();
         if(root==null) return ar;
         findPath(root,ar,x);
         return ar;
    }
    public static boolean findPath(Node root, List<Node>ar, Node x){
         if(root==null) return false;
         ar.add(root);
         if(root.data==x.data) return true;
         if(findPath(root.left,ar,x)||findPath(root.right,ar,x)) return true;
         ar.remove(ar.size()-1);
         return false;
    }
    public static void main(String[] args) {
        Node root= new Node(3);
        root.left=new Node(5);
        root.right=new Node(1);
        root.left.left=new Node(6);
        root.left.right=new Node(2);
        root.left.right.left=new Node(7);
        root.left.right.right=new Node(4);
        root.right.left=new Node(0);
        root.right.right=new Node(8);
        Node x=lca(root,new Node(5),new Node(1));
        Node y=lca(root,new Node(5),new Node(4));
        Node z=lca(root,new Node(1),new Node(2));
        System.out.print(x.data+" "+y.data+" "+z.data);
    }
}