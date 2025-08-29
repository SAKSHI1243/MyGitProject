package BinaryTree;
import java.util.*;
class PostNode{
    int data;
    PostNode left,right;
    PostNode(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
public class PostOrder2stack {
    public static List<Integer> traversal(PostNode root){
        List<Integer>ans=new ArrayList<>();
        Stack<PostNode>st1=new Stack<>();
        Stack<Integer>st2=new Stack<>();
        st1.push(root);
        while (!st1.isEmpty()){
            PostNode node=st1.pop();
            st2.push(node.data);
            if(node.left!=null) st1.push(node.left);
            if(node.right!=null) st1.push(node.right);
        }
        while (!st2.isEmpty()) ans.add(st2.pop());
        return ans;
    }
    public static void main(String[] args) {
        PostNode root=new PostNode(1);
        root.left=new PostNode(2);
        root.right=new PostNode(3);
        root.left.left=new PostNode(4);
        root.left.right=new PostNode(5);
        List<Integer> ans=traversal(root);
        for (int i:ans) System.out.print(i);
    }
}
