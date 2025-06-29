package hashmap;
import java.util.*;
public class CountFrequency {
    public static void countFreq(int []ar){
        HashMap<Integer,Integer> mp= new HashMap<>();
       for(int i=0;i<ar.length;i++){
           if(mp.containsKey(ar[i])) mp.put(ar[i],mp.get(ar[i])+1);
           else mp.put(ar[i],1);
       }
        for (Map.Entry<Integer,Integer> entry:mp.entrySet()) System.out.println(entry.getKey()+"->"+entry.getValue());
    }
    public static void main(String[] args) {
        int []ar={10,5,15,10,5,10};
        countFreq(ar);
    }
}