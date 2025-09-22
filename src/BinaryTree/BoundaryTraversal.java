package BinaryTree;
import java.util.*;
public class BoundaryTraversal {
    public static List<Integer> boundaryTraversal(Node root){
        List<Integer>res=new ArrayList<>();
        if(root==null) return res;
        if(!isLeaf(root)) res.add(root.data);
        addLeftBoundary(root,res);
        addLeaves(root,res);
        addRightBoundary(root,res);
        return res;
    }
    public static boolean isLeaf(Node root){
        return (root.left==null && root.right==null);
    }
    public static void addLeftBoundary(Node root , List<Integer> res){
        Node curr=root.left;
        while (curr!=null) {
            if (!isLeaf(curr)) res.add(curr.data);
            if (curr.left != null) curr = curr.left;
            else curr = curr.right;
        }
    }
    public static void addLeaves(Node root,List<Integer>res) {
     if(isLeaf(root)){
         res.add(root.data);
         return;
     }
     if (root.left!=null) addLeaves(root.left,res);
     if(root.right!=null) addLeaves(root.right,res);
    }
    public static void addRightBoundary(Node root, List<Integer>res){
            List<Integer>temp=new ArrayList<>();
            Node curr=root.right;
            while (curr!=null) {
                if (!isLeaf(curr)) temp.add(curr.data);
                if (curr.right != null) curr = curr.right;
                else curr = curr.left;
            }
            Collections.reverse(temp);
            res.addAll(temp);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.right.right=new Node(6);
        root.left.right=new Node(5);
        List<Integer>ans=boundaryTraversal(root);
        for(int i:ans) System.out.print(i+" ");
    }
}