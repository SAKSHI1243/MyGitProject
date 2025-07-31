package stacks;
import java.util.*;
public class SumOfSubarraysMinimum {
    public static int sum(int []ar){
        int n=ar.length;
       ArrayList<ArrayList<Integer>>res= new ArrayList<>();
       ArrayList<Integer> list= new ArrayList<>();
       Stack<Integer> st= new Stack<>();
        for(int i=n-1;i>=0;i--){
            st.push(ar[i]);
            list.add(ar[i]);
            res.add(new ArrayList<>(ar[i]));
        }
        res.add(list);

    }
    public static void main(String[] args) {
        int []ar={3,1,2,4};
        System.out.print(sum(ar));
    }
}
