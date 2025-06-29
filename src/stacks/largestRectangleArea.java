package stacks;
import java.util.*;
public class largestRectangleArea {
    public static int areaRect(int[]height){
        int n= height.length;
        Stack<Integer>st= new Stack<>();
        int[] nse= new int[n];
        int[]pse= new int[n];
        //calc nse
        st.push(n-1);
        nse[n-1]=n;
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && height[i]<=height[st.peek()]) st.pop();
            if(st.isEmpty()) nse[i]=n;
            else nse[i]= st.peek();
            st.push(i);
        }
        //emptying stack
        while(!st.isEmpty()) st.pop();
        //calc pse
        st.push(0);
        pse[0]=-1;
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && height[i]<= height[st.peek()]) st.pop();
            if(st.isEmpty()) pse[i]=-1;
            else pse[i]= st.peek();
            st.push(i);
        }
        while(!st.isEmpty()) st.pop();
        int max=-1;
        for(int i=0;i<n;i++){
            int area=height[i]*(nse[i]-pse[i]-1);
            max=Math.max(max,area);
        }
        return max;
    }
    public static void main(String[] args) {
        int[]ar={5,2,4,6,3,5};
    System.out.println("max rect area: "+areaRect(ar));
    }
}
