package stacks;
import java.util.*;
public class SumOfSubarraysRange {
    public static int findSumMinimum(int ar[]){
        int n=ar.length;
        Stack<Integer> st= new Stack<>();
        int []nse= new int[n];
        int []pse= new int [n];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && ar[i]<=ar[st.peek()]) st.pop();
            pse[i]=(st.isEmpty())?-1:st.peek();
            st.push(i);
        }
        st.clear();
        for (int i = n-1; i >=0 ; i--) {
            while (!st.isEmpty()&& ar[i]<ar[st.peek()]) st.pop();
            nse[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        st.clear();
        int total=0;
        for (int i = 0; i < n; i++) total+=(i-pse[i])*(nse[i]-i)*ar[i];
        return total;
    }
    public static int findSumMaximum(int []ar){
        int n=ar.length;
        Stack<Integer> st= new Stack<>();
        int []nle= new int[n];
        int []ple= new int [n];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && ar[i]>=ar[st.peek()]) st.pop();
            ple[i]=(st.isEmpty())?-1:st.peek();
            st.push(i);
        }
        st.clear();
        for (int i = n-1; i >=0 ; i--) {
            while (!st.isEmpty()&& ar[i]>ar[st.peek()]) st.pop();
            nle[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        st.clear();
        int total=0;
        for (int i = 0; i < n; i++) total+=(i-ple[i])*(nle[i]-i)*ar[i];
        return total;
    }

    public static int sumRange(int []ar){
        return findSumMaximum(ar)-findSumMinimum(ar);
    }
    public static void main(String[] args) {
        int[]ar={3,1,2};
        System.out.print(sumRange(ar));
    }
}