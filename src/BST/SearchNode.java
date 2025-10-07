package BST;
public class SearchNode {
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static Node find(Node root, int target){
        if(root==null) return null;
        while (root!=null && root.data!=target) root=target<root.data?root.left:root.right;
        return root;
    }
    public static void main(String[] args) {
        Node root=new Node(5);
        root.left=new Node(3);
        root.right=new Node(8);
        root.left.left=new Node(1);
        root.right.left=new Node(7);
        root.left.right=new Node(4);
        root.right.right=new Node(10);
        int target=42;
        Node node=find(root,target);
        if(node==null) System.out.println(target+" not found");
        else System.out.println(target+" found");
    }
}