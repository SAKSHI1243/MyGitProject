package HEAPS;
import java.util.*;
public class ReplaceByRank {
    public static int[] rank(int []ar){
        int cnt=1;
        PriorityQueue<Integer>minHeap=new PriorityQueue<>();
        HashMap<Integer,Integer>mp=new HashMap<>();
        for (int i = 0; i < ar.length; i++) minHeap.add(ar[i]);
        while (!minHeap.isEmpty()){
            int val= minHeap.poll();
            if(!mp.containsKey(val)) mp.put(val,cnt++);
        }
        for (int i = 0; i < ar.length; i++) ar[i]=mp.get(ar[i]);
        return ar;
    }
    public static void main(String[] args) {
        int []ar={20,15,26,2,98,6};
        int []p=rank(ar);
        for (int i:p) System.out.print(i+" ");
    }
}