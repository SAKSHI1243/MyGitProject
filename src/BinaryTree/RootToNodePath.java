package BinaryTree;
import java.util.*;
public class RootToNodePath {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    public static boolean findPath(Node root, List<Integer>arr,int x){
        if (root==null) return false;
        arr.add(root.data);
        if (x==root.data) return true;
        if(findPath(root.left,arr,x)||findPath(root.right,arr,x)) return true;
        arr.remove(arr.size()-1);
        return false;
    }
    public static List<Integer>solve(Node root,int x){
        List<Integer>ans=new ArrayList<>();
        if(root==null) return ans;
        findPath(root,ans,x);
        return ans;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.left.right.left=new Node(6);
        root.left.right.right=new Node(7);
        List<Integer>ans=solve(root,7);
        System.out.print("path from root to last node:");
        for (int i=0;i<ans.size();++i) System.out.print(ans.get(i)+" ");
    }
}