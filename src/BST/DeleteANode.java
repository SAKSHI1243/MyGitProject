package BST;
public class DeleteANode {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static Node delete(Node root, int key){
        if(root==null) return null;
        if(key< root.data) root.left=delete(root.left,key);
        else if(key> root.data) root.right=delete(root.right,key);
        else{
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            else{
                Node node=root.right;
                while (node.left!=null) node=node.left;
                root.data= node.data;
                root.right=delete(root.right, node.data);
            }
        }
        return root;
    }
    public static void preorder(Node root){
        if(root==null) return ;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root= new Node(5);
        root.left=new Node(3);
        root.right=new Node(6);
        root.left.left=new Node(2);
        root.left.right=new Node(4);
        root.right.right=new Node(7);
        System.out.println("original tree:");
        preorder(root);
        System.out.println();
        System.out.println("tree after deletion:");
        Node result=delete(root,3);
        preorder(result);
    }
}