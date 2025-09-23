package BinaryTree;
import java.util.*;
public class AllPathsFromRootToNode {
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
  public static void findAllPaths(Node root, List<Integer>path, List<List<Integer>>allPaths){
        if (root==null) return;
        path.add(root.data);
        if(root.left==null && root.right==null) allPaths.add(new ArrayList<>(path));
        else {
            findAllPaths(root.left,path,allPaths);
            findAllPaths(root.right,path,allPaths);
        }
        path.remove(path.size()-1);
  }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.left.right.left=new Node(6);
        root.left.right.right=new Node(7);
        List<List<Integer>> allPath=new ArrayList<>();
        List<Integer>path=new ArrayList<>();
        findAllPaths(root,path,allPath);
        for (List<Integer>p:allPath) System.out.println(p);
    }
}