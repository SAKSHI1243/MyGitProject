package queue;
import java.util.*;
public class reverseKelements {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the Kth position:");
        int k= sc.nextInt();
        Queue<Integer> q= new LinkedList<>();
        Stack<Integer> st= new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("original queue:"+q);
        for(int i=0;i<k;i++) st.push(q.remove());
        while(st.size()>0) q.add(st.pop());
        for(int i=0;i<q.size()-k;i++) q.add(q.remove());
        System.out.println(q);
    }
}
