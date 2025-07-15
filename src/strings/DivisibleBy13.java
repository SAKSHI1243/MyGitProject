package strings;
public class DivisibleBy13 {
    public static boolean isDivisible(String s){
        int mod=0;
        for (int i = 0; i < s.length(); i++) mod=(mod*10+(s.charAt(i)-'0'))%13;
        if(mod%13==0) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isDivisible("2911285"));
    }
}