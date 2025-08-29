package BinaryTree;
import java.util.*;
public class InorderTraversal {
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
    public static void inorder(Node root,List<Integer> list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    public static List<Integer> inorderTraversal(Node root){
        List<Integer>list=new ArrayList<>();
        inorder(root,list);
        return list;
    }
    public static void main(String[] args) {
        InorderTraversal.Node root=new InorderTraversal.Node(1);
        root.left=new InorderTraversal.Node(2);
        root.right=new InorderTraversal.Node(3);
        root.left.left=new InorderTraversal.Node(4);
        root.left.right=new InorderTraversal.Node(5);
        ArrayList<Integer>ans= (ArrayList<Integer>) inorderTraversal(root);
        for (int i:ans) System.out.print(i+" ");
    }
}
