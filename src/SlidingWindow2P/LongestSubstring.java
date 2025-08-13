package SlidingWindow2P;
import java.util.*;
public class LongestSubstring {
    public static int findLongestSubstring(String s){
        HashMap<Character,Integer>mp= new HashMap<>();
        int start=0,max=0;
        for (int i = start; i < s.length(); i++) {
            if(mp.containsKey(s.charAt(i))) start=Math.max(start,mp.get(s.charAt(i))+1);
            mp.put(s.charAt(i),i);
            max=Math.max(max,i-start+1);
        }
        return max;
    }
    public static void main(String[] args) {
        String s="aabaab!bb";
        System.out.println(findLongestSubstring(s));
    }
}