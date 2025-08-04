package stacks;
import java.util.*;
public class MaximumRectangle {
    public static int findArea(int []ar){
        Stack<Integer>st= new Stack<>();
        int maxArea=0;
        for (int i = 0; i < ar.length; i++) {
            while (!st.isEmpty() && (i==ar.length||ar[st.peek()]>=ar[i])){
                int height=ar[st.pop()];
                int width=st.isEmpty()?i:i-st.peek()-1;
                maxArea=Math.max(maxArea,width*height);
            }
            st.push(i);
        }
        return maxArea;
    }
    public static int findMaximum(char [][]ar){
        int ans=0;
        int []height=new int[ar[0].length];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if(ar[i][j]=='1') height[j]++;
                else height[j]=0;
            }
            ans=Math.max(ans,findArea(height));
        }
       return ans;
    }
    public static void main(String[] args) {
        char [][]matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.print(findMaximum(matrix));
    }
}