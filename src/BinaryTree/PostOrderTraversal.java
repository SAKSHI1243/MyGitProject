package BinaryTree;
import java.util.*;
public class PostOrderTraversal {
   static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    public static void postorder(Node root,List<Integer>list){
        if(root==null) return;
        postorder(root.left,list);
        postorder(root.right,list);
        list.add(root.data);
    }
    public static List<Integer>postorderTraversal(Node root){
        List<Integer>list=new ArrayList<>();
        postorder(root,list);
        return list;
    }
    public static void main(String[] args) {
    PostOrderTraversal.Node root=new PostOrderTraversal.Node(1);
        root.left=new PostOrderTraversal.Node(2);
        root.right=new PostOrderTraversal.Node(3);
        root.left.left=new PostOrderTraversal.Node(4);
        root.left.right=new PostOrderTraversal.Node(5);
        ArrayList<Integer>ans= (ArrayList<Integer>) postorderTraversal(root);
        for (int i:ans) System.out.print(i+" ");
    }
}
