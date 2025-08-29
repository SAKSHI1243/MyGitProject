package BinaryTree;
import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
public class HeightOfBT {
    public static int findHeight(Node root){
        if(root==null) return 0;
        Queue<Node>q=new LinkedList<>();
        int height=0;
        q.add(root);
        while (!q.isEmpty()){
            int size=q.size();
            for (int i = 0; i < size; i++) {
                Node node=q.poll();
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            height++;
        }
        return height;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(5);
        root.right.left=new Node(4);
        root.right.right=new Node(6);
        root.right.left.left=new Node(5);
        System.out.print(findHeight(root));
    }
}