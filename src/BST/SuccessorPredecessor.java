package BST;
public class SuccessorPredecessor {
    static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static TreeNode successor(TreeNode root, TreeNode key){
        if(root==null) return null;
        TreeNode res=null;
        while (root!=null) {
             if (key.data < root.data) {
                res = root;
                root = root.left;
            }
             else root = root.right;
        }
        return res;
    }
    public static TreeNode predecessor(TreeNode root, TreeNode key){
        if(root==null) return null;
        TreeNode pre=null;
        while (root!=null){
            if(key.data>root.data){
                pre=root;
                root=root.right;
            }
            else root=root.left;
        }
        return pre;
    }
    public static void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        System.out.println("BST:");
        inorder(root);
        System.out.println();
        TreeNode p=root.right;
        TreeNode res=successor(root,p);
        if(res!=null) System.out.println("Successor of "+p.data+ " is "+res.data);
        else System.out.println(("No successor exist of "+p.data ));
        TreeNode pre=predecessor(root,p);
        if(pre!=null) System.out.println("Predecessor of "+p.data+" is "+pre.data);
        else System.out.println("No predecessor of "+p.data);
    }
}