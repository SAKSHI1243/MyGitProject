package HEAPS;
import java.util.*;
public class TaskScheduler {
    public static int taskScheduler(char []ar,int n){
       int []freq=new int[26];
        for (int i = 0; i < ar.length; i++) freq[ar[i]-'A']++;//count freq of each char of ch
        PriorityQueue<Integer>maxHeap=new PriorityQueue<>((a,b)->b-a);
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]>0) maxHeap.add(freq[i]);
        }
        int time=0;
        while (!maxHeap.isEmpty()){
            ArrayList<Integer>temp=new ArrayList<>();
            int cycle=n+1;
            while (cycle>0  && !maxHeap.isEmpty()){
                int curr=maxHeap.poll();
                curr--;
                if(curr>0) temp.add(curr);
                time++;
                cycle--;
            }
                for (int t:temp) maxHeap.add(t);
                 if(!maxHeap.isEmpty()) time+=cycle;
        }
        return time;
    }
    public static void main(String[] args) {
        char []ch={'A','A','A','B','B','B'};
        System.out.print(taskScheduler(ch,2));
    }
}