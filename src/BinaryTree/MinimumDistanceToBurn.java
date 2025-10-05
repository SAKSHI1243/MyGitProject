package BinaryTree;
import java.util.*;
public class MinimumDistanceToBurn {
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static HashMap<Node,Node> parentMap(Node root){
        if(root==null) return new HashMap<>();
        Queue<Node> q= new LinkedList<>();
        HashMap<Node,Node> map=new HashMap<>();
        q.add(root);
        while (!q.isEmpty()){
            Node node=q.poll();
            if(node.left!=null){
                map.put(node.left,node);
                q.add(node.left);
            }
            if(node.right!=null){
                map.put(node.right,node);
                q.add(node.right);
            }
        }
        return map;
    }
    public static int timeToBurn(Node root, Node target) {
        if (root == null || target==null) return 0;
            Queue<Node> q = new LinkedList<>();
            HashMap<Node,Node>parent=parentMap(root);
            HashSet<Node> visited= new HashSet<>();
            q.add(target);
            visited.add(target);
            int c = 0;
            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    Node node = q.poll();
                    if(node.left!=null && !visited.contains(node.left)) {
                        q.add(node.left);
                        visited.add(node.left);
                    }
                    if(node.right!=null && !visited.contains(node.right) ) {
                        q.add(node.right);
                        visited.add(node.right);
                    }
                    if(parent.containsKey(node) && !visited.contains(parent.get(node))){
                        q.add(parent.get(node));
                        visited.add(parent.get(node));
                    }
                }
                c++;
            }
            return c-1;
        }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.left.right=new Node(7);
        root.right.left=new Node(5);
        root.right.right=new Node(6);
        System.out.print(timeToBurn(root, root.right.left));
    }
}