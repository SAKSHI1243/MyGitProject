package stacks;
import java.util.*;
class Node{
    int key;
    int value;
    Node next;
    Node prev;
   public Node(int key, int value){
        this.key=key;
        this.value=value;
    }
}
public class LRUCache {
     static int capacity;
     static HashMap<Integer,Node> mp;
     static Node head;
    static Node tail;
    public LRUCache(int capacity){
        this.capacity=capacity;
        mp=new HashMap<>();
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
    }
    public static void addToHead(Node node){
        node.prev=head;
        node.next=head.next;
        head.next=node;
        node.next.prev=node;
    }
    public static void removeNode(Node node){
        node.next.prev=node.prev;
        node.prev.next=node.next;
    }
    public static void moveToHead(Node node){
        addToHead(node);
        removeNode(node);
    }
    public static int get(int key){
        if(mp.containsKey(key)){
            Node node=mp.get(key);
            moveToHead(node);
            return node.value;
        }
        return -1;
    }
    public static void put(int key, int value){
        if (mp.containsKey(key)) {
            Node node=mp.get(key);
            node.value=value;
            moveToHead(node);
        }
        else{
            Node newnode=new Node(key,value);
            mp.put(key,newnode);
            addToHead(newnode);
            if(mp.size()>capacity){
                Node tailNode=tail.prev;
                removeNode(tailNode);
                mp.remove(tailNode.key);
            }
        }
    }
    public static void main(String[] args) {
                LRUCache cache = new LRUCache(2);
                cache.put(1, 1);
                cache.put(2, 2);
                System.out.println(cache.get(1));
                cache.put(3, 3);
                System.out.println(cache.get(2));
                cache.put(4, 4);
                System.out.println(cache.get(1));
                System.out.println(cache.get(3));
                System.out.println(cache.get(4));
            }
}