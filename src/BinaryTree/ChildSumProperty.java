package BinaryTree;
public class ChildSumProperty {
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static boolean checkIfValid(Node root){
        if (root==null|| root.left==null && root.right==null) return true;
        int child=0;
        if(root.left!=null) child+=root.left.data;
        if (root.right!=null) child+=root.right.data;
        return (child==root.data) && checkIfValid(root.left) && checkIfValid(root.right);
    }
    public static void convertTree(Node root){
        if(root==null) return;
        convertTree(root.left);
        convertTree(root.right);
        int child=0;
        if(root.left!=null) child+=root.left.data;
        if (root.right!=null) child+=root.right.data;
        if (child>=root.data) root.data=child;
        else {
            int diff = root.data - child;
            if (root.left != null) {
                root.left.data += diff;
                convertTree(root.left);
            } else if(root.left!=null){
            root.right.data+=diff;
            convertTree(root.right);
            }
        }
    }
    public static void inorderTree(Node root){
        if (root==null) return;
        inorderTree(root.left);
        System.out.print(root.data+" ");
        inorderTree(root.right);
    }
    public static void main(String[] args) {
        Node root= new Node(2);
        root.left=new Node(35);
        root.right=new Node(10);
        root.left.left=new Node(2);
        root.left.right=new Node(3);
        root.right.left=new Node(5);
        root.right.right=new Node(2);
        System.out.println("Before conversion:");
        inorderTree(root);
        System.out.println(checkIfValid(root));
        convertTree(root);
        System.out.println("After conversion:");
        inorderTree(root);
        System.out.println(checkIfValid(root));
    }
}