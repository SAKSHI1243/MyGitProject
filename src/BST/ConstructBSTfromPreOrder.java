package BST;
import java.util.*;
public class ConstructBSTfromPreOrder {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    public static int idx=0;
public static Node build(int[]preorder,int min, int max){
        if(idx== preorder.length) return null;
        if(preorder[idx]<=min || preorder[idx]>=max) return null;
        Node root=new Node(preorder[idx++]);
        root.left=build(preorder,min, root.data);
        root.right=build(preorder, root.data, max);
        return root;
}
public static List<Integer> LevelOrder(Node root){
    if(root==null) return null;
   Queue<Node> q=new LinkedList<>();
   q.add(root);
    List<Integer>list=new ArrayList<>();
   while (!q.isEmpty()){
       int size=q.size();
       for (int i = 0; i < size; i++) {
           Node node=q.poll();
           list.add(node.data);
           if(node.left!=null) q.add(node.left);
           if(node.right!=null) q.add(node.right);
       }
   }
   return list;
}
public static Node constructBST(int[]preoder){
    return build(preoder,Integer.MIN_VALUE,Integer.MAX_VALUE);
}
    public static void main(String[] args) {
       int []preorder={8,5,1,7,10,12};
        Node root=constructBST(preorder);
        List<Integer> ans=LevelOrder(root);
        for (int i:ans) System.out.print(i+" ");
    }
}