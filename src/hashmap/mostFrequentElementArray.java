//find the most frequent element in am array
package hashmap;
import java.util.*;
public class mostFrequentElementArray {
    public static void main(String[] args) {
    int []ar={1,4,2,5,1,4,4,6,4,4,4,6};
    Map<Integer,Integer> freq= new HashMap<>();
    for(int el:ar){//(int el=0;el<ar.length;el++)
       if(!freq.containsKey(el)) freq.put(el,1);
       else freq.put(el, freq.get(el)+1);
    }
    System.out.println("frequency is:");
    System.out.println(freq.entrySet());
    int maxfreq=0, anskey=-1;
   // for(var e: freq.entrySet()){
     //   if(e.getValue()>maxfreq) {
        //    maxfreq=e.getValue();
          //  anskey=e.getKey();
        //}
    //}
    for(var key: freq.keySet()){
        if(freq.get(key)>maxfreq){
            maxfreq=freq.get(key);
            anskey= key;
        }
    }
    System.out.printf("%d has max frequency and it occurs %d times", anskey,maxfreq);
    }
}
