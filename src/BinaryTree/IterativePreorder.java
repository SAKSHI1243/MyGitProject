package BinaryTree;
import java.util.*;
class PreNode{
    int data;
    PreNode left,right;
    PreNode(int data){
        this.data=data;
        PreNode left=null;
        PreNode right=null;
    }
}
public class IterativePreorder {
    public static List<Integer> traversal(PreNode root){
        List<Integer>ans=new ArrayList<>();
        Stack<PreNode>st= new Stack<>();
        st.push(root);
        while (!st.isEmpty()){
            int size=st.size();
            for (int i = 0; i < size; i++) {
                PreNode node=st.pop();
                ans.add(node.data);
                if(node.right!=null) st.push(node.right);
                if(node.left!=null) st.push(node.left);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
    PreNode root=new PreNode(1);
    root.left=new PreNode(2);
    root.right=new PreNode(3);
    root.left.left=new PreNode(4);
    root.left.right=new PreNode(5);
    List<Integer> ans=traversal(root);
    for (int i:ans) System.out.print(i+" ");
    }
}