package BinaryTree;
public class MaxPathSum {
    private static int max;
    public static int findMaxSumPath(Node root){
        if(root==null) return 0;
        int leftSum=Math.max(0,findMaxSumPath(root.left));
        int rightSum=Math.max(0,findMaxSumPath(root.right));
        max=Math.max(max,leftSum+rightSum+root.data);
        return Math.max(leftSum,rightSum)+root.data;
    }
    public static int maxSumPath(Node root){
          max=Integer.MIN_VALUE;
        findMaxSumPath(root);
        return max;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(5);
        root.right.left=new Node(4);
        root.right.right=new Node(6);
        root.right.left.left=new Node(5);
        System.out.print(maxSumPath(root));
    }
}