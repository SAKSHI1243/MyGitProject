package BinaryTree;
import java.util.*;
class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
public class LevelOrderTraversal {
    public static List<List<Integer>> traversal(TreeNode root){
        List<List<Integer>>result=new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int size=q.size();
            List<Integer>level=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                level.add(node.data);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            result.add(level);
        }
        return result;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        List<List<Integer>> ans=traversal(root);
        for (List<Integer> i:ans) System.out.print(i);
    }
}