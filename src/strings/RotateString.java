package strings;
public class RotateString {
    public static boolean reverse(String s, String goal){
        if(s.length()!=goal.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            s=s.substring(1)+s.charAt(0);
            if(s.equals(goal)) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s="abcde",goal="cdeab";
        System.out.println(reverse(s,goal));
    }
}