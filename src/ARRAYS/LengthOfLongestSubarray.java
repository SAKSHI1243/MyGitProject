package ARRAYS;
import java.util.*;
public class LengthOfLongestSubarray {
    public static int FindMax(int []ar){
        int max=0;
        for(int i=0;i<ar.length;i++){
            int sum=0;
            for(int j=i;j<ar.length;j++){
                sum+=ar[j];
                if(sum==0) max=Math.max(max,j+1-i);
            }
        }
        return max;
    }
    public static int findMaxLength(int []ar){
        HashMap<Integer,Integer> mp= new HashMap<>();
        int max=0, sum=0;
        for (int i = 0; i <ar.length ; i++) {
            sum+=ar[i];
            if(sum==0) max=i+1;
            else {
                if(mp.get(sum)!=null) max= Math.max(max, i-mp.get(sum));
                else mp.put(sum,i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int []ar={9, -3, 3, -1, 6, -5};
        System.out.print(FindMax(ar));
        System.out.println();
        System.out.print(findMaxLength(ar));
    }
}