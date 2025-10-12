package BST;
import java.util.*;
public class RecoverBST {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static Node recover(Node root){
        List<Node>list=new ArrayList<>();
        inorder(root,list);
        Node first=null,second=null;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).data>list.get(i+1).data){
                if(first==null) first=list.get(i);
                second=list.get(i+1);
            }
        }
       if(first!=null && second!=null){
           int temp=first.data;
           first.data=second.data;
           second.data=temp;
       }
       return root;
    }
    public static Node inorder(Node root,List<Node>list){
        if(root==null) return null;
        inorder(root.left,list);
        list.add(root);
        inorder(root.right,list);
        return root;
    }
    public static void printInorder(Node root){
        if(root==null) return;
        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);
    }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(3);
        root.left.right=new Node(2);
        printInorder(root);
        System.out.println();
        Node x=recover(root);
        printInorder(x);
    }
}