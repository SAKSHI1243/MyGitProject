package strings;
public class LargestPalindromicSubstring {
    public static String length(int left, int right,String s){
            while (left>=0 && right<s.length()&&(s.charAt(left)==s.charAt(right))){
                left--;right++;
            }
            return s.substring(left+1,right);
    }
    public static String findLargest(String s){
        if(s.length()==1|| s.length()==0) return s;
        String sb="";
        for (int i = 0; i < s.length(); i++) {
            String odd=length(i,i,s);
            String even=length(i,i+1,s);
            if(odd.length()>sb.length()) sb=odd;
            if(even.length()>sb.length()) sb=even;
        }
        return sb;
    }
    public static void main(String[] args) {
        System.out.println(findLargest("babad"));
    }
}