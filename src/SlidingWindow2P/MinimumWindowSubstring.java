package SlidingWindow2P;
import java.util.*;
public class MinimumWindowSubstring {
    public static String findMinimumWindowLength(String s, String t){
        HashMap<Character,Integer>mp= new HashMap<>();
        for (int i = 0; i <t.length() ; i++) {
            if(!mp.containsKey(t.charAt(i))) mp.put(t.charAt(i),1);
            else mp.put(t.charAt(i),mp.get(t.charAt(i))+1);
        }
        HashMap<Character,Integer>window= new HashMap<>();
        int start=0, minLength=Integer.MAX_VALUE,minStart=0,have=0;
        for (int i = 0; i < s.length(); i++) {
            if(!window.containsKey(s.charAt(i))) window.put(s.charAt(i),1);
            else window.put(s.charAt(i),window.get(s.charAt(i))+1);
            if(mp.containsKey(s.charAt(i)) && mp.get(s.charAt(i))==window.get(s.charAt(i))) have++;
            while (have==mp.size()){
                if(i-start+1<minLength){
                    minLength=i-start+1;
                    minStart=start;
                }
                if(mp.containsKey(s.charAt(start)) && window.get(s.charAt(start))==mp.get(s.charAt(start))) have--;
                window.put(s.charAt(start),window.get(s.charAt(start))-1);
                start++;
            }
        }
        return minLength==Integer.MAX_VALUE?"":s.substring(minStart,minStart+minLength);
    }
    public static void main(String[] args) {
        String s="ADOBECODEBANC", t="ABC";
        System.out.println(findMinimumWindowLength(s,t));
    }
}