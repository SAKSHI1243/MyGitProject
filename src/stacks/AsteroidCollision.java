package stacks;
import java.util.*;
public class AsteroidCollision {
    public static int[] collision(int []ar){
        Stack<Integer>st= new Stack<>();
        for (int i = 0; i < ar.length; i++) {
            int curr=ar[i];
            while(!st.isEmpty() && curr<0 && st.peek()>0){
                if(Math.abs(curr)>st.peek()) st.pop();
                else if(Math.abs(curr)==st.peek()){
                    st.pop();
                    curr=0;
                    break;
                }
                else{
                    curr=0;
                    break;
                }
            }
            if(curr!=0) st.push(curr);
        }
        int []res= new int[st.size()];
        for (int i=res.length-1;i>=0;i--) res[i]=st.pop();
        return res;
    }
    public static void main(String[] args) {
        int []ar={5,10,-5};
        int[]res=collision(ar);
        for (int ans:res) System.out.print(ans+" ");
    }
}