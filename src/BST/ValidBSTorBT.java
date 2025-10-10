package BST;
public class ValidBSTorBT {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static boolean isValid(Node root, long max, long min){
        if(root==null) return true;
       if (root.data>=max|| root.data<=min) return false;
        return isValid(root.left, root.data,min) && isValid(root.right,max, root.data);
    }
    public static void main(String[] args) {
        Node root=new Node(5);
        root.left=new Node(1);
        root.right=new Node(9);
        root.right.left=new Node(3);
        root.right.right=new Node(6);
        System.out.println(isValid(root,Long.MAX_VALUE,Long.MIN_VALUE));
    }
}