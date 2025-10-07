package BST;
public class FloorCeil {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static int findCeil(Node root, int key){
        if(root==null) return 0;
        int ceil=-1;
        while (root!=null){
            if(key==root.data) return key;
            if(key<root.data){
                ceil=root.data;
                root=root.left;
            }
            else root=root.right;
        }
        return ceil;
    }
    public static int findFloor(Node root, int key){
        if(root==null) return 0;
        int floor=-1;
        while (root!=null){
            if(root.data==key) return key;
            if(key>root.data){
                floor=root.data;
                root=root.right;
            }
            else root=root.left;
        }
        return floor;
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left = new Node(5);
        root.right = new Node(13);
        root.left.left = new Node(3);
        root.left.left.left = new Node(2);
        root.left.left.right = new Node(4);
        root.left.right = new Node(6);
        root.left.right.right = new Node(9);
        root.right.left = new Node(11);
        root.right.right = new Node(14);
        System.out.println(findCeil(root,12));
        System.out.println(findCeil(root,8));
        System.out.println(findFloor(root,12));
        System.out.println(findFloor(root,8));
    }
}