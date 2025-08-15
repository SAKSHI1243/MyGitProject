package SlidingWindow2P;
import java.util.*;
public class LongestSubstringWithKDistinctChar {
    public static int findLongestSubstring(String s, int k){
        int start=0, max=0;
        HashMap<Character,Integer>mp= new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(!mp.containsKey(s.charAt(i))) mp.put(s.charAt(i),1);
            else mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            while(mp.size()>k){
                mp.put(s.charAt(start),mp.get(s.charAt(start))-1);
                if(mp.get(s.charAt(start))==0) mp.remove(s.charAt(start));
                start++;
            }
             max=Math.max(max,i-start+1);
        }
        return max;
    }
    public static void main(String[] args) {
        String s="aababbcaacc";
        System.out.println(findLongestSubstring(s,2));
        String st="abcddefg";
        System.out.println(findLongestSubstring(st,3));
        String str="abccab";
        System.out.println(findLongestSubstring(str,4));
    }
}