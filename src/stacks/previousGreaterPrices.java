package stacks;
import java.util.*;
public class previousGreaterPrices {
    public static int []stockPrices(int []ar){
        Stack<Integer>st= new Stack<>();
        int []res= new int[ar.length];
        for(int i=0;i<ar.length;i++){
                while(!st.isEmpty() && ar[st.peek()]<=ar[i]) st.pop();
                if(st.isEmpty()) res[i]=i+1;
                else res[i]=i-st.peek();
                st.push(i);
            }
        return res;
    }
    public static void main(String[] args) {
    int []ar={100,80,60,70,60,75,85};
    int []res= stockPrices(ar);
    for(int i=0;i<ar.length;i++) System.out.print(res[i]+" ");
    }
}
