package HEAPS;
import java.util.*;
public class KthLargestElement {
    public static int findKthLargest(int []ar, int k){
        PriorityQueue<Integer>minHeap= new PriorityQueue<>();
        for (int i = 0; i < ar.length; i++) {
            if(minHeap.size()<k) minHeap.add(ar[i]);
            else if(ar[i]>minHeap.peek()) {
                minHeap.poll();
                minHeap.add(ar[i]);
            }
        }
        return minHeap.peek();
    }
    public static void main(String[] args) {
        int []ar={4,5,7,8,2,3};
        System.out.println(findKthLargest(ar,3));
    }
}