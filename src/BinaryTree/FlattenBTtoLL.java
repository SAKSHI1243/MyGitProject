package BinaryTree;
import java.util.*;
public class FlattenBTtoLL {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static void flatten(Node root){
        if(root==null) return;
        Node curr=root;
        while(curr!=null){
            if(curr.left!=null){
            Node pre=curr.left;
            while (pre.right!=null) pre=pre.right;
            pre.right=curr.right;
            curr.right=curr.left;
            curr.left=null;
            }
            curr=curr.right;
        }
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void printFlatten(Node root){
        while (root!=null){
            System.out.print(root.data+" ");
            root=root.right;
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(4);
        root.right.right=new Node(6);
        System.out.println("original tree:");
        inorder(root);
        System.out.println();
        flatten(root);
        System.out.println("Flattened linked list:");
        printFlatten(root);
        System.out.println();
    }
}