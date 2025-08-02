package stacks;
import java.util.*;
public class SumOfSubarrayMaximum {
    public static int maximum(int []ar){
        Stack<Integer> st= new Stack<>();
        int n=ar.length;
        int[] ple= new int[n];
        int []nle= new int[n];
        for (int i = 0; i < n; i++) {
            while(!st.isEmpty() && ar[i]>=ar[st.peek()]) st.pop();
            ple[i]=(st.isEmpty())?-1:st.peek();
            st.push(i);
        }
        st.clear();
        for (int i = n-1; i >=0 ; i--) {
            while (!st.isEmpty() && ar[i]>ar[st.peek()]) st.pop();
            nle[i]=(st.isEmpty())?n:st.peek();
            st.push(i);
        }
        st.clear();
        int total=0;
        for (int i = 0; i < n; i++) total+=(i-ple[i])*(nle[i]-i)*ar[i];
        return total;
    }
    public static void main(String[] args) {
        int []ar={3,1,2};
        System.out.print(maximum(ar));
    }
}