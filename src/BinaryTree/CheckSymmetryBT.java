package BinaryTree;
public class CheckSymmetryBT {
    public static boolean isSymmetric(Node root){
        if(root==null) return true;
        return check(root.left,root.right);
    }
    public static boolean check(Node root1, Node root2){
        if(root1==null || root2==null) return (root1==root2);
        return (root1.data==root2.data) && check(root1.left,root2.right) && check(root1.right,root2.left);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(2);
        root.left.left=new Node(3);
        root.left.right=new Node(4);
        root.right.left=new Node(4);
        root.right.right=new Node(3);
        System.out.print(isSymmetric(root));
    }
}