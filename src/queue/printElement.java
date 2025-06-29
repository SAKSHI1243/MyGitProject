package queue;
import java.util.*;
public class printElement {
    public static void main(String[] args) {
        Queue<Integer> q1= new LinkedList<>();
        Queue<Integer> q2= new LinkedList<>();
        q1.add(2);
        q1.add(3);
        q1.add(1);
        q1.add(5);
        q1.add(4);
        while(q1.size()>0) {
            System.out.print(q1.peek()+" ");
            q2.add(q1.poll());
        }
        while (q2.size()>0){
            q1.add(q2.remove());
        }
    }
}
