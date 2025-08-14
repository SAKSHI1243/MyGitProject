package SlidingWindow2P;
import java.util.*;
public class SubstringContainingAll3Characters {
    public static int countSubstrings(String s){
        HashMap<Character,Integer>mp= new HashMap<>();
        int start=0,cnt=0;
        for (int i =0; i < s.length(); i++) {
           if(!mp.containsKey(s.charAt(i))) mp.put(s.charAt(i),1);
           else mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            while (mp.size()==3){
                mp.put(s.charAt(start),mp.get(s.charAt(start))-1);
                if(mp.get(s.charAt(start))==0) mp.remove(s.charAt(start));
                start++;
                cnt+=(s.length()-i);
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        String s1="abcabc";
        String s2="aaabc";
        String s3="abc";
        System.out.println(countSubstrings(s1));
        System.out.println(countSubstrings(s2));
        System.out.println(countSubstrings(s3));
    }
}