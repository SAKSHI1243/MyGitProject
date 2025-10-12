package BST;
import java.util.*;
public class MergeTwoBST {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static List<Integer> merge(Node root1, Node root2){
        List<Integer> l1= inorder(root1);
        List<Integer> l2=inorder(root2);
        List<Integer> l3=new ArrayList<>();
        int l=0,r=0;
        while (l<l1.size() && r< l2.size()){
            if(l1.get(l)<=l2.get(r)) {
                l3.add(l1.get(l));
                l++;
            }
            else{
                l3.add(l2.get(r));
                r++;
            }
        }
        while(l<l1.size()) l3.add(l1.get(l++));
        while(r<l2.size()) l3.add(l2.get(r++));
        return l3;
    }
    public static List<Integer> inorder(Node root){
        List<Integer>list=new ArrayList<>();
        if(root==null) return list;
        list.addAll(inorder(root.left));
        list.add(root.data);
        list.addAll(inorder(root.right));
        return list;
    }
    public static void main(String[] args) {
        Node root1=new Node(3);
        root1.left=new Node(1);
        root1.right=new Node(5);
        System.out.println("first tree:");
        List<Integer>l1=inorder(root1);
        for (int i:l1) System.out.print(i+" ");
        System.out.println();
        Node root2= new Node(4);
        root2.left=new Node(2);
        root2.right=new Node(6);
        System.out.println("second tree:");
        List<Integer>l2=inorder(root2);
        for (int i:l2) System.out.print(i+" ");
        System.out.println();
        System.out.println("merged tree:");
        List<Integer> res=merge(root1,root2);
        for (int i:res) System.out.print(i+" ");
    }
}
