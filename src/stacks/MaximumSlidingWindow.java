package stacks;
import java.util.*;
public class MaximumSlidingWindow {
    public static int[] findMax(int []ar, int k){
        int []res=new int[ar.length-k+1];
        Stack<Integer> st= new Stack<>();
        Stack<Integer> maxSt=new Stack<>();
        for (int i = 0; i <= ar.length-k; i++) {
            int max=0,j=i;
            while (st.size()<k && j< ar.length){
                st.push(ar[j]);
                j++;
                max=Math.max(max,st.peek());
            }
            st.clear();
            maxSt.push(max);
        }
        for (int i = res.length-1 ;i >=0 ; i--) res[i]=maxSt.pop();
        return res;
    }
    public static int[] optimized(int []ar, int k){
        Deque<Integer> q= new LinkedList<>();
        int []res= new int[ar.length-k+1];
        int ri=0;
        for (int i = 0; i < ar.length; i++) {
            while (!q.isEmpty() && q.peekFirst()==i-k) q.poll();
            while (!q.isEmpty() && ar[q.peekLast()]<ar[i] ) q.pollLast();
            q.offer(i);
            if(i>=k-1) res[ri++]=ar[q.peek()];
        }
        return res;
    }
    public static void main(String[] args) {
        int []ar={1,3,-1,-3,5,3,6,7};
        int []n=optimized(ar,3);
        for (int x:n) System.out.print(x+" ");
    }
}