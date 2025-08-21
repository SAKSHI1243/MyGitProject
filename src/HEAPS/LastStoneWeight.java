package HEAPS;
import java.util.*;
public class LastStoneWeight {
    public static int findLastStone(int []stones){
        int diff=0;
        PriorityQueue<Integer>maxHeap=new PriorityQueue<>((a,b)-> b-a);
        for (int i:stones) maxHeap.add(i);
        while (maxHeap.size()>1){
            int a=maxHeap.poll(), b=maxHeap.poll();
            diff=Math.abs(a-b);
            if(diff>0) maxHeap.add(diff);
        }
        return !maxHeap.isEmpty()?maxHeap.peek():diff;
    }
    public static void main(String[] args) {
        int []stones={2,7,4,1,8,1};
        System.out.print(findLastStone(stones));
    }
}
