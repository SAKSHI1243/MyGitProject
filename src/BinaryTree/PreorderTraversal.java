package BinaryTree;
import java.util.*;
public class PreorderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    public static void preorder(Node root,List<Integer>ans){
        if (root==null) return;
        ans.add(root.data);
        preorder(root.left,ans);
        preorder(root.right,ans);
    }
    public static List<Integer> preorderTraversal(Node root){
    List<Integer>ans=new ArrayList<>();
    preorder(root,ans);
    return ans;
    }
    public  static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        ArrayList<Integer>ans= (ArrayList<Integer>) preorderTraversal(root);
        for (int i:ans) System.out.print(i+" ");
    }
}