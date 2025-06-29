package stacks;
import java.util.*;
public class removeConsecutiveSubsequences {
    public static int[] removeSubsequence(int []ar){
            Stack<Integer> st= new Stack<>();
            for(int i=0;i<ar.length;i++){
                if(st.isEmpty() || st.peek()!=ar[i]) st.push(ar[i]);
                else if ( ar[i]==st.peek()) {
                    if( i==ar.length-1||ar[i]!=ar[i+1]) st.pop();
                }
            }
            int []res=new int[st.size()];
            for (int i=res.length-1;i>=0;i--) res[i]=st.pop();
            return res;
    }
    public static void main(String[] args) {
        int []ar= {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int []res=removeSubsequence(ar);
        for (int i=0;i<res.length;i++) System.out.print(res[i] + " ");
    }
}
