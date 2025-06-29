package hashmap;
import  java.util.*;
public class HighestLowestFrequencyElement {
    public static void freq(int []ar) {
        HashMap<Integer,Integer>mp= new HashMap<>();
        for(int i=0;i< ar.length;i++){
            if(mp.containsKey(ar[i])) mp.put(ar[i],mp.get(ar[i])+1);
            else mp.put(ar[i],1);
        }
        int maxEle=0, minEle=0;
        int maxFreq=0, minFreq=ar.length;
        for (Map.Entry<Integer,Integer> entry: mp.entrySet()) {
            int element=entry.getKey();
            int count=entry.getValue();
            if(count>maxFreq){
                maxEle=element;
                maxFreq=count;
            }
            if(count<minFreq){
                minEle=element;
                minFreq=count;
            }
        }
        System.out.println("Maximum frequency element="+maxEle+"->"+maxFreq);
        System.out.println("Minimum frequency element="+minEle+"->"+minFreq);
    }
    public static void main(String[] args) {
        int[] ar={2,2,3,4,4,2};
        freq(ar);
    }
}