package BinaryTree;
import java.util.*;
public class CountNodes {
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static int countTotalNodes(Node root){
        if (root==null) return 0;
        return 1+countTotalNodes(root.left)+countTotalNodes(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        System.out.print(countTotalNodes(root));
    }
}