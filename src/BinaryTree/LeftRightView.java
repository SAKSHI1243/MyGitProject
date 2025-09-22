package BinaryTree;
import java.util.*;
public class LeftRightView {
    public static List<Integer>leftView(Node root){
        List<Integer> res=new ArrayList<>();
        if(root==null) return res;
        recurisionLeft(root,0,res);
        return res;
    }
    public static List<Integer> rightView(Node root){
        List<Integer>res=new ArrayList<>();
        if (root==null)return res;
        recursionRight(root,0,res);
        return res;
    }
    public static void recurisionLeft(Node root,int level,List<Integer>res){
        if(root==null) return;
        if(res.size()==level) res.add(root.data);
        recurisionLeft(root.left,level+1,res);
        recurisionLeft(root.right,level+1,res);
    }
    public static void recursionRight(Node root,int level,List<Integer> res){
        if(root==null) return;
        if(res.size()==level) res.add(root.data);
        recursionRight(root.right,level+1,res);
        recursionRight(root.left,level+1,res);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(10);
        root.right.left=new Node(9);
        root.right.right=new Node(11);
        root.left.left.right=new Node(5);
        root.left.left.right.right=new Node(6);
        System.out.print("Left View:");
        List<Integer>l=leftView(root);
        for (int i:l) System.out.print(i+" ");
        System.out.println();
        System.out.print("Right View:");
        List<Integer>r=rightView(root);
        for (int i:r) System.out.print(i+" ");
    }
}