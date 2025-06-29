package stacks;
import java.util.*;
public class nextGreaterElement {
    public static int[] nextGreater(int []ar){
        Stack<Integer> st= new Stack<>();
        int []res= new int[ar.length];
        for(int i=ar.length-1;i>=0;i--){

            while(!st.isEmpty() && st.peek()<=ar[i]) st.pop();
            if(st.isEmpty()) res[i]=-1;
            else res[i]=st.peek();
            st.push(ar[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int []ar={1,3,2,1,8,6,3,4};
        int []res=nextGreater(ar);
        for(int i=0;i< res.length;i++) System.out.print(res[i]+" ");
    }
}
