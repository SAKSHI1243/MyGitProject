package BinaryTree;
import java.util.*;
class AllNode{
    int data;
    AllNode left,right;
    AllNode(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
public class AllInOneTraversal {
    public static void allTraversal(AllNode root,List<Integer>preorder,List<Integer>postorder,List<Integer>inorder){
        if(root==null) return;
        preorder.add(root.data);
        allTraversal(root.left,preorder,inorder,postorder);
        inorder.add(root.data);
        allTraversal(root.right,preorder,inorder,postorder);
        postorder.add(root.data);
    }
    public static void main(String[] args) {
    AllNode root=new AllNode(1);
    root.left=new AllNode(2);
    root.right=new AllNode(3);
    root.left.left=new AllNode(4);
    root.left.right=new AllNode(5);
    List<Integer>inorder=new ArrayList<>();
    List<Integer>preorder=new ArrayList<>();
    List<Integer>postorder=new ArrayList<>();
    allTraversal(root,preorder,inorder,postorder);
    System.out.println(preorder);
    System.out.println(inorder);
    System.out.println(postorder);
    }
}