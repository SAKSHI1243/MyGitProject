package strings;
import java.util.*;
class IsomorphicString{
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Character> mp1 = new HashMap<>();
        HashMap<Character, Character> mp2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (mp1.containsKey(sc)) {
                if (mp1.get(sc) != tc) return false;
            } else mp1.put(sc, tc);
            if (mp2.containsKey(tc)) {
                if (mp2.get(tc) != sc) return false;
            } else mp2.put(tc, sc);
        }
        return true;
    }
    public static void main(String[] args) {
        String s="egg";
        String t="ade";
        System.out.println(isIsomorphic(s,t));
    }
}