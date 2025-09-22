package BinaryTree;
public class DiameterOfBT {
    private static int maxHeight;
    public static int findHeight(Node root){
        if(root==null) return 0;
        int leftNode=findHeight(root.left);
        int rightNode=findHeight(root.right);
        maxHeight=Math.max(maxHeight,leftNode+rightNode);
        return Math.max(leftNode,rightNode)+1;
    }
    public static int findDiameter(Node root){
        maxHeight=0;
       findHeight(root);
       return maxHeight;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(5);
        root.right.left=new Node(4);
        root.right.right=new Node(6);
        root.right.left.left=new Node(5);
        System.out.print(findDiameter(root));
    }
}
