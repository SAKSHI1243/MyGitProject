package BinaryTree;
public class SameTree {
    public static boolean isSame(Node p,Node q){
        if(p==null && q==null) return true;
        if(p==null||q==null) return false;
        return (p.data==q.data) && isSame(p.left,q.left)&&isSame(p.right,q.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(5);
        root.right.left=new Node(4);
        root.right.right=new Node(6);
        root.right.left.left=new Node(5);
        Node x=new Node(1);
        x.left=new Node(4);
        x.right=new Node(5);
        x.right.left=new Node(4);
        x.right.right=new Node(6);
        x.right.left.left=new Node(5);
        System.out.print(isSame(root,x));
    }
}