package BST;
public class lca {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static int lca(Node root,Node p, Node q){
        if(root==null) return 0;
        if(root.data<p.data && root.data<q.data) return lca(root.right,p,q);
        else if(root.data>p.data && root.data>q.data)return lca(root.left,p,q);
        else return root.data;
    }
    public static void main(String[] args) {
        Node root=new Node(6);
        root.left=new Node(2);
        root.right=new Node(8);
        root.left.left=new Node(0);
        root.left.right=new Node(4);
        root.right.left=new Node(7);
        root.right.right=new Node(9);
        root.left.right.left=new Node(3);
        root.left.right.right=new Node(5);
        Node p=new Node(4);
        Node q=new Node(8);
        System.out.println(lca(root,p,q));
    }
}