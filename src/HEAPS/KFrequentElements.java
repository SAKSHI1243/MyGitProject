package HEAPS;
import java.util.*;
public class KFrequentElements {
    public static int[] kFrequentElement(int []nums, int k){
        HashMap<Integer,Integer>mp=new HashMap<>();
        for (int num : nums) mp.put(num,mp.getOrDefault(num,0)+1);
        PriorityQueue<Map.Entry<Integer,Integer>>maxHeap=new PriorityQueue<>((a,b)-> b.getValue()-a.getValue());
        maxHeap.addAll(mp.entrySet());
        int []res=new int[k];
        for (int i=0;i<k;i++) res[i]=maxHeap.poll().getKey();
        return res;
    }
    public static void main(String[] args) {
        int []nums={1,1,1,2,2,3};
        int []ans=kFrequentElement(nums,2);
        for (int i:ans) System.out.print(i+" ");
    }
}