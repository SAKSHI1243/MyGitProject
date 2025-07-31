package stacks;
import java.util.*;
public class NextSmallerElement {
    public static int []findNextSmallerElement(int []ar){
        int n=ar.length;
        int []res=new int[n];
        Stack<Integer> st= new Stack<>();
        for (int i = n-1; i >=0 ; i--) {
            while (!st.isEmpty() && ar[i]<=st.peek()) st.pop();
            if(st.isEmpty()) res[i]=-1;
            else res[i]=st.peek();
                st.push(ar[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int []ar={4,8,5,2,25};
        int []res=findNextSmallerElement(ar);
        for (int num:res) System.out.print(num+" ");
    }
}