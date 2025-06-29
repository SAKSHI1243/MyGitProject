package strings;
import java.util.*;
public class ValidAnagram {
    public static boolean isAnagram(String s, String t){
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> mp1= new HashMap<>();
        HashMap<Character,Integer> mp2= new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sc= s.charAt(i);
            char tc=t.charAt(i);
            if(mp1.containsKey(sc)) mp1.put(sc, mp1.get(sc)+1);
            else mp1.put(sc,1);
            if(mp2.containsKey(tc))mp2.put(tc, mp2.get(tc)+1);
            else mp2.put(tc,1);
        }
        return mp1.equals(mp2);
    }
    public static void main(String[] args) {
        String s="anagram", t="navaram";
        System.out.println(isAnagram(s,t));
    }
}