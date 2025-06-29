package strings;
public class ReverseWordInAString {
    public static String resverse(String s){
        StringBuilder sb= new StringBuilder();
        int end=s.length();
        for (int i = s.length()-1; i>=0 ; i--) {
            if(s.charAt(i)==' ') end=i;
            else if(i==0|| s.charAt(i-1)==' ') {
                sb.append(s.substring(i,end));
                sb.append(' ');
                end=i-1;
            }
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String str="a is the";
        System.out.println(resverse(str));
    }
}