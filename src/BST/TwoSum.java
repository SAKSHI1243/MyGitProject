package BST;
import java.util.*;
public class TwoSum {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static boolean twoSum(Node root, int k){
        List<Integer>list= inorder(root);;
        int l=0,r=list.size()-1;
        while (l<=r){
            if(list.get(l)+list.get(r)<k) l++;
            else if (list.get(l)+list.get(r)>k) r--;
            else return true;
        }
        return false;
    }
    public static boolean optimal(Node root, int k){
        HashSet<Integer> set= new HashSet<>();
        return check(root,k,set);
    }
    public static boolean check(Node root, int k, HashSet<Integer>set){
        if(root==null|| k==0) return false;
        if(set.add(root.data-k)) return true;
        set.add(root.data);
        return check(root.left,k,set)||check(root.right,k,set);
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
        Node root=new Node(5);
        root.left=new Node(3);
        root.right=new Node(6);
        root.left.left=new Node(2);
        root.left.right=new Node(4);
        root.right.right=new Node(7);
        System.out.println(twoSum(root,89));
        System.out.print(optimal(root,9));
    }
}