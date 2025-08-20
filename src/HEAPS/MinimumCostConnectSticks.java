package HEAPS;
import java.util.*;
public class MinimumCostConnectSticks {
   public static int findMinimumCost(ArrayList<Integer>sticks){
       int cost=0;
       PriorityQueue<Integer>minHeap=new PriorityQueue<>();
       for(int stick:sticks) minHeap.add(stick);
       while (minHeap.size()>1){
           int first=minHeap.poll(),second=minHeap.poll();
           int sum=first+second;
           cost+=sum;
           minHeap.add(sum);
       }
       return cost;
   }
    public static void main(String[] args) {
      ArrayList<Integer> sticks=new ArrayList<>();
      sticks.add(2);
      sticks.add(4);
      sticks.add(3);
        System.out.print(findMinimumCost(sticks));
    }
}