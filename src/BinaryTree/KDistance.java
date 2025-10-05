package BinaryTree;
import java.util.*;
public class KDistance {
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
public static List<Integer> targetDistanceK(Node root, Node target, int k){
        if (root==null) return new ArrayList<>();
        HashMap<Node,Node> parentMap=new HashMap<>();//binary tree is directional(parent->child) soto traverse upward we need parent references
        mapParent(root,parentMap);//fill parentMap with child,parent entries of all nodes
        return bfsFromTarget(target,parentMap,k);//do a BFS starting from target to find nodes at distance K.
}
public static void mapParent(Node root, HashMap<Node,Node>parentMap){
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node node=q.poll();
            if(node.left!=null){
                parentMap.put(node.left,node);
                q.add(node.left);
            }
            if(node.right!=null){
                parentMap.put(node.right,node);
                q.add(node.right);
            }
        }
}
public static List<Integer>bfsFromTarget(Node target, HashMap<Node,Node>parentMap, int k){
        Queue<Node>q=new LinkedList<>();
        HashSet<Node>visited=new HashSet<>();
        q.add(target);
        visited.add(target);
        int currLevel=0;// nodes currently at q are at 0 distance
        while (!q.isEmpty()){
            int size= q.size();
            if(currLevel++==k) break;
            for (int i = 0; i < size; i++) {
                Node node=q.poll();
                if(node.left!=null && !visited.contains(node.left)){
                    q.add(node.left);
                    visited.add(node.left);
                }
                if(node.right!=null && !visited.contains(node.right)){
                    q.add(node.right);
                    visited.add(node.right);
                }
                if (parentMap.containsKey(node) && !visited.contains(parentMap.get(node))){
                    q.add(parentMap.get(node));
                    visited.add(parentMap.get(node));
                }
            }
        }
        ArrayList <Integer> result=new ArrayList<>();
        while (!q.isEmpty()) result.add(q.poll().data);
        return result;
}
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        List<Integer> result=targetDistanceK(root,root.left,3);
        for ( int val:result) System.out.print(val+" ");
    }
}