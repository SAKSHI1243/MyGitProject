package stacks;
import java.util.*;
public class nextGreaterElement {
    public static int[] nextGreater(int []ar){
        int n= ar.length;
        int []nge= new int[n];
        Stack<Integer> st= new Stack<>();
        for (int i = 2*n-1; i >=0 ; i--) {
            while (!st.isEmpty() && st.peek()<=ar[i%n]) st.pop();
            if(i<n){
                if(st.isEmpty()) nge[i]=-1;
                else nge[i]=st.peek();
            }
            st.push(ar[i%n]);
        }
        return nge;
    }
    public static void main(String[] args) {
        int []ar={1,3,2,1,8,6,3,4};
        int []res=nextGreater(ar);
        for(int i=0;i< res.length;i++) System.out.print(res[i]+" ");
    }
}
