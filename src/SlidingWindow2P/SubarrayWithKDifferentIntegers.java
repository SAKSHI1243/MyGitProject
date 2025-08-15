package SlidingWindow2P;
import java.util.*;
public class SubarrayWithKDifferentIntegers {
    public static int atMost(int []ar, int k){
        int start=0,max=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            if(!mp.containsKey(ar[i])) mp.put(ar[i],1);
            else mp.put(ar[i],mp.get(ar[i])+1);
            while (mp.size()>k){
                mp.put(ar[start],mp.get(ar[start])-1);
                if(mp.get(ar[start])==0) mp.remove(ar[start]);
                start++;
            }
             max+=(i-start+1);
        }
        return max;
    }
    public static int findLongestSubarray(int []ar,int k){
       return atMost(ar,k)-atMost(ar,k-1);
    }
    public static void main(String[] args) {
        int []ar={1,2,1,2,3};
        System.out.println(findLongestSubarray(ar,2));
    }
}