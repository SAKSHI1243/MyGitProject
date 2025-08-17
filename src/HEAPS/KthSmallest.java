package HEAPS;
import java.util.*;
public class KthSmallest {
    public static int kthSmallest(int []ar, int k){
        PriorityQueue<Integer>maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < ar.length; i++) {
            if(maxHeap.size()<k)maxHeap.add(ar[i]);
            else if(ar[i]<maxHeap.peek()){
                maxHeap.poll();
                maxHeap.add(ar[i]);
            }
        }
        return maxHeap.peek();
    }
    public static void main(String[] args) {
        int []ar={3,1,4,6,8,2};
        System.out.println(kthSmallest(ar,3));
    }
}