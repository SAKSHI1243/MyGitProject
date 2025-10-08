package BST;
public class InsertNode {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static Node insert(Node root, int value){
        if(root==null) return new Node(value);
        Node node=root;
        while (node!=null){
            if(value<node.data) {
                if(node.left==null) {
                    Node newnode=new Node(value);
                    node.left=newnode;
                  break;
        }

                node=node.left;
            }
            if(value>node.data ){

                if(node.right==null) {
                    Node newnode=new Node(value);
                    node.right=newnode;
                    break;
                }

                node=node.right;
            }
        }
        return root;
    }
    public static Node recursiveInsertion(Node root, int value){
        if(root==null) return new Node(value);
        if(value<root.data) root.left=recursiveInsertion(root.left,value);
        else if(value>root.data) root.right=recursiveInsertion(root.right,value);
        return root;
    }
    public static void preorder(Node root){
        if(root==null) return ;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root= new Node(40);
        root.left=new Node(20);
        root.right=new Node(60);
        root.left.left=new Node(10);
        root.left.right=new Node(30);
        root.right.left=new Node(50);
        root.right.right=new Node(70);
        System.out.println("original tree:");
        preorder(root);
        Node result=insert(root,25);
        System.out.println("tree after insertion:");
        preorder(result);
        Node x=recursiveInsertion(root,25);
        System.out.println();
        preorder(x);
    }
}