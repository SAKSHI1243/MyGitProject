package hashmap;
import  java.util.*;
public class largestSubarrayWith0Sum {
    int zeroSum(int []ar){
        int maxLen=0 ,prefSum=0;
        HashMap<Integer,Integer> mp= new HashMap<>();
        mp.put(0, -1);
        for(int i=0;i<ar.length;i++){
            prefSum+=ar[i];
            if(mp.containsKey(prefSum)) maxLen=Math.max(maxLen, i-mp.get(prefSum));
            else mp.put(prefSum,i);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        largestSubarrayWith0Sum obj= new largestSubarrayWith0Sum();
        int []ar={15,-2,2,-8,1,7,10,23};
        System.out.println(obj.zeroSum(ar));
    }
}