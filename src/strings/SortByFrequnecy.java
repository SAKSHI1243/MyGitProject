package strings;
import java.util.*;
public class SortByFrequnecy {
    public static String sortFreq(String s){
        HashMap<Character,Integer> mp= new HashMap<>();
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(mp.containsKey(s.charAt(i))) mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            else mp.put(s.charAt(i),1);
        }
        int max=0;
        for (int i:mp.values()){
            if(max<i) max=i;
        }
        for (int freq = max; freq>=1; freq--) {
            for (Map.Entry<Character,Integer> e: mp.entrySet()) {
                if(e.getValue()==freq){
                    for (int i = 0; i < freq; i++) sb.append(e.getKey());
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(sortFreq("tree"));
    }
}