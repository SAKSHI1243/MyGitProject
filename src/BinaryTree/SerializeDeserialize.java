package BinaryTree;
import java.util.*;
public class SerializeDeserialize {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static String serialize(Node root){
        if(root==null) return " ";
        StringBuilder sb=new StringBuilder();
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node node=q.poll();
            if(node==null) sb.append("#,");
            else{
                sb.append(node.data).append(",");
                q.add(node.left);
                q.add(node.right);
            }
        }
        return sb.toString();
    }

    public static Node deserialize(String data){
        if(data==null) return null;
        String []values=data.split(",");
        int i=0;
        Node root=new Node(Integer.parseInt(values[i++]));
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node node=q.poll();
            if(i< values.length && !values[i].equals("#")){
                Node leftNode=new Node(Integer.parseInt(values[i]));
                node.left=leftNode;
                q.add(leftNode);
            }
            i++;
            if(i< values.length && !values[i].equals("#")){
                Node rightNode=new Node(Integer.parseInt(values[i]));
                node.right=rightNode;
                q.add(rightNode);
            }
            i++;
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.left=new Node(4);
        root.right.right=new Node(5);
        System.out.println("original tree:");
        inorder(root);
        System.out.println();
        System.out.println(serialize(root));
        Node deserialized=deserialize(serialize(root));
        System.out.println("Tree after deserialization:");
        inorder(deserialized);
        System.out.println();
    }
}