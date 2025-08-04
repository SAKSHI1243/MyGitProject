package stacks;
import java.util.*;
public class StockSpanner {
    public static int []previousSmaller(int []ar){
        int []span= new int[ar.length];
        Stack<Integer> st= new Stack<>();
        for (int i = 0; i < ar.length; i++) {
            while(!st.isEmpty() && ar[st.peek()]<=ar[i]) st.pop();
            span[i]=st.isEmpty()?i+1:i-st.peek();
            st.push(i);
        }
        return span;
    }
    public static void main(String[] args) {
        int []ar={100,80,60,70,60,75,85};
        int []x=previousSmaller(ar);
        for (int i:x) System.out.print(i+" ");
    }
}