package stacks;
import java.util.*;
public class SumOfSubarraysMinimum {
    public static int sum(int []ar){
        int n=ar.length;
        int pse[]=new int[n];
        int nse[]= new int[n];
        Stack<Integer>st= new Stack<>();
        for (int i = 0; i < n; i++) {//pse
            while (!st.isEmpty() && ar[st.peek()]>=ar[i]) st.pop();
            if(st.isEmpty()) pse[i]=-1;
            else pse[i]=st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){//nse
            while (!st.isEmpty() && ar[st.peek()]>=ar[i]) st.pop();
            if(st.isEmpty()) nse[i]=n;
            else nse[i]=st.peek();
            st.push(i);
        }
        st.clear();
        int total=0;
        for (int i = 0; i < n; i++) total+=(i-pse[i])*(nse[i]-i)*ar[i];
        return total;
    }
    public static int optimized(int []ar){
        int n=ar.length;
        int mod=(int)1e9+7;
        Stack<Integer> st= new Stack<>();
        long total=0;
        for (int i = 0; i <=n ; i++) {
            int curr=(i<n)?ar[i]:0;
            while(!st.isEmpty() && ar[st.peek()]>curr){
                int mid=st.pop();
                int left= st.isEmpty()?-1:st.peek();
                int right=i;
                long count=(mid-left)*(long)(right-mid);
                total=(total+count*ar[mid])%mod;
            }
            st.push(i);
        }
        return (int) total;
    }
    public static void main(String[] args) {
        int []ar={3,1,2};
        System.out.println(sum(ar));
        System.out.print(optimized(ar));
    }
}