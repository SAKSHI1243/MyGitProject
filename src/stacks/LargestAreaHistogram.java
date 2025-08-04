package stacks;
import java.util.*;
public class LargestAreaHistogram {
    public static int findArea(int []ar){
        int maxA=0;
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < ar.length; i++) {
            while (!st.isEmpty() && (i==ar.length||ar[st.peek()]>=ar[i])){
                int height=ar[st.pop()];
                int width;
                if(st.isEmpty()) width=i;
                else width=i-st.peek()-1;
                maxA=Math.max(maxA,height*width);
            }
            st.push(i);
        }
        return maxA;
    }
    public static void main(String[] args) {
        int []heights={2,1,5,6,2,3};
        System.out.print(findArea(heights));
    }
}