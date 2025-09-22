package BinaryTree;
class Check {
    int data;
    Check left,right;
    Check(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
public class CheckIfHeightBalanced {
    public static boolean isBalanced(Check root){
        return findHeight(root)!=-1;
    }
    public static int findHeight(Check root){
        if(root ==null) return 0;
        int leftHeight=findHeight(root.left);
        if(leftHeight==-1) return -1;
        int rightHeight=findHeight(root.right);
        if(rightHeight==-1) return -1;
        if(Math.abs(leftHeight-rightHeight)>1) return -1;
        return Math.max(leftHeight,rightHeight)+1;
    }
    public static void main(String[] args) {
    Check root=new Check(3);
    root.left=new Check(9);
    root.right=new Check(20);
    root.right.left=new Check(15);
    root.right.right=new Check(6);
    System.out.print(isBalanced(root));
    }
}