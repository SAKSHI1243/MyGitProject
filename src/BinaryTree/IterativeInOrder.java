package BinaryTree;
import java.util.*;
class InNode{
    int data;
    InNode left;
    InNode right;
    InNode(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
public class IterativeInOrder {
    public static void traversal(InNode root,List<Integer> ans){
        if (root==null) return;
        traversal(root.left,ans);
        ans.add(root.data);
        traversal(root.right,ans);
        }
        public static List<Integer> inorder(InNode root){
        List<Integer>ans=new ArrayList<>();
        traversal(root,ans);
        return ans;
        }
    public static void main(String[] args) {
        InNode root=new InNode(1);
        root.left=new InNode(2);
        root.right=new InNode(3);
        root.left.left=new InNode(4);
        root.left.right=new InNode(5);
        for (int i:inorder(root)) System.out.print(i);
    }
}