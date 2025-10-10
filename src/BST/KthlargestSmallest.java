package BST;
import java.util.*;
public class KthlargestSmallest {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static int findKthSmallest(Node root, int k){
        List<Integer>ans=inorder(root);
        if(root==null ||k<0|| k>ans.size()) return -1;
        return ans.get(k-1);
    }
    public static List<Integer>  inorder(Node root){
        List<Integer>x=new ArrayList<>();
        if(root==null) return x;
        x.addAll(inorder(root.left));
        x.add(root.data);
        x.addAll(inorder(root.right));
        return x;
    }
    public static int findKthLargest(Node root, int k){
        List<Integer>ans=inorder(root);
        if(root==null ||k<0|| k>ans.size()) return -1;
        return ans.get(ans.size()-k);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(12);

        root.left.left = new Node(4);
        root.left.right = new Node(7);
        root.left.right.left = new Node(6);

        root.right.left = new Node(10);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);
      System.out.println(findKthSmallest(root,3));
      System.out.println(findKthLargest(root,3));
    }
}