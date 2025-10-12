package BST;
public class LargestBST {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    static class Info{
        boolean isBST;
        int size,min,max;
        Info(boolean isBST,int size,int min,int max){
            this.isBST=isBST;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }
    public static Info helper(Node root){
       if(root==null) return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        Info left=helper(root.left);
        Info right=helper(root.right);
        if(left.isBST && right.isBST && root.data>left.max && root.data<right.min){
            int size=left.size+right.size+1;
            int min=Math.min(root.data,left.min);
            int max=Math.max(root.data,right.max);
            return new Info(true,size,min,max);
        }
        return new Info(false,Math.max(left.size,right.size),0,0);
    }
    public static int largestBST(Node root){
        return helper(root).size;
    }
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(1);
        root.right=new Node(4);
        root.right.left=new Node(2);
        System.out.print(largestBST(root));
    }
}