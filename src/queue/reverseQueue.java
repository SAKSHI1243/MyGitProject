package queue;
import java.util.*;
public class reverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);
        Stack<Integer> st= new Stack<>();
        while(!q.isEmpty()) st.push(q.remove());
        while(!st.isEmpty()) q.add(st.pop());
        System.out.println(q);
    }
}
