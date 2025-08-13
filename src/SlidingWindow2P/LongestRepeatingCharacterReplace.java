package SlidingWindow2P;
import java.util.*;
public class LongestRepeatingCharacterReplace {
    public static int findLongestRepeatingCharReplacement(String s, int k){
        HashMap<Character,Integer>mp=new HashMap<>();
        int start=0,max=0,maxFreq=0;
        for (int i=start;i<s.length();i++){
            if(!mp.containsKey(s.charAt(i))) mp.put(s.charAt(i),1);
            else mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            maxFreq=Math.max(maxFreq,mp.get(s.charAt(i)));
            while ((i-start+1)-maxFreq>k) {
                mp.put(s.charAt(start),mp.get(s.charAt(start))-1);
                start++;
            }
            max=Math.max(max,i-start+1);
        }
        return max;
    }
    public static void main(String[] args) {
        String s="ABAB";
        System.out.println(findLongestRepeatingCharReplacement(s,2));
    }
}