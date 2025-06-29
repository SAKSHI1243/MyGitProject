package hashmap;
import java.util.*;
public class hashmapImpl {
    static class MyHashMap<K, V>{
        public static final int DEFAULT_CAPACITY=4;
        public static final float DEFAULT_LOAD_FACTOR=0.75f;
        private class Node{
            K key;
            V value;
            Node(K key , V value){
                this.key=key;
                this.value= value;
            }
            private LinkedList<Node>[] buckets;
            private int n;
            private void initBuckets(int N){
                buckets = new LinkedList[N];
                for(int i=0;i<buckets.length;i++) buckets[i]=new LinkedList<>();
            }
            public void MyHashMap(){
                initBuckets(DEFAULT_CAPACITY);
            }
            private int HashFunc(K key){
                int hc=key.hashCode();
                return (Math.abs(hc))%buckets.length;
            }
            private int searchInBucket(LinkedList<Node> ll,K key){
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key==key) return i;
            }
            return -1;
            }
            public int capacity(){
                return buckets.length;
            }
            public float load(){
                return (float) ((n*1.0)/buckets.length);
            }
            private void rehash(){
                LinkedList<Node> []oldBuckets=buckets;
                initBuckets(oldBuckets.length*2);
                n=0;
                for(var bucket:oldBuckets){
                    for(var node:bucket) put(node.key,node.value);
                }
            }
            public int size(){
                return n;
            }
            public void put(K key, V value){
            int  bi= HashFunc(key);
            LinkedList<Node> currBucket= buckets[bi];
            int ei=searchInBucket(currBucket,key);
            if(ei==-1){//key, doesn't exist
                Node node= new Node(key,value);
                currBucket.add(node);
                n++;
            }
            else{//update
                Node currNode=currBucket.get(ei);
                currNode.value=value;
            }
            if(n>=buckets.length*DEFAULT_LOAD_FACTOR) rehash();
            }
            public V get(K key){
            int bi=HashFunc(key);
            LinkedList<Node> currBucket= buckets[bi];
            int ei=searchInBucket(currBucket,key);
            if(ei!=-1){
                Node currnode= currBucket.get(ei);
                return currnode.value;
            }
            return null;//key doesn't exist
            }
            public V remove(K key){
            int bi= HashFunc(key);
            LinkedList<Node> currBucket= buckets[bi];
            int ei= searchInBucket(currBucket, key);
            if(ei!=-1){
                 Node currnode= currBucket.get(ei);
                 V val= currnode.value;
                 currBucket.remove(ei);
                 n--;
                 return val;
            }
            return null;
            }
        }
    }
    public static void main(String[] args) {
        Map<String,Integer> mp= new HashMap<>();
        System.out.println("put:");
        mp.put("a",1);
        mp.put("b",2);
        mp.put("c",3);
        mp.put("x",4);
        mp.put("y",5);
        System.out.println("size:"+mp.size());
        mp.put("c",30);
        System.out.println(mp.get("a"));
        System.out.println(mp.get("b"));
        System.out.println(mp.get("c"));
        System.out.println(mp.get("college"));
        System.out.println("Size:"+mp.size());
        System.out.println(mp.remove("c"));
        System.out.println(mp.remove("c"));
        System.out.println("Size:"+mp.size());
    }
}
