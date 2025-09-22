package BinaryTree;
import java.util.*;
public class ZigZag {
    public static List<List<Integer>> findZigZag(Node root){
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        boolean leftToRight=true;
        while (!q.isEmpty()){
            int size=q.size();
            List<Integer>level=new ArrayList<>();
            for(int i=0;i<size;i++) {
                Node node = q.poll();
                level.add(node.data);
                if (node.left != null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            if(!leftToRight) Collections.reverse(level);
            ans.add(level);
            leftToRight=!leftToRight;
        }
        return ans;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.right.right=new Node(6);
        root.left.right=new Node(5);
        List<List<Integer>>ans=findZigZag(root);
        for (List<Integer>i:ans) System.out.print(i);
    }
}